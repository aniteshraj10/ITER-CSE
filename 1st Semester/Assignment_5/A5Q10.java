import java.util.*;

public class A5Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x in radian : ");
		double x = sc.nextDouble();
		
		double error = 0.000001;
		double tsin = x, term = x;
		int i = 1;
		
		while (Math.abs(term)>error)
		{
			i+=2;
			term = -term*(x*x)/(i*(i-1));
			tsin+=term;
		}
		
		System.out.println("The value of sin(" + x + ") = " + tsin);
		
		sc.close();

	}

}
