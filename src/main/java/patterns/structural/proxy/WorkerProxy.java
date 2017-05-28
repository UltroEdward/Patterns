package patterns.structural.proxy;

public class WorkerProxy implements Worker {

	WorkerImpl worker = new WorkerImpl();

	public void doWord1() {
		worker.doWord1();
		System.out.println("proxy activity");
	}

	public void doWord2() {
		worker.doWord2();
		System.out.println("proxy activity");
	}

}
