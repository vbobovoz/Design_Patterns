import org.example.UserChoose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.example.Main.configuration;

public class AbstractFactoryTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testLinuxSQLiteFactory() {
        UserChoose userChoose = configuration("LINUXOS");
        userChoose.print();
        assertEquals("You use Linux. You use SQLite.", outContent.toString());
    }

    @Test
    public void testMacOSMongoDBFactory() {
        UserChoose userChoose = configuration("macos");
        userChoose.print();
        assertEquals("You use MacOS. You use MongoDB.", outContent.toString());
    }

    @Test
    public void testWindowsMySQLFactory() {
        UserChoose userChoose = configuration("WindowsOS");
        userChoose.print();
        assertEquals("You use Windows. You use MySQL.", outContent.toString());
    }
}
