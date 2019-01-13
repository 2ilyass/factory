package beans;

public abstract class Voiture {
	
	protected String modele;
	protected int puissance;
	
	
	public abstract  void afficherDetails();


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public int getPuissance() {
		return puissance;
	}


	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	
	
}
