package Problem4;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
		
	public HourlyEmployee(String name, String lastName, 
			String socialSecurityNumber, double w, double h) {
		super(name, lastName, socialSecurityNumber);
		
		this.wage = w;
		this.hours = h;
		
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	double getPayment() {
		// TODO Auto-generated method stub
		
		return wage * hours;
	}
	
	public String toString() {
		
		return super.toString() + ", " + this.wage + ", "  + this.hours;
	}
	
}
