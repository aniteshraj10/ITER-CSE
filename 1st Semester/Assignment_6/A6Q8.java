import java.util.*;

public class A6Q8 {
	
	public static double area(int n, double side)
	{
		return (n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n));
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of  sides of polygon : ");
		int n = input.nextInt();
		
		System.out.print("enter length of polygon : ");
		double l = input.nextDouble();
		
		double area = area(n, l);
		
		System.out.println("Area of polygon = " + area);

		input.close();
		

	}

}
