import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;

public class Lesson29 extends JFrame{
	
	JButton but1, but2, but3, but4, but5, but6,
		but7, but8, but9, but0, butPlus, butMinus,
		clearAll;
	
	JTextField textResult;
	
	int num1, num2;
	
	public static void main(String[] args){
		
		new Lesson29();
		
	}
	
	public Lesson29(){
		
		// Create the frame, position it and handle closing it
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		JPanel thePanel = new JPanel();
		
		// Create a Grid Layout with as many rows as needed
		// and 3 columns. The last 2 parameters create a
		// horizontal gap of 2 pixels and a vertical gap of
		// 2 pixels.
		
		// thePanel.setLayout(new GridLayout(0,3,2,2));
		
		thePanel.setLayout(new GridBagLayout());
		
		// You create a GridBagContraints object that defines
		// defaults for your components
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		// Define the x position of the component
		
		gridConstraints.gridx = 1;
		
		// Define the y position of the component
		
		gridConstraints.gridy = 1;
		
		// Number of columns the component takes up
		
		gridConstraints.gridwidth = 1;
		
		// Number of rows the component takes up
		
		gridConstraints.gridheight = 1;
		
		// Gives the layout manager a hint on how to adjust
		// component width (0 equals fixed)
		
		gridConstraints.weightx = 50;
		
		// Gives the layout manager a hint on how to adjust
		// component height (0 equals fixed)
		
		gridConstraints.weighty = 100;
		
		// Defines padding top, left, bottom, right
		
		gridConstraints.insets = new Insets(5,5,5,5);
		
		// Defines where to place components if they don't
		// fill the space: CENTER, NORTH, SOUTH, EAST, WEST
		// NORTHEAST, etc.
		
		gridConstraints.anchor = GridBagConstraints.CENTER;
		
		// How should the component be stretched to fill the
		// space: NONE, HORIZONTAL, VERTICAL, BOTH
		
		gridConstraints.fill = GridBagConstraints.BOTH;
		
		textResult = new JTextField("0",20);
		
		// Defines the font to use in the text field
		
		Font font = new Font("Helvetica", Font.PLAIN, 18);
        textResult.setFont(font);
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPlus = new JButton("+");
		but0 = new JButton("0");
		butMinus = new JButton("-");
		clearAll = new JButton("C");
		
		thePanel.add(clearAll,gridConstraints);
		gridConstraints.gridwidth = 20;
		gridConstraints.gridx = 5;
		thePanel.add(textResult,gridConstraints);
		gridConstraints.gridwidth = 1;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		thePanel.add(but1,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but2,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but3,gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		thePanel.add(but4,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but5,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but6,gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		thePanel.add(but7,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but8,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but9,gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		thePanel.add(butPlus,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but0,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(butMinus,gridConstraints);
		
		
		// Adding buttons using the Grid Layout
		
		/*
		thePanel.add(but1);
		thePanel.add(but2);
		thePanel.add(but3);
		thePanel.add(but4);
		thePanel.add(but5);
		thePanel.add(but6);
		thePanel.add(but7);
		thePanel.add(but8);
		thePanel.add(but9);
		thePanel.add(butPlus);
		thePanel.add(but0);
		thePanel.add(butMinus);
		*/
		
		this.add(thePanel);
		
		this.setVisible(true);
		
	} // END OF Lesson29 CONSTRUCTOR
	
} // END OF Lesson29 CLASS