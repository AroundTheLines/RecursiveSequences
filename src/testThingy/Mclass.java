package testThingy;

public class Mclass {
	
	public static int M(int n){
		if(n>100){
			return n-10;
		}else{
			return M(M(n+11));
		}
	}
	
	public static void main(String[] args){
		M(121121);
	}
}
