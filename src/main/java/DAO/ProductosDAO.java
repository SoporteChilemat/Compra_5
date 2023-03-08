/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Productos;
import static Ventanas.VentanaPrincipal.conex;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sopor
 */
public class ProductosDAO {

    public static PreparedStatement preparedStatement;

    public static boolean registraProductos(ArrayList<Productos> arrProductos, String local) {
        try {
            if (local.equals("PB")) {
                preparedStatement = conex.getConnection().prepareStatement("INSERT INTO dbo.informesPB (codigoProducto, descripcionProducto, preveedor, cantidad, unidad, "
                        + "medida, stockVigente, stockValido, ultimaFechaIngreso, ultimoIngreso, ultimoPrecio, promedioTotal, local) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            } else if (local.equals("VA")) {
                preparedStatement = conex.getConnection().prepareStatement("INSERT INTO dbo.informesVA (codigoProducto, descripcionProducto, preveedor, cantidad, unidad, "
                        + "medida, stockVigente, stockValido, ultimaFechaIngreso, ultimoIngreso, ultimoPrecio, promedioTotal, local) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            } else if (local.equals("OL")) {
                preparedStatement = conex.getConnection().prepareStatement("INSERT INTO dbo.informesOL (codigoProducto, descripcionProducto, preveedor, cantidad, unidad, "
                        + "medida, stockVigente, stockValido, ultimaFechaIngreso, ultimoIngreso, ultimoPrecio, promedioTotal, local) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            }

            arrProductos.stream().forEach((Productos producto) -> {
                try {
                    preparedStatement.setString(1, producto.getCodigo());
                    preparedStatement.setString(2, producto.getDescripcion());
                    preparedStatement.setString(3, producto.getProveedor());
                    preparedStatement.setString(4, producto.getCantidadComprada());
                    preparedStatement.setString(5, producto.getUnidad());
                    preparedStatement.setString(6, producto.getMedida());
                    preparedStatement.setString(7, producto.getStockVigente());
                    preparedStatement.setString(8, producto.getStockValido());
                    preparedStatement.setString(9, producto.getUltimaFechaIngreso());
                    preparedStatement.setString(10, producto.getUltimoIngeso());
                    preparedStatement.setString(11, producto.getUltimoPrecio());
                    preparedStatement.setString(12, producto.getPromTotal());
                    preparedStatement.setString(13, local);
                    preparedStatement.addBatch();

                } catch (SQLException ex) {
                    Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            });
            preparedStatement.executeBatch();
            preparedStatement.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static ArrayList<Productos> selectProductos(String local) throws SQLException {
        ArrayList<Productos> arrProductos = new ArrayList<>();
        try (PreparedStatement estatuto = conex.getConnection().prepareStatement("SELECT * FROM dbo.informes" + local + ""); ResultSet res = estatuto.executeQuery()) {
            while (res.next()) {
                Productos producto = new Productos();
                producto.setCodigo(res.getString("codigoProducto"));
                producto.setDescripcion(res.getString("descripcionProducto"));
                producto.setProveedor(res.getString("preveedor"));
                producto.setCantidadComprada(res.getString("cantidad"));
                producto.setUnidad(res.getString("unidad"));
                producto.setMedida(res.getString("medida"));
                producto.setStockVigente(res.getString("stockVigente"));
                producto.setStockValido(res.getString("stockValido"));
                producto.setUltimaFechaIngreso(res.getString("ultimaFechaIngreso"));
                producto.setUltimoIngeso(res.getString("ultimoIngreso"));
                producto.setUltimoPrecio(res.getString("ultimoPrecio"));
                producto.setPromTotal(res.getString("promedioTotal"));
                arrProductos.add(producto);
            }
            res.close();
            estatuto.close();
        }
        return arrProductos;
    }
}
