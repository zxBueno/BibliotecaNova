package src;
import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	int codigo;
	long CPF;
	public String nome;
	public String telefone;
	public String email;
	Endereco endereco;
	Pessoa pessoa;
	public int codigoEndereco;
	public String logradouro; 
	public int numero;
	public String cidade;
	public String bairro; 
	public String complemento;
	public String estado;
	public String uf;
	public long CEP;
	
	public ControlMenu() {
		this.entrada = new Scanner(System.in);
		this.opcao   = 0;
	} // Fim do construtor padrão
	
	public void MostrarMenu() {
		System.out.println("\n\nBem-vindo(a)\n\n" +
	            "Escolha uma das opções abaixo: " +
				"\n0. Sair"                       +
	            "\n1 . Cadastrar Pessoa"          +
				"\n2 Consultar Pessoa"            +
	            "\n3 Atualizar Pessoa"             +
				"\n4 Excluir Pessoa" 
	            );
		
		// Coleta a opção
		this.opcao = Integer.parseInt(entrada.nextLine());
	} // Fim do Mostrar Menu
	
	public void executar() {
		do {
			this.MostrarMenu(); // Mostrar as opções disponíveis para o usuário
			switch(this.opcao) {
		case 0:
			System.out.println("Obrigado!");
			break;
		case 1:
			System.out.println("Cadastrar!");
			// Variável que representa a entrada via console
			this.entrada = new Scanner(System.in);
			
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
			
		
			this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
			this.pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
			break;
			
		case 2:
			System.out.println("Consultar!");
			System.out.println(this.pessoa.imprimir()); // Mostrar os dados
			break;
			
		case 3:
			System.out.println("Atualizar!");
			System.out.println("Escolha abaixo o que deseja atualizar: \n" +
			        "1. Nome\n"                                            +
					"2. CPF\n"                                             +
			        "3. Telefone\n"                                        +
					"4. E-mail\n"                                          +
			        "5. Logradouro\n"                                      +
					"6. Número\n"                                          +
			        "7. Bairro\n"                                          +
					"8. Complemento\n"                                     +
			        "9. Cidade\n"                                          +
					"10. Estado\n"                                         +
			        "11. UF\n"                                             +
					"12. CEP\n");
			this.opcao = Integer.parseInt(this.entrada.nextLine());
			// Escolha caso para essa atualização
			switch(this.opcao) {
			case 1:
				System.out.println("Qual o novo nome?");
				String nome = this.entrada.nextLine(); // Coletando o novo nome do usúario
				this.pessoa.setNome(nome);
				break;
				
			case 2:
				System.out.println("Qual o novo CPF?");
				String cpf = this.entrada.nextLine(); // Coletando o novo CPF do usúario
				this.pessoa.setCPF(Long.parseLong(cpf));
				break;
				
			case 3:
				System.out.println("Qual o novo telefone?"); 
				String telefone = this.entrada.nextLine(); // Coletando o novo telefone do usúario
				this.pessoa.setTelefone(telefone);
				break;
				
			case 4:
				System.out.println("Qual o novo email?");
				String email = this.entrada.nextLine(); // Coletando o novo email do usúario
				this.pessoa.setEmail(email);
				break;
				
			case 5:
				System.out.println("Qual o novo logradouro?");
				String logradouro = this.entrada.nextLine(); // Coletando o novo logadouro do usúario
				this.endereco.setLogradouro(logradouro);
				break;
				
			case 6:
				System.out.println("Qual o novo número?");
				int numero = Integer.parseInt(this.entrada.nextLine()); // Coletando o novo número do usúario
				this.endereco.setNumero(numero);
				break;
				
			case 7:
				System.out.println("Qual o novo bairro?");
				String bairro = this.entrada.nextLine(); // Coletando o novo bairro do usúario
				this.endereco.setBairro(bairro);
				break;
				
			case 8:
				System.out.println("Qual o novo complemento?");
				String complemento = this.entrada.nextLine(); // Coletando o novo complemento do usúario
				this.endereco.setComplemento(complemento);
				break;
				
			case 9:
				System.out.println("Qual a nova cidade?");
				String cidade = this.entrada.nextLine(); // Coletando a nova cidade do usúario
				this.endereco.setCidade(cidade);
				break;
				
			case 10:
				System.out.println("Qual o novo estado?");
				String estado = this.entrada.nextLine(); // Coletando o novo estado do usúario
				this.endereco.setEstado(estado);
				break;
				
			case 11:
				System.out.println("Qual o novo UF?");
				String uf = this.entrada.nextLine(); // Coletando o novo UF do usúario
				this.endereco.setUF(uf);
				break;
				
			case 12:
				System.out.println("Qual o novo CEP?");
				Long CEP = Long.parseLong(this.entrada.nextLine()); // Coletando o novo CEP do usúario
				this.endereco.setCEP(CEP);
				break;
				
				default:
					System.out.println("Código inválido!");
					break;
			
			} // Fim do método
			
			break;
			
		case 4:
			System.out.println("Deletar!");
			this.endereco = new Endereco(); // Chamando o construtor vazio
			this.pessoa = new Pessoa(); // Chamando o construtor vazio
			break;
			
		default:
			System.out.println("Código informado inválido!");
			break;
				
	} // Fim do Switch
		}while(this.opcao !=0);
	} // Fim do método que executa a ação escolhida

} // Fim do Controle