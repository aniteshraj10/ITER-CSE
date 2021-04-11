import java.util.Scanner;

public class A5Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x in radian : ");
		double x = sc.nextDouble();
		
		double error = 0.000001;
		double sum = 0.0, term = 1.0;

		for (int i = 1; Math.abs(term)>error; i++)
		{
			sum+=term;
			term = term*x/i;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
