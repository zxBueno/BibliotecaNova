package src;
import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	
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
	            "\n3 Atualiar Pessoa"             +
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
			break;
		case 2:
			System.out.println("Consultar!");
			break;
		case 3:
			System.out.println("Atualizar!");
			break;
		case 4:
			System.out.println("Deletar!");
			break;
		default:
			System.out.println("Código informado inválido!");
			break;
				
	} // Fim do Switch
		}while(this.opcao !=0);
	} // Fim do método que executa a ação escolhida

} // Fim do Controle