import org.example.Courses.FirstCourse;
import org.example.Courses.FourthCourse;
import org.example.Courses.SecondCourse;
import org.example.Courses.ThirdCourse;
import org.example.Preparation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class TemplateMethodTests {
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
    public void testFirstCourse() {
        Preparation preparation = new FirstCourse();
        preparation.startToPrepare();
        assertEquals("Open your lecture notes. Open your practice notes. Learn and repeat it often. Solve similar problems.", outContent.toString());
    }

    @Test
    public void testSecondCourse() {
        Preparation preparation = new SecondCourse();
        preparation.startToPrepare();
        assertEquals("Open GoogleDisk with theory. Ask your collegues about practice notes. Try to learn theory. Revise practice.", outContent.toString());
    }

    @Test
    public void testThirdCourse() {
        Preparation preparation = new ThirdCourse();
        preparation.startToPrepare();
        assertEquals("Open GoogleDisk with theory. Ask your collegues about practice notes. Please open theory. Please open practice.", outContent.toString());
    }

    @Test
    public void testFourthCourse() {
        Preparation preparation = new FourthCourse();
        preparation.startToPrepare();
        assertEquals("Open GoogleDisk with all theory. Ask your collegues about practice notes. Do something, you have a state exam this year!!! At least open it.", outContent.toString());
    }
}
