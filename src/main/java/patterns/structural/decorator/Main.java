package patterns.structural.decorator;

public class Main {

	public static void main(String[] args) {
		FileProcessor processor;
		
		System.out.println("Standart file processor:");
		processor = new StandardFileProcessor();
		processor.read(null);
		processor.write(null);
		
		System.out.println("Zip file processor:");
		processor = new ZipFileProcessorDecorator(processor);
		processor.read(null);
		processor.write(null);
		
		System.out.println("Encrypt file processor:");
		processor = new EncryptionFileProcessorDecorator(processor);
		processor.read(null);
		processor.write(null);
		
		System.out.println("Zip file processor on line:");
		FileProcessor processor2;
		processor2 = new ZipFileProcessorDecorator(new EncryptionFileProcessorDecorator(new StandardFileProcessor()));
		processor2.read(null);
		processor2.write(null);
		
	}

}
