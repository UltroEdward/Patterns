package patterns.structural.decorator;

import java.io.File;

public class EncryptionFileProcessorDecorator extends FileProcessorDecorator{

	public EncryptionFileProcessorDecorator(FileProcessor fileProcessor) {
		super(fileProcessor);
	}

	public void read(File file) {
		System.out.println("Un-crypt file");	
		super.read(file);
	}

	public void write(File file) {
		super.write(file);
		System.out.println("Crypt file");	
	}
}
