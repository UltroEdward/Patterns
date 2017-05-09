package patterns.creational.factorymethod;

import patterns.creational.factorymethod.items.Animal;
import patterns.creational.factorymethod.items.Cat;
import patterns.creational.factorymethod.items.Tiger;

public class Factory {

	public Animal getAnimal(String name) {
		if (name.equals("Snezhok"))
			return new Cat();
		else if (name.equals("Amur"))
			return new Tiger();
		return null;
	}

}
