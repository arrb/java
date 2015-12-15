public class FooCorporation {
	
	public static void main(String[] args){
		
		double employee1 = 7.50;
		double employee2 = 8.20;
		double employee3 = 10.00;

		double hrEmpl1 = 35; 
		double hrEmpl2 = 47 ;
		double hrEmpl3 = 73; 
			
		if(employee1 < 8.00){
			System.out.println("Error: base pay has to be greater than 8");
		}else{totalPay(employee1, hrEmpl1);}
		
		if(employee2 < 8.00){
			System.out.println("Error: base pay has to be greater than 8");
		}else{totalPay(employee2, hrEmpl2);}
		
		if(employee3 < 8.00){
			System.out.println("Error: base pay has to be greater than 8");
		}else{totalPay(employee3, hrEmpl3);}
			
		
		
	}

	private static void totalPay(double employee, double hrEmpl) {
		// TODO Auto-generated method stub	
		if(hrEmpl > 40 && hrEmpl < 60){
			System.out.println("total pay = " + (1.5 * employee * hrEmpl));
		}
		else if (hrEmpl > 60){
			System.out.println("more than 60 hours error");
		} else {System.out.println("total pay = " + (employee * hrEmpl));}
		
	}

}
