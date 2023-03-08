package DAO;

import Clases.Descuento;
import static Ventanas.VentanaPrincipal.conex;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class consultaDescuentosDAO {

    public static boolean registraDescuentos(Descuento descuento) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("INSERT INTO dbo.descuentos (codigo, descuento1, descuento2, descuento3, precioFinal, marca,pk) VALUES ('"
                    + descuento.getCodigo() + "', '"
                    + descuento.getD1() + "', '"
                    + descuento.getD2() + "', '"
                    + descuento.getD3() + "', '"
                    + descuento.getPrecioFinal() + "', '"
                    + descuento.getNombreProvedor() + "', '"
                    + descuento.getCodigo() + descuento.getNombreProvedor() + "')");
            estatuto.close();
//                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException e) {
            try ( Statement estatuto = conex.getConnection().createStatement()) {
                System.out.println("UPDATE dbo.descuentos SET precioFinal ='" + descuento.getPrecioFinal() + "' , descuento1 = '" + descuento.getD1()
                        + "', descuento2 = '" + descuento.getD2()
                        + "', descuento3 = '" + descuento.getD3() + "' WHERE pk = '" + descuento.getCodigo() + descuento.getNombreProvedor() + "'");
                estatuto.executeUpdate("UPDATE dbo.descuentos SET precioFinal ='" + descuento.getPrecioFinal() + "' , descuento1 = '" + descuento.getD1()
                        + "', descuento2 = '" + descuento.getD2()
                        + "', descuento3 = '" + descuento.getD3() + "' WHERE pk = '" + descuento.getCodigo() + descuento.getNombreProvedor() + "'");
                estatuto.close();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }
    }

    public static ArrayList<Descuento> consultaDescuentos() throws IOException, SQLException {
        ArrayList<Descuento> arrDescuentos = new ArrayList<>();
        try ( PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT codigo, descuento1, descuento2, descuento3, precioFinal, marca from dbo.descuentos");  ResultSet res = consulta.executeQuery()) {
            while (res.next()) {
                Descuento descuento = new Descuento();
                descuento.setCodigo(res.getString("codigo"));
                descuento.setD1(res.getString("descuento1"));
                descuento.setD2(res.getString("descuento2"));
                descuento.setD3(res.getString("descuento3"));
                descuento.setPrecioFinal(res.getString("precioFinal"));
                descuento.setNombreProvedor(res.getString("marca"));
                arrDescuentos.add(descuento);
            }
            res.close();
            consulta.close();
            return arrDescuentos;
        } catch (SQLException e) {
            System.out.println("47");
            System.out.println(e.getMessage());
            return arrDescuentos;
        }
    }

    public static ArrayList<String> consultaMarcas() throws IOException, SQLException {
        ArrayList<String> arrDescuentos = new ArrayList<>();
        try ( PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT marca from dbo.marcas");  ResultSet res = consulta.executeQuery()) {
            while (res.next()) {
                arrDescuentos.add(res.getString("marca"));
            }
            res.close();
            consulta.close();
            return arrDescuentos;
        } catch (SQLException e) {
            return arrDescuentos;
        }
    }

    public static boolean eliminaDescuentos(String marca) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeUpdate("DELETE dbo.descuentos WHERE marca = '" + marca + "'");
            estatuto.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
