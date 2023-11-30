package WebServicesRestDataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class AutorServiceImpl implements AutorService{

	@Override
	public void addAutor(Autor autor) {
		String query = "insert into tbl_autor values(null,?,?)";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = ConnectionDB.getConnection().prepareStatement(query);
			preparedStatement.setString(1, autor.getNomautor());
			preparedStatement.setString(2, autor.getDescrip());
			int x = preparedStatement.executeUpdate();
			if(x > 0){
				System.out.println("Dato Registrado en la BD");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void updateAutor(Autor autor) {
		String query = "update tbl_autor set nomautor=?, descrip=? where idautor=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = ConnectionDB.getConnection().prepareStatement(query);
			preparedStatement.setString(1, autor.getNomautor());
			preparedStatement.setString(2, autor.getDescrip());
			preparedStatement.setInt(3, autor.getIdautor());
			int x = preparedStatement.executeUpdate();
			if(x > 0){
				System.out.println("Dato Actualizado en la BD");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAutor(Autor autor) {
		String query = "delete tbl_autor where idautor=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = ConnectionDB.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, autor.getIdautor());
			int x = preparedStatement.executeUpdate();
			if(x > 0){
				System.out.println("Dato Eliminado en la BD");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Autor findAutor(Autor autor) {
		String query = "select * from tbl_autor where idautor=?";
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		
		return null;
	}

	@Override
	public List<Autor> listAutors() {
		// TODO Auto-generated method stub
		return null;
	}

}
