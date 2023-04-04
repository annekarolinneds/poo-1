package br.edu.ifnmg.poo1;

public class Pessoa extends Entidade {

	private final String nome;
	
	public Pessoa(long id, String nome) {
		super(id);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
