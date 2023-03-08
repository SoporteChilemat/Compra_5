package Ventanas;

import Clases.AutoCompleteComboBox;
import Clases.Cruze;
import DAO.consultaInformeDAO;
import Clases.Descuento;
import Clases.Documento;
import Clases.PareoProveedor;
import Clases.Productos;
import DAO.CruzeDAO;
import DAO.ProductosDAO;
import static DAO.consultaDescuentosDAO.consultaDescuentos;
import DAO.consultaPareoProveedorDAO;
import static Ventanas.VentanaLogin.usuario;
import connect.DatabaseConnection;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.io.FileDeleteStrategy;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.Color;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.TableColumnModel;
import net.coderazzi.filters.gui.AutoChoices;
import net.coderazzi.filters.gui.TableFilterHeader;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.ini4j.Wini;

public class VentanaPrincipal extends javax.swing.JFrame {

    public static int index = 999999999;
    public static int encuentra = 0;
    public static ArrayList<Productos> arrGet = new ArrayList<>();
    public static ArrayList<Productos> arrGetPB = new ArrayList<>();
    public static ArrayList<Productos> arrGetOL = new ArrayList<>();
    public static ArrayList<Productos> arrGetVA = new ArrayList<>();
    public static ArrayList<ArrayList<Productos>> leeProductos = new ArrayList<>();
    public static ArrayList<ArrayList<String>> pareaCodigos = new ArrayList<>();
    public static VentanaPrincipal ventanaPrincipal;
    public static DatabaseConnection conex;
    public static DatabaseConnection conex2;
    public static DatabaseConnection conex3;
    public static VentanaLogin vl;
    public static VentanaCargando vc;
    public static ArrayList<String> arrClientes = new ArrayList<>();

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCargarInforme = new javax.swing.JButton();
        jButtonDescargarInformes = new javax.swing.JButton();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new AutoCompleteComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new AutoCompleteComboBox();
        jPanel8 = new javax.swing.JPanel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonQuitar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButtonComprar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCargarInforme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCargarInforme.setForeground(new java.awt.Color(255, 102, 102));
        jButtonCargarInforme.setText("Cruzar Informacion y cargar datos.");
        jButtonCargarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarInformeActionPerformed(evt);
            }
        });

        jButtonDescargarInformes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDescargarInformes.setForeground(new java.awt.Color(0, 153, 255));
        jButtonDescargarInformes.setText("DESCARGAR INFORME");
        jButtonDescargarInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescargarInformesActionPerformed(evt);
            }
        });

        rSDateChooser2.setPlaceholder("Seleccionar fecha HASTA");

        rSDateChooser1.setPlaceholder("Seleccionar fecha DESDE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROGRAMA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDescargarInformes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCargarInforme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCargarInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(jButtonDescargarInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esmeralda", "Karina", "Francisco", "Giacomo" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proveedores");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clientes");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 153, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonQuitar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonQuitar.setForeground(new java.awt.Color(0, 153, 255));
        jButtonQuitar.setText("Quitar");
        jButtonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Quitar Seleccion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "O.C.", "Proveedor", "Cliente", "Codigo", "Descripcion", "Promedio", "Cantidad", "Stock PB", "Factor PB", "Stock VA", "Factor VA", "Stock OL", "Factor OL", "Seleccion", "Precio", "Precio", "Proveedor", "Codigo Original", "Primero", "Color"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane1.addTab("Ventana Principal", jScrollPane2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Productos Agregados");

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonComprar.setText("COMPRAR");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComprar)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonComprar)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Poductos sin agregar");

        jButton1.setText("Exportar Excel");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos Agregados", jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu3.setText("Descuentos");

        jMenuItem1.setText("Mostrar Descuentos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Aplicar Descuento");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
//                    connection();
//                    connection2();
//                    connection3();

                    conex = new DatabaseConnection("servidor-toso.ddns.net", "sa", "qweASDzxc123*", "descarga");
                    conex.connect();
                    conex.startKeepAliveThread();

                    conex2 = new DatabaseConnection("servidor-toso.ddns.net", "sa", "qweASDzxc123*", "ordenes");
                    conex2.connect();
                    conex2.startKeepAliveThread();

                    conex3 = new DatabaseConnection("servidor-toso.ddns.net", "sa", "qweASDzxc123*", "ingresoAutomatico");
                    conex3.connect();
                    conex3.startKeepAliveThread();

                    ventanaPrincipal = new VentanaPrincipal();
                    ventanaPrincipal.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

//    public static void connection() throws IOException {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                try {
//                    conex.desconectar();
//                    System.out.println("Desconectando...");
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        conex = new DbConnection();
//
//        Thread thread = new Thread(() -> {
//            while (true) {
//                try {
//                    if (conex.getConnection().isClosed()) {
//                        try {
//                            conex = new DbConnection();
//                        } catch (IOException ex) {
//                            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    Thread.sleep(1000);
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        thread.start();
//    }
//
//    public static void connection2() throws IOException {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                try {
//                    conex2.desconectar();
//                    System.out.println("Desconectando...");
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        conex2 = new DbConnection2();
//
//        Thread thread = new Thread(() -> {
//            while (true) {
//                try {
//                    if (conex2.getConnection().isClosed()) {
//                        try {
//                            conex2 = new DbConnection2();
//                        } catch (IOException ex) {
//                            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    Thread.sleep(1000);
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        thread.start();
//    }
//
//    public static void connection3() throws IOException {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                try {
//                    conex3.desconectar();
//                    System.out.println("Desconectando...");
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        conex3 = new DbConnection3();
//
//        Thread thread = new Thread(() -> {
//            while (true) {
//                try {
//                    if (conex3.getConnection().isClosed()) {
//                        try {
//                            conex3 = new DbConnection3();
//                        } catch (IOException ex) {
//                            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    Thread.sleep(1000);
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        thread.start();
//    }
    public static ArrayList<ArrayList<Productos>> leeProductosSoloPB(String especial) throws FileNotFoundException, IOException {
//        try {
        arrProductosPBEspecial.clear();
        arrArrProductosEspecial.clear();

        System.out.println(especial);
        File excelFile = new File(especial);
        FileInputStream ExcelFileToRead = new FileInputStream(excelFile);
        HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
        HSSFSheet sheet = wb.getSheetAt(0);

        Iterator rows = sheet.rowIterator();

        while (rows.hasNext()) {
            Productos doc = new Productos();
            HSSFRow row = (HSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            int cont = 0;
            while (cells.hasNext()) {
                //System.out.println(cont);
                HSSFCell cell = (HSSFCell) cells.next();
                switch (cont) {
                    case 0:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setCodigo(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setCodigo(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setCodigo(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setCodigo(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 1:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setDescripcion(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setDescripcion(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setDescripcion(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setDescripcion(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 2:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setProveedor(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setProveedor(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setProveedor(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setProveedor(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 3:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setCantidadComprada(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setCantidadComprada(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setCantidadComprada(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setCantidadComprada(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 4:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setUnidad(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setUnidad(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setUnidad(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setUnidad(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 5:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setMedida(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setMedida(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setMedida(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setMedida(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 6:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setStockVigente(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setStockVigente(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setStockVigente(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setStockVigente(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 7:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setStockValido(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setStockValido(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setStockValido(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setStockValido(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 8:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setUltimaFechaIngreso(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setUltimaFechaIngreso(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setUltimaFechaIngreso(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setUltimaFechaIngreso(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 9:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setUltimoIngeso(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setUltimoIngeso(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setUltimoIngeso(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setUltimoIngeso(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                    case 10:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                doc.setPromTotal(String.valueOf(cell.getNumericCellValue()));
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                doc.setPromTotal(cell.getStringCellValue());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                doc.setPromTotal(cell.getStringCellValue());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                doc.setPromTotal(String.valueOf(valueOf).trim());
                            }
                        }
                        break;
                }
                cont = cont + 1;
            }
            arrProductosPBEspecial.add(doc);
        }
        arrArrProductosEspecial.add(arrProductosPBEspecial);

        return arrArrProductosEspecial;
//        } catch (Exception ex) {
//            return null;
//        }
    }

    public static ArrayList<Descuento> leerExcelDescuento(String ruta) throws FileNotFoundException, IOException {
//        try {
        arrDescuento.clear();

        System.out.println(ruta);
        File excelFile = new File(ruta);
        FileInputStream ExcelFileToRead = new FileInputStream(excelFile);
        HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
        HSSFSheet sheet = wb.getSheetAt(0);

        Iterator rows = sheet.rowIterator();

        int i = 0;
        while (rows.hasNext()) {
            Descuento desc = new Descuento();
            HSSFRow row = (HSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            int cont = 0;
            while (cells.hasNext()) {
                //System.out.println(cont);
                HSSFCell cell = (HSSFCell) cells.next();
                switch (cont) {
                    case 0:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setNombreProvedor(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setNombreProvedor(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setNombreProvedor(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                Integer valueOf = (int) cell.getNumericCellValue();
                                desc.setNombreProvedor(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                    case 1:
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
                    case 2:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setD1(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setD1(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setD1(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                System.out.println(cell.getNumericCellValue());
                                Double valueOf = (Double) cell.getNumericCellValue();
                                desc.setD1(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                    case 3:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setD2(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setD2(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setD2(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                Double valueOf = (Double) cell.getNumericCellValue();
                                desc.setD2(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                    case 4:
                        if (cell.getCellType() == CellType.FORMULA) {
                            if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                //cell.getNumericCellValue();
                                desc.setD3(String.valueOf(cell.getNumericCellValue()).trim());
                            } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                //cell.getStringCellValue();
                                desc.setD3(cell.getStringCellValue().trim());
                            }
                        } else {
                            try {
                                //cell.getStringCellValue();
                                desc.setD3(cell.getStringCellValue().trim());
                            } catch (Exception e) {
                                Double valueOf = (Double) cell.getNumericCellValue();
                                desc.setD3(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                    case 5:
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
                                System.out.println("i " + i);
                                Double valueOf = (Double) cell.getNumericCellValue();
                                desc.setPrecioFinal(String.valueOf(valueOf).trim().trim());
                            }
                        }
                        break;
                }
                cont = cont + 1;
            }
            arrDescuento.add(desc);
            i++;
        }

        return arrDescuento;
//        } catch (Exception ex) {
//            return null;
//        }
    }

    public static ArrayList<ArrayList<Productos>> leeProductos(String nombre) throws FileNotFoundException, IOException {
        try {
            arrProductosPB.clear();
            arrProductosOL.clear();
            arrProductosVA.clear();
            arrArrProductos.clear();

            progreso = 0;

            System.out.println("nombre " + nombre);

            HSSFRow row;
            HSSFCell cell;
            HSSFWorkbook wb;
            HSSFSheet sheet;
            FileInputStream ExcelFileToRead;
            File excelFile;
            Iterator rows;
            String cwd = System.getProperty("user.name");

            if (nombre.contains(".xlsx")) {
                nombre = nombre.replace(".xlsx", ".xls");
            }

            System.out.println(System.getProperty("user.dir") + "\\PB\\" + nombre);
            excelFile = new File(System.getProperty("user.dir") + "\\PB\\" + nombre);

            ExcelFileToRead = new FileInputStream(excelFile);
            wb = new HSSFWorkbook(ExcelFileToRead);
            sheet = wb.getSheetAt(0);
            int rowCountPB = sheet.getLastRowNum() + 1;

            rows = sheet.rowIterator();

            rows.next();
            rows.next();

            int i = 0;

            while (rows.hasNext()) {
                Productos producto = new Productos();
                row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                int cont = 0;
                while (cells.hasNext()) {
                    //System.out.println(cont);
                    cell = (HSSFCell) cells.next();
                    switch (cont) {
                        case 0:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setCodigo(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setCodigo(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setCodigo(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setCodigo(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 1:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setDescripcion(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setDescripcion(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setDescripcion(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setDescripcion(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 2:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setProveedor(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setProveedor(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setProveedor(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setProveedor(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 3:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setCantidadComprada(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setCantidadComprada(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setCantidadComprada(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setCantidadComprada(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 4:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setUnidad(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setUnidad(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setUnidad(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setUnidad(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 5:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setMedida(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setMedida(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setMedida(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setMedida(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 6:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setStockVigente(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setStockVigente(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setStockVigente(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setStockVigente(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 7:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setStockValido(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setStockValido(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setStockValido(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setStockValido(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 8:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setUltimaFechaIngreso(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setUltimaFechaIngreso(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setUltimaFechaIngreso(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setUltimaFechaIngreso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 9:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setUltimoIngeso(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setUltimoIngeso(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setUltimoIngeso(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setUltimoIngeso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 10:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setUltimoPrecio(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setUltimoPrecio(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setUltimoPrecio(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setUltimoPrecio(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 11:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    producto.setPromTotal(String.valueOf(cell.getNumericCellValue()));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    producto.setPromTotal(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    producto.setPromTotal(cell.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cell.getNumericCellValue();
                                    producto.setPromTotal(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                    }
                    cont = cont + 1;
                }

                i++;

                progreso = (int) ((i * 10) / rowCountPB);
//                System.out.println("--------------------------------> " + i + " " + rowCountPB + " " + progreso);
//                jProgressBar1.setValue(progreso);

                arrProductosPB.add(producto);
            }
            arrArrProductos.add(arrProductosPB);

            progreso = 10;

            System.out.println(nombre);
            String nombre1 = nombre;

            System.out.println(System.getProperty("user.dir") + "\\OL\\" + nombre1.replace(".xls", ".xlsx"));
            excelFile = new File(System.getProperty("user.dir") + "\\OL\\" + nombre1.replace(".xls", ".xlsx"));

            ExcelFileToRead = new FileInputStream(excelFile);
            XSSFWorkbook wb1 = new XSSFWorkbook(ExcelFileToRead);
            XSSFSheet sheet1 = wb1.getSheetAt(0);
            int rowCountOL = sheet1.getLastRowNum() + 1;

            Row row2;
            Cell cel2;
            Iterator rows1 = sheet1.rowIterator();

            rows1.next();
            rows1.next();

            i = 0;

            while (rows1.hasNext()) {
                Productos doc = new Productos();
                row2 = (Row) rows1.next();
                Iterator cells = row2.cellIterator();
                int cont = 0;
                while (cells.hasNext()) {
                    //System.out.println(cont);
                    cel2 = (Cell) cells.next();
                    switch (cont) {
                        case 0:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setCodigo(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setCodigo(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setCodigo(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setCodigo(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 1:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setDescripcion(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setDescripcion(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setDescripcion(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setDescripcion(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 2:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setProveedor(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setProveedor(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setProveedor(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setProveedor(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 3:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setCantidadComprada(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setCantidadComprada(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setCantidadComprada(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setCantidadComprada(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 4:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUnidad(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUnidad(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUnidad(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUnidad(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 5:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setMedida(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setMedida(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setMedida(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setMedida(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 6:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setStockVigente(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setStockVigente(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setStockVigente(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setStockVigente(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 7:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setStockValido(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setStockValido(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setStockValido(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setStockValido(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 8:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimaFechaIngreso(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimaFechaIngreso(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimaFechaIngreso(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimaFechaIngreso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 9:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimoIngeso(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimoIngeso(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimoIngeso(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimoIngeso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 10:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimoPrecio(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimoPrecio(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimoPrecio(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimoPrecio(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 11:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setPromTotal(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setPromTotal(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setPromTotal(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setPromTotal(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                    }
                    cont = cont + 1;
                }
                i++;

                progreso = 10 + (int) ((i * 10) / rowCountOL);
//                System.out.println("--------------------------------> " + i + " " + rowCountOL + " " + progreso);
//                jProgressBar1.setValue(progreso);

                arrProductosOL.add(doc);
            }
            arrArrProductos.add(arrProductosOL);

////////////////////////////////////////////////////////////////////////////////
            progreso = 20;

            System.out.println(nombre);
            nombre1 = nombre;

            System.out.println(System.getProperty("user.dir") + "\\VA\\" + nombre1.replace(".xls", ".xlsx"));
            excelFile = new File(System.getProperty("user.dir") + "\\VA\\" + nombre1.replace(".xls", ".xlsx"));

            ExcelFileToRead = new FileInputStream(excelFile);
            wb1 = new XSSFWorkbook(ExcelFileToRead);
            sheet1 = wb1.getSheetAt(0);
            int rowCountVA = sheet1.getLastRowNum() + 1;

            rows1 = sheet1.rowIterator();

            rows1.next();
            rows1.next();

            i = 0;

            while (rows1.hasNext()) {
                Productos doc = new Productos();
                row2 = (Row) rows1.next();
                Iterator cells = row2.cellIterator();
                int cont = 0;
                while (cells.hasNext()) {
                    //System.out.println(cont);
                    cel2 = (Cell) cells.next();
                    switch (cont) {
                        case 0:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setCodigo(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setCodigo(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setCodigo(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setCodigo(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 1:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setDescripcion(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setDescripcion(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setDescripcion(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setDescripcion(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 2:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setProveedor(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setProveedor(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setProveedor(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setProveedor(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 3:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setCantidadComprada(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setCantidadComprada(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setCantidadComprada(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setCantidadComprada(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 4:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUnidad(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUnidad(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUnidad(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUnidad(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 5:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setMedida(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setMedida(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setMedida(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setMedida(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 6:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setStockVigente(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setStockVigente(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setStockVigente(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setStockVigente(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 7:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setStockValido(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setStockValido(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setStockValido(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setStockValido(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 8:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimaFechaIngreso(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimaFechaIngreso(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimaFechaIngreso(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimaFechaIngreso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 9:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimoIngeso(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimoIngeso(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimoIngeso(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimoIngeso(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 10:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setUltimoPrecio(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setUltimoPrecio(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setUltimoPrecio(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setUltimoPrecio(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                        case 11:
                            if (cel2.getCellType() == CellType.FORMULA) {
                                if (cel2.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    doc.setPromTotal(String.valueOf(cel2.getNumericCellValue()));
                                } else if (cel2.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    doc.setPromTotal(cel2.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    doc.setPromTotal(cel2.getStringCellValue());
                                } catch (Exception e) {
                                    Integer valueOf = (int) cel2.getNumericCellValue();
                                    doc.setPromTotal(String.valueOf(valueOf).trim());
                                }
                            }
                            break;
                    }
                    cont = cont + 1;
                }
                i++;

                progreso = 20 + (int) ((i * 10) / rowCountVA);
//                System.out.println("--------------------------------> " + i + " " + rowCountVA + " " + progreso);
//                jProgressBar1.setValue(progreso);

                arrProductosVA.add(doc);
            }

            arrArrProductos.add(arrProductosVA);

            return arrArrProductos;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    public static ArrayList<ArrayList<String>> pareaCodigos(ArrayList<Productos> uno, ArrayList<Productos> dos, ArrayList<Productos> tres) {
        ArrayList<ArrayList<String>> arrString = new ArrayList<>();
        ArrayList<String> stockVigente1 = new ArrayList<>();
        ArrayList<String> cantidadComprada1 = new ArrayList<>();
        ArrayList<String> stockVigente2 = new ArrayList<>();
        ArrayList<String> cantidadComprada2 = new ArrayList<>();

        uno.stream().forEach((Productos get) -> {
            try {
                String codigo = get.getCodigo();

                AtomicInteger jAt = new AtomicInteger(0);
                dos.stream().forEach((Productos get1) -> {
                    int j = Integer.valueOf(jAt.toString());
                    String codigo1 = get1.getCodigo();

                    if (codigo.equals(codigo1)) {
                        stockVigente1.add(get1.getStockVigente());
                        cantidadComprada1.add(get1.getCantidadComprada());
                        return;
                    }
                    if (j == dos.size() - 1) {
                        stockVigente1.add("NULL");
                        cantidadComprada1.add("NULL");
                    }
                    jAt.getAndIncrement();
                });
                AtomicInteger jAt1 = new AtomicInteger(0);
                tres.stream().forEach((Productos get1) -> {
                    int j = Integer.valueOf(jAt1.toString());
                    String codigo1 = get1.getCodigo();
                    if (codigo.equals(codigo1)) {
                        stockVigente2.add(get1.getStockVigente());
                        cantidadComprada2.add(get1.getCantidadComprada());
                        return;
                    }
                    if (j == tres.size() - 1) {
                        stockVigente2.add("NULL");
                        cantidadComprada2.add("NULL");
                    }
                    jAt1.getAndIncrement();
                });
            } catch (Exception ex) {

            }
        });

        arrString.add(stockVigente1);
        arrString.add(cantidadComprada1);
        arrString.add(stockVigente2);
        arrString.add(cantidadComprada2);

        return arrString;
    }


    private void jButtonCargarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarInformeActionPerformed
        try {
            // TODO add your handling code here:
            vc = new VentanaCargando(ventanaPrincipal, false);
            vc.setLocationRelativeTo(ventanaPrincipal);
            vc.setVisible(true);
            cargar();
        } catch (SQLException ex) {
//            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCargarInformeActionPerformed

    public static String condigoAntguo;
    public static String color = "1";

    public static void llenaTablaPrincipal(ArrayList<Cruze> selectCruze) {
        DefaultTableModel name = (DefaultTableModel) jTable1.getModel();
        Object[] fila = new Object[21];
        AtomicInteger at = new AtomicInteger(0);
        condigoAntguo = "";
        arrClientes = new ArrayList<>();
        for (int j = 0; j < selectCruze.size(); j++) {
            Cruze get = selectCruze.get(j);
            String preveedor = get.getPreveedor();
            if (preveedor == null) {
                preveedor = "x";
            }
            String nOrden = get.getnOrden();
            if (nOrden == null) {
                nOrden = "x";
            }
            String cliente = get.getCliente();
            if (cliente == null) {
                cliente = "x";
            }
            String codigoProducto = get.getCodigoProducto();
            if (codigoProducto == null) {
                codigoProducto = "x";
            }
            String descripcion = get.getDescripcionProducto();
            if (descripcion == null) {
                descripcion = "x";
            }
            String promedio = get.getPromedioTotal();
            if (promedio == null) {
                promedio = "x";
            }
            String cantidad = get.getCantidad();
            if (cantidad == null) {
                cantidad = "x";
            }
            String stockPB = get.getStockVigentePB();
            if (stockPB == null) {
                stockPB = "x";
            }
            String factorPB = get.getFactor();
            if (factorPB == null) {
                factorPB = "x";
            }
            String stockOL = get.getStockVigenteOL();
            if (stockOL == null) {
                stockOL = "x";
            }
            String factorOL = get.getFactorOL();
            if (factorOL == null) {
                factorOL = "x";
            }
            String stockVA = get.getStockVigenteVA();
            if (stockVA == null) {
                stockVA = "x";
            }
            String factorVA = get.getFactorVA();
            if (factorVA == null) {
                factorVA = "x";
            }
            String precio = get.getPrecioFinal();
            if (precio == null) {
                precio = "x";
            }
            String proveedor = get.getProveedor();
            if (proveedor == null) {
                proveedor = "x";
            }
            String fecha = get.getFecha();
            if (fecha == null) {
                fecha = "x";
            }
            String codigoOriginal = get.getCodigoOriginal();
            if (codigoOriginal == null) {
                codigoOriginal = "x";
            }
            arrClientes.add(cliente);
            fila[0] = fecha;
            fila[1] = nOrden;
            fila[2] = preveedor;
            fila[3] = cliente;
            fila[4] = codigoProducto;
            fila[5] = descripcion;
            fila[6] = promedio;
            fila[7] = cantidad;
            fila[8] = stockPB;
            fila[9] = factorPB;
            fila[10] = stockVA;
            fila[11] = factorVA;
            fila[12] = stockOL;
            fila[13] = factorOL;
            fila[14] = false;
            if (cliente.equals("COMERCIAL FRANCISCO TOSO LTDA.")) {
                fila[15] = precio;
                fila[16] = "x";
            } else {
                fila[15] = "x";
                fila[16] = precio;
            }
            fila[17] = proveedor;
            fila[18] = codigoOriginal;
            System.out.println(at.getAndIncrement());
            String fila18 = "";
            if (at.get() == 0) {
                fila[19] = "x";
                fila18 = "x";
            } else if (codigoProducto.equals(condigoAntguo)) {
                fila[19] = "x";
                fila18 = "x";
            } else {
                fila[19] = "1";
                fila18 = "1";
            }
            if (fila18.equals("1")) {
                if (color.equals("1")) {
                    color = "2";
                } else {
                    color = "1";
                }
            }

            fila[20] = color;
            condigoAntguo = codigoProducto;
            name.addRow(fila);
        }
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String toString = table.getValueAt(row, 20).toString();
                if (toString.equals("1")) {
                    c.setBackground(new Color(103, 219, 219));
                } else {
                    c.setBackground(new Color(88, 123, 133));
                }
                return c;
            }
        };
        int columnCount = jTable1.getColumnCount();
        synchronized (jTable1) {
            for (int i = 0; i < columnCount; i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
            }
        }
        renderer.setHorizontalAlignment(0);
        ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(0);
        resizeColumnWidth(jTable1);

        jTable1.setRowHeight(30);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);

        TableColumnModel columnModel = jTable1.getColumnModel();
        TableColumn column = columnModel.getColumn(14);

        column.setCellEditor(new DefaultCellEditor(new JCheckBox() {
        }));

        column.setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox checkBox = new JCheckBox();
                checkBox.setSelected((value != null && ((Boolean) value)));
                checkBox.setHorizontalAlignment(0);
                return checkBox;
            }
        });
        System.out.println("Fin");
    }

    public static void cargar() throws SQLException {
        CompletableFuture.runAsync(() -> {
            jTable1.setVisible(false);
        }).thenRunAsync(() -> {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();

            System.out.println("AH!");

            try {
                System.out.println("Aqui");
                ArrayList<String> selectProveedores = CruzeDAO.selectProveedores();
                System.out.println("selectProveedores.size() " + selectProveedores.size());
                selectProveedores.add("TODOS");
                jComboBox1.setModel(new DefaultComboBoxModel<>(selectProveedores.toArray(new String[0])));
                jComboBox1.setSelectedItem("TODOS");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).thenRunAsync(() -> {
            try {
                ArrayList<Cruze> selectCruze = CruzeDAO.selectCruze();
                System.out.println("selectCruze.size() " + selectCruze.size());

                llenaTablaPrincipal(selectCruze);

                Set<String> hashSet = new HashSet<String>(arrClientes);
                arrClientes.clear();
                arrClientes.addAll(hashSet);

                arrClientes.add("TODOS");
                jComboBox2.setModel(new DefaultComboBoxModel<>(arrClientes.toArray(new String[0])));
                jComboBox2.setSelectedItem("TODOS");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).thenRunAsync(() -> {
            vc.dispose();
            jTable1.setVisible(true);
        });
    }

    public static void aplicaDescuento(String nombre, ArrayList<ArrayList<Descuento>> arrDesc) throws FileNotFoundException {
        String baseURL = "https://asociado.chilemat.cl";

        String email = null;
        String password = null;

        String data = "";
        Wini ini = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir") + "\\config.ini");
            ini = new Wini(inputStream);
            data = ini.get("Propiedades", "box");
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jComboBox3.getSelectedItem().equals("Karina")) {
            email = "17568448-4";
            password = "qu4tfx";
        } else if (jComboBox3.getSelectedItem().equals("Esmeralda")) {
            email = "14380892-0";
            password = "u5l5yh";
        } else if (jComboBox3.getSelectedItem().equals("Francisco")) {
            email = "13989471-5";
            password = "MG2701";
        } else {
            email = "17354508-8";
            password = "cw2pwj";
        }

//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        try {
        driver.manage().window().maximize();

        //Goes to SellerCloud website
        driver.get(baseURL);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtRut\"]")));

        driver.findElement(By.xpath("//*[@id=\"txtRut\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"objInpText_strClave\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"objButton_loginUsuario\"]")).click();

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_txtBusqueda")));

        index = 999999999;
        AtomicInteger jAt = new AtomicInteger();
        arrDesc.stream().forEach((ArrayList<Descuento> get) -> {
            int j = Integer.valueOf(jAt.toString());
            Descuento get1 = get.get(0);
            String nombreProvedor = get1.getNombreProvedor();

            if (nombre.equals(nombreProvedor)) {
                index = j;
                return;
            }
            jAt.getAndIncrement();
        });

        if (index != 999999999) {
            ArrayList<Descuento> get = arrDesc.get(index);
            Descuento get1 = get.get(0);
            String nombreProvedor = get1.getNombreProvedor();

            driver.get("https://asociado.chilemat.cl/Clientes/verCarro.aspx");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objDwnList_Proveedores")));
            Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objDwnList_Proveedores")));

            System.out.println("");

            select.selectByVisibleText(nombreProvedor);

            try {
                driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_generarOrden\"]/img")).click();
            } catch (Exception ex) {
                //driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_generarOrden\"]/img")).click();
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden\"]")));

            boolean bool = false;
            vNum = 2;
            do {
                System.out.println("----------------------------------------->");
                try {
                    if (vNum == 2) {
                        wait = new WebDriverWait(driver, 20);
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden\"]/tbody/tr[" + v + "]/td[1]")));
                    }

                    String text2 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden\"]/tbody/tr[" + v + "]/td[1]")).getText();

                    get.stream().forEach((Descuento get2) -> {
                        String codigo = get2.getCodigo();
                        String d1 = get2.getD1();
                        String d2 = get2.getD2();
                        String d3 = get2.getD3();
                        String precioFinal = get2.getPrecioFinal();

                        System.out.println(get2.getD1()
                                + " " + get2.getD2()
                                + " " + get2.getD3()
                                + " " + get2.getPrecioFinal());
                        System.out.println("codigo.trim() " + codigo.trim());
                        if (codigo.trim().equals("1008883-Viña del Mar")) {
                            System.out.println("codigo.trim() Si");
                        }

//                        if (text2.trim().equals("1008883-Viña del Mar")) {
//                            System.out.println("text2.trim() Si");
//                        }
                        if (codigo.trim().equalsIgnoreCase(text2.trim())) {

                            System.out.println("text2.trim() " + text2.trim());
                            System.out.println("codigo.trim() " + codigo.trim());

                            if (!"".equals(d1)) {
                                if (vNum < 10) {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10\"]")).sendKeys(d1.replace(".", ",").trim());
                                    }
                                } else {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10\"]")).sendKeys(d1.replace(".", ",").trim());
                                    }
                                }
                            }
                            if (!"".equals(d2)) {
                                if (vNum < 10) {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_2\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_2\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_2\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_2\"]")).sendKeys(d2.replace(".", ",").trim());
                                    }
                                } else {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_2\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_2\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_2\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_2\"]")).sendKeys(d2.replace(".", ",").trim());
                                    }
                                }
                            }
                            if (!"".equals(d3)) {
                                if (vNum < 10) {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_3\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_3\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_3\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_Descuento10_3\"]")).sendKeys(d3.replace(".", ",").trim());
                                    }
                                } else {
                                    if (d1.equals("0.0")) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_3\"]")).clear();
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_3\"]")).sendKeys("0");
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_3\"]")).clear();
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_Descuento10_3\"]")).sendKeys(d3.replace(".", ",").trim());
                                    }
                                }
                            }
                            if (!"".equals(precioFinal) && !"null".equals(precioFinal)) {
                                if (vNum < 10) {
                                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_PrecioFinal\"]")));
                                    driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_PrecioFinal\"]")).clear();
                                    String[] split = precioFinal.replace(".", ",").split(",");
                                    String name = split[1];
                                    if (name.length() > 9) {
                                        name = name.substring(0, 9);
                                    }
                                    Integer valueOf = Integer.valueOf(name);
                                    if (valueOf == 0) {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_PrecioFinal\"]")).sendKeys(split[0].trim());
                                    } else {
                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl0" + v + "_objTxtBox_PrecioFinal\"]")).sendKeys(precioFinal.replace(".", ",").trim());
                                    }
                                } else {
                                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_PrecioFinal\"]")));
//                                    System.out.println(precioFinal.replace(".", ","));
//                                    driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_PrecioFinal\"]")).clear();
//                                    String[] split = precioFinal.replace(".", ",").split(",");
//                                    String name = split[1];
//                                    if (name.length() > 9) {
//                                        name = name.substring(0, 9);
//                                    }
//                                    Integer valueOf = Integer.valueOf(name);
//                                    if (valueOf == 0) {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_PrecioFinal\"]")).sendKeys(split[0].trim());
//                                    } else {
//                                        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_objDataGrid_colDetalleOrden_ctl" + v + "_objTxtBox_PrecioFinal\"]")).sendKeys(precioFinal.replace(".", ",").trim());
//                                    }
                                }
                            }
                            return;
                        }
                    });
                    v = v + 1;
                } catch (Exception e) {
//                    System.out.println("e " + e);
                    bool = true;
                    vNum = 0;
                }
            } while (bool == false);

            wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_Recalcular")));
            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_Recalcular")).click();
        }
//        } catch (Exception ex) {
//            driver.close();
//            driver.quit();
//        }
    }

    public static ArrayList<JMenuItem> arrJMenuItem = new ArrayList<>();

    public static void aplicaDescuento() throws SQLException {
        try {
            if (!arrJMenuItem.isEmpty()) {
                arrJMenuItem.stream().forEach((JMenuItem jMenuItem) -> {
                    ventanaPrincipal.jMenu1.remove(jMenuItem);
                });
                arrJMenuItem.clear();
            }

            ArrayList<String> arrNombreProveedores = new ArrayList<>();

            ArrayList<Descuento> leerExcelDescuento = consultaDescuentos();

            for (int j = 0; j < leerExcelDescuento.size(); j++) {
                Descuento get = leerExcelDescuento.get(j);
                String nombreProvedor = get.getNombreProvedor();
                arrNombreProveedores.add(nombreProvedor);
            }

            Set<String> hashSet = new HashSet<String>(arrNombreProveedores);
            arrNombreProveedores.clear();
            arrNombreProveedores.addAll(hashSet);

            ArrayList<ArrayList<Descuento>> arrArrDesc = new ArrayList<>();

            for (int u = 0; u < arrNombreProveedores.size(); u++) {
                ArrayList<Descuento> arrDesc = new ArrayList<>();
                arrArrDesc.add(arrDesc);
            }

            for (int j = 0; j < arrNombreProveedores.size(); j++) {
                //Por cada Proveedor
                String get = arrNombreProveedores.get(j);

                if (!get.equals("NOMBRE")) {
                    JMenuItem jMenuItem = new JMenuItem(get);
                    jMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            Thread thread = new Thread(() -> {
//                            System.out.println("Nuevo evento de archivo");
                                String text = jMenuItem.getText();
                                try {
                                    //                                System.out.println(text);
                                    aplicaDescuento(text, arrArrDesc);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
                            thread.start();
                        }
                    });
                    arrJMenuItem.add(jMenuItem);
                    jMenu1.add(jMenuItem);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CompletableFuture.runAsync(() -> {
            try {
                aplicaDescuento();

                new TableFilterHeader(jTable1, AutoChoices.ENABLED);

                vl = new VentanaLogin(ventanaPrincipal, true);
                vl.setLocationRelativeTo(ventanaPrincipal);
                vl.setVisible(true);

                setExtendedState(MAXIMIZED_BOTH);

                jPanel11.setVisible(false);

                modelTabla3.addColumn("Proveedor");
                modelTabla3.addColumn("Codigo");
                modelTabla3.addColumn("Descripcion");
                modelTabla3.addColumn("N° Comprado");
                modelTabla3.addColumn("Stock Valido");
                modelTabla3.addColumn("Factor");
                modelTabla3.addColumn("Seleccionar");

//                jTable1.getColumnModel().getColumn(19).setMinWidth(0);
//                jTable1.getColumnModel().getColumn(19).setMaxWidth(0);
//                jTable1.getColumnModel().getColumn(19).setWidth(0);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_formWindowOpened

    public void combobox() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (jTable3.getRowCount() == 0) {
                        try {
                            jTabbedPane1.removeTabAt(1);
                        } catch (Exception e) {
                        }
                    } else {
                        jTabbedPane1.setEnabledAt(1, false);
                    }
                }
            }
        });
        thread.start();
    }

    public void filtroTabla() {
        //trsfiltro.setRowFilter(RowFilter.regexFilter(this.buscarBox.getText(), 0));
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        java.util.List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(1);
        RowFilter<Object, Object> serviceFilter = RowFilter.orFilter(filters);
        sorter.setRowFilter(serviceFilter);
        jTable1.setRowSorter(sorter);
    }

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
//        jProgressBar3.setValue(0);
        jButtonAgregar.setEnabled(false);
        Thread thread = new Thread(() -> {
            try {
                System.out.println("jTable1.getRowCount() " + jTable1.getModel().getRowCount());

                int i = 0;
                int rowCount = jTable1.getModel().getRowCount();

                while (i < rowCount) {
                    try {
                        if ("true".equals(jTable1.getModel().getValueAt(i, 14).toString()) 
                                && "1".equals(jTable1.getModel().getValueAt(i, 19).toString())) {
                            System.out.println("jTable1.getModel().getValueAt(i, 11).toString() " + jTable1.getModel().getValueAt(i, 14).toString());
                            System.out.println("jTable1.getModel().getValueAt(i, 1).toString() " + jTable1.getModel().getValueAt(i, 2).toString());

                            filaTabla3[0] = jTable1.getModel().getValueAt(i, 2).toString();
                            if (jTable1.getModel().getValueAt(i, 18).toString().equals("")
                                    || jTable1.getModel().getValueAt(i, 18).toString().equals("x")) {
                                filaTabla3[1] = jTable1.getModel().getValueAt(i, 4).toString();
                            } else {
                                filaTabla3[1] = jTable1.getModel().getValueAt(i, 18).toString();
                            }
                            filaTabla3[2] = jTable1.getModel().getValueAt(i, 5).toString();
                            filaTabla3[3] = jTable1.getModel().getValueAt(i, 7).toString();
                            filaTabla3[4] = jTable1.getModel().getValueAt(i, 8).toString();
                            filaTabla3[5] = jTable1.getModel().getValueAt(i, 9).toString();
                            filaTabla3[6] = true;

                            modelTabla3.addRow(filaTabla3);
                        }
                        i++;
                    } catch (Exception ex) {
                        i++;
                    }
                }

                System.out.println("jTable1.getRowCount() " + jTable1.getModel().getRowCount());

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);

                jTable3.setModel(modelTabla3);
                TableRowSorter trs = new TableRowSorter(modelTabla3);

                class IntComparator2 implements Comparator {

                    public int compare(Object o1, Object o2) {
                        Double valueOf;
                        try {
                            valueOf = Double.valueOf(o1.toString());
                        } catch (Exception ex) {
                            valueOf = -999999999.0;
                        }
                        Double valueOf1 = 0.0;
                        try {
                            valueOf1 = Double.valueOf(o2.toString());
                        } catch (Exception ex) {
                            valueOf1 = -999999999.0;
                        }
                        return valueOf.compareTo(valueOf1);
                    }
                }

                trs.setComparator(3, new IntComparator2());
                trs.setComparator(4, new IntComparator2());
                trs.setComparator(5, new IntComparator2());

                jTable3.setRowSorter(trs);

                jTable3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
                jTable3.getColumnModel().getColumn(2).setPreferredWidth(500);

                TableColumn Tcol = jTable3.getColumnModel().getColumn(6);
                Tcol.setCellEditor(jTable3.getDefaultEditor(Boolean.class));
                Tcol.setCellRenderer(jTable3.getDefaultRenderer(Boolean.class));

                jTable3.setRowHeight(25);
                jTable3.setShowHorizontalLines(true);
                jTable3.setShowVerticalLines(true);
            } catch (Exception ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                jButtonAgregar.setEnabled(true);

                if (jTable3.getRowCount() > 0) {
                    jTabbedPane1.setEnabledAt(1, true);
                }
                System.out.println("jTable3.getRowCount() " + jTable3.getRowCount());

                JOptionPane.showMessageDialog(null, "Productos Agragados Correctamente!", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        thread.start();

        CompletableFuture.runAsync(() -> {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            jTable1.setVisible(false);

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }

            int numRows = model.getRowCount();
            System.out.println("numRows " + numRows);

            int numCols = model.getColumnCount();
            System.out.println("numCols " + numCols);

            Object[][] newData = new Object[numRows][numCols];
            Object newValue = false;

            String toStringProveedor = jComboBox1.getSelectedItem().toString();
            String toStringCliente = jComboBox2.getSelectedItem().toString();

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (col == 14) { // Modificar solo la columna 1
                        String toString2 = model.getValueAt(row, 2).toString();
                        String toString3 = model.getValueAt(row, 3).toString();

                        if (toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                            newData[row][col] = newValue;
                        } else if (!toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                            if (toString2.equals(toStringProveedor)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        } else if (toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                            if (toString3.equals(toStringCliente)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        } else if (!toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                            if (toString2.equals(toStringProveedor) && toString3.equals(toStringCliente)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        }
                    } else {
                        newData[row][col] = model.getValueAt(row, col);
                    }
                }
            }

            model.setDataVector(newData, getColumnNames(model));

            if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    String toString1 = jComboBox1.getSelectedItem().toString();
                    String toString2 = jComboBox2.getSelectedItem().toString();

                    // Crear el primer filtro
                    RowFilter<Object, Object> rowFilter1 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(2);
                            return (value.toString().equals(toString1));
                        }
                    };

                    // Crear el segundo filtro
                    RowFilter<Object, Object> rowFilter2 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(3);
                            return (value.toString().equals(toString2));
                        }
                    };

                    // Crear un nuevo filtro combinando ambos filtros con AND
                    RowFilter<Object, Object> combinedFilter = RowFilter.andFilter(Arrays.asList(rowFilter1, rowFilter2));

                    // Obtener el sorter actual de la tabla
                    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                    // Asignar el RowFilter combinado al sorter y aplicar el filtro
                    sorter.setRowFilter(combinedFilter);

                    // Actualizar el sorter de la tabla
                    jTable1.setRowSorter(sorter);
                } catch (Exception ex) {

                }
            } else if (jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringA = jComboBox2.getSelectedItem().toString();
                    System.out.println("toString " + toStringA);

                    if (!toStringA.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(3);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringA));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringB = jComboBox1.getSelectedItem().toString();
                    System.out.println("toString " + toStringB);

                    if (!toStringB.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(2);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringB));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            }

            renderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    String toString = table.getValueAt(row, 19).toString();

                    if (toString.equals("1")) {
                        c.setBackground(new Color(103, 219, 219));
                    } else {
                        c.setBackground(new Color(88, 123, 133));
                    }

                    return c;
                }
            };

            columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }
            renderer.setHorizontalAlignment(0);
            ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(0);

            resizeColumnWidth(jTable1);

            jTable1.setRowHeight(30);
            jTable1.setShowHorizontalLines(true);
            jTable1.setShowVerticalLines(true);

            TableColumnModel columnModel = jTable1.getColumnModel();

            TableColumn column = columnModel.getColumn(14);
            column.setCellEditor(new DefaultCellEditor(new JCheckBox() {
                {
                    setHorizontalAlignment(JCheckBox.CENTER); // Establece la alineación horizontal en el centro
                }
            }));

            column.setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    JCheckBox checkBox = new JCheckBox();
                    checkBox.setSelected(value != null && (Boolean) value);
                    checkBox.setHorizontalAlignment(JCheckBox.CENTER);

                    return checkBox;
                }
            });

            jTable1.setVisible(true);
        });
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    public static void cargaPaginaUno() {
        try {
            String cwd = System.getProperty("user.dir");
            //System.out.println(cwd + "\\" + "LISTA PRECIOS.xls");
            File excelFile = new File(cwd + "\\" + "Documentos\\pareo codigos PB.xls");
            FileInputStream ExcelFileToRead = null;
            ExcelFileToRead = new FileInputStream(excelFile);
            HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
            HSSFSheet sheet = wb.getSheetAt(0);

            HSSFRow row;
            HSSFCell cell;

            Iterator rows = sheet.rowIterator();

            while (rows.hasNext()) {
                ArrayList<String> rowDoc = new ArrayList<>();
                row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                int cont = 0;
                while (cells.hasNext()) {
                    //System.out.println(cont);
                    cell = (HSSFCell) cells.next();
                    switch (cont) {
                        case 0:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    //cell.getNumericCellValue();
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                } catch (Exception e) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                }
                            }
                            break;
                        case 1:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                } catch (Exception e) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                }
                            }
                            break;
                        case 2:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                } catch (Exception e) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                }
                            }
                            break;
                        case 3:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                } catch (Exception e) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                }
                            }
                            break;
                        case 4:
                            if (cell.getCellType() == CellType.FORMULA) {
                                if (cell.getCachedFormulaResultType() == CellType.NUMERIC) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                } else if (cell.getCachedFormulaResultType() == CellType.STRING) {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                }
                            } else {
                                try {
                                    //cell.getStringCellValue();
                                    rowDoc.add(cell.getStringCellValue());
                                } catch (Exception e) {
                                    double numericCellValue = cell.getNumericCellValue();
                                    Integer valueOf = (int) numericCellValue;
                                    rowDoc.add(String.valueOf(valueOf));
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    cont = cont + 1;
                }
                paginaUno.add(rowDoc);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String leerTxt() throws Exception {
        String cwd = System.getProperty("user.name");
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("C:\\Users\\" + cwd + "\\Sync\\pareo.txt")));
        return data;
    }

    public static void creaBlock(String sinAregar) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String data = sinAregar;
            File file = new File("Sin Agregar.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(data);
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static int regresaInt(String preInt) {
        if (preInt.equals("1.0")) {
            preInt = preInt.replace("0", "");
            preInt = preInt.replace(".", "");

            Integer valueOf = Integer.valueOf(preInt) * 100;
            return valueOf;
        } else {
            preInt = preInt.replace("0", "");
            preInt = preInt.replace(".", "");
            if (preInt.length() != 2) {
                Integer valueOf = Integer.valueOf(preInt) * 10;
                return valueOf;
            } else {
                Integer valueOf = Integer.valueOf(preInt);
                return valueOf;
            }
        }
    }

    private void jButtonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarActionPerformed
//         TODO add your handling code here:
        System.out.println("-------------------------------------------------");
        ArrayList<Integer> arrIndex = new ArrayList<>();

        for (int i = 0; i < jTable3.getModel().getRowCount(); i++) {
            if ("true".equals(jTable3.getModel().getValueAt(i, 6).toString())) {
                arrIndex.add(i);
            }
        }

        System.out.println(arrIndex);

        DefaultTableModel name3 = (DefaultTableModel) jTable3.getModel();
        int k = 0;
        for (int i = 0; i < arrIndex.size(); i++) {
            int get = arrIndex.get(i);
            name3.removeRow(get - k);
            k++;
        }

        JOptionPane.showMessageDialog(null, "Productos Quitados Correctamente!", "Información", JOptionPane.INFORMATION_MESSAGE);
//        
//        System.out.println(arrIndex);
//        
//        arrIndex.stream().forEach((Integer num) -> {
//            arrFilas.remove(num);
//        });
//        
//        System.out.println("arrFilas.size() " + arrFilas.size());

        /*
        int cont2 = 0;
        for (int i = 0; i < lista.size(); i++) {
            ((DefaultTableModel) jTable3.getModel()).removeRow(lista.get(i) + cont2);
            cont2 = cont2 - 1;
        }

        if (jTable3.getRowCount() == 0) {
            jComboBox1.setSelectedItem("TODOS");
            Object selectedItem = jComboBox1.getSelectedItem();
            System.out.println(selectedItem.toString());
            jTabbedPane1.setEnabledAt(1, false);
        }

        productos = new ArrayList<>();
        String cwd = System.getProperty("user.name");
        String[] list = new File(System.getProperty("user.dir") + "\\" + jComboBox2.getSelectedItem().toString()).list();
        String toString = list[0];
        jTable1.setVisible(true);
        Object selectedItem = jComboBox1.getSelectedItem();

        jTabbedPane1.setTitleAt(0, selectedItem.toString() + " Ventas entre el "
                + toString.substring(6, 8) + "/" + toString.substring(4, 6)
                + "/" + toString.substring(0, 4) + " y el " + toString.substring(14, 16)
                + "/" + toString.substring(12, 14) + "/" + toString.substring(8, 12));

        //////////////////////////////////////////////////////////////////////
        String name = list[0];
        ArrayList<ArrayList<Productos>> leeProductos = null;

        try {
            leeProductos = leeProductos(name);
            leeProductos.get(0).remove(0);
            leeProductos.get(0).remove(0);
            leeProductos.get(1).remove(0);
            leeProductos.get(1).remove(0);
            leeProductos.get(2).remove(0);
            leeProductos.get(2).remove(0);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Productos> arrGet = new ArrayList<>();
        ArrayList<Productos> arrGetPB = new ArrayList<>();
        ArrayList<Productos> arrGetOL = new ArrayList<>();
        ArrayList<Productos> arrGetVA = new ArrayList<>();

        arrGetPB = leeProductos.get(0);
        arrGetOL = leeProductos.get(1);
        arrGetVA = leeProductos.get(2);

        pareaCodigos = new ArrayList<>();

        System.out.println(arrGetPB.size());
        System.out.println(arrGetOL.size());
        System.out.println(arrGetVA.size());

        System.out.println("jComboBox2.getSelectedItem().toString() " + jComboBox2.getSelectedItem().toString());

        if (jComboBox2.getSelectedItem().toString().equals("PB")) {
            arrGet = leeProductos.get(0);
            pareaCodigos = pareaCodigos(arrGetPB, arrGetOL, arrGetVA);
        } else if (jComboBox2.getSelectedItem().toString().equals("OL")) {
            arrGet = leeProductos.get(1);
            pareaCodigos = pareaCodigos(arrGetOL, arrGetPB, arrGetVA);
        } else if (jComboBox2.getSelectedItem().toString().equals("VA")) {
            arrGet = leeProductos.get(2);
            pareaCodigos = pareaCodigos(arrGetVA, arrGetPB, arrGetOL);
        }
        ////////////////////////////////////////////////////////////////////
        List<Productos> listaFiltrada = new ArrayList<>();
        List<Productos> listaCompleta = new ArrayList<>();

        System.out.println("jComboBox1.getSelectedItem().toString() " + jComboBox1.getSelectedItem().toString());

        for (int i = 0; i < arrGet.size(); i++) {
            Productos get = arrGet.get(i);
            String proveedor1 = get.getProveedor();
            if (proveedor1.contains(selectedItem.toString())) {
                listaFiltrada.add(get);
            }
            listaCompleta.add(get);
        }

        System.out.println(listaCompleta.size());
        System.out.println(listaFiltrada.size());

//        System.exit(0);
        if (!jComboBox1.getSelectedItem().toString().equals("TODOS")) {
            for (int i = 0; i < listaFiltrada.size(); i++) {
                Productos producto = new Productos();

                Productos get = listaFiltrada.get(i);
                String codigo = get.getCodigo();
                String descripcion = get.getDescripcion();
                String proveedor = get.getProveedor();
                String cantidadComprada = get.getCantidadComprada();
                String unidad = get.getUnidad();
                String medida = get.getMedida();
                String stockVigente = get.getStockVigente();
                String stockValido = get.getStockValido();
                String ultimaFechaIngreso = get.getUltimaFechaIngreso();
                String ultimoIngeso = get.getUltimoIngeso();
                String promTotal = get.getPromTotal();

                System.out.println(codigo);
                producto.setCodigo(codigo);
                producto.setDescripcion(descripcion);
                producto.setProveedor(proveedor);
                producto.setCantidadComprada(cantidadComprada);
                producto.setUnidad(unidad);
                producto.setMedida(medida);
                producto.setStockVigente(stockVigente);
                producto.setStockValido(stockValido);
                producto.setUltimaFechaIngreso(ultimaFechaIngreso);
                producto.setUltimoIngeso(ultimoIngeso);
                producto.setPromTotal(promTotal);
                productos.add(producto);
            }

            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

            Object[] fila = new Object[15];

            int encuentra = 0;

            for (int i = 0; i < productos.size(); i++) {
                Productos get = productos.get(i);
                for (int x = 0; x < jTable3.getModel().getRowCount(); x++) {
                    if (jTable3.getModel().getValueAt(x, 1).equals(get.getCodigo())) {
                        System.out.println(get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
                        encuentra = encuentra + 1;
                    } else {
                        System.out.println("else " + get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
                    }
                }
                if (encuentra == 0) {
                    fila[0] = get.getProveedor();

                    fila[1] = get.getCodigo();

                    fila[2] = get.getDescripcion();
                    fila[3] = get.getCantidadComprada();
                    fila[4] = get.getStockVigente();
                    try {
                        if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)))) {
                            fila[5] = "1000";
                        } else {
                            try {
                                String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                                String[] split = valueOf.split(Pattern.quote("."));
                                if (split[1].length() > 2) {
                                    String substring = split[1].substring(0, 2);
                                    fila[5] = split[0] + "." + substring;
                                } else {
                                    fila[5] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                                }
                            } catch (Exception ex) {
                            }
                        }
                    } catch (NumberFormatException e) {
                    }
                    fila[6] = get.getPromTotal();
                    fila[11] = false;

                    if (jComboBox2.getSelectedItem().toString().equals("PB")) {
//                      arrGetPB = leeProductos.get(0);
                        arrGetOL = leeProductos.get(1);
                        arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    } else if (jComboBox2.getSelectedItem().toString().equals("OL")) {
                        arrGetPB = leeProductos.get(0);
//                      arrGetOL = leeProductos.get(1);
                        arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    } else if (jComboBox2.getSelectedItem().toString().equals("VA")) {
                        arrGetPB = leeProductos.get(0);
                        arrGetOL = leeProductos.get(1);
//                      arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                    model1.addRow(fila);
                }
                encuentra = 0;
            }

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            jTable1.setModel(model1);
            TableRowSorter trs = new TableRowSorter(model1);

//            class IntComparator implements Comparator {
//                public int compare(Object o1, Object o2) {
//                    Integer int1 = (Integer) o1;
//                    Integer int2 = (Integer) o2;
//                    return int1.compareTo(int2);
//                }
//
//                public boolean equals(Object o2) {
//                    return this.equals(o2);
//                }
//            }
            class IntComparator2 implements Comparator {

                public int compare(Object o1, Object o2) {
                    Double valueOf;
                    try {
                        valueOf = Double.valueOf(o1.toString());
                    } catch (Exception ex) {
                        valueOf = -999999999.0;
                    }
                    Double valueOf1 = 0.0;
                    try {
                        valueOf1 = Double.valueOf(o2.toString());
                    } catch (Exception ex) {
                        valueOf1 = -999999999.0;
                    }
                    return valueOf.compareTo(valueOf1);
                }
            }

            trs.setComparator(4, new IntComparator2());
            trs.setComparator(3, new IntComparator2());
            trs.setComparator(5, new IntComparator2());
            trs.setComparator(6, new IntComparator2());
            trs.setComparator(7, new IntComparator2());
            trs.setComparator(8, new IntComparator2());
            trs.setComparator(9, new IntComparator2());
            trs.setComparator(10, new IntComparator2());

            jTable1.setRowSorter(trs);

            jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(500);

            TableColumn Tcol = jTable1.getColumnModel().getColumn(11);
            Tcol.setCellEditor(jTable1.getDefaultEditor(Boolean.class
            ));
            Tcol.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class
            ));

            jTable1.setRowHeight(25);
            jTable1.setShowHorizontalLines(true);
            jTable1.setShowVerticalLines(true);
        } else {
            for (int i = 0; i < listaCompleta.size(); i++) {
                try {
                    Productos producto = new Productos();

                    Productos get = listaCompleta.get(i);
                    String codigo = get.getCodigo();
                    String descripcion = get.getDescripcion();
                    String proveedor = get.getProveedor();
                    String cantidadComprada = get.getCantidadComprada();
                    String unidad = get.getUnidad();
                    String medida = get.getMedida();
                    String stockVigente = get.getStockVigente();
                    String stockValido = get.getStockValido();
                    String ultimaFechaIngreso = get.getUltimaFechaIngreso();
                    String ultimoIngeso = get.getUltimoIngeso();
                    String promTotal = get.getPromTotal();

                    System.out.println(codigo);
                    producto.setCodigo(codigo);
                    producto.setDescripcion(descripcion);
                    producto.setProveedor(proveedor);
                    producto.setCantidadComprada(cantidadComprada);
                    producto.setUnidad(unidad);
                    producto.setMedida(medida);
                    producto.setStockVigente(stockVigente);
                    producto.setStockValido(stockValido);
                    producto.setUltimaFechaIngreso(ultimaFechaIngreso);
                    producto.setUltimoIngeso(ultimoIngeso);
                    producto.setPromTotal(promTotal);
                    productos.add(producto);
                } catch (Exception e) {
                }
            }

            DefaultTableModel model1 = new DefaultTableModel();
            if (jComboBox2.getSelectedItem().toString().endsWith("PB")) {
                model1.addColumn("Proveedor PB");
                model1.addColumn("Codigo PB");
                model1.addColumn("Descripcion PB");
                model1.addColumn("N° Comprado PB");
                model1.addColumn("Stock Valido PB");
                model1.addColumn("Factor PB");
                model1.addColumn("Promedio Total PB");

                model1.addColumn("Stock Valido OL");
                model1.addColumn("Factor OL");
                model1.addColumn("Stock Valido VA");
                model1.addColumn("Factor VA");

                model1.addColumn("Seleccionar PB");
            } else if (jComboBox2.getSelectedItem().toString().equals("OL")) {
                model1.addColumn("Proveedor OL");
                model1.addColumn("Codigo OL");
                model1.addColumn("Descripcion OL");
                model1.addColumn("N° Comprado OL");
                model1.addColumn("Stock Valido OL");
                model1.addColumn("Factor OL");
                model1.addColumn("Promedio Total OL");

                model1.addColumn("Stock Valido PB");
                model1.addColumn("Factor PB");
                model1.addColumn("Stock Valido VA");
                model1.addColumn("Factor VA");

                model1.addColumn("Seleccionar OL");
            } else if (jComboBox2.getSelectedItem().toString().equals("VA")) {
                model1.addColumn("Proveedor VA");
                model1.addColumn("Codigo VA");
                model1.addColumn("Descripcion VA");
                model1.addColumn("N° Comprado VA");
                model1.addColumn("Stock Valido VA");
                model1.addColumn("Factor VA");
                model1.addColumn("Promedio Total VA");

                model1.addColumn("Stock Valido PB");
                model1.addColumn("Factor PB");
                model1.addColumn("Stock Valido OL");
                model1.addColumn("Factor OL");

                model1.addColumn("Seleccionar VA");
            }

            Object[] fila = new Object[12];

            int encuentra = 0;

            for (int i = 0; i < productos.size(); i++) {
                Productos get = productos.get(i);
                for (int x = 0; x < jTable3.getModel().getRowCount(); x++) {
                    if (jTable3.getModel().getValueAt(x, 1).equals(get.getCodigo())) {
                        System.out.println(get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
                        encuentra = encuentra + 1;
                    } else {
                        System.out.println("else " + get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
                    }
                }
                if (encuentra == 0) {
                    fila[0] = get.getProveedor();
                    fila[1] = get.getCodigo();
                    fila[2] = get.getDescripcion();
                    fila[3] = get.getCantidadComprada();
                    fila[4] = get.getStockVigente();
                    try {
                        if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)))) {
                            fila[5] = "1000";
                        } else {
                            try {
                                String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                                String[] split = valueOf.split(Pattern.quote("."));
                                if (split[1].length() > 2) {
                                    String substring = split[1].substring(0, 2);
                                    fila[5] = split[0] + "." + substring;
                                } else {
                                    fila[5] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                                }
                            } catch (Exception ex) {
                            }
                        }
                    } catch (NumberFormatException e) {
                    }
                    fila[6] = get.getPromTotal();
                    fila[11] = false;

                    if (jComboBox2.getSelectedItem().toString().equals("PB")) {
//                      arrGetPB = leeProductos.get(0);
                        arrGetOL = leeProductos.get(1);
                        arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    } else if (jComboBox2.getSelectedItem().toString().equals("OL")) {
                        arrGetPB = leeProductos.get(0);
//                      arrGetOL = leeProductos.get(1);
                        arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    } else if (jComboBox2.getSelectedItem().toString().equals("VA")) {
                        arrGetPB = leeProductos.get(0);
                        arrGetOL = leeProductos.get(1);
//                      arrGetVA = leeProductos.get(2);
                        fila[7] = pareaCodigos.get(0).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                                fila[8] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[8] = split[0] + "." + substring;
                                    } else {
                                        fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                        fila[9] = pareaCodigos.get(2).get(i);
                        try {
                            if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                                fila[10] = "1000";
                            } else {
                                try {
                                    String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    String[] split = valueOf.split(Pattern.quote("."));
                                    if (split[1].length() > 2) {
                                        String substring = split[1].substring(0, 2);
                                        fila[10] = split[0] + "." + substring;
                                    } else {
                                        fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                                    }
                                } catch (Exception ex) {
                                }
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                    model1.addRow(fila);
                }
                encuentra = 0;
            }

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            jTable1.setModel(model1);
            TableRowSorter trs = new TableRowSorter(model1
            );

//            class IntComparator implements Comparator {
//                public int compare(Object o1, Object o2) {
//                    Integer int1 = (Integer) o1;
//                    Integer int2 = (Integer) o2;
//                    return int1.compareTo(int2);
//                }
//
//                public boolean equals(Object o2) {
//                    return this.equals(o2);
//                }
//            }
            class IntComparator2 implements Comparator {

                public int compare(Object o1, Object o2) {
                    Double valueOf;
                    try {
                        valueOf = Double.valueOf(o1.toString());
                    } catch (Exception ex) {
                        valueOf = -999999999.0;
                    }
                    Double valueOf1 = 0.0;
                    try {
                        valueOf1 = Double.valueOf(o2.toString());
                    } catch (Exception ex) {
                        valueOf1 = -999999999.0;
                    }
                    return valueOf.compareTo(valueOf1);
                }
            }

            trs.setComparator(4, new IntComparator2());
            trs.setComparator(3, new IntComparator2());
            trs.setComparator(5, new IntComparator2());
            trs.setComparator(6, new IntComparator2());
            trs.setComparator(7, new IntComparator2());
            trs.setComparator(8, new IntComparator2());
            trs.setComparator(9, new IntComparator2());
            trs.setComparator(10, new IntComparator2());

            jTable1.setRowSorter(trs);

            jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(500);

            TableColumn Tcol = jTable1.getColumnModel().getColumn(11);
            Tcol.setCellEditor(jTable1.getDefaultEditor(Boolean.class
            ));
            Tcol.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class
            ));

            jTable1.setRowHeight(25);
            jTable1.setShowHorizontalLines(true);
            jTable1.setShowVerticalLines(true);
        }

        if (jTable3.getRowCount() == 0) {
            jTabbedPane1.setEnabledAt(1, false);
            jTable4.setModel(new DefaultTableModel());
            jPanel11.setVisible(false);
            jTabbedPane1.setSelectedIndex(0);
        }
//        jProgressBar1.setValue(100);
         */
    }//GEN-LAST:event_jButtonQuitarActionPerformed

    public static void consulta(String codigo) {
        String consulta = "SELECT distinct precioUnitario, proveedor, cliente FROM (SELECT distinct precioUnitario,\n"
                + "proveedor,\n"
                + "cliente,\n"
                + "row_number() over (partition by precioUnitario order by precioUnitario) as contador\n"
                + "FROM [ordenes].[dbo].[orden_2] where codigo = '" + codigo + "') as f where f.contador = 1";
        arrConsultas.add(consulta);
    }

    public static DefaultTableModel llenaTabla(int i, int encuentra, Object[] fila, ArrayList<ArrayList<String>> pareaCodigos, DefaultTableModel model) {
        Productos get = productos.get(i);

        for (int x = 0; x < jTable3.getModel().getRowCount(); x++) {
            if (jTable3.getModel().getValueAt(x, 1).equals(get.getCodigo())) {
                System.out.println(get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
                encuentra = encuentra + 1;
            } else {
                System.out.println("else " + get.getCodigo() + " " + jTable3.getModel().getValueAt(x, 1));
            }
        }

        if (encuentra == 0) {
            fila[0] = get.getProveedor();

//            arrConsultas = new ArrayList<>();
//            try {
//                ArrayList<String> selectCodigos = IngresosDAO.selectCodigos(get.getCodigo());
//                System.out.println(selectCodigos);
//
//                selectCodigos.stream().forEach((String codigo) -> {
//                    consulta(codigo);
//                });
//            } catch (SQLException ex) {
//                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            System.out.println("-------------> arrConsultas " + arrConsultas);
//
//            if (!arrConsultas.isEmpty()) {
//                DocumentoOrdenDAO.QueryMultipleResultSets(arrConsultas);
//            }
            fila[1] = get.getCodigo();
            fila[2] = get.getDescripcion();
            fila[3] = get.getCantidadComprada();
            fila[4] = get.getStockVigente();
            try {
                if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)))) {
                    fila[5] = "1000";
                } else {
                    try {
                        String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                        String[] split = valueOf.split(Pattern.quote("."));
                        if (split[1].length() > 2) {
                            String substring = split[1].substring(0, 2);
                            fila[5] = split[0] + "." + substring;
                        } else {
                            fila[5] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(get.getCantidadComprada()) / Double.valueOf(get.getStockVigente()), 2)));
                        }
                    } catch (Exception ex) {
                    }
                }
            } catch (NumberFormatException e) {
            }
            fila[6] = get.getPromTotal();
            fila[11] = false;

            fila[7] = pareaCodigos.get(0).get(i);
            try {
                if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)))) {
                    fila[8] = "1000";
                } else {
                    try {
                        String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                        String[] split = valueOf.split(Pattern.quote("."));
                        if (split[1].length() > 2) {
                            String substring = split[1].substring(0, 2);
                            fila[8] = split[0] + "." + substring;
                        } else {
                            fila[8] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(1).get(i)) / Double.valueOf(pareaCodigos.get(0).get(i)), 2)));
                        }
                    } catch (Exception ex) {
                    }
                }
            } catch (NumberFormatException e) {
            }
            fila[9] = pareaCodigos.get(2).get(i);
            try {
                if ("Infinity".equals(String.valueOf(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)))) {
                    fila[10] = "1000";
                } else {
                    try {
                        String valueOf = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                        String[] split = valueOf.split(Pattern.quote("."));
                        if (split[1].length() > 2) {
                            String substring = split[1].substring(0, 2);
                            fila[10] = split[0] + "." + substring;
                        } else {
                            fila[10] = String.valueOf(Math.abs(redondearDecimales(Double.valueOf(pareaCodigos.get(3).get(i)) / Double.valueOf(pareaCodigos.get(2).get(i)), 2)));
                        }
                    } catch (Exception ex) {
                    }
                }
            } catch (NumberFormatException e) {
            }

            model.addRow(fila);
        }
        encuentra = 0;
        return model;
    }

    public String[] getColumnNames(DefaultTableModel model) {
        String[] columnNames = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            columnNames[i] = jTable1.getColumnName(i);
        }
        return columnNames;
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    String toString1 = jComboBox1.getSelectedItem().toString();
                    String toString2 = jComboBox2.getSelectedItem().toString();

                    // Crear el primer filtro
                    RowFilter<Object, Object> rowFilter1 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(2);
                            return (value.toString().equals(toString1));
                        }
                    };

                    // Crear el segundo filtro
                    RowFilter<Object, Object> rowFilter2 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(3);
                            return (value.toString().equals(toString2));
                        }
                    };

                    // Crear un nuevo filtro combinando ambos filtros con AND
                    RowFilter<Object, Object> combinedFilter = RowFilter.andFilter(Arrays.asList(rowFilter1, rowFilter2));

                    // Obtener el sorter actual de la tabla
                    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                    // Asignar el RowFilter combinado al sorter y aplicar el filtro
                    sorter.setRowFilter(combinedFilter);

                    // Actualizar el sorter de la tabla
                    jTable1.setRowSorter(sorter);
                } catch (Exception ex) {

                }
            } else if (jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toString = jComboBox2.getSelectedItem().toString();
                    System.out.println("toString " + toString);

                    if (!toString.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(3);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toString));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toString = jComboBox1.getSelectedItem().toString();
                    System.out.println("toString " + toString);

                    if (!toString.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(2);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toString));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else {
                jTable1.setRowSorter(null);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    static public void eliminarFileFECHA() throws IOException {
        String dir = System.getProperty("user.dir");

        File fin = new File(dir + "\\PB");
        for (File file : fin.listFiles()) {
            FileDeleteStrategy.FORCE.delete(file);
        }

        fin = new File(dir + "\\VA");
        for (File file : fin.listFiles()) {
            FileDeleteStrategy.FORCE.delete(file);
        }

        fin = new File(dir + "\\OL");
        for (File file : fin.listFiles()) {
            FileDeleteStrategy.FORCE.delete(file);
        }
    }

    public static void descargarInformeCompartido(String fechas) throws IOException {
        //crear archivo llamado fecha
        String dir = System.getProperty("user.dir");

        String substring = fechas.substring(0, 8);
        String substring1 = fechas.substring(8);

        System.out.println("substring " + substring);
        System.out.println("substring1 " + substring1);

        eliminarFileFECHA();

        ImageIcon icon = new ImageIcon(dir + "\\ICON\\Gif\\ok.png");

        try {
////////////////////////////////////////////////////////////////////////////////                
/////////////////////////////////// PB  ///////////////////////////////////             
////////////////////////////////////////////////////////////////////////////////     
            CompletableFuture.runAsync(() -> {
                try {
                    String respre = consultaInformeDAO.ConsultaLocalMonitorInforme(usuario, "PB");
                    System.out.println("respre " + respre);
                    if ("".equals(respre)) {
                        consultaInformeDAO.registraMonitorInforme(substring + "@" + substring1, usuario, "PB");
                    } else {
                        consultaInformeDAO.actualizaMonitorInforme(substring + "@" + substring1, usuario, "PB");
                    }
////////////////////////////////////////////////////////////////////////////////
                    String respre0 = consultaInformeDAO.ConsultaLocalReporteInforme(usuario, "pb");
                    if ("".equals(respre0)) {
                        consultaInformeDAO.registraReportesInformeNull(usuario);
                    } else {
                        consultaInformeDAO.actualizaReportesInforme(usuario, "pb");
                    }
////////////////////////////////////////////////////////////////////////////////
                    byte[] bytes = null;
                    int length = 0;
                    while (length == 0) {
                        try {
                            bytes = consultaInformeDAO.ConsultaLocal("pb", "xls", usuario, fechas);
                            length = bytes.length;
                        } catch (Exception ex) {
                            length = 0;
                        }
                        System.out.println("length " + length);
                        Thread.sleep(1000);
                    }

                    VentanaPrincipal.vd.jLabel4.setIcon(icon);
                } catch (Exception ex) {

                }
            });
////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////// VA  ///////////////////////////////////  
////////////////////////////////////////////////////////////////////////////////  
            CompletableFuture.runAsync(() -> {
                try {
                    String respre = consultaInformeDAO.ConsultaLocalMonitorInforme(usuario, "VA");
                    System.out.println("respre " + respre);
                    if ("".equals(respre)) {
                        consultaInformeDAO.registraMonitorInforme(substring + "@" + substring1, usuario, "VA");
                    } else {
                        consultaInformeDAO.actualizaMonitorInforme(substring + "@" + substring1, usuario, "VA");
                    }
////////////////////////////////////////////////////////////////////////////////
                    String respre0 = consultaInformeDAO.ConsultaLocalReporteInforme(usuario, "va");
                    if ("".equals(respre0)) {
                        consultaInformeDAO.registraReportesInformeNull(usuario);
                    } else {
                        consultaInformeDAO.actualizaReportesInforme(usuario, "va");
                    }
////////////////////////////////////////////////////////////////////////////////
                    byte[] bytes = null;
                    int length = 0;
                    while (length == 0) {
                        try {
                            bytes = consultaInformeDAO.ConsultaLocal("va", "xlsx", usuario, fechas);
                            length = bytes.length;
                        } catch (Exception ex) {
                            length = 0;
                        }
                        System.out.println("length " + length);
                        Thread.sleep(1000);
                    }
                    VentanaPrincipal.vd.jLabel5.setIcon(icon);
                } catch (Exception ex) {

                }
            });
////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////// OL  ///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
            CompletableFuture.runAsync(() -> {
                try {
                    String respre = consultaInformeDAO.ConsultaLocalMonitorInforme(usuario, "OL");
                    System.out.println("respre " + respre);
                    if ("".equals(respre)) {
                        consultaInformeDAO.registraMonitorInforme(substring + "@" + substring1, usuario, "OL");
                    } else {
                        consultaInformeDAO.actualizaMonitorInforme(substring + "@" + substring1, usuario, "OL");
                    }
////////////////////////////////////////////////////////////////////////////////
                    String respre0 = consultaInformeDAO.ConsultaLocalReporteInforme(usuario, "ol");
                    if ("".equals(respre0)) {
                        consultaInformeDAO.registraReportesInformeNull(usuario);
                    } else {
                        consultaInformeDAO.actualizaReportesInforme(usuario, "ol");
                    }
////////////////////////////////////////////////////////////////////////////////
                    byte[] bytes = null;
                    int length = 0;
                    while (length == 0) {
                        try {
                            bytes = consultaInformeDAO.ConsultaLocal("ol", "xlsx", usuario, fechas);
                            length = bytes.length;
                        } catch (Exception ex) {
                            length = 0;
                        }
                        System.out.println("length " + length);
                        Thread.sleep(1000);
                    }
                    VentanaPrincipal.vd.jLabel6.setIcon(icon);
                } catch (Exception ex) {

                }
            });
////////////////////////////////////////////////////////////////////////////////
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButtonDescargarInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescargarInformesActionPerformed
        // TODO add your handling code here:
        CompletableFuture.runAsync(() -> {
            try {

                String direccion = System.getProperty("user.dir");

                File fileCarpeta = new File(direccion + "\\PB");
                if (!fileCarpeta.exists()) {
                    new File(direccion + "\\PB").mkdir();
                }

                File fileCarpeta1 = new File(direccion + "\\VA");
                if (!fileCarpeta1.exists()) {
                    new File(direccion + "\\VA").mkdir();
                }

                File fileCarpeta2 = new File(direccion + "\\OL");
                if (!fileCarpeta2.exists()) {
                    new File(direccion + "\\OL").mkdir();
                }

                if (rSDateChooser1.getDatoFecha() != null && rSDateChooser2.getDatoFecha() != null) {

                    jButtonDescargarInformes.setEnabled(false);

                    String cwd = System.getProperty("user.name");

                    Date datoFecha = rSDateChooser1.getDatoFecha();
                    Date datoFecha2 = rSDateChooser2.getDatoFecha();
                    String format = null;
                    String format2 = null;

                    SimpleDateFormat dt1 = new SimpleDateFormat("yyyyMMdd");

                    if (datoFecha != null) {
                        format = dt1.format(datoFecha);
                    }

                    if (datoFecha2 != null) {
                        format2 = dt1.format(datoFecha2);
                    }

                    String contenido = format + format2;

                    vd = new VentanaDescarga();
                    vd.setVisible(true);

                    descargarInformeCompartido(contenido);

                    File file11 = new File(System.getProperty("user.dir") + "\\PB\\" + contenido + ".xls"); //catch (IOException ex) {
                    File file22 = new File(System.getProperty("user.dir") + "\\VA\\" + contenido + ".xlsx");
                    File file33 = new File(System.getProperty("user.dir") + "\\OL\\" + contenido + ".xlsx");

                    while (file11.length() == 0 || file22.length() == 0 || file33.length() == 0) {
                        System.out.println("Esperando");
                        Thread.sleep(1000);
                    }

                    try {
                        leeProductos = leeProductos(contenido + ".xlsx");

                        ProductosDAO.registraProductos(leeProductos.get(0), "PB");
                        ProductosDAO.registraProductos(leeProductos.get(1), "OL");
                        ProductosDAO.registraProductos(leeProductos.get(2), "VA");

                    } catch (IOException ex) {
                        Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    vd.dispose();

                    vc = new VentanaCargando(ventanaPrincipal, false);
                    vc.setLocationRelativeTo(ventanaPrincipal);
                    vc.setVisible(true);
                    cargar();
                    jButtonDescargarInformes.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Fecha no seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
            }
        });
    }//GEN-LAST:event_jButtonDescargarInformesActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:
        Thread thread2 = new Thread(() -> {
            jButtonComprar.setEnabled(false);
            arr = new ArrayList<>();
            row = new ArrayList<>();

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            Vector<Vector> dataVector = model.getDataVector();
            dataVector.stream().forEach((Vector vector) -> {
                if ("true".equals(vector.get(6).toString())) {
                    row = new ArrayList<>();
                    row.add(vector.get(0).toString());
                    row.add(vector.get(1).toString());
                    row.add(vector.get(2).toString());
                    row.add(vector.get(3).toString());
                    row.add(vector.get(4).toString());
                    row.add(vector.get(5).toString());
                    row.add(vector.get(6).toString());
                    arr.add(row);
                }
            });

            System.out.println(arr.size());
            String baseURL = "https://asociado.chilemat.cl/";

            String email = null;
            String password = null;

            String data = "";
            Wini ini = null;
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(System.getProperty("user.dir") + "\\config.ini");
                ini = new Wini(inputStream);
                data = ini.get("Propiedades", "box");
                inputStream.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class
                        .getName()).log(Level.SEVERE, null, ex);

            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            if (jComboBox3.getSelectedItem().equals("Karina")) {
                email = "17568448-4";
                password = "qu4tfx";
            } else if (jComboBox3.getSelectedItem().equals("Esmeralda")) {
                email = "14380892-0";
                password = "u5l5yh";
            } else if (jComboBox3.getSelectedItem().equals("Francisco")) {
                email = "13989471-5";
                password = "MG2701";
            } else {
                email = "17354508-8";
                password = "cw2pwj";
            }

            //            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            //Goes to SellerCloud website
            driver.get(baseURL);
            WebDriverWait wait;
            wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtRut\"]")));

            driver.findElement(By.xpath("//*[@id=\"txtRut\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"objInpText_strClave\"]")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id=\"objButton_loginUsuario\"]")).click();

            wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_txtBusqueda")));

            ArrayList<ArrayList> productosSinAgregar = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
                try {
                    String url = driver.getCurrentUrl();
                    System.out.println("url " + url);
                    if (i != 0) {
                        if (url.equals("http://www.chilemat.cl/chilemat/inicio.aspx")) {
                            System.out.println("Es Inicio");
                            driver.get(baseURL);
                            wait = new WebDriverWait(driver, 20);
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtRut\"]")));

                            driver.findElement(By.xpath("//*[@id=\"txtRut\"]")).sendKeys(email);
                            driver.findElement(By.xpath("//*[@id=\"objInpText_strClave\"]")).sendKeys(password);
                            driver.findElement(By.xpath("//*[@id=\"objButton_loginUsuario\"]")).click();

                            wait = new WebDriverWait(driver, 20);
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_txtBusqueda")));
                        }
                    }

                    String toString = arr.get(i).get(0).toString();
                    String codigoFinal = arr.get(i).get(1).toString();

                    System.out.println("toString " + toString);
                    System.out.println("codigoFinal " + codigoFinal);

                    PareoProveedor consultaProveedor = consultaPareoProveedorDAO.consultaProveedor(toString);

                    System.out.println(toString);
                    System.out.println(consultaProveedor.getNombreNuestro());
                    System.out.println(consultaProveedor.getNombreChilemat());
                    System.out.println(consultaProveedor.getRut());

                    String replace = "";
                    try {
                        String[] split = consultaProveedor.getRut().split("-");
                        replace = split[0].replace(".", "");
                    } catch (Exception ex) {

                    }

                    if (consultaProveedor.getRut() != null) {
                        driver.get("https://asociado.chilemat.cl/clientes/ComprasXProveedor.aspx?intIdTipoProveedor=1&intRutProveedor=" + replace);
                    }

                    boolean bool = false;

                    driver.findElement(By.id("ctl00_txtBusqueda")).clear();
                    driver.findElement(By.id("ctl00_txtBusqueda")).sendKeys(codigoFinal);

                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_buttonBN")));
                    driver.findElement(By.id("ctl00_buttonBN")).click();

                    wait = new WebDriverWait(driver, 10);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")));
                    try {
                        driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_DXDataRow1"));
                        try {
                            System.out.println("aqui--->mas de una fila");
                            String text2 = driver.findElement(By.className("dxpSummary")).getText();
                            System.out.println("text2 " + text2);
                            String substring = text2.substring(text2.indexOf("(") + 1, text2.indexOf("items"));
                            System.out.println("substring " + substring.trim());
                            Integer valueOf = Integer.valueOf(substring.trim());
                            System.out.println("valueOf " + valueOf);
                            int division = valueOf / 50;
                            System.out.println("division " + division);

                            int resto = 0;
                            if (division * 50 < valueOf) {
                                resto = valueOf - division * 50;
                                System.out.println("resto " + resto);
                            }

                            int num = 0;

                            for (int m = 0; m < division; m++) {
                                System.out.println("num " + num);
                                for (int x = 0; x < 50; x++) {
                                    System.out.println("x " + x);
                                    //ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell0_1
                                    //ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell1_1
                                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + (num + x) + "_1")));
                                    String text = driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + (num + x) + "_1")).getText();
                                    if (text.equals(codigoFinal)) {
                                        wait = new WebDriverWait(driver, 10);
                                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")));

                                        driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_cell" + (num + x) + "_13_objTxtBox_cantidad")).sendKeys(arr.get(i).get(3).toString());
                                        driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")).click();

                                        wait = new WebDriverWait(driver, 10);
                                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generarOrden")));
                                        bool = true;
                                        break;
                                    }
                                }

                                if (bool == true) {
                                    break;
                                }

                                String textPost = "";

                                wait.until(ExpectedConditions.elementToBeClickable(By.className("dxWeb_pNext")));
                                driver.findElement(By.className("dxWeb_pNext")).click();

                                Integer valueOf1 = 0;

                                if (m != division - 1) {
                                    do {
                                        textPost = driver.findElement(By.className("dxpCurrentPageNumber")).getText().substring(1, 2);
                                        valueOf1 = Integer.valueOf(textPost);
                                        System.out.println("valueOf1 " + valueOf1);
                                    } while (valueOf1 == m);
                                    num = num + 50;
                                }

                                System.out.println("num " + num);

                                boolean bool1 = false;
                                while (bool1 == false) {
                                    try {
                                        driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + num + "_1"));
                                        bool1 = true;
                                        System.out.println("bool1 " + bool1);
                                    } catch (Exception ex) {
                                        System.out.println(ex);
                                        System.out.println("Line 2665");
                                        try {
                                            wait.until(ExpectedConditions.elementToBeClickable(By.className("dxWeb_pNext")));
                                            driver.findElement(By.className("dxWeb_pNext")).click();
                                        } catch (Exception x) {
                                            System.out.println(x);
                                            System.out.println("Line 2670");
                                        }
                                    }
                                }
                            }
                            if (bool != true) {
                                if (resto != 0) {
                                    System.out.println("aqui");
                                    for (int x = 0; x < resto; x++) {
                                        System.out.println("x " + x);
                                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + ((division * 50) + x) + "_1")));
                                        String text = driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + ((division * 50) + x) + "_1")).getText();

                                        if (text.equals(codigoFinal)) {
                                            wait = new WebDriverWait(driver, 10);
                                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")));

                                            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_cell" + ((division * 50) + x) + "_13_objTxtBox_cantidad")).sendKeys(arr.get(i).get(3).toString());
                                            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")).click();

                                            wait = new WebDriverWait(driver, 10);
                                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generarOrden")));
                                            bool = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Exception n) {
                            System.out.println("Line 2697");
                            System.out.println(n);
                            for (int x = 0; x < 50; x++) {
                                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + x + "_1")));
                                String text = driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_tccell" + x + "_1")).getText();
                                //System.out.println("text " + (num + x) + " " + text);
                                //System.out.println("text " + text);
                                if (text.equals(codigoFinal)) {
                                    wait = new WebDriverWait(driver, 10);
                                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")));

                                    driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_cell" + x + "_13_objTxtBox_cantidad")).sendKeys(arr.get(i).get(3).toString());
                                    driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")).click();

                                    wait = new WebDriverWait(driver, 10);
                                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_generarOrden\"]/img")));
                                    bool = true;
                                    break;
                                }
                            }
                        }
                    } catch (Exception o) {
                        System.out.println(o);
                        System.out.println("Line 2720");
                        try {
                            System.out.println("aqui--->1");
                            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_DXDataRow0"));

                            wait = new WebDriverWait(driver, 10);
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")));

                            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_ASPxGridView_productos_cell0_13_objTxtBox_cantidad")).sendKeys(arr.get(i).get(3).toString());
                            driver.findElement(By.id("ctl00_ContentPlaceHolder_Centro_objImgButton_agregarCarro0")).click();

                            wait = new WebDriverWait(driver, 10);
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder_Centro_generarOrden\"]/img")));
                            bool = true;
                        } catch (Exception p) {
                            System.out.println(p);
                            System.out.println("Line 2736");
                            productosSinAgregar.add(arr.get(i));
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/table/tbody/tr/td/table[1]/tbody/tr/td/div[1]/div/div[1]/a/img")));
                            driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/table/tbody/tr/td/table[1]/tbody/tr/td/div[1]/div/div[1]/a/img")).click();
                            wait = new WebDriverWait(driver, 10);
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_txtBusqueda")));
                            driver.findElement(By.id("ctl00_txtBusqueda")).clear();
                            bool = true;
                        }
                    }

                    if (bool == false) {
                        productosSinAgregar.add(arr.get(i));
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("Line 2751");
                    productosSinAgregar.add(arr.get(i));
                }
            }

            System.out.println("productisSinAgregar.size() " + productosSinAgregar.size());

            for (int i = 0; i < productosSinAgregar.size(); i++) {
                creaBlock(productosSinAgregar.get(i).get(0).toString() + " " + productosSinAgregar.get(i).get(1).toString() + " " + productosSinAgregar.get(i).get(2).toString());
            }

            if (!productosSinAgregar.isEmpty()) {
                DefaultTableModel model2 = new DefaultTableModel();
                model2.addColumn("Proveedor");
                model2.addColumn("Codigo");
                model2.addColumn("Descripcion");
                model2.addColumn("N° Comprado");
                //                model2.addColumn("Stock Valido");
                //                model2.addColumn("Factor");
                //                model2.addColumn("Seleccionar");
                model2.addColumn("Parear Codigo");
                Object[] fila2 = new Object[5];

                for (int i = 0; i < productosSinAgregar.size(); i++) {
                    ArrayList get = productosSinAgregar.get(i);
                    fila2[0] = get.get(0);
                    fila2[1] = get.get(1);
                    fila2[2] = get.get(2);
                    fila2[3] = get.get(3);
                    //                    fila2[4] = get.get(4);
                    //                    fila2[5] = get.get(5);
                    //                    fila2[6] = true;
                    model2.addRow(fila2);
                }

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);

                jTable4.setModel(model2);
                TableRowSorter trs = new TableRowSorter(model2);

                //                class IntComparator implements Comparator {
                //                    public int compare(Object o1, Object o2) {
                //                        Integer int1 = (Integer) o1;
                //                        Integer int2 = (Integer) o2;
                //                        return int1.compareTo(int2);
                //                    }
                //
                //                    public boolean equals(Object o2) {
                //                        return this.equals(o2);
                //                    }
                //                }
                class IntComparator2 implements Comparator {

                    public int compare(Object o1, Object o2) {
                        Double valueOf;
                        try {
                            valueOf = Double.valueOf(o1.toString());
                        } catch (Exception ex) {
                            valueOf = -999999999.0;
                        }
                        Double valueOf1 = 0.0;
                        try {
                            valueOf1 = Double.valueOf(o2.toString());
                        } catch (Exception ex) {
                            valueOf1 = -999999999.0;
                        }
                        return valueOf.compareTo(valueOf1);
                    }
                }

//                trs.setComparator(5, new IntComparator2());
                trs.setComparator(3, new IntComparator2());
                //                trs.setComparator(4, new IntComparator());

                jTable4.setRowSorter(trs);
                DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTable4.getTableHeader().getDefaultRenderer();
                renderer.setHorizontalAlignment(JLabel.CENTER);

                jTable4.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                jTable4.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                jTable4.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                jTable4.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                //                this.jTable4.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                //                this.jTable4.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                //                this.jTable4.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
                jTable4.getColumnModel().getColumn(2).setPreferredWidth(500);

                //                TableColumn Tcol = jTable4.getColumnModel().getColumn(6);
                //                Tcol.setCellEditor(jTable4.getDefaultEditor(Boolean.class));
                //                Tcol.setCellRenderer(jTable4.getDefaultRenderer(Boolean.class));
                jTable4.getColumn("Parear Codigo").setCellRenderer(new ButtonRenderer2());
                jTable4.getColumn("Parear Codigo").setCellEditor(new ButtonEditor2(new JCheckBox()));

                jTable4.setRowHeight(25);
                jTable4.setShowHorizontalLines(true);
                jTable4.setShowVerticalLines(true);

                JOptionPane.showMessageDialog(jPanel7, "Procedimiento Terminado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                jPanel11.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Procedimiento Terminado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            }

            jButtonComprar.setEnabled(true);

            try {
                Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread2.start();
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            Logica.LogicaDescuentos.Principal();
        } catch (Exception e) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CompletableFuture.runAsync(() -> {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            jTable1.setVisible(false);

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }

            // Obtener el número de filas del modelo de tabla
            int numRows = model.getRowCount();
            System.out.println("numRows " + numRows);

            int numCols = model.getColumnCount();
            System.out.println("numCols " + numCols);

            Object[][] newData = new Object[numRows][numCols];
            Object newValue = true;

            String toStringProveedor = jComboBox1.getSelectedItem().toString();
            String toStringCliente = jComboBox2.getSelectedItem().toString();
            double threshold = Double.parseDouble(jTextField2.getText());

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (col == 14) { // Modificar solo la columna 1
                        try {
                            String toString2 = model.getValueAt(row, 2).toString();
                            String toString3 = model.getValueAt(row, 3).toString();
                            String toString9 = model.getValueAt(row, 9).toString();

                            if (toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                                if ((Double.parseDouble(toString9) >= threshold) || (model.getValueAt(row, 8).toString().contains("-"))) {
                                    newData[row][col] = newValue;
                                } else {
                                    newData[row][col] = model.getValueAt(row, col);
                                }
                            } else if (!toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                                if (((Double.parseDouble(toString9) >= threshold) || (model.getValueAt(row, 8).toString().contains("-"))) && toString2.equals(toStringProveedor)) {
                                    newData[row][col] = newValue;
                                } else {
                                    newData[row][col] = model.getValueAt(row, col);
                                }
                            } else if (toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                                if (((Double.parseDouble(toString9) >= threshold) || (model.getValueAt(row, 8).toString().contains("-"))) && toString3.equals(toStringCliente)) {
                                    newData[row][col] = newValue;
                                } else {
                                    newData[row][col] = model.getValueAt(row, col);
                                }
                            } else if (!toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                                if (((Double.parseDouble(toString9) >= threshold) || (model.getValueAt(row, 8).toString().contains("-"))) && toString2.equals(toStringProveedor) && toString3.equals(toStringCliente)) {
                                    newData[row][col] = newValue;
                                } else {
                                    newData[row][col] = model.getValueAt(row, col);
                                }
                            }
                        } catch (Exception ex) {
                            newData[row][col] = model.getValueAt(row, col);
                        }
                    } else {
                        newData[row][col] = model.getValueAt(row, col);
                    }
                }
            }

            model.setDataVector(newData, getColumnNames(model));

            if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    String toString1 = jComboBox1.getSelectedItem().toString();
                    String toString2 = jComboBox2.getSelectedItem().toString();

                    // Crear el primer filtro
                    RowFilter<Object, Object> rowFilter1 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(2);
                            return (value.toString().equals(toString1));
                        }
                    };

                    // Crear el segundo filtro
                    RowFilter<Object, Object> rowFilter2 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(3);
                            return (value.toString().equals(toString2));
                        }
                    };

                    // Crear un nuevo filtro combinando ambos filtros con AND
                    RowFilter<Object, Object> combinedFilter = RowFilter.andFilter(Arrays.asList(rowFilter1, rowFilter2));

                    // Obtener el sorter actual de la tabla
                    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                    // Asignar el RowFilter combinado al sorter y aplicar el filtro
                    sorter.setRowFilter(combinedFilter);

                    // Actualizar el sorter de la tabla
                    jTable1.setRowSorter(sorter);
                } catch (Exception ex) {

                }
            } else if (jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringA = jComboBox2.getSelectedItem().toString();
                    System.out.println("toString " + toStringA);

                    if (!toStringA.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(3);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringA));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringB = jComboBox1.getSelectedItem().toString();
                    System.out.println("toString " + toStringB);

                    if (!toStringB.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(2);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringB));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            }

            renderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    String toString = table.getValueAt(row, 19).toString();

                    if (toString.equals("1")) {
                        c.setBackground(new Color(103, 219, 219));
                    } else {
                        c.setBackground(new Color(88, 123, 133));
                    }

                    return c;
                }
            };

            columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }
            renderer.setHorizontalAlignment(0);
            ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(0);

            resizeColumnWidth(jTable1);

            jTable1.setRowHeight(30);
            jTable1.setShowHorizontalLines(true);
            jTable1.setShowVerticalLines(true);

            TableColumnModel columnModel = jTable1.getColumnModel();

            TableColumn column = columnModel.getColumn(14);
            column.setCellEditor(new DefaultCellEditor(new JCheckBox() {
                {
                    setHorizontalAlignment(JCheckBox.CENTER); // Establece la alineación horizontal en el centro
                }
            }));

            column.setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    JCheckBox checkBox = new JCheckBox();
                    checkBox.setSelected(value != null && (Boolean) value);
                    checkBox.setHorizontalAlignment(JCheckBox.CENTER);

                    return checkBox;
                }
            });

            jTable1.setVisible(true);
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CompletableFuture.runAsync(() -> {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            jTable1.setVisible(false);

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }

            int numRows = model.getRowCount();
            System.out.println("numRows " + numRows);

            int numCols = model.getColumnCount();
            System.out.println("numCols " + numCols);

            Object[][] newData = new Object[numRows][numCols];
            Object newValue = false;

            String toStringProveedor = jComboBox1.getSelectedItem().toString();
            String toStringCliente = jComboBox2.getSelectedItem().toString();

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (col == 14) { // Modificar solo la columna 1
                        String toString2 = model.getValueAt(row, 2).toString();
                        String toString3 = model.getValueAt(row, 3).toString();

                        if (toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                            newData[row][col] = newValue;
                        } else if (!toStringProveedor.equals("TODOS") && toStringCliente.equals("TODOS")) {
                            if (toString2.equals(toStringProveedor)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        } else if (toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                            if (toString3.equals(toStringCliente)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        } else if (!toStringProveedor.equals("TODOS") && !toStringCliente.equals("TODOS")) {
                            if (toString2.equals(toStringProveedor) && toString3.equals(toStringCliente)) {
                                newData[row][col] = newValue;
                            } else {
                                newData[row][col] = model.getValueAt(row, col);
                            }
                        }
                    } else {
                        newData[row][col] = model.getValueAt(row, col);
                    }
                }
            }

            model.setDataVector(newData, getColumnNames(model));

            if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    String toString1 = jComboBox1.getSelectedItem().toString();
                    String toString2 = jComboBox2.getSelectedItem().toString();

                    // Crear el primer filtro
                    RowFilter<Object, Object> rowFilter1 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(2);
                            return (value.toString().equals(toString1));
                        }
                    };

                    // Crear el segundo filtro
                    RowFilter<Object, Object> rowFilter2 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(3);
                            return (value.toString().equals(toString2));
                        }
                    };

                    // Crear un nuevo filtro combinando ambos filtros con AND
                    RowFilter<Object, Object> combinedFilter = RowFilter.andFilter(Arrays.asList(rowFilter1, rowFilter2));

                    // Obtener el sorter actual de la tabla
                    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                    // Asignar el RowFilter combinado al sorter y aplicar el filtro
                    sorter.setRowFilter(combinedFilter);

                    // Actualizar el sorter de la tabla
                    jTable1.setRowSorter(sorter);
                } catch (Exception ex) {

                }
            } else if (jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringA = jComboBox2.getSelectedItem().toString();
                    System.out.println("toString " + toStringA);

                    if (!toStringA.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(3);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringA));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toStringB = jComboBox1.getSelectedItem().toString();
                    System.out.println("toString " + toStringB);

                    if (!toStringB.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(2);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toStringB));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            }

            renderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    String toString = table.getValueAt(row, 19).toString();

                    if (toString.equals("1")) {
                        c.setBackground(new Color(103, 219, 219));
                    } else {
                        c.setBackground(new Color(88, 123, 133));
                    }

                    return c;
                }
            };

            columnCount = jTable1.getColumnCount();
            synchronized (jTable1) {
                for (int i = 0; i < columnCount; i++) {
                    jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
            }
            renderer.setHorizontalAlignment(0);
            ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(0);

            resizeColumnWidth(jTable1);

            jTable1.setRowHeight(30);
            jTable1.setShowHorizontalLines(true);
            jTable1.setShowVerticalLines(true);

            TableColumnModel columnModel = jTable1.getColumnModel();

            TableColumn column = columnModel.getColumn(14);
            column.setCellEditor(new DefaultCellEditor(new JCheckBox() {
                {
                    setHorizontalAlignment(JCheckBox.CENTER); // Establece la alineación horizontal en el centro
                }
            }));

            column.setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    JCheckBox checkBox = new JCheckBox();
                    checkBox.setSelected(value != null && (Boolean) value);
                    checkBox.setHorizontalAlignment(JCheckBox.CENTER);

                    return checkBox;
                }
            });

            jTable1.setVisible(true);
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        try {
            if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    String toString1 = jComboBox1.getSelectedItem().toString();
                    String toString2 = jComboBox2.getSelectedItem().toString();

                    // Crear el primer filtro
                    RowFilter<Object, Object> rowFilter1 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(2);
                            return (value.toString().equals(toString1));
                        }
                    };

                    // Crear el segundo filtro
                    RowFilter<Object, Object> rowFilter2 = new RowFilter<Object, Object>() {
                        public boolean include(RowFilter.Entry<?, ?> entry) {
                            Object value = entry.getValue(3);
                            return (value.toString().equals(toString2));
                        }
                    };

                    // Crear un nuevo filtro combinando ambos filtros con AND
                    RowFilter<Object, Object> combinedFilter = RowFilter.andFilter(Arrays.asList(rowFilter1, rowFilter2));

                    // Obtener el sorter actual de la tabla
                    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                    // Asignar el RowFilter combinado al sorter y aplicar el filtro
                    sorter.setRowFilter(combinedFilter);

                    // Actualizar el sorter de la tabla
                    jTable1.setRowSorter(sorter);
                } catch (Exception ex) {

                }
            } else if (jComboBox1.getSelectedItem().toString().equals("TODOS") && !jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toString = jComboBox2.getSelectedItem().toString();
                    System.out.println("toString " + toString);

                    if (!toString.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(3);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toString));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else if (!jComboBox1.getSelectedItem().toString().equals("TODOS") && jComboBox2.getSelectedItem().toString().equals("TODOS")) {
                try {
                    jTable1.setRowSorter(null);

                    String toString = jComboBox1.getSelectedItem().toString();
                    System.out.println("toString " + toString);

                    if (!toString.equals("TODOS")) {
                        RowFilter<Object, Object> rowFilter = new RowFilter<Object, Object>() {
                            public boolean include(RowFilter.Entry<?, ?> entry) {
                                // Obtener el valor de la columna deseada
                                Object value = entry.getValue(2);
                                // Verificar si el valor cumple con el filtro deseado
                                return (value.toString().equals(toString));
                            }
                        };

                        // Obtener el sorter actual de la tabla
                        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable1.getRowSorter();

                        // Asignar el RowFilter al sorter y aplicar el filtro
                        sorter.setRowFilter(rowFilter);

                        // Actualizar el sorter de la tabla
                        jTable1.setRowSorter(sorter);
                    } else {
                        jTable1.setRowSorter(null);
                    }
                } catch (Exception ex) {

                }
            } else {
                jTable1.setRowSorter(null);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public static void crearExcel() throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Descuento");

        XSSFFont headerFont = workbook.createFont();
        headerFont.setColor(IndexedColors.WHITE.index);
        CellStyle headerCellStyle = spreadsheet.getWorkbook().createCellStyle();
        // fill foreground color ...
        headerCellStyle.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.index);
        // and solid fill pattern produces solid grey cell fill
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyle.setFont(headerFont);
        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"CODIGO", "PRECIO FINAL"});
        // Iterate over data and write to sheet 
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            // this creates a new row in the sheet 
            Row row = spreadsheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                // this line creates a cell in the next column of that row 
                Cell cell = row.createCell(cellnum++);
                // if rownum is 1 (first row was created before) then set header CellStyle
                if (rownum == 1) {
                    cell.setCellStyle(headerCellStyle);
                }
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }
        File file = new File("Descuento.xlsx");
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();

        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) {
            desktop.open(file);
        }
    }

    public static void resizeColumnWidth(JTable table) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15;
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max((comp.getPreferredSize()).width + 1, width);
            }
            width = Math.max(width, table.getColumnModel().getColumn(column).getPreferredWidth());
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }

    public static void Principal() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public static List<Productos> productos = new ArrayList<>();
    public static DefaultTableModel modelTabla3 = new DefaultTableModel();
    public static Object[] filaTabla3 = new Object[10];

    public static int i;
    public static WebDriver driver;
    static ArrayList<String> listaProveedores = new ArrayList<String>();

    static ArrayList<ArrayList> paquete = new ArrayList<>();
    static ArrayList<String> proveedores = new ArrayList<>();
    static String codigoVentana1;
    static ArrayList<ArrayList> paginaUno = new ArrayList<>();
    public static ArrayList<String> noProveedor = new ArrayList<>();
    public static ArrayList<String> proveedor = new ArrayList<>();
    public static ArrayList<String> codigosCarro = new ArrayList<>();
    public static ArrayList<ArrayList<Documento>> arrArrDocumentos = new ArrayList<>();
    public static String textRazonSocial;
    public static ArrayList<Productos> arrProductosPB = new ArrayList<>();
    public static ArrayList<Productos> arrProductosPBEspecial = new ArrayList<>();
    public static ArrayList<Descuento> arrDescuento = new ArrayList<>();
    public static ArrayList<Productos> arrProductosOL = new ArrayList<>();
    public static ArrayList<Productos> arrProductosVA = new ArrayList<>();
    public static ArrayList<ArrayList<Productos>> arrArrProductos = new ArrayList<>();
    public static ArrayList<ArrayList<Productos>> arrArrProductosEspecial = new ArrayList<>();

    public static String v = "";
    public static String columna0;
    public static String columna1;
    public static String columna2;
    public static int progreso;
    public static VentanaDescarga vd;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgregar;
    public static javax.swing.JButton jButtonCargarInforme;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonDescargarInformes;
    private javax.swing.JButton jButtonQuitar;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTextField jTextField2;
    public static rojeru_san.componentes.RSDateChooser rSDateChooser1;
    public static rojeru_san.componentes.RSDateChooser rSDateChooser2;
    // End of variables declaration//GEN-END:variables
    public static boolean opcion = true;
    public static ArrayList<ArrayList> arr;
    public static ArrayList<String> row;
    public static int vNum;
    public static ArrayList<String> arrConsultas = new ArrayList<>();

}

////////////////////////////////////////////////////////////////////////////////
class ButtonRenderer2 extends JButton implements TableCellRenderer {

    public ButtonRenderer2() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else {
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
        }
        setText((value == null) ? "Parear Codigo" : value.toString());
        return this;
    }
}

class ButtonEditor2 extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;

    public ButtonEditor2(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "Parear Codigo" : value.toString();
        button.setText("Parear Codigo");
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            int row = VentanaPrincipal.jTable4.getSelectedRow();
            System.out.println("row " + row);
            VentanaPrincipal.columna0 = VentanaPrincipal.jTable4.getValueAt(row, 0).toString();
            System.out.println("columna0 " + VentanaPrincipal.columna0);
            VentanaPrincipal.columna1 = VentanaPrincipal.jTable4.getValueAt(row, 1).toString();
            System.out.println("columna1 " + VentanaPrincipal.columna1);
            VentanaPrincipal.columna2 = VentanaPrincipal.jTable4.getValueAt(row, 2).toString();
            System.out.println("columna2 " + VentanaPrincipal.columna2);

            VentanaParear vp = new VentanaParear();
            vp.setVisible(true);
        }
        isPushed = false;
        return label;
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        try {
            super.fireEditingStopped();
        } catch (Exception ex) {
        }
    }
}
