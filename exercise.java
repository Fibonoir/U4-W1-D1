import java.util.Arrays;

public class exercise {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concat(String str, int num) {
        return str + num;
    }

    public static String[] mixedArray(String[] array, String str) {
        String[] newArray = new String[6];
        for (int i = 0; i < 3; i++)
            newArray[i] = array[i];
        newArray[3] = str;
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println("Multiply: " + multiply(2, 3));
        System.out.println("Concat: " + concat("Hello ", 3));

        String[] array = { "a", "b", "c", "d", "e" };
        String[] newArray = mixedArray(array, "f(extra)");
        System.out.println("Mixed Array: " + Arrays.toString(newArray));
    }

}
