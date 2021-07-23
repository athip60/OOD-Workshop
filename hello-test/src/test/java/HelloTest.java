import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    // f(name) = "Hello Athip"
    @Test
    @DisplayName("ทำการทดสอบ...")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "Athip";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello Athip", actualResult);
    }
}