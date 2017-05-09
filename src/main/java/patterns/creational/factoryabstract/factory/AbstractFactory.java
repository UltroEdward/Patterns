package patterns.creational.factoryabstract.factory;

import patterns.creational.factoryabstract.items.Chair;
import patterns.creational.factoryabstract.items.Table;

public abstract class AbstractFactory {

	public abstract Chair getChair();

	public abstract Table getTable();

}
