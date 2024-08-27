package Day2Programs;
import java.util.Scanner;
public class ExactlyXdivisors {
	    
	    public static int countNumbersWithExactDivisors(int limit, int x) {
	        int count = 0;

	        for (int i = 1; i <= limit; i++) {
	            if (countDivisors(i) == x) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static int countDivisors(int n) {
	        int count = 0;
	        for (int i = 1; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                if (n / i == i) {
	                    count++; // i is a divisor
	                } else {
	                    count += 2; // i and n/i are divisors
	                }
	            }
	        }
	        return count;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the maximum limit: ");
	        int limit = scanner.nextInt();

	        System.out.print("Enter the number of divisors: ");
	        int x = scanner.nextInt();

	        scanner.close();

	        int count = countNumbersWithExactDivisors(limit, x);
	        System.out.println("Number of integers up to " + limit + " with exactly " + x + " divisors: " + count);
	    }

	}

