package flechette;

import java.util.Scanner;

public class PanneauTextuel implements Panneau{
	private static Scanner scanner = new Scanner(System.in);
	String nomDuJeu;
	String auteurs; 
	
	public PanneauTextuel(String nomDuJeu, String auteurs){
		this.nomDuJeu = nomDuJeu;
		this.auteurs = auteurs;
	}
	
	@Override
	public Flechette viserEtLancerFlechette() {
		// Pensez a utiliser la methode lireEntierComprisEntre() de la classe UtilitairesJeux
		System.out.println("Quel secteur vises-tu?");
		int secteur = UtilitairesJeux.lireEntierComprisEntre(0, 25, "Il faut un chiffre compris entre 0 et 25");
		System.out.println("Quelle zone vises-tu?");
		int zone = UtilitairesJeux.lireEntierComprisEntre(-1, 3, "Il faut un chiffre compris entre -1 et 3");
		Flechette flechette = new Flechette(secteur, zone);
		return flechette;
	}
	
	@Override
	public void afficherMessageDebutJeu() {
		System.out.println("*****************************************************************");
		System.out.println("    Bienvenue au jeu de flechette - "+nomDuJeu);
		System.out.println("     programme par "+auteurs);
		System.out.println("*****************************************************************");
	}

	@Override
	public void afficherMessageFinJeu() {
		System.out.println("C'est la fin de la partie!");
	}

	@Override
	public void afficherJoueurDebutTour(Joueur joueur, int numeroTour) {
		System.out.println("Debut du Tour : "+numeroTour+"\nJoueur : "+joueur.getNom());
	}
	@Override
	public void afficherJoueurFinTour(Joueur joueur, int numeroTour) {
		System.out.println("Fin du Tour : "+numeroTour+"\nJoueur : "+joueur.getNom());
	}
	
	@Override
	public void afficherGagnant(Joueur gagnant) {
		System.out.println(gagnant.getNom()+" have won");
	}
	
	@Override
	public void afficherJoueurs(Joueur[] joueurs) {
		System.out.println("Joueur(s):");
		for(Joueur bleh:joueurs)
		{
			System.out.println(bleh.getNom());
		}
	}

	@Override
	public void afficherDebutTour(int numeroTour) {
		System.out.println("C'est le debut du tour " + numeroTour);
	}

	@Override
	public void afficherFinTour(int numeroTour) {
		System.out.println("C'est la fin du tour " + numeroTour);	
	}

	@Override
	public void afficherJoueurDebutFlechette(Joueur joueur, int numeroFlechette) {
		System.out.println(joueur.getNom() + "a lancée flechette "+numeroFlechette);	
	}

	@Override
	public void afficherJoueurFinFlechette(Joueur joueur, int numeroFlechette) {
		System.out.println(joueur.getNom() + "a lancée flechette "+numeroFlechette);
	}

	@Override
	public void afficherFlechette(Flechette flechette) {
		System.out.println("flechette" +flechette);		
	}


	@Override
	public void afficherMessageInfo(String message) {
		System.out.println(message);		
	}

	@Override
	public void afficherMessageWarning(String message) {
		System.out.println(message);				
	}

	@Override
	public void afficherRecommandationPourJoueur(Joueur joueur, Flechette flechetteGagnante) {
		System.out.println("Pour " + joueur.getNom() + "je lui conseille de lancer vers " + flechetteGagnante);		
	}
	

}
