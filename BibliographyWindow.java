
/**
 * Opens a window to display a big String, sent as text.
 *
 * @author Michael Buescher for APCS-A @ HB
 * @version 2018-04
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BibliographyWindow
{
    private String text;
    
    public BibliographyWindow (String str)
    {
        JTextArea outputArea = new JTextArea (str);
        JFrame window = new JFrame("Your Bibliography!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(outputArea);
        window.setBounds(200,100,50 * CitationManagerGUI.FONT_SIZE, 40 * CitationManagerGUI.FONT_SIZE);
        window.setVisible(true);
    }   

}
