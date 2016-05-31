package slide89;

public class Funcionario{
	private String nome;
	private double salario;
	private double custo;
	private double aumento;

	public void setNome(String nome){
		this.nome = nome;
	}
	public final void setSalario (double salario){
		this.salario = salario;
		this.custo = salario * getPercentualCusto();
	}
	public void setAumento(double percentual){
		double mult = (100.0 + percentual)/100.0;
		this.setSalario(this.getSalario()*mult);		
	}
	public void setAumento(String percentual){
		double d = Double.parseDouble(percentual);
		this.setAumento(d);
	}
	public void setAumento(){
		this.setAumento(10.0);
	}
	protected double getPercentualCusto(){ return 1.8; }
	public String getNome(){ return this.nome; }
	public double getSalario() { return this.salario; }
	public double getCusto() { return this.custo; }
	public double getAumento() { return this.aumento; }
	public void imprimir(){
		System.out.println(this.getNome() + " ganha " + this.getSalario() + " e tem um custo de " + this.getCusto());
	}
	public void imprimir(Cabecalho cabecalho){
		cabecalho.imprimirCabecalho();
		this.imprimir();
	}
	public void imprimir(Cabecalho cabecalho, Rodape rodape){
		cabecalho.imprimirCabecalho();
		this.imprimir();
		rodape.imprimirRodape();
	}
	public void imprimir(Rodape rodape){
		this.imprimir();
		rodape.imprimirRodape();
	}
}