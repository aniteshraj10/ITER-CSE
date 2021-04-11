
public class A4Q7 {

	public static void main(String[] args) {
		
		int N= Integer.parseInt(args[0]);
		
		double sum =0 , average;
		
		for (int i=1; i<=N; i++) 
		{
			double rn = Math.random();
			System.out.println("Random number " + i + " is " + rn);
			sum = sum+rn;
		}
		
		System.out.println("\nSum of random numbers = " + sum);
		average = sum/N;
		System.out.println("\nAverage of random numbers = " + average);
	}

}
