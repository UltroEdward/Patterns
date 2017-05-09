package patterns.creational.factoryabstract.factory;

import patterns.creational.factoryabstract.items.Chair;
import patterns.creational.factoryabstract.items.Table;
import patterns.creational.factoryabstract.items.chainaimpl.ChainaChair;
import patterns.creational.factoryabstract.items.chainaimpl.ChainaTable;

public class ChainaFactory extends AbstractFactory{

	@Override
	public Chair getChair() {
		return new ChainaChair();
	}

	@Override
	public Table getTable() {
		return new ChainaTable();
	}

}
