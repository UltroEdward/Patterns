package patterns.structural.decorator;

import java.io.File;

public interface FileProcessor {

	public void read(File file);

	public void write(File file);

}
