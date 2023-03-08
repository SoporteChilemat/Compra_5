package Ventanas;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class Ventana2 extends javax.swing.JDialog {

    public Ventana2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jButton1.setText("PROVEEDOR GENERICO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Proveedor");
        model.addColumn("Eegir");
        Object[] fila = new Object[2];

        System.out.println("Calendar.proveedores.size() " + VentanaPrincipal.proveedores.size());

        for (int i = 0; i < VentanaPrincipal.proveedores.size(); i++) {
            fila[0] = VentanaPrincipal.proveedores.get(i);
            fila[1] = false;
            model.addRow(fila);
        }

        jTable1.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableRowSorter trs = new TableRowSorter(model);

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

        class IntComparator2 implements Comparator {

            public int compare(Object o1, Object o2) {
                Double valueOf = Double.valueOf(o1.toString());
                Double valueOf1 = Double.valueOf(o2.toString());
                double name = valueOf * 100;
                double name2 = valueOf1 * 100;
                String valueOf2 = String.valueOf(name);
                String[] split = valueOf2.split(Pattern.quote("."));
                String valueOf3 = String.valueOf(name2);
                String[] split2 = valueOf3.split(Pattern.quote("."));

                Integer int1 = (Integer) Integer.valueOf(String.valueOf(split[0]));
                Integer int2 = (Integer) Integer.valueOf(String.valueOf(split2[0]));
                return int1.compareTo(int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        //trs.setComparator(2, new IntComparator());
        jTable1.setRowSorter(trs);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer();

        renderer.setHorizontalAlignment(JLabel.CENTER);

        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(220);
        TableColumn Tcol = jTable1.getColumnModel().getColumn(1);

        Tcol.setCellEditor(jTable1.getDefaultEditor(Boolean.class));
        Tcol.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
        jTable1.setRowHeight(25);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int cont = 0;
        int num = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 1).equals(true)) {
                cont = cont + 1;
                num = i;
                System.out.println("num " + num);
            }
        }
        if (cont > 1 || cont == 0) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                VentanaPrincipal.noProveedor.add(jTable1.getValueAt(i, 0).toString());
            }
        } else {
            VentanaPrincipal.proveedor.add(jTable1.getValueAt(num, 0).toString());
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            VentanaPrincipal.noProveedor.add(jTable1.getValueAt(i, 0).toString());
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
