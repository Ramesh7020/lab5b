package La5b;

import java.util.Scanner;

public class RemoveWhitespaceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);

        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }

    // User-defined function
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }
}
