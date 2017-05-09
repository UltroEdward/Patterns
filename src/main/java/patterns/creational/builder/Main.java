package patterns.creational.builder;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder().setWeight(1000).setSize(36).setName("pepperoni").build();
		System.out.println(pizza);
	}
}
