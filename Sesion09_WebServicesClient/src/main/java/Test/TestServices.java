package Test;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Model.Autor;
import Service.AutorService;

public class TestServices {

	public static void main(String[] args) throws Exception {
		// autores();
		// searchAutor(1);
		// addAutor();
		// updateAutor();
		deleteAutor(7);
	}
	
	private static void autores() throws Exception{
		AutorService autorService = new AutorService();
		List<Autor> autors = autorService.autores();
		for (Autor autor : autors) {
			System.out.println(autor);
		}
	}
	
	private static void searchAutor(int id) throws Exception{
		AutorService autorService = new AutorService();
		Autor autor = autorService.autorById(id);
		System.out.println(autor);
	}
	
	private static void addAutor() {
		AutorService autorService = new AutorService();
		Autor autor = new Autor();
		autor.setIdautor(0);
		autor.setNomautor("Aluze");
		autor.setDescrip("Te saco los ojos bobo!");
		
		autorService.saveAutor(autor);
	}
	
	private static void updateAutor() {
		AutorService autorService = new AutorService();
		Autor autor = new Autor();
		autor.setIdautor(7);
		autor.setNomautor("Aluze Luperdi");
		autor.setDescrip("Logica de Programación II!");
		
		autorService.updateAutor(autor);
	}
	
	private static void deleteAutor(int id) throws Exception{
		AutorService autorService = new AutorService();
		autorService.deleteAutor(id);
	}

}
