package utilities;

import java.util.Random;

public class Utility {
    public static int generateRandomNumbers(){
        Random ran = new Random();
        int randonNumbers = ran.nextInt(10000);
        return randonNumbers;
    }
}
