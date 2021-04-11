
public class A4Q12 {

	public static void main(String[] args) {
			
		System.out.println("log N					N				NlogN			N^2			N^3			2^N");
		
		for (int N=16; N<=2048; N=N*2){
			System.out.println(Math.log(N)+"\t"+N+"\t"+N*Math.log(N)+"\t"+(N*N)+"\t"+(N*N*N)+"\t"+Math.pow(2, N));
		}
		

	}

}
