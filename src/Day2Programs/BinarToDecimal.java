package Day2Programs;
import java.util.*;
import java.lang.Math;

public class BinarToDecimal {
	
	public static int Decimal(int binary) {
		int decimal=0;
		int count=0;
		while(true) {
			if(binary==0) 
			{
				break;
			}
			
			else
			{
				int last=binary%10;
				decimal+=last*Math.pow(2,count);
				binary=binary/10;
				count++;
				   
			}
			
		}return  decimal;
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary number:");
		int binary = sc.nextInt();
		sc.close();
		int result=Decimal(binary);
		System.out.println(binary+" In Decimal is "+result);
		
	}

}
