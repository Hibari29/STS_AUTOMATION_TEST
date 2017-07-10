package View.Performance;

import javax.swing.JTabbedPane;

public class SubTabbedPane extends JTabbedPane{
	public SubTabbedPane(){
		this.add(new Existing(), "Existing");
		this.add(new New(), "New");
	}
}
