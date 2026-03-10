package src;

public class Pessoa {

	// 1º Máxima do 0.0 = Encapsulamento
		private int codigo;
		private long cpf;
		private String nome;
		private String telefone; 
		private String email;
		Endereco endereco;
		
		public Pessoa () {
			this.setCodigo(0);
			this.setCPF(0);
			this.setNome("");
			this.setTelefone("");
			this.setEmail("");
			this.setEndereco(new Endereco()); // Chamado o construtor vazio - com valores padrões
			
		} // Fim do construtor padrão
		
		//2º Máxima da O.O = Sopbrecarga
		
		public Pessoa(int codigo, long cpf, String nome, String telefone, String email, Endereco endereco) {
			this.setCodigo(codigo);
			this.setCPF(cpf);
			this.setNome(nome);
			this.setTelefone(telefone);
			this.setEmail(email);
			this.setEndereco(endereco); // Logradouro, número, bairro, cidade, estado, UF, CEP
		}//fim do construtor pessoa
		
		//Métodos modificadores
		public int getCodigo() {
			return this.codigo;
		}//fim do getcodigo
		public long getCPF() {
			return this.cpf;
		}//fim do getTelefone
		public String getNome() {
			return this.nome;
		}//fim do getTelefone
		public String getTelefone() {
			return this.telefone;
		}//fim do getTelefone
		public String getEmail() {
			return this.email;
		}//fim do getEmail
		
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}// fim do setCodigo
		public void setCPF(long cpf) {
			this.cpf = cpf;
		}//fim do setCPF
		public void setNome(String nome){
			this.nome = nome;
		}//fim do setNome
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}// fim do setTelefone
		public void setEmail(String email) {
			this.email = email;
		} // Fim do setEmail
		
		public Endereco getEndereco(String endereco) {
			return this.endereco;
		} // Fim do getEndereco
		
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		} // Fim do setEndereco
		
		public String imprimir() {
			return "Codigo: " 		+ getCodigo() 	+
					"\nCPF: " 		+ getCPF() 		+
					"\nNome: " 		+ getNome()		+
					"\nTelefone: " 	+ getTelefone() +
					"\nEmail: " 	+ getEmail()    +
					"\nDados Endereço: "            + this.endereco.imprimir();
		} // Fim do imprimir
		
	}  // Fim da classe
