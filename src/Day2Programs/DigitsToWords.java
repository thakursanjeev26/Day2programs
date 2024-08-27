package Day2Programs;
import java.util.*;
public class DigitsToWords {
	 private static final String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	 private static final String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	 private static final String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	    
	 public static String DigToWord(int number) {
		 if(number<0 || number>9999) {
			 return "out of range";
		 }
		 if (number == 0) return ones[0];

		    String words = "";

		    // Process thousands
		    if (number / 1000 > 0) {
		        words += ones[number / 1000] + " Thousand ";
		        number %= 1000;
		    }

		    // Process hundreds
		    if (number / 100 > 0) {
		        words += ones[number / 100] + " Hundred ";
		        number %= 100;
		    }

		    // Process tens and ones
		    if (number >= 11 && number <= 19) {
		        words += teens[number - 11];
		    } else {
		        if (number / 10 > 0) {
		            words += tens[number / 10 - 1] + " ";
		            number %= 10;
		        }
		        if (number > 0) {
		            words += ones[number];
		        }
		    }

		    return words.trim();
		}
	 
	 public static void main(String[]args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter a Digit:");
		 int number = sc.nextInt();
		 sc.close();
		 String result=DigToWord(number);
		 System.out.println(result);
	 }
	 }
	    
