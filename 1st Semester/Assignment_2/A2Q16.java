/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q16 {

	public static void main(String[] args) {
		
		int min=Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[1]);
		
		int x=min+(int)(Math.random()*(max-min+1));
		int y=min+(int)(Math.random()*(max-min+1));
		
		System.out.println("x = " + x );
		System.out.println("y = " + y );
		
		int sum=x+y;
		
		System.out.println("Sum = " + sum);
		

	}

}
