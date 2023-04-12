package Problem4;

public class Main {
	
	public static void main(String []args) {
		
		Employee[] emp = new Employee[5];
		
		emp[0] = new CommissionEmployee("John", "Lucas", "111-11-1111", 120000, 0.25);
		emp[1] = new CommissionEmployee("Suzanne", "Helly", "000-00-1111", 2000000, 0.37);
		emp[2] = new SalariedEmployee("Anna", "Freid", "123-11-4321", 4000);
		emp[3] = new HourlyEmployee("Raj", "Singh", "000-11-0000", 22000, 35);
		emp[4] = new BasePlusCommissionEmployee("John", "Lucas", "111-11-1111", 4700000, 0.25, 250000);
		
		double total = 0;
		
		for(Employee e: emp) {
			
			total += e.getPayment();
		}
		
		System.out.println("Total: " + (double) Math.round(total*100)/100);
	}

}
