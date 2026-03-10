package src;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		long CPF;
		String nome;
		String telefone;
		String email;
		Endereco endereco;
		Pessoa pessoa;
		int codigoEndereco;
		String logradouro; 
		int numero;
		String cidade;
		String bairro; 
		String complemento;
	    String estado;
	    String uf;
	    long CEP;
		
		// Variáveç que representa a entrada via console
		Scanner entrada = new Scanner(System.in);
		
		// Coletar os dados
		System.out.println("\nInforme um código: ");
		codigo = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme um CPF: ");
		CPF = Long.parseLong(entrada.nextLine());
		
		System.out.println("\nInforme um nome: ");
		nome = entrada.nextLine();
		
		System.out.println("\nInforme um telefone: ");
		telefone = entrada.nextLine();
		
		System.out.println("\nInforme um email: ");
		email = entrada.nextLine();
		
		// ----- COLETAR OS DADOS DO ENDERECO -----
		
		System.out.println("\nInforme um código de endereço: ");
		codigoEndereco = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme um logradouro: ");
		logradouro = entrada.nextLine();
		
		System.out.println("\nInforme um número: ");
		numero = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme uma cidade: ");
		cidade = entrada.nextLine();
		
		System.out.println("\nInfome um bairro: ");
		bairro = entrada.nextLine();
		
		System.out.println("\nInforme um complemento: ");
		complemento = entrada.nextLine();
		
		System.out.println("\nInforme um estado: ");
		estado = entrada.nextLine();
		
		System.out.println("\nInforme um UF: ");
		uf = entrada.nextLine();
		
		System.out.println("\nInforme um CEP: ");
		CEP = Long.parseLong(entrada.nextLine());
		
		// Criar objeto endereço:
		endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
		// Crair objeto pessoa:
		pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
		
		// Mostrar o resultado dos dados
		System.out.println(pessoa.imprimir()); // Mostrar os dados
		
	} // Fim do Método Static

}
