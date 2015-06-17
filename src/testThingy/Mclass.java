package testThingy;

public class Mclass {
	
	public static int M(int n){
		if(n>100){
			System.out.print((n-10)+"\t");
			return n-10;
		}else{
			System.out.println((M(M(n+11)))+"\t");
			return M(M(n+11));
		}
	}
	
	public static void main(String[] args){
		M(99);
	}
}
