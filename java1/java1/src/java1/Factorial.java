package java1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("please enter an integer");
		int num = in.nextInt();
		factorial(num);
	}

	private static void factorial(int num) {
		// TODO Auto-generated method stub
		int result = 1 ; 
		for(int i = 1 ; i<=num; i++){
			
			result *= i;
			//System.out.println(num);
		}
		System.out.println(result);

	}
}
