package aplicacao;

import java.util.Scanner;

import entidade.Cadastro;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CADASTRO
		System.out.println("*****CADASTRO*****");
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu email: ");
		String email = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		
		System.out.print("\nCriar Usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();
		
		System.out.print("Criar Senha: ");
		String senha = sc.nextLine();
		
		Cadastro cadastro = new Cadastro(nome, email, idade, anoNascimento, usuario, senha);
		//FIM CADASTRO
		
		//CONFIRMAÇÃO DO USUARIO
		System.out.println("USUARIO CADASTRADO COM SUCESSO!");
		System.out.println("\n*****ENTRE COM O SEU LOGIN*****");
		System.out.print("Digite o Usuario: ");
		String confirmacaoUsuario = sc.nextLine();
		
		if(confirmacaoUsuario.equals(cadastro.getUsuario())) {
			System.out.println("Usuario correto!");
		}
		else {
			int tentativaUsuario = 3;
			while(! confirmacaoUsuario.equals(cadastro.getUsuario()) && tentativaUsuario > 1) {
				tentativaUsuario--;
				System.out.println("\nUsuario Incorreto. Você tem mais " + tentativaUsuario + " tentativas");
				System.out.print("Digite o Usuario: ");
				confirmacaoUsuario = sc.nextLine();
			}
			if(confirmacaoUsuario.equals(cadastro.getUsuario())) {
				System.out.println("Usuario Correto!");
			}
			else {
				System.out.println("Usuario Incorreto!");
				System.out.println("Por medida de segurança faça o cadastro mais uma vez.");
				System.exit(0); //FINALIZA O PROGRAMA
			}
		}//FIM DA CONFIRMAÇÃO DO USUARIO
		
		//CONFIRMAÇÃO DA SENHA
		System.out.print("\nDigite a Senha: ");
		String confirmacaoSenha = sc.nextLine();
		if(confirmacaoSenha.equals(cadastro.getSenha())) {
			System.out.println("Senha Correta!");
		}
		else {
			int tentativaSenha = 3;
			while(! confirmacaoSenha.equals(cadastro.getSenha()) && tentativaSenha > 1) {
				tentativaSenha--;
				System.out.println("\nSenha Incorreto. Você tem mais " + tentativaSenha + " tentativas");
				System.out.print("Digite a Senha: ");
				confirmacaoSenha = sc.nextLine();
			}
			if(confirmacaoSenha.equals(cadastro.getSenha())) {
				System.out.println("Senha Correto!");
			}
			else {
				System.out.println("Senha Incorreto!");
				System.out.println("Por medida de segurança faça o cadastro mais uma vez.");
				System.exit(0); //FINALIZA O PROGRAMA
			}
		} //FIM DA CONFIRMAÇÃO DA SENHA
		
		System.out.println("***********************************************************");
		System.out.println(cadastro);
		

	}

}
