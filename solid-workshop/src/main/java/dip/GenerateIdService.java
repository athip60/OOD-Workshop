package dip;

import java.util.Random;

public class GenerateIdService {
    public String getId() {
        Random random = new Random();
        int number = random.nextInt(10);
        return  "XYZ" + number;
    }
}