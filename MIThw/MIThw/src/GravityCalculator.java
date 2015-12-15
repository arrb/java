
public class GravityCalculator {
	
	    public static void main(String[] arguments) {
	        double fallingTime = 10.0;
	        double finalPosition = 0.0;
	        
	        double a = -9.81; 
	        int time = 10 ; 
	        double v1 = 0 ; 
	        double x1 = 0 ; 	        
	        x1 = 0.5 * a * Math.pow(time, 2)  + v1 *time + 0 ;
	        System.out.println(x1);
	        System.out.println("The object's position after " + fallingTime +
	                " seconds is " + finalPosition + " m.");
	    }
	
}
