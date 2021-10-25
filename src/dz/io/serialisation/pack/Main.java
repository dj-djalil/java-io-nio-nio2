package dz.io.serialisation.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game ("pes","football", 200.0d);
		ObjectOutputStream oos = null;
	 try {
		 
		  oos = new ObjectOutputStream(new FileOutputStream(new File("Files/gameObjects/games.txt")));
		  // serialiser lobjet game 
		  oos.writeObject(game);
	} catch (FileNotFoundException e) {
		 
		e.printStackTrace();
	} catch (IOException e) {
		 
		e.printStackTrace();
	}finally {
		if(oos != null) {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
}
