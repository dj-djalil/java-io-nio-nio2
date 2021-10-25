package dz.io.pack;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class Filter_Input_Output_Stream {
	public static void main(String[] args)   {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		 try {
			  fis = new FileInputStream ("Files/dictionnaire.txt");
			  bis = new BufferedInputStream(new FileInputStream("Files/dictionnaire.txt"));
			  fos = new FileOutputStream("Files/copyDictionnaire1.txt");
			  bos = new BufferedOutputStream(new FileOutputStream("Files/copyDictionnaire2.txt"));
			  
			
			byte buf [] = new byte [8];
			
			double startedTime = System.currentTimeMillis();
			while (fis.read(buf)!= -1 ) {
				fos.write(buf);
			}
			double endTime = System.currentTimeMillis();
			System.out.println("Read bytes with FileInputStream :"+ (endTime - startedTime));
			 startedTime = System.currentTimeMillis();
			 while(bis.read(buf)!= -1) {
				 bos.write(buf);
			 }
			 endTime = System.currentTimeMillis();
			 System.out.println("Read bytes with BufferedInputStream :"+(endTime-startedTime));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // note : we can use try catch ressources instead of close the Stream manualy
		 finally {
			 if(fis != null) {
				 try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 if(fos != null) {
				 try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 
			 if(bis != null) {
				 try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 if(bos != null) {
				 try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }

	}

}
