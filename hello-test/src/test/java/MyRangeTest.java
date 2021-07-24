import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

    @Test
    public void case01() {
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    public void endNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.getEnd();
        assertEquals(4, result);
    }

    @Test
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5, result);
    }

    @Test
    public void endWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    public void startNumberWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStart();
        assertEquals(2, result);
    }

    @Test
    public void startNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( ผลที่ได้คือ false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

}