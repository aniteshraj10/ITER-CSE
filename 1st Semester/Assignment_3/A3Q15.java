import java.util.*;

public class A3Q15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of a point : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		
		if (distance>=0 && distance <=10)
		{
			System.out.println("Point (" + x + "," + y + ") is in the circle");
		}
		else
		{
			System.out.println("Point (" + x + "," + y + ") is not in the circle");
		}
		
		input.close();
		
	}

}
