package Day2Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class Hcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the first number and find its divisors
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        ArrayList<Integer> divisors1 = new ArrayList<>();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                divisors1.add(i);
            }
        }
        System.out.println("Divisors of " + num1 + ": " + divisors1);

        // Get the second number and find its divisors
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        ArrayList<Integer> divisors2 = new ArrayList<>();
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                divisors2.add(i);
            }
        }
        System.out.println("Divisors of " + num2 + ": " + divisors2);

        // Find common divisors and determine the greatest common divisor (GCD)
        int gcd = 1;
        for (int divisor : divisors1) {
            if (divisors2.contains(divisor)) {
                gcd = Math.max(gcd, divisor);
            }
        }

        System.out.println("The greatest common divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }
}
