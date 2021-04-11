import java.util.Scanner;

public class A6Q15 {
	
	public static double triangle(double base, double height)
	{
		return (0.5*base*height);
	}
	
	public static double square(double side)
	{
		return (Math.pow(side,2));
	}
	
	public static double circle(double radius)
	{
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public static double rectangle(double length, double breadth)
	{
		return (length * breadth);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int condition = 0;
		
		while (condition == 0)
		{
			System.out.println("***MENU***");
			System.out.println("1. Area of Triangle");
			System.out.println("2. Area of Square");
			System.out.println("3. Area of Circle");
			System.out.println("4. Area of Rectangle");
			System.out.println("5. EXIT\n");
			
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			System.out.println();
			
			double area;
			
			switch (choice)
			{
			case 1:
				System.out.print("Enter base : ");
				double base = input.nextInt();
				
				System.out.print("Enter height : ");
				double height = input.nextInt();
				
				area = triangle(base, height);
				
				System.out.println("Area of Triangle = " + area + "\n");
				
				break;
				
			case 2:
				System.out.print("Enter side : ");
				double side = input.nextInt();

				area = square(side);
				
				System.out.println("Area of Square = " + area + "\n");
				
				break;
				
			case 3:
				System.out.print("Enter radius : ");
				double radius = input.nextInt();
				
				area = circle(radius);
				
				System.out.println("Area of Circle = " + area + "\n");
				
				break;
				
			case 4:
				System.out.print("Enter length : ");
				double length = input.nextInt();
				
				System.out.print("Enter breadth : ");
				double breadth = input.nextInt();
				
				area = rectangle(length, breadth);
				
				System.out.println("Area of Rectangle = " + area + "\n");
				
				break;
			
			case 5:
				condition = 1;
				
				break;
			}
		}

		input.close();

	}

}
