package DAO;

import Clases.Marcas;
import static Ventanas.VentanaPrincipal.conex;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class consultaMarcaDAO {
    
        public static boolean registraMarca(String marca) throws IOException, SQLException {
        try (Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("INSERT INTO dbo.marcas (marca) VALUES ('"
                    + marca + "')"
            );
            estatuto.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static ArrayList<Marcas> consultaMarcas() throws IOException, SQLException {
        ArrayList<Marcas> arrMarcas = new ArrayList<>();
        try (PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM dbo.marcas");
                ResultSet res = consulta.executeQuery()) {
            while (res.next()) {
                Marcas marca = new Marcas();
                marca.setMarca(res.getString("marca"));
                arrMarcas.add(marca);
            }
            res.close();
            consulta.close();
            return arrMarcas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return arrMarcas;
        }
    }

    public static boolean eliminaMarca(String marca) throws IOException, SQLException {
        try (Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeUpdate("DELETE FROM dbo.marcas WHERE marca = '" + marca + "'");
            estatuto.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }    
}
