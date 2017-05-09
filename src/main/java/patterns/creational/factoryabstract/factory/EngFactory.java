package patterns.creational.factoryabstract.factory;

import patterns.creational.factoryabstract.items.Chair;
import patterns.creational.factoryabstract.items.Table;
import patterns.creational.factoryabstract.items.engimpl.EngChair;
import patterns.creational.factoryabstract.items.engimpl.EngTable;

public class EngFactory extends AbstractFactory {

	@Override
	public Chair getChair() {
		return new EngChair();
	}

	@Override
	public Table getTable() {
		return new EngTable();
	}

}
