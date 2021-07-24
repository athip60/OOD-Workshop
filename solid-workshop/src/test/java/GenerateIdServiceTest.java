package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

// Mock
class RandomX extends Random {
    long number;
    public RandomX(long seed) {
        number = seed;
    }

    @Override
    public int nextInt(int bound) {
        return (int) number;
    }
}

class GenerateIdServiceTest {

    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        GenerateIdService service = new GenerateIdService();
        service.setRandom(new RandomX(7)); // Test Double = Stub
        String id = service.getId();
        assertEquals("XYZ7", id);
    }

}