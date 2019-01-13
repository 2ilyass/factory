package com.ensa.test.fabriqueImpl;

import beans.Moto;
import beans.MotoGasoil;
import beans.Voiture;
import beans.VoitureGasoil;

public class FabriqueVehiculeGasoil extends FabriqueAbstraite{

	


	@Override
	public Moto creeMoto(String m) {
		Moto moto =new MotoGasoil(m);
		return moto;
	}

	@Override
	public Voiture creeVoiture(String m, int p) {
		Voiture voiture = new VoitureGasoil(m,p);
		return voiture;
	}
	
	

}
