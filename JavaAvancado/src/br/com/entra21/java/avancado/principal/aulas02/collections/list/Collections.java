package br.com.entra21.java.avancado.principal.aulas02.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {

			System.out.println(menuCollections());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Voltando ao menu principal");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Op��o inv�lida, escolha uma op��o v�lida");
				break;
			}

		} while (option != 0);

	}

	private static String menuCollections() {
		String menu = "Escolha uma op��o: \n";
		menu += "0 - Voltar ao menu principal \n";
		menu += "1 - ArrayList \n";
		menu += "2 - LinkedList \n";
		return menu;
	}

	private static void aprenderArrayList() {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Lucas");
		nomes.add("Clara");
		nomes.add("Marcela");
		nomes.add(0, "Primeiro");
		System.out.println("Quantos nomes? " + nomes.size());

		for (String item : nomes) {
			System.out.println("O nome no momento � " + item);
		}

		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice nome: " + nome + "tem o valor: " + nomes.get(nome));

		}

		System.out.println("O primeiro nome �: " + nomes.get(0));
		System.out.println("O primeiro nome �: " + nomes.get(3));

		nomes.set(3, "Alterei o nome que estava aqui");
		System.out.println(nomes.get(3));
		nomes.set(0, nomes.get(0).toUpperCase());
		nomes.set(2, nomes.get(1).toLowerCase());

		System.out.println("Onde ser� que estoa o PRIMEIRO? " + nomes.indexOf("PRIMEIRO"));

		System.out.println("vou deletar quem tiver no index 2" + nomes.get(2));
		nomes.remove(2);
		System.out
				.println("Vou deletar o PRIMEIRO pela busca do nome que est� na posi��o " + nomes.indexOf("PRIMEIRO"));
		nomes.remove(nomes.indexOf("PRIMEIRO"));
		System.out.println(nomes.get(0));

		// criar uma lista de interesses
		// inclua cinxo interesses
		// liste todos os interesses
		// dessa lista escolha 2 para mostrar que s�o seus favoritos
		// exclua um item por posi��o e outro por valor
		// um syso explicandno para cadda a��o

		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("Counter Strike");
		interesses.add("Motocross");
		interesses.add("Surf");
		interesses.add("Futebol");
		interesses.add("Volei");
		interesses.add("Formula 1");
		System.out.println("Foi criado um Array com " + interesses.size() + " interesses");
		System.out.println("Os interesses foram ");
		for (String interesse : interesses) {
			System.out.println(interesse);
		}
		System.out.println("Por�m meus favoritos s�o: " + interesses.get(0) + " e "
				+ interesses.get(interesses.indexOf("Formula 1")));
		System.out.println("Mas ultimamente n�o ando gostando de Futebol e Volei");
		interesses.remove(3);
		interesses.remove(interesses.indexOf("Volei"));
		System.out.println("Ent�o meus interesses atuais s�o:");
		for (String interesse : interesses) {
			System.out.println(interesse);
		}

	}

	private static void aprenderLinkedList() {

	}
}
