package beans;

public abstract class Moto {
	
	
	protected String modele;
	
	public abstract void afficherDetails();
	

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	
	

}
