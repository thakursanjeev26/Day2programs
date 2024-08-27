package Day2Programs;
import java.lang.Math;
import java.util.*;

public class OctalToDecimal {
	public static int OctalToDec(int num) {
		int count=0,rem,decimal=0;
		while(true) {
			if(num==0) {
				break;
			}else {
				rem=num%10;
				decimal+=rem*(int)Math.pow(8,count);
				num/=10;
				count++;
				
			}
			
		}return decimal;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Octal Number");
		int num=sc.nextInt();
		sc.close();
		int result=OctalToDec(num);
		System.out.println("In Decimal is "+result);
		
	}
	
}
