package java1;

public class SumSquaresCubes {
	public static void main(String[] args){
		 final int LIMIT = 10;
	        System.out.println("The sum of the squares from 1 to " + LIMIT +  " is " + sumSquares(LIMIT));
	        System.out.println();
	        System.out.println("The sum of the cubes from 1 to " + LIMIT +  " is " + sumCubes(LIMIT));
	}

	private static int sumCubes(int lIMIT) {
		int result = 0 ; 
		for (int i = 1; i<=lIMIT; i++){
			int cube = i*i*i; 
			result +=cube;
		}		
		return result;
	}
	

	private static int sumSquares(int lIMIT) {
		int result = 0 ; 
		for (int i = 1; i<=lIMIT; i++){
			int square = i*i; 
			result +=square;
		}		
		return result;
	}
}
