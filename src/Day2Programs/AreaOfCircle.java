package Day2Programs;
import java.util.*;

public class AreaOfCircle {
	
	public static int Area(int R ,double PI) {
		int area=(int) (PI*R*R);
		return area;
	}
	
	public static void main(String[]args) {
		final double PI=3.14;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter te Radius");
		int r = sc.nextInt();
		sc.close();
		double result=Area(r, PI);
		System.out.println(result);
		
	}
}
