package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//create new or return existing flyweight
public class FlyWeightFactory {

	private Map<String, TreeFlyWeight> items = new HashMap<>();

	public TreeFlyWeight get(String name) {
		
		if (items.containsKey(name)) {
			return items.get(name);
		} else {
			items.put(name, new TreeFlyWeight());
		}
		return items.get(name);
	}
}
