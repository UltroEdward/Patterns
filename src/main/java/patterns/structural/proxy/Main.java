package patterns.structural.proxy;

public class Main {

	public static void main(String[] args) {
		Worker worker = new WorkerProxy();
		worker.doWord1();
		worker.doWord2();
	}

}
