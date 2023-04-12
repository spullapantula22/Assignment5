import java.time.LocalDate;

public class DeptEmployee {
	
	private String name;
	private LocalDate hireDate;
	private double salary;
	
	public DeptEmployee(String name, int year, int month, int day, double salary) {
		this.name = name;
		this.hireDate = LocalDate.of(year, month, day);
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double computeSalary() {
		
		return this.getSalary();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name: ").append(name)
		.append(" Hire Date: ").append(this.hireDate)
		.append(" Salary: ").append(this.salary);
		
		return sb.toString();

	}

}
