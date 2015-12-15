package java1;

public class MostFrequent {
	public static void main(String[] args){
		int[] freq= new int[10];//0-9
        for (String arg : args) {
            try {
                freq[Integer.parseInt(arg)]++;
            }
            catch (NumberFormatException nfe) {
            	System.out.println("error here");
            }
        }
        int max= 0, j;
        for (j=1; j<args.length; j++) {
            while(freq[j]>freq[max]) {
                max=j;
            }
        }
        System.out.println("The digit that appears most frequently is " + max);
    }
		

}
