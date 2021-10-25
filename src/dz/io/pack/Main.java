package dz.io.pack;
import java.io.File;

public class Main {

	public static void main(String... args) {

		File f = new File("Files/test.txt");
		System.out.println("is a file : " + f.isFile());
		System.out.println("is a directory : " + f.isDirectory());
		System.out.println("absolute Path :" + f.getAbsolutePath());
		System.out.println("exists ? : " + f.exists());

		System.out.println("afiichage du l'ecture de la racine ");

		for (File roots : f.listRoots()) {
			System.out.println(roots.getAbsolutePath());

			try {
				int nbrParLigne = 0;
				for (File nom : roots.listFiles()) {
					System.out.print(nom.isDirectory() ? "\t /" + nom.getName() : "\t " + nom.getName());
					nbrParLigne++;
					if (nbrParLigne % 3 == 0)
						System.out.print("\n");
				}
				 System.out.print("\n");
			} catch (NullPointerException e) {

			}
		}

	}

}
