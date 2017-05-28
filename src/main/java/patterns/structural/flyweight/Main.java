package patterns.structural.flyweight;

public class Main {

	public static void main(String[] args) {
		TreeContext tree = new TreeContext(5, 5, new FlyWeightFactory().get("OAK"));
		System.out.println(tree.toString());

	}

}
