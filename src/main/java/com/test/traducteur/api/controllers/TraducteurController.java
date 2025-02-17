package com.test.traducteur.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.traducteur.api.services.TraducteurService;

@RestController
@RequestMapping("/traduire")
public class TraducteurController {

	@Autowired
	private TraducteurService traducteurService;

	@PostMapping("/francais_vers_javanais")
	public String traduireFrancaisVersJavanais(@RequestBody String texteATraduireDto) throws Exception {

		return traducteurService.traduireFrancaisVersJavanais(texteATraduireDto);
	}
	
	@PostMapping("/javanais_vers_francais")
	public String traduireJavanaisVersFrancais(@RequestBody String texteATraduireDto) throws Exception {

		return traducteurService.traduireJavanaisVersFrancais(texteATraduireDto);
	}
	
}
