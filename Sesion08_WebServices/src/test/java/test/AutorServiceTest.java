package test;

import WebServicesRestDataBase.Autor;
import WebServicesRestDataBase.AutorService;
import WebServicesRestDataBase.AutorServiceImpl;

public class AutorServiceTest {

	public static void main(String[] args) {
		//addAutor();
		updateAutor();
	}
	
	private static void addAutor(){
		Autor autor = new Autor();
		AutorService service = new AutorServiceImpl();
		
		autor.setNomautor("Sadohu");
		autor.setDescrip("Gozuuu!");
		service.addAutor(autor);
	}
	
	private static void updateAutor(){
		Autor autor = new Autor();
		AutorService service = new AutorServiceImpl();
		
		autor.setIdautor(5);
		autor.setNomautor("Valdelomar");
		autor.setDescrip("Bajo muy low");
		service.updateAutor(autor);
	}
	
}
