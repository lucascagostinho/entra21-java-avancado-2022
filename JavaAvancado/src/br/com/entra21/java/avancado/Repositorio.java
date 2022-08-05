package br.com.entra21.java.avancado;

import java.util.HashMap;

public class Repositorio {

	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public static void inicializarPessoas() {
		if (pessoas.isEmpty()) {
			pessoas.put("Steve", new Pessoa("Rogers", (byte) 115));
			pessoas.put("Tony", new Pessoa("Stark", (byte) 58));
			pessoas.put("Peter", new Pessoa("Parker", (byte) 22));
		}
	}
}
