/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import Clases.Descuento;
import DAO.consultaDescuentosDAO;
import static Logica.LogicaDescuentos.cargaTabla;
import static Logica.LogicaDescuentos.ventanaVE;
import static Ventanas.VentanaPrincipal.aplicaDescuento;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author sopor
 */
public class VentanaIngresarDescuento extends javax.swing.JDialog {

    /**
     * Creates new form VentanaIngresarDescuento
     */
    public VentanaIngresarDescuento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Proveedor:");

        jButton1.setText("Generar Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Proveedor...", "3M", "ABUS", "ACEROS COX", "ACETOGEN INDUSTRIAL", "ACMA", "ACMANET", "ACO", "ADIOFFICE", "ADISOL ", "AGM", "AGROFOR LTDA", "AGROFOR S.A", "AIROLITE", "AISLANTES NACIONALES", "AISLANTES PARRAL", "AISLANTES VOLCAN", "AISLAPANEL", "AISLAPOL", "ALAMBRES POTRO PURASANGRE", "ALCAZAR", "ALCHILE", "ALFAPLAS", "ALGIFOL", "ALOXO", "ALTE", "AMERICAN SCREW", "AMERPLAST", "AMESTI", "ANASAC", "ANDES BIO-PELLETS S.A.", "ANDESRAP", "ANTEROS", "ANWO", "ARAR", "ARMACERO", "ARREDONDO", "ARTECOLA", "ASERRADEROS CAMUR", "ASERRADEROS MANUEL MUÑOZ", "ASTEEL", "AUSTRAL PLASTICOS", "B Y P", "BAHCO", "BAÑO CENTER", "BASH", "BATA", "BECTON", "BERR Y NALLY SPA", "BEST GARDEN", "BIO BIO", "BIOPLASTIC", "BOSCA", "BOSCH", "BOTTAI", "BUSEL", "C&M CHILE SPA", "CAMUS", "CANALES", "CANONTEX", "CARPENTER", "CAVE", "CEM", "CEMENTOS LA UNION", "CERAMICA SANTIAGO", "CERAMICAS KANTU", "CERAMICAS TORO SPA", "CERAMITEC", "CERRAJERIA MANUEL ADROVEZ", "CEYS", "CHILE PANEL S.A", "CHILEMAT", "CHRISTENSEN ", "CHRISTIAN DIAZ", "CINTAC", "CLEVER GROUP", "CMPC", "CNP", "CODELPA", "CODEPOL", "COFLEX ", "COLIGUES CURICÓ", "COMERCIAL DEVOTO", "COMERCIAL ECOSTONE", "COMERCIAL IRONTRUST", "COMERCIAL MAG", "COMERCIAL MOBIKIT", "COMERCIAL PINARES", "COMERCIAL REY", "COMERCIAL VAISMAN", "COMERCIALIZADORA LA DEHESA", "COMERCIALIZADORA XP S.A", "COMISA", "CON CON MADERAS", "CONDOR", "CONSTRUFACE ", "CORBETTA", "CORDILLERA", "COSMOPLAS", "COUNTACH S.A.", "COVISA", "CREST", "CTM", "DAP DUCASSE", "DARTEL", "DECOEXPRESS ", "DECOGREEN", "DECOGROUP", "DERCO PARTS", "DICOMAC", "DIDEVAL", "DISTINTEC", "DISTRIBUIDORA ARIRANG", "DOLEZYCH CHILE", "DOWNLIGHT", "DSC", "DUCASSE", "DUSCHY CHILE S.A.", "DVP", "DYNAL ", "EAGON", "ECOSA", "EGLO ILUMINACION", "EINHELL", "ELECTROLUX", "ELECTROPRODUCTOS", "EMARESA DISTRIBUCION", "EMARESA FORESTAL (STIHL)", "EMASA ", "ENERGIZER", "EPA CHILE", "EPICA STAR", "EQUIPOS DE RIEGO SPA.", "ESPOL S.A", "ETERSOL", "FABER-CASTELL", "FADONEL", "FAESIN", "FAMASTIL", "FANALOZA", "FAS", "FELTREX", "FEMOGLAS", "FERRAMENTA", "FERRATI", "FERRETERIA OHIGGINS", "FERROMAT", "FIBROCEMENTOS VOLCAN", "FILMAMERICA", "FIRE MASTER", "FITTEX", "FORESTAL COLLICURA LIMITADA", "FORESTAL LEONERA", "FORESTAL RIO CLARO", "FORESTAL SANTA BLANCA", "FORESTAL SANTA LORETO", "FORESTAL Y AGRICOLA YUKON ", "FORMASUR", "FUTUROIL", "GAMMA COLOR", "GARMENDIA", "GEVEMAC", "GILI", "GLOBALMARKET", "GOBANTES", "GOLDEN PANEL CHILE SPA", "GOMAHOGAR", "GOTEX COMERCIAL LTDA.", "GRUPO LATYN", "GRUPO TX", "GYMSA", "H.J", "HELA", "HENKEL", "HOFFENS", "HOJALATERIA FEGALV", "HYDROPOL", "IBERICA INDUSTRIAL", "IDETEX", "IMBRA", "IMEL", "IMPOGAR ", "IMPORPER", "IMPORTADORA BS", "IMPORTADORA VERTICAL", "IMPROVAR", "INCHALAM", "INDEPP", "INDURA", "INDUSTRIAL Y COMERCIAL MAGNOLIA", "INEX", "INMAFOR", "INPPA", "INTEC", "INVERSIERRA", "INVERSIONES HARAS", "IPPSA", "IRRITEC", "ISESA", "ITAKA", "ITC", "JCE", "JUNKERS", "KALOP", "KARCHER CHILE", "KERSTING", "KINDOR", "KINGROY", "KLINGSPOR", "KLIPEN", "KNAUF", "KOSLAN", "KRAUSSER CORDELES", "LAN GLOBAL", "LANCO", "LAS DOS ESTRELLAS", "LEGRAND", "LEKER", "LEMACO", "LIOI", "LIZCAL", "LOCTITE", "LP CHILE", "LUCAS BLANDFORD", "MACROTEL", "MADERAS ARAUCO", "MADERAS BRAVO", "MADERAS EL PANGUE", "MADERAS INSIGNE", "MADERAS MARTIN", "MADERAS SANTA ELISA", "MADERERA PROSPERIDAD", "MAKITA", "MALLATEC", "MAR AZUL", "MAR DEL SUR", "MARIENBERG", "MASISA", "MASONITE", "MASTERFIBRA", "MATRIPLAST ", "MAXZYME", "MC GARCIA", "MC2 SPA", "MEC", "MEDESTUK", "MEDIDORES MAIPO", "MEGAPOL", "MELON", "METALAMERICA", "METALHSA", "MILAN", "MOLDECOR", "MOSAICO", "MULTIACEROS", "MULTIVENDOR", "NAUTIKA CHILE", "NEOX", "NEWTRADE", "NIBSA", "NILFISK ", "NOVOPLAST", "ODIS", "P.G.I.C.", "PANELES LEONERA LIMITADA", "PAREX CHILE", "PARKSOLAR", "PASSOL", "PEGATANKE", "PERFILAM", "PERFIMET", "PERSER", "PETRILAC", "PETROFLEX", "PIMA", "PINTUREC", "PIZARREÑO", "PLASMET", "PLASTICORD", "PLAY PLAZA", "POLCURA", "POLI", "POLINASA", "POLISAK", "POLPAICO", "POLYTERM", "POLYTEX", "PREFABRICADOS GRAU", "PREMET", "PRESERVA", "PRIMATERM ", "PRODALUM", "PROHESA", "PROIBER CHILE", "PROTEKTA", "PUERTAS FORTALEZA SPA", "PUERTAS IGAL", "PUERTAS WOODS", "QRUBBER", "QUIMICA UNIVERSAL", "R Y R", "RAYTAN", "REDBO", "REDES CABOS E HILOS", "REFRACTARIOS IUNGE", "REGALOGAR", "REHAU", "REIFOX", "REMA", "RENGOALUM", "RENNER", "RF LUMBER LTDA.", "RGM", "RHONA", "RIO BAKER", "ROBLAN", "RODILLOS VALFRAN ", "ROLLMIX", "ROMERAL", "RUST OLEUM", "SALOMON SACK", "SAN DIEGO", "SANDE", "SCANAVINI", "SCHNEIDER ELECTRIC", "SENSUS", "SERVICOMP", "SHERWIN-WILLIAMS", "SIGMA", "SIKA", "SILCOSIL", "SIMPSON STRONG", "SINDELEN", "SISTEMAS HIDRAULICOS SPA", "SOLCROM", "SOPROCAL", "SOUDAL", "STANLEY BLACK AND DECKER", "SURTIVENTAS", "TAB", "TAJAMAR", "TAP", "TAUMM", "TEBISA", "TECHNOPLUS", "TECNO TRUSS S.A.", "TEJERAS Y LADRILLERAS DEL SUR LTDA", "TEKA", "TEMPEST", "TEMSA", "TESA", "THC CHILE", "TIGRE", "TITAN", "TOOLTEK SPA", "TOYAMA", "TRAMONTINA", "TRANSACO", "TRESS", "TRICOLOR", "TRICON PELLET", "TROTTER", "TUHOME SPA", "TULSA S.A", "URGELL", "UTRON ", "UYUSTOOLS", "V.H.", "VECTOR LTDA.", "VENTUS", "VERSACHEM", "VICSA", "VICTORINOX", "VIDRIOS LIRQUEN", "VIELCO", "VIELVA", "VILLALBA", "VINILIT", "VNX LTDA", "VOLCAN", "VULCANO", "WD-40", "WESSER", "WILLIAMSON", "WINKLER", "WOODS CHILE", "WULKAN", "WURTH CHILE", "ZAGREB" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 218, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            VentanaPrincipal.crearExcel();
        } catch (IOException ex) {
            Logger.getLogger(VentanaIngresarDescuento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String toString = jComboBox1.getSelectedItem().toString();

        if (!toString.trim().equals("Elegir Proveedor...")) {
            try {
                ArrayList<Descuento> leerExcelDescuentoNuevo = leerExcelDescuentoNuevo();

                DAO.consultaMarcaDAO.registraMarca(toString);

                leerExcelDescuentoNuevo.parallelStream().forEach((Descuento descuento) -> {
                    try {
                        consultaDescuentosDAO.registraDescuentos(descuento);
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaIngresarDescuento.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(VentanaIngresarDescuento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                JOptionPane.showMessageDialog(VentanaPrincipal.ventanaPrincipal, "Descuento Agregados!");

                aplicaDescuento();

                ventanaVE = new VentanaVE(VentanaPrincipal.ventanaPrincipal, true);
                ventanaVE.setSize(new Dimension(860, 683));
                ventanaVE.setResizable(false);
                ventanaVE.setLocationRelativeTo(VentanaPrincipal.ventanaPrincipal);

                JPanel cargaTabla = cargaTabla();
                ventanaVE.jScrollPane1.setViewportView(cargaTabla);

                ventanaVE.setVisible(true);

                dispose();
            } catch (IOException ex) {
                Logger.getLogger(VentanaIngresarDescuento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaIngresarDescuento.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(VentanaPrincipal.ventanaPrincipal, "Proveedor Vacio!", "No puede dejar el capo proveedor vacio.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ventanaVE = new VentanaVE(VentanaPrincipal.ventanaPrincipal, true);
        ventanaVE.setSize(new Dimension(860, 683));
        ventanaVE.setResizable(false);
        ventanaVE.setLocationRelativeTo(VentanaPrincipal.ventanaPrincipal);

        try {
            JPanel cargaTabla = cargaTabla();
            ventanaVE.jScrollPane1.setViewportView(cargaTabla);
        } catch (IOException ex) {
            Logger.getLogger(VentanaVE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaVE.class.getName()).log(Level.SEVERE, null, ex);
        }

        ventanaVE.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static ArrayList<Descuento> leerExcelDescuentoNuevo() throws FileNotFoundException, IOException {
        ArrayList<Descuento> arrDescuento = new ArrayList<>();

        File excelFile = new File(System.getProperty("user.dir") + "\\Descuento.xlsx");
        FileInputStream ExcelFileToRead = new FileInputStream(excelFile);
        Workbook wb = new XSSFWorkbook(ExcelFileToRead);
        Sheet sheet = wb.getSheetAt(0);

        Iterator rows = sheet.rowIterator();

        rows.next();

        int i = 0;
        while (rows.hasNext()) {
            Descuento desc = new Descuento();
            Row row = (Row) rows.next();
            Iterator cells = row.cellIterator();

            int cont = 0;
            while (cells.hasNext()) {
                //System.out.println(cont);
                Cell cell = (Cell) cells.next();
                switch (cont) {
                    case 0:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setCodigo(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setCodigo(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setCodigo(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                desc.setCodigo(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                    case 1:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setPrecioFinal(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setPrecioFinal(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setPrecioFinal(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                desc.setPrecioFinal(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                }

                desc.setNombreProvedor(jComboBox1.getSelectedItem().toString());
                desc.setD1("0.0");
                desc.setD2("0.0");
                desc.setD3("0.0");

                cont = cont + 1;
            }
            arrDescuento.add(desc);
            i++;
        }

        return arrDescuento;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}