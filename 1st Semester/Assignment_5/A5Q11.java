import java.util.Scanner;

public class A5Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x in radian : ");
		double x = sc.nextDouble();
		
		double error = 0.000001;
		double tcos = 1, term = 1;
		int i = 0;

		while (Math.abs(term)>error)
		{
			i+=2;
			term = -term*(x*x)/(i*(i-1));
			tcos+=term;
		}
		
		System.out.println("The value of cos(" + x + ") = " + tcos);
		
		sc.close();

	}

}
