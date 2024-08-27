package Day2Programs;
import java.util.*;


public class DecimalToBinary {
	public static String GetBinary(int decimal) {
		if(decimal==0) {
			return "0";
		}
		String binary="";
		while(decimal>0) {
			int rem=decimal%2;
			binary=rem+binary;
			decimal=decimal/2;
		}
		return binary;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		int Deciaml = sc.nextInt();
		sc.close();
		String result=GetBinary(Deciaml);
		System.out.println(" In Binary is :"+result);
	}
}
