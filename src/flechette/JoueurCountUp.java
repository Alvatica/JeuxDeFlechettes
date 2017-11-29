package flechette;

public class JoueurCountUp extends Joueur{
	
	public JoueurCountUp(String nom) {
		super(nom);
	}
	
	/**
	 * ajoute des points aux points du joueur
	 * @param points les points a ajouter
	 */
	public void ajouterPoints(int points){
		System.out.println("Points: "+points);
		this.setPoints(this.getPoints()+points);
	}

	@Override
	public boolean estMieuxClasse(Joueur autreJoueur) {
		if(autreJoueur == null)
		{
			throw new IllegalArgumentException("Invalid Argument!!!");
		}
		if(this.getPoints() > autreJoueur.getPoints())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
