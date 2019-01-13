package beans;

public class VoitureGasoil extends Voiture {

	public VoitureGasoil() {
		
	}
	
	public VoitureGasoil(String model, int puissance) {

		this.modele = model;
		this.puissance = puissance;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Voiture Gasoil -- modele : " + modele + "--puissance : " + puissance);

	}

}
