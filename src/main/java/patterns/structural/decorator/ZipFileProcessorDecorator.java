package patterns.structural.decorator;

import java.io.File;

public class ZipFileProcessorDecorator extends FileProcessorDecorator{

	public ZipFileProcessorDecorator(FileProcessor fileProcessor) {
		super(fileProcessor);
	}

	public void read(File file) {
		System.out.println("Un-zip file");	
		super.read(file);
	}

	public void write(File file) {
		super.write(file);
		System.out.println("Zip file");	
	}
}
