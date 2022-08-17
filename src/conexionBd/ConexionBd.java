package conexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {

	private Connection connection;

	public ConexionBd() {
		super();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Se encontró el driver");

		} catch (ClassNotFoundException e) {
			System.out.println("No se encontró el driver");
			e.printStackTrace();
			return;
		}

		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "VENTAS", "VENTAS");
			System.out.println("Conexión creada con éxito");

		} catch (SQLException e) {
			System.out.println("No se logró iniciar la conexión");
			e.printStackTrace();
			return;
		}

		try {
			connection.close();
			System.out.println("Conexión cerrada con éxito");

		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión");
			e.printStackTrace();
			return;
		}
	}
}
