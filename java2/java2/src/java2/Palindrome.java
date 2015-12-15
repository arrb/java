package java2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter a word to check if palindrome");
		Scanner in = new Scanner(System.in);
		String palind = in.next();
		in.close();
		char pl;
		int lngt = palind.length();
		pl = palind.charAt(lngt / 2);
		if (lngt % 2 != 0) {
			int newLngt = Math.round(lngt / 2);
			String a = palind.substring(newLngt + 1, lngt);
			String b = new StringBuilder(palind.substring(0, newLngt))
					.reverse().toString();
			if (a.contains(b)) {
				System.out.println("palindrome!");
			} else
				System.out.println("nope :/ ");
		} else {
			if (pl == palind.charAt((lngt / 2) - 1)) {
				System.out.println("palidrome");
			} else
				System.out.println("nope :/ ");
		}
	}
}
