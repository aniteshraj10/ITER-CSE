/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q20 {

	public static void main(String[] args) {
		
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		
		System.out.println("Date = " + d);
		System.out.println("Month = " + m);
		
		boolean check1=m==3 && d>=20 && d<=31;
		boolean check2=m==4 && d>=1 && d<=30;
		boolean check3=m==5 && d>=1 && d<=31;
		boolean check4=m==6 && d>=1 && d<=20;
		
		boolean result=(check1 || check2 || check3 || check4);
		
		System.out.println("Result = " + result);
		

	}

}
