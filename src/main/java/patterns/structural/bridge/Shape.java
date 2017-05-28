package patterns.structural.bridge;

public class Shape {
	
	protected Drawer drawer;
	
	public Shape (Drawer drawer){
		this.drawer = drawer;
	}
	
	public void doWork() {
		System.out.println("drawing cool");
	}
	
	public void draw(){
		drawer.draw();
	}

}
