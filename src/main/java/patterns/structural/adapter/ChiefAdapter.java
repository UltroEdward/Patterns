package patterns.structural.adapter;

public class ChiefAdapter implements Chief {

	private Plumber plumber = new Plumber();

	public void makeBreakfast() {
		 plumber.getKey();
	}

	public void makeDinner() {
		 plumber.getScrewDriver();
	}

	public void makeSupper() {
		 plumber.getPipe();
	}

}