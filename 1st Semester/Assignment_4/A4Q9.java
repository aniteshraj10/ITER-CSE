
public class A4Q9 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<1000; i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		
		System.out.println("Sum of all multiples of 3 or 5 below 1000 is " + sum);

	}

}
