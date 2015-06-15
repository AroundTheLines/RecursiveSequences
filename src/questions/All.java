package questions;

public class All {
	
	public static void q1(int n){
		if(n<1){
			System.out.print(25+"\t");
		}else{
			q1(n-1);
			System.out.print((25-n)+"\t");
		}
	}
	
	public static void q2(int n){
		if(n<1){
			System.out.print(25+"\t");
		}else{
			q2(n-1);
			System.out.print((25-2*n)+"\t");
		}
	}
	
	public static void q3(int n){
		if(n<1){
			System.out.print(2+"\t");
		}else{
			q3(n-1);
			System.out.print((2+2*n)+"\t");
		}
	}
	
	public static void q4(int n){
		if(n<1){
			System.out.print(2+"\t");
		}else{
			q4(n-1);
			System.out.print((2+n)+"\t");
		}
	}
	
	public static void q5(int n){//needs fixing
		if(n<1){
			System.out.print(1+"\t");
		}else{
			q5(n-1);
			System.out.print((2*n)+"\t");
		}
	}
	
	public static void reset(){
		System.out.println();
	}
	
	public static void main(String[] args){
		q1(8);
		reset();
		q2(8);
		reset();
		q3(8);
		reset();
		q4(8);
		reset();
		q5(8);
	}
}
