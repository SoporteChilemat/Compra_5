/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Cruze;
import static Ventanas.VentanaPrincipal.conex;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sopor
 */
public class CruzeDAO {

    public static ArrayList<Cruze> selectCruze() throws SQLException {
        ArrayList<Cruze> arrCruze = new ArrayList<>();
        try (PreparedStatement estatuto = conex.getConnection().prepareStatement("SELECT * FROM (SELECT u.*,\n"
                + "ROW_NUMBER() OVER (\n"
                + "PARTITION BY codigoOriginal, precioFinal, codigoProducto\n"
                + "ORDER BY codigoOriginal, precioFinal, codigoProducto) rownum,\n"
                + "ROW_NUMBER() OVER (\n"
                + "PARTITION BY proveedor, cliente, codigoProducto\n"
                + "ORDER BY proveedor, cliente, codigoProducto) rownum2\n"
                + "FROM (SELECT preveedor, \n"
                + "cliente,\n"
                + "codigoProducto, \n"
                + "descripcionProducto, \n"
                + "promedioTotal, \n"
                + "cantidad, \n"
                + "stockVigentePB, \n"
                + "factor, \n"
                + "stockVigenteVA, \n"
                + "factorVA, \n"
                + "stockVigenteOL, \n"
                + "factorOL, \n"
                + "codigoOriginal, \n"
                + "precioUnitario,\n"
                + "precioFinal,\n"
                + "proveedor,\n"
                + "fecha,\n"
                + "nOrden\n"
                + "FROM (SELECT g.*, d.precioUnitario, d.precioFinal, d.proveedor, d.cliente, d.fecha, d.nOrden\n"
                + "FROM (SELECT * FROM (SELECT u.*,\n"
                + "ROW_NUMBER() OVER (\n"
                + "PARTITION BY preveedor,u.	codigoProducto,u.	descripcionProducto,u.	promedioTotal,u.	cantidad,u.	stockVigentePB,u.	factor,u.	stockVigenteVA,u.	factorVA,u.	stockVigenteOL,u.	factorOL,u.	codigoOriginal\n"
                + "ORDER BY preveedor,u.	codigoProducto,u.	descripcionProducto,u.	promedioTotal,u.	cantidad,u.	stockVigentePB,u.	factor,u.	stockVigenteVA,u.	factorVA,u.	stockVigenteOL,u.	factorOL,u.	codigoOriginal) rownumx\n"
                + "FROM (SELECT f.preveedor, \n"
                + "f.codigoProducto,\n"
                + "descripcionProducto,\n"
                + "promedioTotal,\n"
                + "cantidad,\n"
                + "stockVigentePB,\n"
                + "factor,\n"
                + "stockVigenteVA,\n"
                + "factorVA,\n"
                + "stockVigenteOL,\n"
                + "factorOL,\n"
                + "v.codigoOriginal\n"
                + "FROM (SELECT pb.preveedor, \n"
                + "pb.codigoProducto,\n"
                + "pb.descripcionProducto, \n"
                + "pb.promedioTotal, \n"
                + "pb.cantidad,\n"
                + "pb.stockVigente as stockVigentePB, \n"
                + "ROUND(cast( pb.cantidad as float)/ nullif(cast( pb.stockVigente as float),0),2) as factor, \n"
                + "va.stockVigente as stockVigenteVA, \n"
                + "ROUND(cast( va.cantidad as float)/ nullif(cast( va.stockVigente as float),0),2) as factorVA, \n"
                + "ol.stockVigente as stockVigenteOL, \n"
                + "ROUND(cast( ol.cantidad as float)/ nullif(cast( ol.stockVigente as float),0),2) as factorOL			 \n"
                + "FROM [descarga].[dbo].[informesPB] as pb \n"
                + "left join [descarga].[dbo].[informesVA] as va on pb.codigoProducto = va.codigoProducto \n"
                + "left join [descarga].[dbo].[informesOL] as ol on pb.codigoProducto = ol.codigoProducto) as f \n"
                + "left join [ingresoAutomatico].[dbo].[pareoCodigo2] as v on f.codigoProducto = v.codigo1) as u) as l where l.rownumx = 1) as g\n"
                + "left join (SELECT * FROM [ordenes].[dbo].[orden_2] WHERE fecha > DATEADD(month, -2, GETDATE())) as d on g.codigoOriginal = d.codigo) as h\n"
                + "group by precioUnitario, preveedor, cliente, codigoProducto, descripcionProducto, promedioTotal, cantidad, stockVigentePB, factor, stockVigenteVA, factorVA, stockVigenteOL, factorOL, codigoOriginal, precioUnitario, precioFinal, proveedor, fecha, nOrden) as u\n"
                + ") as k where rownum = 1 or (cliente = 'COMERCIAL FRANCISCO TOSO LTDA.' and rownum2 = 1)\n"
                + "order by codigoProducto, precioFinal asc"); ResultSet res = estatuto.executeQuery()) {
            while (res.next()) {
                Cruze cruze = new Cruze();
                cruze.setPreveedor(res.getString("preveedor"));
                cruze.setCliente(res.getString("Cliente"));
                cruze.setCodigoProducto(res.getString("codigoProducto"));
                cruze.setDescripcionProducto(res.getString("descripcionProducto"));
                cruze.setPromedioTotal(res.getString("promedioTotal"));
                cruze.setCantidad(res.getString("cantidad"));
                cruze.setStockVigentePB(res.getString("stockVigentePB"));
                cruze.setFactor(res.getString("factor"));
                cruze.setStockVigentePB(res.getString("stockVigenteVA"));
                cruze.setFactorVA(res.getString("factorVA"));
                cruze.setStockVigenteOL(res.getString("stockVigenteOL"));
                cruze.setFactorOL(res.getString("factorOL"));
                cruze.setCodigoOriginal(res.getString("codigoOriginal"));
                cruze.setPrecioUnitario(res.getString("precioUnitario"));
                cruze.setPrecioFinal(res.getString("precioFinal"));
                cruze.setProveedor(res.getString("proveedor"));
                cruze.setFecha(res.getString("fecha"));
                cruze.setnOrden(res.getString("nOrden"));
                arrCruze.add(cruze);
            }
            res.close();
            estatuto.close();
        } catch (Exception ex) {
            System.out.println("ex " + ex);
        }
        return arrCruze;
    }

    public static ArrayList<String> selectProveedores() throws SQLException {
        ArrayList<String> arrProveedores = new ArrayList<>();
        System.out.println("select distinct preveedor from (select distinct preveedor from [dbo].[informesPB] \n"
                + "union\n"
                + "select distinct preveedor from [dbo].[informesVA]\n"
                + "union\n"
                + "select distinct preveedor from [dbo].[informesOL]) as g WHERE preveedor is not null and preveedor <> 'NULL' and preveedor <> ''");
        try (PreparedStatement estatuto = conex.getConnection().prepareStatement("select distinct preveedor from (select distinct preveedor from [dbo].[informesPB] \n"
                + "union\n"
                + "select distinct preveedor from [dbo].[informesVA]\n"
                + "union\n"
                + "select distinct preveedor from [dbo].[informesOL]) as g WHERE preveedor is not null and preveedor <> 'NULL' and preveedor <> ''"); ResultSet res = estatuto.executeQuery()) {
            while (res.next()) {
                arrProveedores.add(res.getString("preveedor"));
            }
            res.close();
            estatuto.close();
        } catch (Exception ex) {
            System.out.println("ex " + ex);
        }
        return arrProveedores;
    }
}
