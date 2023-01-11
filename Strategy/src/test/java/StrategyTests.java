import org.example.Context;
import org.example.OperationAdd;
import org.example.OperationMul;
import org.example.OperationSub;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class StrategyTests {
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
    public void testOperationAdd() {
        Context context = new Context(new OperationAdd());
        System.out.print("10 + 5 = " + context.executeStrategy(10, 5));
        assertEquals("10 + 5 = 15", outContent.toString());
    }

    @Test
    public void testOperationSub() {
        Context context = new Context(new OperationSub());
        System.out.print("10 - 5 = " + context.executeStrategy(10, 5));
        assertEquals("10 - 5 = 5", outContent.toString());
    }

    @Test
    public void testOperationMul() {
        Context context = new Context(new OperationMul());
        System.out.print("10 * 5 = " + context.executeStrategy(10, 5));
        assertEquals("10 * 5 = 50", outContent.toString());
    }
}
