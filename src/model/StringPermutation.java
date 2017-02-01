/**
 *	@author Ariana Fairbanks
 *  Code to find the permutations.
 */

package model;

import controller.Controller;

public class StringPermutation 
{
	
	private Controller base;
	
	
	public StringPermutation(Controller base) 
	{
		this.base = base;
	}

	
	public void findPermutations(String prefix, String input)
	{
		int position = input.length();
		if (position == 0) 
		{
			base.displayResults(" " + prefix + "\n");
			//System.out.println(prefix);
		}
		else 
		{
			for (int i = 0; i < position; i++)
			{
				findPermutations(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, position));
			}
		}
	}

}