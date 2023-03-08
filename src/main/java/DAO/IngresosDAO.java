/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Ingresos;
import static Ventanas.VentanaPrincipal.conex3;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sopor
 */
public class IngresosDAO {

    public static ArrayList<String> selectCodigos(String codigo) throws SQLException {
        ArrayList<String> arrCodigos = new ArrayList<>();
        System.out.println("select distinct [codigoOriginal] \n"
                + "FROM [ingresoAutomatico].[dbo].[pareoCodigo2] where [codigo1] = '" + codigo + "'");
        try (PreparedStatement estatuto = conex3.getConnection().prepareStatement("select distinct [codigoOriginal] \n"
                + "FROM [ingresoAutomatico].[dbo].[pareoCodigo2] where [codigo1] = '" + codigo + "' and codigoOriginal <> ''"); ResultSet res = estatuto.executeQuery()) {
            while (res.next()) {
                arrCodigos.add(res.getString("codigoOriginal"));
            }
        }

        return arrCodigos;
    }
}
