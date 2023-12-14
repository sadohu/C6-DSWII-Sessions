package Test;

import java.util.List;

import Model.Autor;
import Service.AutorService;

public class TestServices {

	public static void main(String[] args) throws Exception {
		// autores();
		addAutor();
	}
	
	private static void autores() throws Exception{
		AutorService autorService = new AutorService();
		List<Autor> autors = autorService.autores();
		for (Autor autor : autors) {
			System.out.println(autor);
		}
	}
	
	private static void addAutor() {
		AutorService autorService = new AutorService();
		Autor autor = new Autor();
		autor.setIdautor(0);
		autor.setNomautor("Aluze");
		autor.setDescrip("Te saco los ojos bobo!");
		
		autorService.saveAutor(autor);
	}

}
