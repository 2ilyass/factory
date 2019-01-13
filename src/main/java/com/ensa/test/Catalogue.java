package com.ensa.test;

import com.ensa.test.fabriqueImpl.FabriqueAbstraite;

import beans.Moto;
import beans.Voiture;

public class Catalogue {
	
	
	FabriqueAbstraite fb;
	
	public Moto creeMoto(String m) {
		Moto mt = fb.creeMoto(m);
		return mt;
	};
	
	
	public Voiture creeVoiture(String m,int p) {
		Voiture v = fb.creeVoiture(m, p);
		return v;
	};

	public FabriqueAbstraite getFb() {
		return fb;
	}


	public void setFb(FabriqueAbstraite fb) {
		this.fb = fb;
	}


	public Catalogue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Catalogue(FabriqueAbstraite fb) {
		
		this.fb=fb;
		
	}
	
	
	
	
	
	

}
