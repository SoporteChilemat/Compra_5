package DAO;

import static Ventanas.VentanaPrincipal.conex;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GODDAO {

    public static String ConsultaGOD() throws IOException, SQLException {
        String string = "";
        try (Statement estatuto = conex.getConnection().createStatement()) {
            ResultSet res = estatuto.executeQuery("SELECT passgod from dbo.god");
            if (res.next()) {
                string = res.getString("passgod");
            }
            res.close();
            estatuto.close();
            return string;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return string;
        }
    }
}
