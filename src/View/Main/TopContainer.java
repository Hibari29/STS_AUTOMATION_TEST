package View.Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Controller.Performance.UploadFileListener;
import View.Performance.Performance;

public class TopContainer extends JFrame {
	private JPanel jpnlMain;
	private JMenu jMenu;
	private JMenuBar jMenuBar;
	private JMenuItem jMenuItemUpload;
	private JTabbedPane jtpContainer;
	private JFileChooser jfcUploadFile;
	
 
	public TopContainer() {
		createAndShowGui();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(500, 500));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void createAndShowGui() {
		jpnlMain = new JPanel(new BorderLayout());
		this.getContentPane().add(jpnlMain);
		jMenuItemUpload = new JMenuItem("Upload File...");
		jfcUploadFile = new JFileChooser();
		
		jMenuItemUpload.addActionListener(new UploadFileListener(jfcUploadFile));
		
		jMenuBar = new JMenuBar();
		jMenu = new JMenu("File");
		jMenuBar.add(jMenu);
		
		jMenu.add(jMenuItemUpload);
		this.setJMenuBar(jMenuBar);
		
		
		

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		gc.fill = GridBagConstraints.BOTH;
		
		jpnlMain.add(new TopTabbedPane());
		
		
	}
}

