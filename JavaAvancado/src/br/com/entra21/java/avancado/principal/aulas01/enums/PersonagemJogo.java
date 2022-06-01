package br.com.entra21.java.avancado.principal.aulas01.enums;

public enum PersonagemJogo {
	BARBARO(1000, "Muito HP"), // Barbaro
	ANAO(100, "Ferreiro"), // Anao
	DRUIDA(50, "Suporte"), // Druida
	SACERDOTE(10, "Cura/Corre"), // Sacerdote
	MAGO(20, "Contemplem o MAGO");

	private final int VIDA;
	private final String DESCRICAO;

	private PersonagemJogo(int vida, String descricao) {
		this.VIDA = vida;
		this.DESCRICAO = descricao;
	}

	public int getVIDA() {
		return VIDA;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
	
	public String getDetails() {
		
		return "\n Veja a descrição completa do " + this.name() + " sua vida é "
				+ this.VIDA + " e sua habilidade principal " + this.DESCRICAO;
	}

}
