package WebServicesRestDataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DataBase.ConnectionDB;

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
		Autor dbAutor = null;
		try {
			preparedStatement = ConnectionDB.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, autor.getIdautor());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				dbAutor = new Autor(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dbAutor;
	}

	@Override
	public List<Autor> listAutors() {
		String query = "select * from tbl_autor";
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<Autor> autors = new ArrayList<Autor>();
		try {
			preparedStatement = ConnectionDB.getConnection().prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Autor autor = new Autor(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				autors.add(autor);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return autors;
	}

}
