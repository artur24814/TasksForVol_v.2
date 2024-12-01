package task1;

public class StringOfLength {
    public static String getLength (int number) {
        // Execution time for n=1,000: 1008448200 nanoseconds
        String result = "";

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                result = result + "+";
            } else {
                result = result + "-";
            }
        }
        return result;
    }
}
