/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void getメソッドの通信を確認() {
        App classUnderTest = new App();

        classUnderTest.get();

        final String expected = "HTTPステータス:200";
        final String ac = outContent.toString();
        final String[] actual = ac.split("\n");

        assertEquals(expected, actual[0]);
    }
}