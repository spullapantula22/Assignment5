package University;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(String name, int year, int month, int day, 
			double salary, double overtimeHours) {
		super(name, year, month, day, salary);
		// TODO Auto-generated constructor stub
		
		this.overtimeHours = overtimeHours;
	}	
	
	@Override
	public double computeSalary() {
		
		return 12 *(this.overtimeHours) + this.getSalary();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append(" Overtime Hours: ")
		.append(this.overtimeHours).append(" Overtime Salary: ")
		.append(this.computeSalary());
		
		return sb.toString();
	}

}
