
public class Professor extends DeptEmployee {
	
	private int numberOfPublications;
	
	public Professor(String name, int year, int month, int day,
			double salary, int numberOfPublications) {
		super(name, year, month, day, salary);
		// TODO Auto-generated constructor stub
		
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append(" Publications No: ")
		.append(this.numberOfPublications)
		.append(" Salary: ").append(this.getSalary());
		
		return sb.toString();
	}

}
