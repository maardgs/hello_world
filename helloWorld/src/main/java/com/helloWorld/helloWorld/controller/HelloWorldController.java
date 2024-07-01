package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class HelloWorldController {
	
	@GetMapping ("/Hello")
	public String helloworld() {
		return "Hello World!!!";
	}
	
	@GetMapping ("/BSMGeneration")
	public List<String> BSMGen(){
		List<String> BSMGen = new ArrayList<>();
		BSMGen.addAll(Arrays.asList("---------------------------------",
				"- Mentalidades:",
				"De crescimento",
				"⁠Responsabilidade pessoal",
				"Orientação ao futuro",
				"Persistência",
				"--------------------------------",
				"- Competências comportamentais:",
				"Comunicação",
				"⁠Proatividade",
				"⁠Orientação ao detalhe",
				"Trabalho em equipe"));
		
		return BSMGen;
	}
	
	@GetMapping ("/Objectives") 
	public List<String> Meta(){
		List<String> Meta = new ArrayList<>();
		Meta.addAll(Arrays.asList("---------------------------------",
				"1. Realizar o Pitch",
				"2. Explorar mais o app Insomnia"));

		return Meta;
}
}
