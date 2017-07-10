package View.Performance;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Performance extends JPanel {
	public Performance(){
		setLayout(new BorderLayout());
		this.add(new SubTabbedPane());
	}
	
}