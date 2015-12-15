package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
	public static boolean testMagic(String pathName) throws IOException {
		// Open the file
		BufferedReader reader = new BufferedReader(new FileReader(pathName));

		boolean isMagic = true;
		int lastSum = -1;
		String line;

		while ((line = reader.readLine()) != null) {
			// ... sum each row of numbers
			String[] parts = line.split("\t");
			int sum = 0;
			for (String part : parts) {
				if (part.isEmpty() == true) {
				} else if (part.isEmpty() == false) {
					sum += Integer.parseInt(part);
				}
			}
			if (lastSum == -1) {
				// If this is the first row, remember the sum
				lastSum = sum;
			} else if (lastSum != sum && sum != 0) {
				isMagic = false;
				break;
			}
		}

		reader.close();
		return isMagic;
	}

	public static void main(String[] args) throws IOException {
		String[] fileNames = { "Mercury.txt", "Luna.txt" };
		for (String fileName : fileNames) {
			System.out.println(fileName + " is magic? " + testMagic(fileName));
		}
	}
}
