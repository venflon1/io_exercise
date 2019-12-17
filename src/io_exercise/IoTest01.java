package io_exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;


public class IoTest01 {
	
	private static Logger log = Logger.getLogger(IoTest01.class.getName());
	private static final String pathFileWrite = "C:\\Users\\titano\\Desktop";
	
	static {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File(pathFileWrite+"\\prova1.txt"));
			writer.print("Esercitazione\nsu\npackage\njava.io\ncopia\ndel\ncontenuto\ndi\nun\nfile\n");
			writer.close();
		} catch (FileNotFoundException e) {
			log.severe("path: \'"+ pathFileWrite +"\' does not exist!");
			e.printStackTrace();
		} 
		finally {
			if(writer != null)
				writer.close();
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 2) {
			log.severe("I must specified two parameters for perform this program."
					 + "param 1) file thath you want to backup"
					 + "param 2) name you specified for backup file");
			System.exit(1);
		}
		
		File fileToRead = null;
		if ( !(fileToRead = new File("C:\\Users\\titano\\Desktop\\" + args[0])).exists() ){
			log.severe("file to read not exist!");
			System.exit(1);
		}
		
		BufferedReader reader = null;
		PrintWriter writer = null;
		File fileToWrite = new File("..\\io_exercise\\backup\\" + args[1]);
		try {
			reader = new BufferedReader(new FileReader(fileToRead));
			writer = new PrintWriter(fileToWrite);
			String line = null;
			while( (line = reader.readLine()) != null) {
				writer.println(line);
			}
		} catch (FileNotFoundException e) {
			log.severe("file to read not exist!");
			e.printStackTrace();
		} catch(IOException e) {
			log.severe("I can not permission to write"); 
			e.printStackTrace();
		} finally {
			if(reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(writer != null)
				writer.close();
		}
		
	}
}
