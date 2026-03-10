package src;

public class ControlEndereco {
	Endereco endereco;
	
	public ControlEndereco() {
		this.endereco = new Endereco();
	} // Fim do controle // CADASTRAR
	
	public ControlEndereco(int codigo, String logradouro, int numero, String bairro, String complemento, String cidade,
			String estado, String uf, long CEP) {
		this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
	} // Fim do controle com parâmetros

} // fim do ControlEndereco
