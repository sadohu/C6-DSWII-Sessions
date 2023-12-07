package DataBase;

public class ConnectionDBTest {

	public static void main(String[] args) {
		try {
			ConnectionDB.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
