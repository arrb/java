package java1;

public class Calculations {
	public static void main(String[] args){
		add();
		subtract();
		multiply();
		increment();
		decrement();
	}	
	private static void decrement() {
		int c = 10 ; 
		System.out.println(c);
		System.out.println(c=c-1);
		System.out.println(c);
	}
	private static void increment() {
		int c = 10; 
		System.out.println(c);
		System.out.println(c=c+1);
		System.out.println(c);
	}
	private static void multiply() {
		int a = 7 ; 
		double b = 6.5 ; 
		System.out.println(a*a);
		System.out.println(b*b);
		System.out.println(a*b);	
	}
	private static void add(){
		int a = 7 ; 
		double b = 6.5 ; 
		System.out.println(a+a);
		System.out.println(b+b);
		System.out.println(a+b);		
	}
	private static void subtract(){
		int a = 7 ; 
		double b = 6.5;
		System.out.println(a-a);
		System.out.println(b-b);
		System.out.println(a-b);		
	}
}
