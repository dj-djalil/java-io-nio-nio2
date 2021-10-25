package dz.io.pack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_Output_Stream {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("files/test.txt");
			fos = new FileOutputStream("files/copyTest.txt");
			byte[] buf = new byte[8];
			int readValue = 0;
			while ((readValue = fis.read(buf)) != -1) {

				fos.write(buf);
				for (byte b : buf) {
					System.out.print("\t" + b + "(" + (char) b + ")");
				}
				System.out.print("\n");
				buf = new byte[8];
			}

			System.out.println("Copy ended");
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					 
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					 
					e.printStackTrace();
				}
			}
			
			 
		}

	}

}
