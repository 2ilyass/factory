package com.ensa.test.fabriqueImpl;

import beans.Moto;
import beans.MotoEssence;
import beans.Voiture;
import beans.VoitureEssence;

public class FabriqueVehiculeEssence extends FabriqueAbstraite {

	
	

	@Override
	public Moto creeMoto(String m) {
		Moto moto =new MotoEssence(m);
		return moto;
	}

	@Override
	public Voiture creeVoiture(String m, int p) {
		Voiture voiture = new VoitureEssence(m,p);
		return voiture;
	}

	

}
