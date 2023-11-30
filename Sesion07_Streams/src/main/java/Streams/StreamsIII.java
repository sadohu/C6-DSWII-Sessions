package Streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamsIII {

	public static void main(String[] args) throws Exception {
		File file = new File("src/files/notas2024.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		
		dataOutputStream.writeUTF("peru");
		dataOutputStream.writeInt(123);
		dataOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		
		String pais = dataInputStream.readUTF();
		int habitante = dataInputStream.readInt();
		dataInputStream.close();
		
		System.out.println(pais + " tiene " + habitante + " millones de habitantes.");
		
	}

}
