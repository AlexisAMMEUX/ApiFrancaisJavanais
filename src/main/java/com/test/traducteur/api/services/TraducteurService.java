package com.test.traducteur.api.services;

import org.springframework.stereotype.Service;

import com.test.traducteur.api.utils.TraducteurUtil;

@Service
public class TraducteurService {
	
	public String traduireFrancaisVersJavanais(String texteATraduireDto) throws Exception {
		
		return TraducteurUtil.traduireEnJavanais(texteATraduireDto);
	}
	
	public String traduireJavanaisVersFrancais(String texteATraduireDto) throws Exception {
		
		return TraducteurUtil.traduireEnFrancais(texteATraduireDto);
	}
	
}
