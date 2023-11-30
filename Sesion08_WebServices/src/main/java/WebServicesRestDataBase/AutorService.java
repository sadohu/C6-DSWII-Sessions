package WebServicesRestDataBase;

import java.util.List;

import WebServicesRestDataBase.Autor;

public interface AutorService {
	void addAutor(Autor autor);
	void updateAutor(Autor autor);
	void deleteAutor(Autor autor);
	Autor findAutor(Autor autor);
	List<Autor> listAutors();
}
