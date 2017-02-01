package view;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.Controller;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Ariana Fairbanks
 * Makes the rest of the GUI
 */

public class MainPanel extends JPanel
{
	private Controller base;
	private JTextField textField;
	private SpringLayout springLayout;
	private JTextArea textArea;
	private JButton enterButton;
	private JScrollPane scrollPane;
	

	public MainPanel(Controller base)
	{
		this.base = base;
		this.springLayout = new SpringLayout();
		this.textArea = new JTextArea();
		this.textField = new JTextField();
		this.enterButton = new JButton("Enter");
		scrollPane = new JScrollPane(textArea);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 80, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -50, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, enterButton);

		setUpPanel();
		setUpLayout();
		setUpListeners();
	}

	public void setUpPanel()
	{
		this.setLayout(springLayout);
		this.add(scrollPane);
		textArea.setEditable(false);
		this.add(textField);
		this.add(enterButton);
	}
	
	private void setUpLayout() 
	{	
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 81, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 50, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, -50, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, textArea, -50, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 81, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 50, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, -50, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, textArea, -50, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 36, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 50, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, textField, 295, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, enterButton, -1, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, enterButton, -50, SpringLayout.EAST, this);
	}
	
	private void setUpListeners()
	{
		enterButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent onClick) 
			{
				String input = new String(textField.getText().toUpperCase());
				base.beginPermutation(input);
			}

		});
	}
	
	public void setTextArea(String output)
	{
		this.textArea.append(output);
	}
	
	public void clearTextArea()
	{
		this.textArea.setText("");
	}
	
}
