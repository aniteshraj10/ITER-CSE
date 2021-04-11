import java.util.*;

public class A3Q7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Enter x and y coordinates : ");
		x = input.nextDouble();
		y = input.nextDouble();
		
		if (x>0 && y>0){
			System.out.println("("+x+","+y+")"+ " is in first quadrant");}
		
		else if (x<0 && y>0){
			System.out.println("("+x+","+y+")"+ " is in second quadrant");}
		
		else if (x<0 && y<0){
			System.out.println("("+x+","+y+")"+ " is in third quadrant");}
		
		else if (x>0 && y<0){
			System.out.println("("+x+","+y+")"+ " is in fourth quadrant");}
		
		else if (x==0 && y==0){
			System.out.println("("+x+","+y+")"+ " is on origin");}
		
		else if (x==0 && y!=0){
			System.out.println("("+x+","+y+")"+ " is on y-axis");}
		
		else if (y==0 && x!=0){
			System.out.println("("+x+","+y+")"+ " is on x-axis");}
		
		input.close();

	}

}
