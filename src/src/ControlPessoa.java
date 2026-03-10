package src;

public class ControlPessoa {
	Pessoa pessoa;
	
	public ControlPessoa() {
		this.pessoa = new Pessoa();
	} // Fim da controle // CADASTAR
	
	public ControlPessoa(int codigo, long cpf ,String nome, String telefone, String email, Endereco endereco) {
		this.pessoa = new Pessoa(codigo, cpf, nome, telefone, email, endereco);
	} // Fim do controle com parâmetros

	
	
} // Fim da ControlePessoa
