package patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.facade.complexparts.Engine;
import patterns.structural.facade.complexparts.Wheel;

public class CarFacade {
	private Engine engine;
	private List<Wheel> wheels;
	
	public CarFacade (){
		engine = new Engine();
		wheels = new ArrayList<Wheel>();
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		wheels.add(new Wheel());
	}
	
	public void run(){
		engine.getOil();
		engine.getFuel();
		engine.run();
	}

}
