/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : To exchange the value of A and B using third temporary variable C.
 */
public class A1Q7 {

	public static void main(String[] args) {
		
		int A,B,C;
		
		A=10;
		B=20;
		
		System.out.println("Before swapping of values:");
		System.out.println("Value of A = " + A);
		System.out.println("Value of B = " + B);
		
		// C is acting as a temporary variable
		C=B;
		B=A;
		A=C;
		
		System.out.println("After swapping of values:");
		System.out.println("Value of A = " + A);
		System.out.println("Value of B = " + B);

	}

}
