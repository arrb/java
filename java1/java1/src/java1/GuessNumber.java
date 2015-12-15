package java1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("guess a number from 1 - 10 ");
		int numberGuessed = in.nextInt();
		guess(numberGuessed);
		in.close();
	}

	private static void guess(int numberGuessed) {
		// TODO Auto-generated method stub
		Random ram = new Random();
		int max = 10;
		int min = 0;
		int count = 0;
		int answer = ram.nextInt((max - min) + 1) + min;
		while (answer != numberGuessed) {
			count++;
			numberGuessed = getInt(numberGuessed, "try again");
		}
		System.out.println("yay it took you: " + count + " times");
	}

	private static int getInt(int numberGuessed, String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		Scanner in = new Scanner(System.in);
		int newNum = in.nextInt();
		in.close();
		return newNum;
	}

}
