package com.test.traducteur.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.traducteur.api.services.TraducteurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/traduire")
@RequiredArgsConstructor
public class TraducteurController {

	private final TraducteurService traducteurService;

	@PostMapping("/francais_vers_javanais")
	public String traduireFrancaisVersJavanais(@RequestBody String texteATraduireDto) throws Exception {

		return traducteurService.traduireFrancaisVersJavanais(texteATraduireDto);
	}
	
	@PostMapping("/javanais_vers_francais")
	public String traduireJavanaisVersFrancais(@RequestBody String texteATraduireDto) throws Exception {

		return traducteurService.traduireJavanaisVersFrancais(texteATraduireDto);
		
		// Nouveau commit pour la branch test2
	}
	
	
	// Test new commit on branch test 1
	// Test new commit 2 on branch test 1
}
