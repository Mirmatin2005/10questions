import java.util.Scanner;

public class tamrin1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1Str = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2Str = scanner.nextLine();

        scanner.close();

        int len1 = num1Str.length();
        int len2 = num2Str.length();
        int maxLength=(len1>=len2)?len1:len2;

        int[] result = new int[maxLength + 1];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = (i < len1) ? num1Str.charAt(len1 - 1 - i) - '0' : 0;
            int digit2 = (i < len2) ? num2Str.charAt(len2 - 1 - i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result[maxLength - i] = sum % 10; 
            carry = sum / 10;
        }

        result[0] = carry; 
        int startIndex = (result[0] == 0) ? 1 : 0; 
        for (int i = startIndex; i <= maxLength; i++) {
            System.out.print(result[i]);
        }
        System.out.println(); 
    }
}
