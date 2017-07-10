package Main;

import javax.swing.SwingUtilities;

import View.Main.TopContainer;

public class Index 
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run() {
				new TopContainer();
		    }
		});
			
	}
}
