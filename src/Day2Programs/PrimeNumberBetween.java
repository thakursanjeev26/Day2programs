package Day2Programs;
import java.lang.Math;

public class PrimeNumberBetween {
	/*Function to check IF Number isprime*/
	public static boolean isPrime(int num) {
		if(num==0 && num==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}return true;
	}
	
	/*Main Function*/
	public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }
}
