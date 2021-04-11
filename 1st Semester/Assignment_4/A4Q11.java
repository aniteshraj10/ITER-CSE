
public class A4Q11 {

	public static void main(String[] args) {
		
		int sum1=0, sum2=0, diff;
		
		for (int i = 1; i<=100;i++) {
			sum1+=Math.pow(i,2);
			sum2+=i;
		}
		
		sum2=(int)Math.pow(sum2,2);
		diff= sum2- sum1;
		
		System.out.println("Difference between the sum of the squares of the first 100 natural number and the square of the sum is " + sum2 + "-" + sum1 + " = " + diff);
		
	}

}
