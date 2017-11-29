package ui;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import flechette.Joueur;

public class DashboardPanel extends JPanel{
	private JLabel messageLable = new JLabel();
	String nomDuJeu;
	String about = "Les prof. d'algo de l'IPL ";
	
	public DashboardPanel(String nomDuJeu, String about) {
		this.nomDuJeu = nomDuJeu;
		this.about = about;
		this.add(messageLable);
	}
	public void afficherMessageDebutJeu() {
		StringBuilder sb = new StringBuilder();
		sb.append("*****************************************************************\n");
		
		sb.append("    Bienvenue au jeu de flechette - "+nomDuJeu+"\n");
		sb.append("     programme par "+about+"\n");
		sb.append("*****************************************************************");
		messageLable.setText(sb.toString());
	}

	public void afficherMessageFinJeu() {
		StringBuilder sb = new StringBuilder();
		sb.append("*****************************************************************\n");
		sb.append("     Le jeu de flechettes - "+nomDuJeu+" est termine\n");
		sb.append("              A bientot\n");
		sb.append("        "+about+"\n");
		sb.append("*****************************************************************");
		messageLable.setText(sb.toString());
	}
}
