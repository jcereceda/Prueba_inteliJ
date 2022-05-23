import java.sql.*;

public class BasicoBBDD {
	private String bd = "nba";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://127.0.0.1:3306/" + bd;
	private Connection conexion;

	public BasicoBBDD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			if (conexion != null) {
				System.out.println(" - Conexión a la BD " + url + " OK...");
				conexion.close();
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Driver JDBC no encontrado");
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Error al conectarse  a la BD");
			sqle.printStackTrace();
		} catch (Exception e) {
			System.out.println(" – Error general -");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BasicoBBDD prueba = new BasicoBBDD();
	}
}
