public class App {
    public static void main(String[] args) {
        System.out.println("Hello there");

        int one = 345;

        char[] arr = Integer.toString(one).toCharArray();

        System.out.println("Len: " + Integer.toString(one).toCharArray().length);

        for (char i: arr){
            System.out.println("Res: " + i);
        }
    }
}
