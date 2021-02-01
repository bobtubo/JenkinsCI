package utilities;

public class Storage {
    private static int randomNumbers = 0;

    public static int getRandomNumbers() {
        return randomNumbers;
    }

    public static void setRandomNumbers(int randomNumbers) {
        Storage.randomNumbers = randomNumbers;
    }
}
