package patterns.structural.bridge;

public class Main {

	public static void main(String[] args) {
		new Shape(new CoolDrawer()).doWork();
		new Shape(new CoolDrawer()).draw();

	}

}
