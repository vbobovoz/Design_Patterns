import org.example.SingletonDBConnection;
import org.junit.Test;
import static junit.framework.TestCase.assertSame;

public class DBConnectionTest {
    @Test
    public void testGetInstanceReturnsSameObject() {
        SingletonDBConnection instance1 = SingletonDBConnection.getInstance();
        SingletonDBConnection instance2 = SingletonDBConnection.getInstance();
        assertSame(instance1, instance2);
    }
}
