package view;
import java.awt.Dimension;

import javax.swing.JFrame;

import controller.Controller;

/**
 * @author Ariana Fairbanks
 * Creates the window for the GUI
 */

public class MainWindow extends JFrame
{

	private Controller base;
	public MainPanel panel;
	
	public MainWindow(Controller base)
	{
		this.base = base;
		this.panel = new MainPanel(base);
		
		setUpFrame();
	}

	private void setUpFrame() 
	{
		this.setContentPane(panel);
		this.setSize(750, 650);
		this.setMinimumSize(new Dimension(500, 200));
		this.setResizable(true);
		this.setVisible(true);
	}
	
}
