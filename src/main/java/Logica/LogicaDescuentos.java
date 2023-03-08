package Logica;

import Clases.Descuento;
import Ventanas.VentanaVE;
import DAO.consultaDescuentosDAO;
import static Logica.LogicaDescuentos.ventanaVE;
import Ventanas.VentanaPrincipal;
import java.awt.Component;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LogicaDescuentos {

    public static VentanaVE ventanaVE;
    public static ArrayList< ArrayList<JPanel>> arrPanel = new ArrayList<>();
    public static ArrayList<JPanel> listPanel = new ArrayList<>();
    public static int cont = 0;
    public static boolean bool = false;

    public static void Principal() throws IOException, SQLException {
        ventanaVE = new VentanaVE(VentanaPrincipal.ventanaPrincipal, true);
        ventanaVE.setSize(new Dimension(860, 683));
        ventanaVE.setResizable(false);
        ventanaVE.setLocationRelativeTo(VentanaPrincipal.ventanaPrincipal);

        JPanel cargaTabla = cargaTabla();
        ventanaVE.jScrollPane1.setViewportView(cargaTabla);
        
        ventanaVE.setVisible(true);
    }

    public static JPanel cargaTabla() throws IOException, SQLException {

        listPanel = new ArrayList<>();
        arrPanel = new ArrayList<>();

        //obtener informacion de BD 
        List<String> proveedores = consultaDescuentosDAO.consultaMarcas();
        ArrayList<Descuento> consultaDescuentos = consultaDescuentosDAO.consultaDescuentos();

        System.out.println("proveedores " + proveedores.size());
        System.out.println("consultaDescuentos " + consultaDescuentos.size());

        cont = 0;

        proveedores.stream().forEach((String get) -> {

            if (cont > 1) {
                arrPanel.add(listPanel);
                listPanel = new ArrayList<>();
                cont = 0;
            }

            PanelHija PanelHija = new PanelHija();

            PanelHija.jLabel1.setText(get);
            DefaultTableModel model = clientesModel(get, consultaDescuentos);
            PanelHija.jTable1.setModel(model);

            PanelHija.jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);

            PanelHija.jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);

            PanelHija.jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
            PanelHija.jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);

            DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table,
                        Object value, boolean isSelected, boolean hasFocus,
                        int row, int column) {
                    try {
                        String replace = value.toString();
                        Double valueOf = Double.valueOf(replace);
                        long round = Math.round(valueOf);

                        return super.getTableCellRendererComponent(table, "$ " + round, isSelected, hasFocus, row, column);
                    } catch (Exception ex) {
                        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    }
                }
            };

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
            centerRenderer2.setHorizontalAlignment(JLabel.CENTER);

            PanelHija.jTable1.setRowHeight(25);
            PanelHija.jTable1.setShowHorizontalLines(true);
            PanelHija.jTable1.setShowVerticalLines(true);

            PanelHija.jTable1.getColumnModel().getColumn(0).setCellRenderer(renderer);
//            PanelHija.jTable1.getColumnModel().getColumn(1).setCellRenderer(renderer);
//            PanelHija.jTable1.getColumnModel().getColumn(2).setCellRenderer(renderer);
//            PanelHija.jTable1.getColumnModel().getColumn(3).setCellRenderer(renderer);
            PanelHija.jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer2);
            PanelHija.jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            PanelHija.jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);

            listPanel.add(PanelHija);
            cont++;
        });

        if (cont % 4 != 0) {
            arrPanel.add(listPanel);
        }

        // panel main
        JPanel jp = new JPanel();
        // Crear layout de filas verticales
        jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));

        arrPanel.stream().forEach((ArrayList<JPanel> get) -> {
            JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            jp2.setLayout(new BoxLayout(jp2, BoxLayout.LINE_AXIS));
            jp2.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

            get.stream().forEach((JPanel get1) -> {
                jp2.add(get1);
            });

            jp.add(jp2);
        });

        return jp;
    }

    public static DefaultTableModel clientesModel(String proveedor1, ArrayList<Descuento> arrCliente) {

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo");
        model.addColumn("Des1");
        model.addColumn("Des2");
        model.addColumn("Des3");
        model.addColumn("Precio Final");

        Object[] fila = new Object[5];

        arrCliente.stream().forEach((Descuento desc) -> {
            String proveedor = desc.getNombreProvedor();

            if (proveedor.equals(proveedor1)) {
                fila[0] = desc.getCodigo();
                fila[1] = desc.getD1();
                fila[2] = desc.getD2();
                fila[3] = desc.getD3();
                fila[4] = desc.getPrecioFinal();
                model.addRow(fila);
            }
        });

        return model;
    }
}

//////////////////////////// CLASES //////////////////////////////////
class UpperCaseDocument extends PlainDocument {

    private boolean upperCase = true;

    public void setUpperCase(boolean flag) {
        upperCase = flag;
    }

    public void insertString(int offset, String str, AttributeSet attSet)
            throws BadLocationException {
        if (upperCase) {
            str = str.toUpperCase();
        }
        super.insertString(offset, str, attSet);
    }
}
