package io_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws FileNotFoundException {
		io_exercise.Message message = new io_exercise.Message();
		message.setTextMessage("ciao a tutti, ahioooo");
	
		try {
			File fileToWrite = new File("..\\io_exercise\\backup\\mess.dat");
			FileOutputStream fos = new FileOutputStream(fileToWrite);
			
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
