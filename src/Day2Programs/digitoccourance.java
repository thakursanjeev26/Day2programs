package Day2Programs;
import java.util.Scanner;
public class digitoccourance {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number or string of digits: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter the digit to count (0-9): ");
	        char digitToCount = scanner.next().charAt(0);

	        scanner.close();

	        if (digitToCount < '0' || digitToCount > '9') {
	            System.out.println("Invalid digit. Please enter a digit between 0 and 9.");
	            return;
	        }

	        int count = countDigitOccurrences(input, digitToCount);
	        System.out.println("The digit " + digitToCount + " occurs " + count + " times.");
	    }

	    public static int countDigitOccurrences(String input, char digit) {
	        int count = 0;
	        for (char c : input.toCharArray()) {
	            if (c == digit) {
	                count++;
	            }
	        }
	        return count;
	    }
	}


