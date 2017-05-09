package patterns.creational.builder;

public class Pizza {

	private int size;
	private int weight;
	private String name;

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("Pizza %s with size %d and weight %d", name, size, weight);
	}
	private Pizza(Builder builder) {
		this.size = builder.size;
		this.weight = builder.weight;
		this.name = builder.name;
	}

	public static class Builder {
		
		private int size;
		private int weight;
		private String name;

		public Builder setSize(int size) {
			this.size = size;
			return this;
		}

		public Builder setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

}
