package com.stevelinz.independentcopy.writer;

import com.stevelinz.independentcopy.Driver;

import javax.swing.JOptionPane;

/**
 * A simple class that demonstrates a capability to write a line of text to a
 * GUI Window. Notice this class is derived from the interface
 * <code>Writer</code>, which is an abstraction of these details.
 *
 * See dependentcopy project for a poor design
 *
 * @author Jim Lombardo
 * @version 1.02
 * @see Driver for run instructions and info about design rules
 */
public class GuiWriter implements Writer {

    /**
     * Write a line of text to a GUI Window.
     *
     * @param line - a String representing one line of text.
     */
    @Override
    public void writeln(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
