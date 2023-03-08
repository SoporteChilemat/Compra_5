/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.MenorPrecio;
import static Ventanas.VentanaPrincipal.conex2;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sopor
 */
public class MenorPrecioDAO {

    public static ArrayList<MenorPrecio> selectPreciosOrdenes(String codigo) throws IOException, SQLException {
        ArrayList<MenorPrecio> arrMenorPrecio = new ArrayList<>();
        try (Statement estatuto = conex2.getConnection().createStatement()) {
            System.out.println("SELECT precioFinal, proveedor, fecha from dbo.orden_2 WHERE codigo = '" + codigo + "'");
            ResultSet res = estatuto.executeQuery("SELECT CONVERT(float,REPLACE(REPLACE(precioFinal,'.',''),',','.')) AS precio, proveedor, fecha from dbo.orden_2 WHERE codigo = '" + codigo + "' order by precio desc");
            while (res.next()) {
                MenorPrecio menorPrecio = new MenorPrecio();
                menorPrecio.setFecha(res.getString("fecha"));
                menorPrecio.setPrecioFinal(res.getString("precio"));
                menorPrecio.setProveedor(res.getString("proveedor"));
                arrMenorPrecio.add(menorPrecio);
            }
            res.close();
            estatuto.close();
            return arrMenorPrecio;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
