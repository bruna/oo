package slide84;
import java.util.ArrayList;

public class Gerente extends Funcionario{
	private ArrayList<String> subordinados = new ArrayList<String>();
 	public void criarNovoSubordinado(String nome){
 	subordinados.add(nome);
 	}
 	public void listarSubordinados(){
 		for (String nome:subordinados)
 		System.out.println(nome);
 		System.out.println("");
 	}
 	public void imprimir(){
 		super.imprimir();
 		System.out.println("e tem "+subordinados.size()+" subordinados:");
 	}
 	protected double getPercentualCusto(){
 		return 1.0;
 	}
}