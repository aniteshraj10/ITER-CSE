import java.util.Scanner;

public class A6Q1 {
	
	public static int additionSimple(int x , int y)
	{
		return (x + y) ;
	}

	public static int subtractionSimple(int x , int y )
	{ 
		return(x - y);
	}

	public static int multiplicationSimple(int x , int y)
	{
		return (x * y) ;
	}

	public static double divisionSimple(double x , double y)
	{
		double z = x/y;
		return z ;
	}
			
	public static int remainderSimple(int a, int b)
	{ 
		return (a%b);
	}
			
	public static double squareRoot(int x )
	{
		double result =  Math.sqrt(x);
		return  result ;
	}
			
	public static void main (String args [] ) {
				
		Scanner n = new Scanner (System.in);

		while (true)
		{
			System.out.println("***MENU***");
			System.out.println(" 0 : Exit");
			System.out.println(" 1 : Add");
			System.out.println(" 2 : Subtract");
			System.out.println(" 3 : Multiplication");
			System.out.println(" 4 : Division");
			System.out.println(" 5 : Remainder");
			System.out.println(" 6 : Square root");
			
			System.out.print(" Enter the choice :");
			int choice = n.nextInt();
			
			if (choice == 0)
				System.exit(0);
			
			System.out.println("Enter two integers : ");
			int N = n.nextInt();
			int M= n.nextInt();
			 
			switch (choice)
			{
			 case 1 : 
				 int sum = additionSimple(M,N);
				// System.out.println("The integers are : " + N + " and " + M  );
				 System.out.println("Sum = " + sum );
				 System.out.println(" " );
				 break;
					 
			case 2 : 
				int sub = subtractionSimple(M,N);
				//System.out.println("The integers are : " + N +" and " + M  );
			    System.out.println("Difference = " + sub );
			    System.out.println(" " );
			    break;
			    
			case 3 : 
				int p = multiplicationSimple(M,N);
				//System.out.println("The integers are : " + N +" and " + M  );
			    System.out.println("Product = " + p );
			    System.out.println(" " );
			    break;
			         
			case 4 : 
				double div = divisionSimple(M,N);
				System.out.println("The integers are : " + N +" and " + M  );
			    System.out.println("Quotient = " + div );
			    System.out.println(" " );
			    break;
			         
			case 5 : 
				int rem =remainderSimple(M,N) ;
				System.out.println("The integer is  : " + N   );
			    System.out.println("Square root  = " + rem );
			    System.out.println(" " );
			    break;
			         
			case 6 : 
				double sqrt = squareRoot(M);
				System.out.println("The integer is  : " +M   );
			    System.out.println("Square root  = " + sqrt );
			    System.out.println(" " );
			    break;
			         
			default : 
				System.out.println(" WRONG INPUT" );
			    System.out.println(" " );
			    break;
			}
			
		}
		
	}			
}