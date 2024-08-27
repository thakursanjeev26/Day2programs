package Day2Programs;
import java.util.*;

public class DecimalTOHexadecimal {
	public static String GetHex(int decimal) {
		if(decimal==0) {
			return "0";
		}
		String hex="";
		char[] hexchar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
		while(decimal>0) {
			int rem=decimal%16;
			hex=hexchar[rem]+hex;
			decimal=decimal/16;   
		}return hex;
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:");
		int decimal=sc.nextInt();
		sc.close();
		String result=GetHex(decimal);
		System.out.println(result);
	}
}
