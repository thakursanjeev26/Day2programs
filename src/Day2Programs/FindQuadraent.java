package Day2Programs;
import java.util.*;
public class FindQuadraent {
	public static String findQuad(int x,int y) {
		if(x>0 && y>0) {
			return "The coordinate is in the First Quadrant";
		}
		else if(x<0 && y>0) {
			return"The coordinate is in the Second Quadrant";
		}
		else if(x<0 && y<0) {
			return"The coordinate is in the Thrird Quadrant";
		}
		else if(x>0 && y<0) {
			return"The coordinate is in the Fourth Quadrant";
		}else if(x==0 && y!=0) {
			return"the coordinate lies on the y-axis.";
		}else if(x!=0 && y==0) {
			return "the coordinate lies on the x-axis.";
		}else {
			return"the coordinate is at the origin.";
		}
	}
		public static void main (String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The X corodinates: ");
			int x= sc.nextInt();
			System.out.println("Enter The Y coordinates: ");
			int y=sc.nextInt();
			sc.close();
			String result=findQuad(x,y);
			System.out.println(result);
		
		
	}
}
