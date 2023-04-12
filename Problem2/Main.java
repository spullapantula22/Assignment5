import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		
		DeptEmployee[] dept = new DeptEmployee[5];
		
		dept[0] = new Professor("John Hemington", 2022, 4, 19, 65000, 13);
		dept[1] = new Professor("Suzanne Swift", 2018, 10, 23, 78000, 15);
		dept[2] = new Professor("Roswell Peterson", 2023, 06, 30, 82500, 10);
		dept[3] = new Secretary("Ellen King", 2015, 1, 1, 63500, 10);
		dept[4] = new Secretary("Peter Jordan", 2019, 3, 31, 55000, 12);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you wish to see the sum of Professor and Secretary\n"
				+ "salaries in the department? (Y/N)");
		
		String option = scan.nextLine();
		
		double sum = 0;
		
		if(option.equalsIgnoreCase("Y")) {
			
			for(DeptEmployee d: dept) {
				
				sum += d.computeSalary();
			}
			
			System.out.println("Total salary: " + (double) Math.round(sum*100)/100);
		}
		
		else {
			
			scan.close();
		}
	}

}
