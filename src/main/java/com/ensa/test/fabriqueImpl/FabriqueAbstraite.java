package com.ensa.test.fabriqueImpl;

import beans.Moto;
import beans.Voiture;

public abstract class FabriqueAbstraite {
	

	
	public abstract Moto creeMoto(String m);
	public abstract Voiture creeVoiture(String m, int p);
	

}
