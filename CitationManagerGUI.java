/** A GUI for a Citation management program.
  * Based on various sources.
  *
  * @author Michael Buescher for Hathaway Brown APCS
  * @version Spring 2018
  */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.border.*;

public class CitationManagerGUI extends JPanel
{
  // -------------- Data Components --------------------
  private ResearchSourceList sourceList;
  
  // Font size to adjust the GUI.
  // For most applications, use 11 or 12.
  // For high-resolution screens, try 20.
  public static final int FONT_SIZE = 20;
  private Font myBoldFont = new Font(Font.SANS_SERIF, Font.BOLD, FONT_SIZE);
  private Font myFont = new Font(Font.SANS_SERIF, Font.PLAIN, FONT_SIZE);
  
  // -------------- GUI components ------------------------
  
 // Sort Buttons
  private JButton sortByAuthorButton;
  private JButton sortByTypeButton;
  
  // Selection Tools
  private JLabel selectLabel;
  private JTextField selectSourceText;
  private JComboBox<Integer> selectSourceCombo;
  private JButton getNoteButton;
  private JButton getBibliographyEntryButton;
  
  // Output area
  private JTextArea listArea;
  private JTextField outputText;
  
  private JLabel blanks20;
  
  //----------------------------------------------------------------------------
  // Constructor sets up the GUI 
  // It's very long!
  //----------------------------------------------------------------------------
  
  public CitationManagerGUI ()
  {    
    // The source list
    sourceList = new ResearchSourceList();
    
    // Set the appopriate Font for the components
    UIManager.put("Button.font", myBoldFont);
    UIManager.put("Label.font", myBoldFont);
    UIManager.put("TextField.font", myFont);
    UIManager.put("TextArea.font", myFont);
    UIManager.put("ComboBox.font", myFont);
    
    // The Sorting Tool
    sortByAuthorButton = new JButton("Sort by Author");
    sortByAuthorButton.addActionListener(new sortAuthorButtonListener());
    
    sortByTypeButton = new JButton("Sort by Type");
    sortByTypeButton.addActionListener(new sortTypeButtonListener());
    
    // The List
    listArea = new JTextArea (FONT_SIZE, 3 * FONT_SIZE);
    
    // The User Tools
    selectLabel = new JLabel ("Select a Source:");
    selectSourceText = new JTextField(5);
    
    // Fill the JComboBox with the integers;
    int numItems = sourceList.getNumItems();
    Integer[] nums = new Integer[numItems];
    for (int i = 0; i < numItems; i++)
    {
        nums[i] = new Integer(i);
    }
    selectSourceCombo = new JComboBox<Integer> (nums);
    
    getNoteButton = new JButton("Get Note");
    getNoteButton.addActionListener(new getNoteButtonListener());
    getBibliographyEntryButton = new JButton("Get Bibliography Entry");
    getBibliographyEntryButton.addActionListener(new getBibliographyEntryButtonListener());
    
    outputText = new JTextField(40);
    
   
    // Lay Out the Tools on a JFrame
    setLayout(new FlowLayout());
    add(sortByAuthorButton);
    add(sortByTypeButton);
    
    add(listArea);
    
    add(selectLabel);
    //add(selectSourceText);
    add(selectSourceCombo);
    add(getNoteButton);
    add(getBibliographyEntryButton);
    add(outputText);
    
    listArea.setText(sourceList.toString());
  }
  
  /** 
   * Reads the text field and parses it to get an integer.
   * 
   * WARNING!  This will crash if the entry in selectSourceText is not an integer.
   * Task: Rewrite so that it will return -1 instead of crashing if the String is not an integer
   * Suggestion: use a loop with isDigit(str.charAt(i))
   */
  public int getSourceNum()
  {
     // return Integer.parseInt(selectSourceText.getText());
     return (int)selectSourceCombo.getSelectedItem();
  }  

  // When the user clicks the "Sort by Author" button
  private class sortAuthorButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      outputText.setText(null);
      outputText.setText("Pressed SortByAuthor");
    }
  }
  
  // When the user clicks the "Sort By Type" button
  private class sortTypeButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      outputText.setText(null);
      outputText.setText("Pressed SortByType");
    }
  }
  
  // When the user clicks the "Get Note" button
  private class getNoteButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      int sourceNum = getSourceNum();
      
      outputText.setText(null);
      outputText.setText("Pressed Get Note for Source #" + sourceNum);
    }
  }

  // When the user clicks the "Get Note" button
  private class getBibliographyEntryButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      int sourceNum = getSourceNum();
      
      outputText.setText(null);
      outputText.setText("Pressed Get Bibliography Entry for Source #" + sourceNum);
    }
  }
    
  public static void main(String[] args) 
  {
    JFrame window = new JFrame("Citation Management");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().add(new CitationManagerGUI());
    window.setBounds(100,100,50 * CitationManagerGUI.FONT_SIZE, 40 * CitationManagerGUI.FONT_SIZE);
    window.setVisible(true);
  }
 
}
