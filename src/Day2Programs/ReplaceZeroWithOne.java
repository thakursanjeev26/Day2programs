package Day2Programs;

public class ReplaceZeroWithOne {
	 public static void main(String[] args) {
	        // Step 1: Initialize the array of numbers
	        int[] numbers = {0, 1, 0, 2, 3, 0, 4, 5, 6};

	        // Step 2: Iterate through the array and replace zeros with ones
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == 0) {
	                numbers[i] = 1;
	            }
	        }

	        // Step 3: Display the modified array
	        System.out.print("Modified array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
}
	
	


