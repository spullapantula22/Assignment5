public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;	

	public CommissionEmployee(String name, String lastName, 
			String socialSecurityNumber, double g, double c) {
		super(name, lastName, socialSecurityNumber);
		
		this.grossSales = g;
		this.commissionRate = c;
		
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	double getPayment() {
		// TODO Auto-generated method stub
		return grossSales * commissionRate;
	}
	
	public String toString() {
		
		return super.toString() + this.grossSales + ", " + this.commissionRate;
	}

}
