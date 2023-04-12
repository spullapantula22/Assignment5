package Problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure [] fig = {new UpwardHat(),
						 new UpwardHat(),
						 new DownwardHat(),
						 new FaceMaker(),
						 new Vertical()};
		
		for(Figure figure: fig) {
			
			figure.getFigure();
		}
	}

}
