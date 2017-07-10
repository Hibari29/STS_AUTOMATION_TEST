package View.Performance;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Existing extends JPanel{
	private JPanel jpnlExisting;
//	private JTabbedPane jTabbedPane;
	private JScrollPane jspContainer;
	private JTable jtblExisting;

	public Existing(){
		setLayout(new BorderLayout());
		initialize();
	}

	private void initialize() {
	//	jTabbedPane = new JTabbedPane();
		jpnlExisting = new JPanel();
		String columnNames[] = {
				"Target",
				"Week 1",
				"Week 2",
				"Week 3",
				"Week 4",
				"EOM"
		};
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.setColumnIdentifiers(columnNames);
		dtm.setRowCount(4);
		jtblExisting = new JTable(dtm);
		jspContainer = new JScrollPane(jtblExisting);
		
		this.add(jspContainer);
	}
}
