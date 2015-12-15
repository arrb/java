package java1;

public class Rectangle {
	public static void main(String[] args){
		largo();
		lines();
		lines();
		lines();
		largo();
	}
	
	private static void lines() {
		System.out.print("|");
		for(int k = 0 ; k < 18; k++){
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println("");
	}
	
	private static void largo(){		
		for(int j = 0 ; j<20 ; j++){
			System.out.print("-");
		}
		System.out.println("");
	}
	
}
