package DAO;

import static Ventanas.VentanaPrincipal.conex;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class consultaInformeDAO {

    public static String ConsultaLocalMonitorInforme(String usuario, String locall) throws IOException, SQLException {
        String string = "";
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            ResultSet executeQuery = estatuto.executeQuery("SELECT locall from dbo.monitorinforme WHERE usuario = '" + usuario + "' AND locall = '" + locall + "'");
            if (executeQuery.next()) {
                string = executeQuery.getString("locall");
            }
            executeQuery.close();
            estatuto.close();
            return string;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return string;
        }
    }

    public static void registraMonitorInforme(String informe, String usuario, String locall) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("INSERT INTO dbo.monitorInforme (informe, usuario, locall) VALUES ('"
                    + informe + "', '"
                    + usuario + "', '"
                    + locall + "')"
            );
            estatuto.close();
//                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
//            JOptionPane.showMessageDialog(null, "No se Registro la persona\n" + e);
        }
    }

    public static void actualizaMonitorInforme(String informe, String usuario, String locall) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeUpdate("UPDATE dbo.monitorinforme SET informe ='" + informe + "' WHERE usuario = '" + usuario + "' AND locall = '" + locall + "'");
            estatuto.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void actualizaReportesInforme(String usuario, String locall) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("UPDATE dbo.reporteinforme SET " + locall + " = " + null + " WHERE usuario = '" + usuario + "'");
            estatuto.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registraReportesInformeNull(String usuario) throws IOException, SQLException {
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            estatuto.executeQuery("INSERT INTO dbo.reporteinforme (usuario) VALUES ('"
                    + usuario + "')"
            );
            estatuto.close();
//                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
//            JOptionPane.showMessageDialog(null, "No se Registro la persona\n" + e);
        }
    }

    public static byte[] ConsultaLocal(String local, String extencion, String usuario, String fechas) throws IOException, SQLException {
        byte[] bytes = null;
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            System.out.println("SELECT " + local + " from dbo.reporteinforme");
            ResultSet executeQuery = estatuto.executeQuery("SELECT " + local + " from dbo.reporteinforme WHERE usuario ='" + usuario + "'");
            if (executeQuery.next()) {
                bytes = executeQuery.getBytes(local);

                File fileExel = new File(System.getProperty("user.dir") + "\\" + local.toUpperCase() + "\\" + fechas + "." + extencion);
                if (!fileExel.exists()) {
                    fileExel.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(fileExel);
                fos.write(bytes);
                fos.close();
            }
            executeQuery.close();
            estatuto.close();
            return bytes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return bytes;
        }
    }

    public static String ConsultaLocalReporteInforme(String usuario, String local) throws IOException, SQLException {
        String string = "";
        try ( Statement estatuto = conex.getConnection().createStatement()) {
            ResultSet executeQuery = estatuto.executeQuery("SELECT " + local + " from dbo.reporteinforme WHERE usuario = '" + usuario + "'"
            );
            if (executeQuery.next()) {
                string = executeQuery.getString(local);
            }
            executeQuery.close();
            estatuto.close();
            return string;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return string;
        }
    }
}
