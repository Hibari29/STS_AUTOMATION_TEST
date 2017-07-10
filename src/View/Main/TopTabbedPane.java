package View.Main;

import javax.swing.JTabbedPane;

import View.Performance.Performance;

public class TopTabbedPane extends JTabbedPane{
	public TopTabbedPane(){
		this.add(new Performance(), "Performance");
	}
}
