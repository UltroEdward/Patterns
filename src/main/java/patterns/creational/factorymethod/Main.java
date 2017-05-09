package patterns.creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		factory.getAnimal("Amur").doRoar();
		factory.getAnimal("Snezhok").doRoar();

	}

}
