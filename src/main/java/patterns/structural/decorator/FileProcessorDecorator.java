package patterns.structural.decorator;

import java.io.File;

public abstract class FileProcessorDecorator implements FileProcessor {

	protected final FileProcessor fileProcessor;

	public FileProcessorDecorator(FileProcessor fileProcessor) {
		this.fileProcessor = fileProcessor;
	}

	public void read(File file) {
		fileProcessor.read(file);
	}

	public void write(File file) {
		fileProcessor.write(file);
	}

}
