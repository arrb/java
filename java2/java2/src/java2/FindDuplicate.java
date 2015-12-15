package java2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
	public static void main(String[] args){
		List<Integer> lstint = new ArrayList<Integer>();
		for(int i = 0 ; i<6; i++){
			lstint.add(i);
		}
		lstint.add(5);
		System.out.print(lstint);
		System.out.println("ejijew  "+ lstint.indexOf(5));

		int dplt = findDuplicate(lstint);
		System.out.println("fduplicate isss  "+ dplt);
	}

	private static int findDuplicate(List<Integer> lstint) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<lstint.size(); i++){
			
		//	while(lstint.iterator().hasNext()){
		//		int nw = lstint.iterator().next();
			//	System.out.println("contains? "+ nw);
			//	break;
		//	}
			//for(int j = 0 ; j < lstint.size(); j++){
				
		//	}
	
		}
		return 0;
	}
}
