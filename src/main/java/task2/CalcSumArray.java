package task2;

public class CalcSumArray {
    public static int getSum (int [] arr) {
        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}
