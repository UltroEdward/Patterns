package patterns.creational.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat cat1 = new Cat("Barsik", 5, "black");
		System.out.println(cat1);

		Cat cat2 = cat1.clone();
		System.out.println(cat2);

	}

}
