package java1;
public class SquaresCubes {
	public static void main(String[] args){
		printSquares();
        System.out.println();
        printCubes();
	}

	private static void printCubes() {
		// TODO Auto-generated method stub
		for(int i = 1 ; i < 11 ; i++){
			System.out.println(i*i*i);
		}
	}

	private static void printSquares() {
		// TODO Auto-generated method stub
		for(int i = 1 ; i < 11 ; i++){
			System.out.println(i*i);
		}
	}
}
