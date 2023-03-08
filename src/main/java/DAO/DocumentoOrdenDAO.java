/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static Ventanas.VentanaPrincipal.conex2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sopor
 */
public class DocumentoOrdenDAO {

    public static void QueryMultipleResultSets(ArrayList<String> arrConsultas) {
        String SQL = "";
        for (int i = 0; i < arrConsultas.size(); i++) {
            String consulta = arrConsultas.get(i);
            SQL = SQL + ";" + consulta;
        }

        System.out.println(SQL);

        SQL = SQL.replaceFirst(";", "");

        try (Statement stmt = conex2.getConnection().createStatement()) {

            boolean results = stmt.execute(SQL);
            int rsCount = 0;

            // Loop through the available result sets.
            do {
                if (results) {
                    ResultSet rs = stmt.getResultSet();
                    rsCount++;

                    // Show data from the result set.
                    System.out.println("RESULT SET #" + rsCount);
                    while (rs.next()) {
                        System.out.println(rs.getString("precioUnitario") + ", " + rs.getString("proveedor") + ", " + rs.getString("cliente"));
                    }
                }
                System.out.println();
                results = stmt.getMoreResults();
            } while (results);
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
