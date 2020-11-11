/**
 * 
 */
package com.client.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class ReadAndWrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Path path=Paths.get("test.txt");
		//Files.writeString(path, "hello word",  StandardOpenOption.APPEND);
		
		
		String ss = Files.readString(path);
		
	 ss.lines().map(x-> x.split("reponses=")[1]).forEach(System.out::println);
		
		
		
	}

}
