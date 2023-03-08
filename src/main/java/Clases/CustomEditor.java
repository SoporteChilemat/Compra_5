package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class CustomEditor extends AbstractCellEditor implements TableCellEditor {

    private final javax.swing.JCheckBox jCheckBox1;
    private final javax.swing.JPanel jPanel1;

    public Object getCellEditorValue() {
        return jCheckBox1.isSelected();
    }

    public CustomEditor(JTable jTable) {
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        String toString = table.getValueAt(row, 19).toString();

        if (toString.equals("1")) {
            jPanel1.setBackground(new Color(103, 219, 219));
        } else {
            jPanel1.setBackground(new Color(88, 123, 133));
        }

        if (value.toString().equals("true")) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }

        return jPanel1;
    }
}
