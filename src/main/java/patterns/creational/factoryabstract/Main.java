package patterns.creational.factoryabstract;

import patterns.creational.factoryabstract.factory.AbstractFactory;
import patterns.creational.factoryabstract.factory.ChainaFactory;
import patterns.creational.factoryabstract.factory.EngFactory;

public class Main {

	public static void main(String[] args) {

		AbstractFactory factory1 = new ChainaFactory();
		System.out.println(factory1.getChair().getInfo());
		System.out.println(factory1.getTable().getInfo());

		AbstractFactory factory2 = new EngFactory();
		System.out.println(factory2.getChair().getInfo());
		System.out.println(factory2.getTable().getInfo());
		
	}
}
