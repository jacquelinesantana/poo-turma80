package poo.cliente;

public class Cliente {
	//classe cliente vamos modelar os atributos necessários para um cliente
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String cpf;
	private String senha;
	private String cep;
	private String complemento;
	
	//método construtor
	/*
	 * implementa a obrigatoriedade de instanciar o objeto já passando 
	 * os atributos evitar que o objeto seja criado sem seus atributos
	 * 
	 */
	public Cliente(String nome, String email, String telefone, String endereco, String cpf, String senha, String cep,
			String complemento) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.senha = senha;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	//getteres and setteres -> get entrega/retorna o dado | set insere os dados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
