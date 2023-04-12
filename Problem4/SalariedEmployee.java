public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee(String name, String lastName, 
			String socialSecurityNumber, double ws) {
		super(name, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		
		this.weeklySalary = ws;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	double getPayment() {
		// TODO Auto-generated method stub
		return this.weeklySalary;
	}
	
	public String toString() {
		
		return super.toString() + ", " + this.weeklySalary;
	}

}
