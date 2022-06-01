package br.com.entra21.java.avancado.principal;

import java.util.Scanner;

import br.com.entra21.java.avancado.principal.aulas01.enums.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(showMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderWrapper();
				break;

			case 2:
				aprenderEnum();
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (option != 0);

	}

	private static String showMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA! \n";
		menu += "0 - Sair \n";
		menu += "1 - Wrapper \n";
		menu += "2 - ENUM \n";
		menu += "Escolha uma das opções";

		return menu;
	}

	private static void aprenderWrapper() {

		char letra = Character.valueOf('l');

		boolean verdade1 = Boolean.parseBoolean("TRUE");
		boolean verdade2 = Boolean.parseBoolean("tRue");
		boolean verdade3 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiro1 = Byte.parseByte("127");
		short inteiro2 = Short.parseShort("128");
		int inteiro3 = Integer.parseInt("100000");
		long inteiro4 = Long.parseLong("10000000");

		float decimal1 = Float.parseFloat("1.5");
		double decimal2 = Double.parseDouble("3.5");

	}

	private static void aprenderEnum() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "não");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
		}

		System.out.println("\n Gosto desse tipo de personagem: " + PersonagemJogo.ANAO);
		System.out.println("\n Geralmente a classe " + PersonagemJogo.ANAO + " tem HP = " + PersonagemJogo.ANAO.getVIDA());
		System.out.println("\n Veja a caracterisca mais comum dele " + PersonagemJogo.ANAO.getDESCRICAO());
		System.out.println("O mago está no indice do Enum " + PersonagemJogo.MAGO.ordinal());
		System.out.println("\n Veja a descrição completa do " + PersonagemJogo.MAGO + " sua vida é "
				+ PersonagemJogo.MAGO.getVIDA() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());
		System.out.println(PersonagemJogo.BARBARO.getDetails());
		
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			System.out.println("Contadoe = " + personagem + "posicção do Enmum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
		}
		
		
	}

}
