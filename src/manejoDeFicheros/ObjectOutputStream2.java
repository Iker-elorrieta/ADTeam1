package manejoDeFicheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream2 extends ObjectOutputStream{

	protected ObjectOutputStream2(FileOutputStream pFos) throws IOException, SecurityException {
		super(pFos);
	}	
	
	@Override
	protected void writeStreamHeader() throws IOException{
		this.reset();
	}
}