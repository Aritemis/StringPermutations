/**
 *	@author Ariana Fairbanks
 *  Owns the other classes
 */

package controller;

import model.StringPermutation;
import view.MainPanel;
import view.MainWindow;

public class Controller 
{
	
	private MainWindow frame;
	private MainPanel panel;
	private StringPermutation permute;
	
	public void start()
	{
		frame = new MainWindow(this);
		panel = frame.panel;
		permute = new StringPermutation(this);
	}
	
	public void beginPermutation(String input)
	{
		panel.clearTextArea();
		permute.findPermutations("", input);
	}
	
	public void displayResults(String output)
	{
		panel.setTextArea(output);
	}
	
}
