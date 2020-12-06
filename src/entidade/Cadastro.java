package entidade;

import java.text.SimpleDateFormat;

public class Cadastro {
	private String nome;
	private String email;
	private int idade;
	private String anoNascimento;
	private String usuario;
	private String senha;
	
	//CONSTRUTOR
	public Cadastro(){
	}
	public Cadastro(String nome, String email, int idade, String anoNascimento, String usuario, String senha) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.anoNascimento = anoNascimento;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	//GET SET
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	
	
	public String toString() {
		return       "SEUS DADOS CADASTRADOS"
				+ "\nNome: " + nome
				+ "\nemail: " + email
				+ "\nidade: " + idade
				+ "\nAno nascimento: " + anoNascimento.substring(0,2) + "/" + anoNascimento.substring(2,4) + "/" + anoNascimento.substring(4,8);
	}
	
	
	

}
