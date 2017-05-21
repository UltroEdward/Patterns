package patterns.structural.composite;

public class Main {

	public static void main(String[] args) {
		
		Component main = new Box();
		Component box1 = new Box();
		Component box2 = new Box();
		Component box3 = new Box();
		
		main.add(box1);
		main.add(new Circle());
		main.add(new Circle());
		main.add(new Shape());
		
		main.add(box2);
		box2.add(box3);
		box3.add(new Circle());
		box3.add(new Circle());
		box3.add(new Shape());
		
		main.draw();
		
	}
}
