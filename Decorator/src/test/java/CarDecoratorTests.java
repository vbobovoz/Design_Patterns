import org.example.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CarDecoratorTests {
    private Car basicCar = new BasicCar();
    private Car sportsCar = new SportCar(basicCar);
    private Car luxuryCar = new LuxuryCar(basicCar);
    private Car sportLuxuryCar = new SportCar(luxuryCar);

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
    public void testBasicCar() {
        basicCar.create();
        assertEquals("Basic car.", outContent.toString());
    }

    @Test
    public void testSportsCar() {
        sportsCar.create();
        assertEquals("Basic car. Adding some SportCar features.", outContent.toString());
    }

    @Test
    public void testLuxuryCar() {
        luxuryCar.create();
        assertEquals("Basic car. Adding some LuxuryCar features.", outContent.toString());
    }

    @Test
    public void testSportsLuxuryCar() {
        sportLuxuryCar.create();
        assertEquals("Basic car. Adding some LuxuryCar features. Adding some SportCar features.", outContent.toString());
    }
}
