import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyRangeTest {

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ ผลที่ได้คือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ] ผลที่ได้คือ true")
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นจะขึ้นต้นด้วย ( ผลที่ได้คือ false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นจะลงท้ายด้วย ) ผลที่ได้คือ false")
    public void endWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นเลขเริ่มต้นคือ 1 ผลที่ได้คือ true")
    public void startNumber() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1,result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) นั้นเลขเริ่มต้นคือ 1 ผลที่ได้คือ true")
    public void endNumber() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5,result);
    }
}
