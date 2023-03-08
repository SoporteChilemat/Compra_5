/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ComboBoxEditor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxEditor;

/**
 *
 * @author sopor
 */
public class AutoCompleteComboBox extends javax.swing.JComboBox<String> {

    public int caretPos = 0;
    public JTextField tfield = null;

    public AutoCompleteComboBox() {
        setEditor(new BasicComboBoxEditor());
        setEditable(true);
        ((JLabel) getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tfield.setHorizontalAlignment(JTextField.CENTER);
    }

    public void setSelectedIndex(int index) {
        super.setSelectedIndex(index);
        tfield.setText(getItemAt(index).toString());
        tfield.setSelectionEnd(caretPos + tfield.getText().length());
        tfield.moveCaretPosition(caretPos);
    }

    public void setEditor(ComboBoxEditor editor) {
        super.setEditor(editor);
        if (editor.getEditorComponent() instanceof JTextField) {
            tfield = (JTextField) editor.getEditorComponent();
            tfield.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent ke) {
                    char key = ke.getKeyChar();
                    if (!(Character.isLetterOrDigit(key) || Character.isSpaceChar(key))) {
                        return;
                    }
                    caretPos = tfield.getCaretPosition();
                    String text = "";
                    try {
                        text = tfield.getText(0, caretPos);
                    } catch (javax.swing.text.BadLocationException e) {
                        e.printStackTrace();
                    }
                    // Convertir el texto a mayúsculas antes de compararlo
                    text = text.toUpperCase();
                    for (int i = 0; i < getItemCount(); i++) {
                        String element = (String) getItemAt(i);
                        if (element.toUpperCase().startsWith(text)) {
                            setSelectedIndex(i);
                            return;
                        }
                    }
                }
            });
        }
    }
}
