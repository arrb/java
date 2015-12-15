package java1;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args){
	System.out.print("Enter maximum number: ");
	Scanner sc= new Scanner(System.in); 
	int n= sc.nextInt();
	sc.close();
	int a=0;
	int b=1;
	int c=0;
	while (a+c<=n){	
		a+=c;
		c=b;
		b=a;
		System.out.println(a);
	}	
	
	System.out.println(a);
	
	}
}