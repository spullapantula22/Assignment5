package Problem5;

public class Main {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer("Samsung", "Intel i7 Core", 16, 4300);
		Computer comp2 = new Computer("Samsung", "Intel i7 Core", 16, 4300);
		
		System.out.println(comp1.equals(comp2));
	}

}
