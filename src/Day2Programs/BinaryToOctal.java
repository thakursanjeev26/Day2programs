package Day2Programs;
import java.lang.Math;
import java.util.Scanner;

public class BinaryToOctal {
	public static String BinToOct(int num) {
		int rem,rem_new,sum=0,count=0;
		String temp="";
		while(num!=0) {
			rem=num%1000;
			while(rem!=0) {
				rem_new=rem%10;
				sum+=rem_new*Math.pow(2, count);
				rem/=10;
				count++;
			}
			temp=sum+temp;
			sum=0;
			count=0;
			num/=1000;
			
		}return temp;
		
			
		}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		String result=BinToOct(num);
		System.out.println(result);
		
	}
}
