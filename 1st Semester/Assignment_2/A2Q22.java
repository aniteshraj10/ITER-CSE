/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q22 {

	public static void main(String[] args) {
		
		double t=Double.parseDouble(args[0]);
		double p=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		
		double result;
		
		result=p*(Math.exp(r*t));
		
		System.out.println(result);

	}
}
