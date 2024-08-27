package Day2Programs;
import java.util.*;

public class countDigits {
	public static int countdigit(int num) {
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Integer");
		int num = sc.nextInt();
		sc.close();
		int result = countdigit(num);
		System.out.println(result);
	}
}
