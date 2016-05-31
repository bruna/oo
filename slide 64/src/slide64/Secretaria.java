package slide64;
import java.util.ArrayList;

public class Secretaria extends Funcionario {
	private ArrayList<String> listaFornecedores = new ArrayList<String>();
	
	public void addFornecedor(String nome){
	 	listaFornecedores.add(nome);
	}
	public void listarFornecedores(){
		for (String nome:listaFornecedores)
	 	System.out.println(nome);
		System.out.println("");
	}
	public void imprimirSecretaria(){
		this.imprimirCompleto();
		System.out.println("e tem " + listaFornecedores.size() + " fornecedores:");
	}

}
