package patterns.creational.prototype;

public class Cat implements Cloneable {

	private String name;
	private int age;
	private String color;

	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("I am %s, %d years old with %s color", name, age, color);

	}

	@Override
	public Cat clone() {
		try {
			return (Cat) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
