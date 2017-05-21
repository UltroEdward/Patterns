package patterns.structural.composite;

/**
 * Leaf implementation
 * @author Horseman
 *
 */
public class Shape implements Component {

	public void add(Component c) {
		throw new UnsupportedOperationException();   
	}

	public void remove(Component c) {
		throw new UnsupportedOperationException();   
		
	}

	public void draw() {
		System.out.println("Drawing shape");
	}

}
