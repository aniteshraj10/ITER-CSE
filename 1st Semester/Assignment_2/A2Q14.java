/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q14 {

	public static void main(String[] args) {
		
		System.out.println("Enter two +ve integers through command prompt" + "\n");
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("First +ve integer = " + a);
		System.out.println("Second +ve integer = " + b + "\n");
		
		boolean result=(a%b==0)||(b%a==0);
		
		System.out.println("Result = " + result);
				

	}

}
