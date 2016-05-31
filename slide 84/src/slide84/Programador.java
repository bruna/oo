package slide84;

public class Programador extends Funcionario {
	private String linguagem;
	private String ferramenta;
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getFerramenta() {
		return ferramenta;
	}
	public void setFerramenta(String ferramenta) {
		this.ferramenta = ferramenta;
	}
	public void imprimir(){
		super.imprimir();
		System.out.println("programa em " + this.getLinguagem() + " e usa a ferramenta " + this.getFerramenta() + ".\n");
	}
}