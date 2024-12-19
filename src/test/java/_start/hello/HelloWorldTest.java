package _start.hello;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.helloWorld();
        assertEquals("Hello, World!", message, "The message should be 'Hello, World!'");
    }
}
