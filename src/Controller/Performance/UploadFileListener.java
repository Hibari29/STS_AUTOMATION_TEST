package Controller.Performance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import View.Main.TopContainer;

public class UploadFileListener implements ActionListener{
	
	private JFileChooser jfc;
	public UploadFileListener(JFileChooser jfc){
		this.jfc = jfc;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		jfc.showOpenDialog(null);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("EXCEL", "xlsx", "xls");
		jfc.setFileFilter(filter);
	}

}
