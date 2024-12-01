package task1;

public class StringOfLength {
    public static String getLength (int number) {
        // Execution time for n=1,000: 1008448200 nanoseconds for using simple String
        //String result = "";

        // Execution time for n=1,000: 4781000 nanoseconds for StringBuilder
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                result.append("+");
            } else {
                result.append("-");
            }
        }
        return result.toString();
    }
}
