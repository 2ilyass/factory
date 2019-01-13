package beans;

public class MotoEssence extends Moto {

	public MotoEssence() {

	}

	public MotoEssence(String model) {
		this.modele=model;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Moto Essence---modele :"+modele);

	}

}
