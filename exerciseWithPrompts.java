import java.util.Scanner;

public class exerciseWithPrompts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter third string: ");
        String str3 = scanner.nextLine();
        String concatenation = str1 + str2 + str3;
        String reverseConcatenation = str3 + str2 + str1;
        System.out.println("Concatenation in order: " + concatenation);
        System.out.println("Concatenation in reverse order: " +
                reverseConcatenation);
        scanner.close();

    }
}
