package java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Maximum {
	public static <T> void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("How many integers will you enter?");
		int intTimes = in.nextInt();
		int[] arr = new int[intTimes]; 
		
		for(int i = 0 ; i < intTimes; i++){
			System.out.println("please enter a pos int");
			Scanner input = new Scanner(System.in);
			while(input.hasNextInt()){
				arr[i] = input.nextInt(); 
				i++;
				if(i == intTimes){
					break; 
				}
			}
			input.close();
		}
		in.close();
		 List<Integer> intList = new ArrayList<Integer>();
		    for (int index = 0; index < arr.length; index++)
		    {
		        intList.add(arr[index]);
		    }
		   findMax(intList);
	}

	private static void findMax(List<Integer> intList) {
		// TODO Auto-generated method stub
		System.out.println(Collections.max(intList));
	}
}
