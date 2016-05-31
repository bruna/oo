package slide89;

public class Cabecalho{
	String cabecalho;
	public String getCabecalho() { return cabecalho; }
	
	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}
	public void imprimirCabecalho(){
		System.out.println(this.getCabecalho());
	}
}
