package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

	private List<Component> items = new ArrayList<Component>();

	public void add(Component c) {
		items.add(c);
	}

	public void remove(Component c) {
		items.remove(c);

	}

	public void draw() {
		System.out.println("Drawing box items:");
		for (Component component : items) {
			component.draw();
		}

	}

}
