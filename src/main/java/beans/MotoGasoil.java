package beans;

public class MotoGasoil extends Moto {

	public MotoGasoil() {
		
	}
	
	public MotoGasoil(String model) {
		this.modele=model;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Moto Gasoil---modele :"+modele);

	}

}
