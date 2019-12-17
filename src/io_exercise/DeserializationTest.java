package io_exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationTest {
	public static void main(String[] args) throws FileNotFoundException {
	
		try {
			File fileToRead = new File("..\\io_exercise\\backup\\mess.dat");
			FileInputStream fis = new FileInputStream(fileToRead);
			
			ObjectInputStream in = new ObjectInputStream(fis);
			io_exercise.Message message = (io_exercise.Message) in.readObject();
			System.out.println(message.getTextMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
