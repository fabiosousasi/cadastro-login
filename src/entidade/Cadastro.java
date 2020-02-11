package entidade;

public class Cadastro {
	private String nome;
	private String email;
	private int idade;
	private int anoNascimento;
	private String usuario;
	private String senha;
	
	//CONSTRUTOR
	public Cadastro(){
	}
	public Cadastro(String nome, String email, int idade, int anoNascimento, String usuario, String senha) {
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
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	
	
	public String toString() {
		return       "SEU PERFIL"
				+ "\nNome: " + nome
				+ "\nemail: " + email
				+ "\nidade: " + idade
				+ "\nAno nascimento: " + anoNascimento;
	}
	
	
	

}
