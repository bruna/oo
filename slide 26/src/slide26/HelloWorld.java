package slide26;

public class HelloWorld{
	
	private String nome;
	private Relogio hora = new Relogio();
	
	public void setNome (String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void imprimir(){
		System.out.println(hora.getHora() + " - Ola " + this.getNome() + ". Voc� acabou de fazer seu primeiro Hello World em Java. Parab�ns.");
	}	

}