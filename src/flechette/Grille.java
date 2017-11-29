package flechette;

public abstract class Grille {
	
	// La table contient les joueurs selon l'ordre du jeu
	private Joueur[] tableJoueurs;

	/**
	 * construit une table vide pouvant contenir nombreJoueurs joueurs
	 * @param nombreJoueurs le nombre de joueurs participants
	 * @throws IllegalArgumentException : nombreJoueurs invalide : minimum 1 joueur!
	 */
	public Grille(int nombreJoueurs) {
		if(nombreJoueurs<1)
			throw new IllegalArgumentException("Attention, minimum 1 joueur!");
		tableJoueurs = new Joueur[nombreJoueurs];		
	}
	
	public int nombreJoueurs() {
		return tableJoueurs.length;
	}

	/**
	 * ajoute un joueur dans la table
	 * @param joueur le joueur a ajouter
	 * @param numero le numero d'ordre du joueur dans le jeu (numerotation commence a 1)
	 * @throws IllegalArgumentException : joueur ou numero invalide(s)
	 */
	public void ajouterJoueur(Joueur joueur, int numero){
		if (joueur==null) throw new IllegalArgumentException();
		if (numero<=0) throw new IllegalArgumentException();
		tableJoueurs[numero-1]= joueur;
	}
	
	/**
	 * renvoie le joueur dont le numero est passe en parametre
	 * @param numero le numero d'ordre du joueur dans le jeu
	 * @return le joueur
	 * @throws IllegalArgumentException : numero invalide 
	 */
	public Joueur donnerJoueur(int numero){
		if (numero ==0) throw new IllegalArgumentException();
		return tableJoueurs[numero-1];
	}
	
	public String toString(){
		String ch ="Voici les points :";
		for (int i = 0; i < tableJoueurs.length; i++) {
			ch += "\n"+tableJoueurs[i];
		}
		return ch;
	}
	
	/**
	 * classement des joueurs (du meilleur au moins bon
	 * @return une table de joueurs
	 */
	public Joueur[] classement(){		
		int iMin;
		Joueur temp;
		for(int i = 0;i < tableJoueurs.length;i++)
		{
			iMin = i;
			for(int j = i;j < tableJoueurs.length;j++)
			{
				if(tableJoueurs[j].estMieuxClasse(tableJoueurs[i]))
				{
					iMin = j;
				}
			}
			temp = tableJoueurs[i];
			tableJoueurs[i] = tableJoueurs[iMin];
			tableJoueurs[iMin] = temp;
		}
		return tableJoueurs;
	}	
	
}
