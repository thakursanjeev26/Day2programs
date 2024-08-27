package Day2Programs;
import java.util.*;

public class HexToDecimal {
	public static int GetDecimal(String num) {
		String Digit ="0123456789ABCDEF";
		num=num.toUpperCase();
		int val=0;
		for(int i=0;i<num.length();i++) {
			char c = num.charAt(i);
			int d = Digit.indexOf(c);
			val=16*val+d;
			
		}return val;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Hexadecimal Number:");
		String num=sc.nextLine();
		sc.close();
		int result=GetDecimal(num);
		System.out.println(result);
		
	}
}
