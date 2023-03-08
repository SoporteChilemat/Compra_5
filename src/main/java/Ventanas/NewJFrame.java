package Ventanas;

import Clases.Documento;
import static Ventanas.VentanaPrincipal.arrArrDocumentos;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo");
        model.addColumn("Orden De Compra");
        model.addColumn("Cliente");
        model.addColumn("Precio Unitario");
        model.addColumn("Descuento");
        model.addColumn("Porcentaje");

        ArrayList<String> arrCodigos = new ArrayList<>();
        for (int i = 0; i < arrArrDocumentos.size(); i++) {
            ArrayList<Documento> get = arrArrDocumentos.get(i);
            for (int j = 0; j < get.size(); j++) {
                String codigo = get.get(j).getCodigo();
                arrCodigos.add(codigo);
            }
        }

        LinkedHashSet<String> hashSet = new LinkedHashSet<>(arrCodigos);
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
        listWithoutDuplicates.sort(String::compareToIgnoreCase);

        System.out.println(listWithoutDuplicates);

        int red = 0;
        int green = 0;
        int blue = 0;

        ArrayList<String> rnds = new ArrayList<>();
        for (int i = 0; i < listWithoutDuplicates.size(); i++) {
            Random r = new Random();
            red = 1 + r.nextInt(255 - 1 + 1);
            green = 1 + r.nextInt(255 - 1 + 1);
            blue = 1 + r.nextInt(255 - 1 + 1);

            String rnd = red + "," + green + "," + blue;
            rnds.add(rnd);
        }

        for (int i = 0; i < arrArrDocumentos.size(); i++) {
            ArrayList<Documento> get = arrArrDocumentos.get(i);
            for (int j = 0; j < get.size(); j++) {
                Documento get1 = get.get(j);

                String codigo = get1.getCodigo();
                String ordenDeCompra = get1.getOrdenDeCompra();
                String cliente = get1.getCliente();
                String precioUnitario = get1.getPrecioUnitario();
                String descuento = get1.getDescuento();
                String porcentaje = get1.getPorcentaje();

                Object[] fila = new Object[6];

                fila[0] = codigo;
                fila[1] = ordenDeCompra;
                fila[2] = cliente;
                fila[3] = precioUnitario;
                fila[4] = descuento;
                fila[5] = porcentaje;
                model.addRow(fila);
            }
        }

        jTable1.setModel(model);

        TableRowSorter trs = new TableRowSorter(model);

        class fechaComparator implements Comparator {

            public int compare(Object o1, Object o2) {
                String[] split = o1.toString().split("/");
                String dia = split[0];
                String mes = split[1];
                String año = split[2];
                String replace = año + mes + dia;
                System.out.println(replace);

                String[] split1 = o2.toString().split("/");
                String dia1 = split1[0];
                String mes1 = split1[1];
                String año1 = split1[2];
                String replace1 = año1 + mes1 + dia1;
                System.out.println(replace1);

                Integer int1 = Integer.valueOf(replace);
                Integer int2 = Integer.valueOf(replace1);
                return int1.compareTo(int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        class IntComparator implements Comparator {

            public int compare(Object o1, Object o2) {
                Integer int1 = (Integer) o1;
                Integer int2 = (Integer) o2;
                return int1.compareTo(int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        class doubleComparator implements Comparator {

            double int1 = 0;
            double int2 = 0;

            public int compare(Object o1, Object o2) {
                try {
                    int1 = Double.valueOf(o1.toString().replace(".", "").replace(",", "."));
                } catch (Exception ex) {
                    int1 = Double.valueOf(o1.toString().replace(",", "."));
                }
                try {
                    int2 = Double.valueOf(o2.toString().replace(".", "").replace(",", "."));
                } catch (Exception ex) {
                    int2 = Double.valueOf(o2.toString().replace(",", "."));
                }
                return Double.compare(int1, int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        class doubleComparator2 implements Comparator {

            double int1 = 0;
            double int2 = 0;

            public int compare(Object o1, Object o2) {
                int1 = Double.valueOf(o1.toString());
                int2 = Double.valueOf(o2.toString());
                return Double.compare(int1, int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        class StringComparator2 implements Comparator {

            public int compare(Object o1, Object o2) {
//                o1.toString().replace("-", "");
                String dia = o1.toString().replace("-", "").substring(0, 2);
                String mes = o1.toString().replace("-", "").substring(2, 4);
                String año = o1.toString().replace("-", "").substring(4);
                String fechao1 = año + mes + dia;

//                o2.toString().replace("-", "");
                String dia2 = o2.toString().replace("-", "").substring(0, 2);
                String mes2 = o2.toString().replace("-", "").substring(2, 4);
                String año2 = o2.toString().replace("-", "").substring(4);
                String fechao2 = año2 + mes2 + dia2;

                Integer int1 = Integer.valueOf(fechao1);
                Integer int2 = Integer.valueOf(fechao2);
                return int1.compareTo(int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        DefaultTableCellRenderer centerRenderer2;
        centerRenderer2 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {

                String toString = jTable1.getValueAt(row, 0).toString();
                System.out.println(toString);

                for (int i = 0; i < listWithoutDuplicates.size(); i++) {
                    String get = listWithoutDuplicates.get(i);
                    String[] split = rnds.get(i).split(",");
                    if (toString.equals(get)) {
                        //#F0FFF0
                        setBackground(new Color(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2])));
                        setForeground(Color.BLACK);
                    }
                }

                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        };

        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);

        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer2);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer2);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer2);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer2);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer2);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer2);

        jTable1.setRowSorter(trs);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
        Renderer.setHorizontalAlignment(JLabel.CENTER);

        jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);

        jTable1.setRowHeight(25);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        //}    
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
