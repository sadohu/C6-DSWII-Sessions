package Streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamsII {

	public static void main(String[] args) throws Exception {
		String fileRoute = "src/files/cursos2024.txt";
		
		//Aplicamos la clase FileOutputStream
		FileOutputStream  fileOutputStream = new FileOutputStream(fileRoute);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		
		String string = "Cursos de programacion: Lenguaje de programacion II, Lenguaje de Programacion I,"
				+ "Base de datos I, Base de datos II";
		
		dataOutputStream.writeUTF(string);
		dataOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(fileRoute);
		DataInputStream dataInputStream =  new DataInputStream(fileInputStream);
		
		System.out.println(dataInputStream.readUTF());
		dataInputStream.close();
	}

}
