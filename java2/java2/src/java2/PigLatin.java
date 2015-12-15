package java2;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		System.out.println("enter a word");
		Scanner in = new Scanner(System.in);
		String pigString = in.next();
		String newW;
		in.close();
		char first;
		System.out.println(pigString);

		first = pigString.charAt(0);
		if (first == 'a' || first == 'e' || first == 'i' || first == 'o'
				|| first == 'u') 
			newW = pigString + "hay";
		else
			newW = pigString.substring(1) + pigString.charAt(0) + "ay";

		System.out.println("pig-latin version: " + newW);
	}
}
