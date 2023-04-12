public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String name, String lastName, 
			String socialSecurityNumber, double g, double c, double salary) {
		super(name, lastName, socialSecurityNumber, g, c);
		
		this.baseSalary = salary;
	}

	public double getSalary() {
		return baseSalary;
	}

	public void setSalary(double salary) {
		this.baseSalary = salary;
	}
	
	@Override
	public double getPayment() {	
		
		return this.baseSalary + (this.getGrossSales() * this.getCommissionRate());
	}

	@Override
	public String toString() {
		
		return super.toString() + this.baseSalary;
	}
	
	
}
