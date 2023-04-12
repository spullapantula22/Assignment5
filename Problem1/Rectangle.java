
public class Rectangle implements Shape {
	
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	

}
