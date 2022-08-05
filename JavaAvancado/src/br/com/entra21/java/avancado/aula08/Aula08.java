package br.com.entra21.java.avancado.aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula08 extends Aula {

	public Aula08(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {
		case 1:
			aprenderListar();
			break;
		case 2:
			aprenderFiltrar();
			break;

		case 3:
			aprenderEstatisticas();
			break;
		case 4:
			aprenderOrdenar();
			break;

		}
		return opcao;
	}

	private void aprenderListar() {

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 5, 10, 8, 9, 15, 8, 3, 4, 2));
		ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Rafael", "Macedo", "Fulano", "Beltrano"));

		System.out.println("Listando de forma muito resumida ");

		numeros.forEach(System.out::println);

		System.out.println("Listando de forma normal ");

		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("Listando nomes de forma resumida ");
		nomes.forEach(System.out::println);

		System.out.println("Listando nomes de forma normal ");

		for (String nome : nomes) {
			System.out.println(nome);

		}
		System.out.println("Listando utilizando Arrow -> , quando executa apenas uma instrucao nao precisa de escopo");
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println(
				"Listando utilizando Arrow -> , quando executa mais de uma instrucao é necessario declarar o escopo \n");
		nomes.forEach(nome -> {
			System.out.println(nome);
			System.out.println("[ " + nome + " ]");
		});
	}

	private void aprenderFiltrar() {
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("Daniel", (byte) 15));
		pessoas.add(new Pessoa("Juninho", (byte) 10));
		pessoas.add(new Pessoa("Joãozinho", (byte) 18));
		pessoas.add(new Pessoa("Pedrinho", (byte) 25));
		pessoas.add(new Pessoa("Mariazinha", (byte) 27));

		pessoas.forEach(pessoa -> {
			System.out.println("Nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());
		});
		List<Pessoa> pessoasNovas = pessoas.stream() // gera um stream pra minha lista (uma cópia) que não afeta a lista
														// original
				.filter(pessoa -> pessoa.getIdade() < 18) // o filter vai filtar com base no meu critério criando uma
															// variável temporário que é verificada a cada item
				.collect(Collectors.toList()); // os itens resultantes serão convertidos em uma lista

		System.out.println(
				"------------------Percorrendo a lista e filtrando apenas os de menor --------------------------");
		pessoasNovas.forEach(pessoa -> {
			System.out.println("Essa pessoa é de menor");
			System.out.println("Nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());

			System.out.println(
					"------------------Percorrendo a lista e filtrando apenas os de menor sem Lambda --------------------------");
			ArrayList<Pessoa> pessoasMenores = new ArrayList<>();

			for (Pessoa pessoa2 : pessoas) {
				if (pessoa.getIdade() < 18) {
					pessoasMenores.add(pessoa);
				}
			}

			for (Pessoa pessoa2 : pessoasMenores) {
				System.out.println("Essa pessoa é de menor: ");
				System.out.println("Nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());
			}

			System.out.println("---------------Filtrando pessoas que terminam com a letra O-----------------");
			pessoas.stream().filter(

					pessoa2 -> pessoa.getNome().endsWith("o") || pessoa.getIdade() >= 18).forEach(pessoa2 -> {
						System.out.println("Essa pessoa termina com o");
						System.out.println("Nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());
					});

		});

	}

	private void aprenderEstatisticas() {
		ArrayList<Double> notas = new ArrayList<>(Arrays.asList(10d, 8d, 7.5d));
		notas.forEach(System.out::println);
		DoubleSummaryStatistics estatisticas = notas.stream().mapToDouble((numero) -> numero).summaryStatistics();
		System.out.println("A média " + estatisticas.getAverage());
		System.out.println("A menor nota " + estatisticas.getMin());
		System.out.println("A Maior nota " + estatisticas.getMax());
		System.out.println("A Soma das notas é " + estatisticas.getSum());
		System.out.println("A quantidade de notas " + estatisticas.getCount());

	}

	private void aprenderOrdenar() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("James");
		nomes.add("Mathew");
		nomes.add("Jared");
		nomes.add("Ariana");
		nomes.add("Astolfo");
		
		System.out.println("----------- Listando os nomes na ordem de criação -------------------");
		nomes.forEach(System.out::println);
		
		System.out.println("----------- Listando os nomes em ordem alfabetica -------------------");
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
	}

}
