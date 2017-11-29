package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoWarnPanel extends JPanel {
	private JLabel infoWarnLabel;
	public InfoWarnPanel(int fontSize) {
		infoWarnLabel = new JLabel();
		infoWarnLabel.setFont(new Font(infoWarnLabel.getFont().getName(), Font.BOLD, fontSize));
		infoWarnLabel.setOpaque(true);
		this.add(infoWarnLabel);
		
	}
	public InfoWarnPanel() {
		this(24);
	}
	public void afficherMessageInfo(String message) {
		infoWarnLabel.setForeground(Color.decode("#25B233"));
		infoWarnLabel.setText(message);

	}
	public void afficherMessageWarning(String message) {		
		infoWarnLabel.setForeground(Color.decode("#FA3838"));
		infoWarnLabel.setText(message);
	}
}
