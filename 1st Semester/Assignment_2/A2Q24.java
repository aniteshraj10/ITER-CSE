/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q24 {

	public static void main(String[] args) {
		
		double n1=Math.random();
		double n2=Math.random();
		double n3=Math.random();
		double n4=Math.random();
		double n5=Math.random();
		
		System.out.println("Five uniform random numbers : \n" + n1 + "\n" + n2 + "\n" + n3+ "\n" + n4 + "\n" + n5);
		
		double avg=(n1+n2+n3+n4+n5)/5;
		double min=Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
		double max=Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
		
		System.out.println("Average Value = " + avg);
		System.out.println("Minumum Value = " + min);
		System.out.println("Maximum Value = " + max);
		

	}

}
