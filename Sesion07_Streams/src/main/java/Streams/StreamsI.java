package Streams;

import java.util.Scanner;

public class StreamsI {

	public static void main(String[] args) {
		// Instanciar clase DataInputStream
		// DataInputStream inputStream = new DataInputStream(System.in); <- Deprecated
		Scanner scanner = new Scanner(System.in);
		
		// Declaramos números de tipo entero e imprimimos
		System.out.println("Ingrese los números solicitados");
		
		try {
			int a = Integer.parseInt(scanner.nextLine());
			int b = Integer.parseInt(scanner.nextLine());
			int c = Integer.parseInt(scanner.nextLine());
		
			int suma = a + b +c;
			System.out.println("La suma de los números es " + suma);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
