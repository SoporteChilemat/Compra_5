package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class BooleanRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if (value instanceof Boolean) {
            boolean selected = (Boolean) value;
            
            if (selected) {
                c.setBackground(Color.BLUE);
            } else {
                c.setBackground(Color.WHITE);
            }
        }
        
        return c;
    }
}