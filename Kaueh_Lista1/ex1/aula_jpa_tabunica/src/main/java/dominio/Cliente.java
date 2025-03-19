package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity //entidade de domínio
@DiscriminatorValue("C")
public class Cliente extends Pessoa {
	
	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	private int CodCliente;
	
	public Cliente() {
		this("",0 ,0);
	}
	
	public Cliente(String nome, int idade, int CodCliente) {
		super(nome,idade);
		setCodCliente(CodCliente);
	}
	
	public int getCodCliente() {
		return this.CodCliente;
	}

	public void setCodCliente(int CodCliente) {
		this.CodCliente = CodCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", CodCliente= "
		+ getCodCliente() + "]";
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("Idade: "+ super.getIdade());
		System.out.println("CodCliente: "+ getCodCliente());
	}
}