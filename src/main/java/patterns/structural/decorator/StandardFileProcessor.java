package patterns.structural.decorator;

import java.io.File;

public class StandardFileProcessor implements FileProcessor {

	public void read(File file) {
		System.out.println("Read file");	
	}

	public void write(File file) {
		System.out.println("Write file");	
	}

}
