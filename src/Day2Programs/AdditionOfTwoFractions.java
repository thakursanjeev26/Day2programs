package Day2Programs;
import java.util.*;
public class AdditionOfTwoFractions {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Numerator1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the denominator1 :");
		int den1 = sc.nextInt();
		System.out.println("Enter the Numerator2 :");
		int num2 = sc.nextInt();
		System.out.println("Enter the  denominator2:");
		int den2 = sc.nextInt();
		sc.close();

		int commonDenominator = lcm(den1, den2);
		
		int adjustedNum1 = num1 * (commonDenominator / den1);
	    int adjustedNum2 = num2 * (commonDenominator / den2);
	    
	    int resultNum = adjustedNum1 + adjustedNum2;
	    
	    int gcd = gcd(resultNum, commonDenominator);
        resultNum /= gcd;
        commonDenominator /= gcd;

        System.out.println("The sum of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is: " + resultNum + "/" + commonDenominator);
    }

    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

	}

