/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q19 {

	public static void main(String[] args) {
		
		double basic_salary,da,hra,gross_salary;
		
		basic_salary=Double.parseDouble(args[0]);
		da=0.40*basic_salary;
		hra=0.20*basic_salary;
		
		gross_salary= basic_salary + da + hra;
		
		System.out.println(gross_salary);
		
		

	}
}
