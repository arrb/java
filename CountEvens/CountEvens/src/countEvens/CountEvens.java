package countEvens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEvens {
	public static void main(String[] args) {
		File file = new File("../CountEvens/src/countEvens/input.txt");
		int count = 0;
		try {
			Scanner scanner = new Scanner(file);
			count = countEvens(scanner);
			System.out.println(count);
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static int countEvens(Scanner scanner) {
		// TODO Auto-generated method stub
		int counter = 0;
		while (scanner.hasNextInt()) {
			int ints = scanner.nextInt();
			if (ints % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
}
