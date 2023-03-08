/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author sopor
 */
public class UpperCaseDocument extends PlainDocument {

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
