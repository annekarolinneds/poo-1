package br.edu.ifnmg.poo1;

public class PessoaJuridica extends Pessoa {

	private Long cnpf;
	
	public PessoaJuridica(long id, String nome, Long cnpf) {
		super(id, nome);
		this.cnpf = cnpf;
	}
	
	public Long getCnpf() {
		return cnpf;
	}
	

}
