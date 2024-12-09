package task5;

public class FirstCharCheck {
    public static String IS_UPPER = "upper";
    public static String IS_LOWER = "lower";
    public static String IS_DIGIT = "digit";
    public static String IS_OTHER = "other";

    public static String repFirstChar(String text){
        char firstChar = text.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            return IS_UPPER;
        } else if (Character.isLowerCase(firstChar)) {
            return IS_LOWER;
        } else if (Character.isDigit(firstChar)) {
            return IS_DIGIT;
        } else {
            return IS_OTHER;
        }
    }
}
