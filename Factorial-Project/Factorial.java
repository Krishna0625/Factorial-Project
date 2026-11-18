
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;

        if (num < 0) {
            System.out.println(
                "Factorial is not defined for negative numbers."
            );
        }
        else if (num > 20) {
            System.out.println(
                "Enter a number between 0 and 20."
            );
        }
        else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println(
                "Factorial of " + num + " is: " + fact
            );
        }

        sc.close();
    }
}
