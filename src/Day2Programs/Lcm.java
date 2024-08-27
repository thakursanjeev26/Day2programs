package Day2Programs;
import java.util.ArrayList;
import java.util.*;
public class Lcm {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number 1:");
		int num1 = sc.nextInt();
		ArrayList<Integer> divisors1 = new ArrayList<>();
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				divisors1.add(i);
			}
		}
		System.out.print("Divisor of"+ num1 +":"+divisors1);
		
		System.out.println("Enter The Number 2:");
		int num2 = sc.nextInt();
		ArrayList<Integer> divisor2 = new ArrayList<>();
		for(int i=1;i<=num2;i++) {
			if(num2%i==0) {
				divisor2.add(i);
				}
			}System.out.println("Divisor of"+ num2 +":"+ divisor2);
			
			
			int gdc=1;
			for(int divisor : divisors1) {
				if(divisor2.contains(divisor)) {
					gdc=Math.max(divisor, gdc);
				}
			}System.out.print("Higgest Common divisor:"+ gdc);
			
			int lcm=num1*num2/gdc;
			System.out.println("Lcm Of The Given NUmber"+ lcm);
			sc.close();
			
		}
}
