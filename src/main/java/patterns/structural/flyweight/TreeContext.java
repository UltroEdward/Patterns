package patterns.structural.flyweight;

public class TreeContext {

	private TreeFlyWeight treeFl;
	private int x;
	private int y;

	public TreeContext(int x, int y, TreeFlyWeight tree) {
		this.x = x;
		this.y = y;
		this.treeFl = tree;
	}

	public String toString() {
		return "Name: " + treeFl.getName();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
