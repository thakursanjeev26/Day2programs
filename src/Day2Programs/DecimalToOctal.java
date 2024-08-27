package Day2Programs;
import java.util.*;
public class DecimalToOctal {
	public static String GetOctal(int decimal) {
		if(decimal==0) {
			return "0";
		}
		String oct ="";
		while(decimal>0) {
			int last=decimal%8;
			oct=last+oct;
			decimal=decimal/8;
		}return oct;
	}
		public static void main(String[]args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a NUmber in Decimal");
			int decimal=sc.nextInt();
			sc.close();
			String result=GetOctal(decimal);
			System.out.println("IN octal is:"+result);
			
		}
	}
