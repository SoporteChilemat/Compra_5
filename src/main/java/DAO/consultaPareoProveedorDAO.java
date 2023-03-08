package DAO;

import Clases.PareoProveedor;
import static Ventanas.VentanaPrincipal.conex;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class consultaPareoProveedorDAO {

    public static boolean registraPareoProveedor(PareoProveedor pareoProveedor) throws IOException, SQLException {
        try (Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("INSERT INTO dbo.pareoProveedor (nombreNuestro, nombreChilemat, rut) VALUES ('"
                    + pareoProveedor.getNombreNuestro() + "', '"
                    + pareoProveedor.getNombreChilemat() + "', '"
                    + pareoProveedor.getRut() + "')"
            );
            estatuto.close();
//                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static PareoProveedor consultaProveedor(String nombreChilemat) throws IOException, SQLException {
        PareoProveedor pareoProveedor = new PareoProveedor();
        try (PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * from dbo.pareoProveedor WHERE nombreChilemat = '" + nombreChilemat + "'"); ResultSet res = consulta.executeQuery()) {
            while (res.next()) {
                pareoProveedor.setNombreNuestro(res.getString("nombreNuestro"));
                pareoProveedor.setNombreChilemat(res.getString("nombreChilemat"));
                pareoProveedor.setRut(res.getString("rut"));
            }
            res.close();
            consulta.close();
            return pareoProveedor;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return pareoProveedor;
        }
    }
}
