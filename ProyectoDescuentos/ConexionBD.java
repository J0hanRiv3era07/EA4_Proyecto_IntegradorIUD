package ProyectoDescuentos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private static final String URL = "jdbc:sqlite:tienda.db";

    public String probarConexion() {
        // try-with-resources: cierra todo automáticamente
        try (Connection conn = DriverManager.getConnection(URL);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT 1")) {

            return "Conexión exitosa a la base de datos SQLite.";

        } catch (SQLException e) {
            return "ERROR de conexión: " + e.getMessage();
        }
    }
}