/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : To exchange the value of A and B without using thord temporary variable.
 */
public class A1Q8 {

	public static void main(String[] args) {
		
		int A=10;
		int B=20;
		
		System.out.println("Befor swapping of values:");
		System.out.println("Value of A = "+A);
		System.out.println("Value of B = "+B);
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("After swapping of values:");
		System.out.println("Value of A = "+A);
		System.out.println("Value of B = "+B);

	

}}
