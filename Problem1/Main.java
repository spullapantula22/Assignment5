
public class Main {
	
	public static void main(String[] args) {
		
		Shape[] shapes = {new Circle(5),
						new Rectangle(5,5),
						new Square(4,4,"Green")};
		
		printTotal(shapes);
		
	}
	
	public static void printTotal(Shape[] shapes)
	 {
		
		StringBuilder sb = new StringBuilder();
		
		double area = 0;
		double perimeter = 0;
		
		for(Shape s: shapes) {
			
			area += s.calculateArea();
			perimeter += s.calculatePerimeter();
		}
		sb.append("Total area is: ").append((double) Math.round(area*100)/100).append("\n");
		sb.append("Total perimeter is: ").append((double) Math.round(perimeter * 100)/100);
		
		System.out.println(sb.toString());
	 }

}
