package com.test.traducteur.api.services;

import org.springframework.stereotype.Service;

import com.test.traducteur.api.datas.TexteATraduireDto;

import Utils.TraducteurUtils;

@Service
public class TraducteurService {
	
	private final String MOT_JAVANAIS = "av";
	
	public String traduireFrancaisVersJavanais(TexteATraduireDto texteATraduireDto) throws Exception {
		
		if(texteATraduireDto.textATraduire() == null) {
			throw new Exception("La phrase à traduire ne doit pas être null.");
		}
		
		String result = TraducteurUtils.ajouterEntreConsonneVoyelle(texteATraduireDto.textATraduire(), MOT_JAVANAIS);
		result = TraducteurUtils.ajouterADebutMotVoyelle(result, MOT_JAVANAIS);
		
		return result;
	}
	
	public String traduireJavanaisVersFrancais(TexteATraduireDto texteATraduireDto) throws Exception {
		
		if(texteATraduireDto.textATraduire() == null) {
			throw new Exception("La phrase à traduire ne doit pas être null.");
		}
		
		String result = TraducteurUtils.supprimerADebutMotVoyelle(texteATraduireDto.textATraduire(), MOT_JAVANAIS);
		result = TraducteurUtils.supprimerEntreConsonneVoyelle(result, MOT_JAVANAIS);
		
		return result;
	}
	
	


}
