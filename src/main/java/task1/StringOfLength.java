package task1;

public class StringOfLength {
    public static String getLength (int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result = result + "=";
        }
        return result;
    }
}
