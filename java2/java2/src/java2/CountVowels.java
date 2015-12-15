package java2;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		System.out.println("enter a sentence");
		Scanner in = new Scanner(System.in);
		String vowSt = in.next();
		in.close();
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0 ; 
		for (int i = 0; i < vowSt.length(); i++) {
			char neSt = vowSt.charAt(i);
		//	System.out.println("equal?" + (neSt == 'a'));
			switch (neSt) {
			case 'a':
				countA++;
				break ;
			case 'e':
				countE++;
				break; 
			case 'i':
				countI++;
				break; 
			case 'o':
				countO++;
				break; 
			case 'u':
				countU++;
				break;
			default:
				break;
			}
		}
		if(countA!=0){
			System.out.println("A: " + countA);
		}
		if(countE!=0){
			System.out.println("E: " + countE);
		}
		if(countI!=0){
			System.out.println("I: " + countI);
		}
		if(countO!=0){
			System.out.println("O: " + countO);
		}
		if(countU!=0){
			System.out.println("U: " + countU);
		}
	}
}
