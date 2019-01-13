package beans;

public class VoitureEssence extends Voiture {

	public VoitureEssence() {

	}

	public VoitureEssence(String model, int puissance) {

		this.modele = model;
		this.puissance = puissance;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Voiture Essence -- modele : " + modele + "--puissance : " + puissance);

	}

}
