package Test;

import java.util.List;

import Model.Autor;
import Service.AutorService;

public class TestServices {

	public static void main(String[] args) throws Exception {
		autores();
	}
	
	private static void autores() throws Exception{
		AutorService autorService = new AutorService();
		List<Autor> autors = autorService.autores();
		for (Autor autor : autors) {
			System.out.println(autor);
		}
	}

}
