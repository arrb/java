package java1;

public class Fibonacci1 {
	public static void main(String[] args){
		fibonacci();
	}

	private static void fibonacci() {
		// TODO Auto-generated method stub
		System.out.println("0");
		System.out.println("1");
		int last = 1; 
		int previous = 0 ; 
		for(int i = 0 ; i < 15; i++){
			int next = last+previous; 
			System.out.println(next);
			previous = last ; 
			last = next; 
		}
	}
}
