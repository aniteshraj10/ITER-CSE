/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q21 {

	public static void main(String[] args) {
		 
		double t = Double.parseDouble(args[0]);
		
		t = Math.toRadians(t);
		
		System.out.println(t);
		
		double val1 = Math.sin(2*t);
		double val2 = Math.sin(3*t);
		
		System.out.println(val1);
		System.out.println(val2);
		
		double sum = val1 + val2;
		
		System.out.println("Sin(2t) + Sin(3t) = " + sum);
		

	}

}
