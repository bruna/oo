package slide89;

public class Analista extends Funcionario{
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public void imprimir(){
		super.imprimir();
		System.out.println("e sua especialidade � " + this.getEspecialidade() + ".\n");
	}
}