package patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		Chief chief = new ChiefAdapter();
		chief.makeDinner();
	}

}
