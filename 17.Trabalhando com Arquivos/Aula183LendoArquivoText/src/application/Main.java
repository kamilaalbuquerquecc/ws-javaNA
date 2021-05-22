package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @KamilaAlbuquerque
 *
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc =null;
		File file = new File("C:\\Temp\\KAMILA.txt");
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) //saber se existe linha ianda no arquivo
				{
				System.out.println(sc.nextLine());
				
				}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null)
				sc.close();
		}

	}

}
