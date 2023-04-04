package br.edu.ifnmg.poo1;

public class PessoaFisica extends Pessoa {

	private Long cpf;
	
	public PessoaFisica(long id, String nome, Long cpf) {
		super(id, nome);
		this.cpf = cpf;
	}
	
	public long getCpf() {
		return cpf;
	}
	
}
