package task3;
import task3.NotOneTo100Exception;

public class ZeroSumArray {
    public static int[] generateArray(int expectedArrLength) throws NotOneTo100Exception {
        if (expectedArrLength < 1 || expectedArrLength > 100){
            throw new NotOneTo100Exception(
                "expectedArrLength must be between 1 and 100 (inclusive)"
            );
        }
        return new int[] {0,0,0,0};
    }
}
