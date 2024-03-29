package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.Aula01;
import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.aula02.Aula02;
import br.com.entra21.java.avancado.aula03.Aula03;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;
import br.com.entra21.java.avancado.aula04.Aula04;
import br.com.entra21.java.avancado.aula05.Aula05;
import br.com.entra21.java.avancado.aula06.Aula06;
import br.com.entra21.java.avancado.aula07.Aula07;
import br.com.entra21.java.avancado.aula08.Aula08;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		Repositorio.inicializarPessoas();
		do {
			System.out.println(montarMenu());
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("At� a proxima!");
				break;
			case 1:
				Aula01.aprender();
				break;
			case 2:
				Aula02.aprender();
				break;
			case 3:
				Aula03.aprender();
				break;
			case 4:
				new Aula04("Aula04 - Collections - SET - HashSet", new ArrayList<>(Arrays.asList("Definir", "CRUD")))
						.aprender();
				break;
			case 5:
				new Aula05("Aula05 - Collections - MAP - HashMap",
						new ArrayList<>(
								Arrays.asList("Definir", "Create", "Read", "Update", "Delete", "Exemplo pr�tico")))
						.aprender();
				break;
			case 6:
				new Aula06("Aula 06", new ArrayList<>(Arrays.asList("Aprender Generics", "Listar Pessoa",
						"Adicionar Pessoa", "Editar Pessoa", "Deletar Pessoa"))).aprender();
				break;
			case 7:

				ArrayList<String> assunto = new ArrayList<>();
				assunto.add("Tratamento de Erro");
				assunto.add("Obter detalhes do Erro");
				assunto.add("Custom exception");
				new Aula07("AULA 7", assunto).aprender();
				break;

			case 8:
				ArrayList<String> topico = new ArrayList<>();
				topico.add("Aprender Listar");
				topico.add("Filtrar");
				topico.add("Estatisticas");
				topico.add("Ordenacao");
				new Aula08("AULA 8", topico).aprender();
				break;
			case 9:
				pedirPaciencia();
				break;
			case 10:
				pedirPaciencia();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida para aprender um assunto avan�ado sobre JAVA");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVAN�ADO");

	}

	private static String montarMenu() {
		String menu = "M�dulo sobre JAVA AVAN�ADO:";
		menu += "\n  0 - Sair";
		menu += "\n  1 - Aula 01  ENUM e Classes Wrapper";
		menu += "\n  2 - Aula 02 - Collections - LIST";// somente 02
		menu += "\n  4 - Aula 03 - Annotations e Datas";// juntos 03
		menu += "\n  5 - Aula 04 - Collections - SET";// somente 04
		menu += "\n  6 - Aula 05 - Collections - MAP";// somente 05
		menu += "\n  7 - Aula 06 - Generics";// somente 06
		menu += "\n  8 - Aula 07 - Exce��es e tratamento de erros";// somente 07
		menu += "\n  9 - Aula 08 - Fun��es Lambda"; // somente 08
		menu += "\n--------------------------------------------------------";
		menu += "\n Escolha uma op��o para aprender:";
		menu += "\n--------------------------------------------------------";

		return menu;
	}

	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.DOCUMENTAR, item = "Mostrar que n�o ta na hora", quemAssume = "Rubem Oliota")
	private static void pedirPaciencia() {
		System.out.println("CALMA CALMA CALMA, muita CALMA... ainda n�o esta pronto.");
		System.out.println("--------------------------------------------------------");

	}

}
