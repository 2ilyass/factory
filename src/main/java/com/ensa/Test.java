package com.ensa;

import com.ensa.test.Catalogue;
import com.ensa.test.fabriqueImpl.FabriqueAbstraite;
import com.ensa.test.fabriqueImpl.FabriqueVehiculeEssence;

import beans.Moto;
import beans.Voiture;

public class Test {

	public static void main(String[] args) {
		
		FabriqueAbstraite fb = new FabriqueVehiculeEssence();
		Catalogue c = new Catalogue(fb);
		Moto m = c.creeMoto("volvo");
		m.afficherDetails();
		
		Voiture v = c.creeVoiture("BMW", 12);
		v.afficherDetails();
	}

}

