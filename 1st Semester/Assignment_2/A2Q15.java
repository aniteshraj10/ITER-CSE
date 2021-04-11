/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q15 {

	public static void main(String[] args) {
		
		int min=Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[1]);
		
		int x=min+(int)(Math.random()*(max-min+1));
		
		System.out.println(x);

	}

}
