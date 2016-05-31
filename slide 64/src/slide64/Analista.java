package slide64;

public class Analista extends Funcionario {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public void imprimirAnalista(){
		this.imprimirCompleto();
		System.out.println("e sua especialidade é " + this.getEspecialidade() + ".\n");
	}

	
}
