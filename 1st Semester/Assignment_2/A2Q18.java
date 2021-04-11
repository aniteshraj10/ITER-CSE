/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q18 {

	public static void main(String[] args) {
		
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double z=Double.parseDouble(args[2]);
		
		boolean a=x<y && x<z;
		boolean b=x>y && y>z;
		
		boolean result=(a||b);
		
		System.out.println("Three values are : " + x + " " + y + " " + z);		
		System.out.println(result);
		
		
	}

}
