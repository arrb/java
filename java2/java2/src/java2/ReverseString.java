package java2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Please enter the string you want to reverse");
		Scanner in = new Scanner(System.in);
		String stringToReverse = in.next();
		char s;
		int lgt = stringToReverse.length();
		while (lgt != 0) {
			--lgt;
			s = stringToReverse.charAt(lgt);
			System.out.print(s);
		}
		in.close();
	}
}
