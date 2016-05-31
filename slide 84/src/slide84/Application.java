package slide84;

public class Application{
	public static void main(String args[]){
		Funcionario ze = new Funcionario();
		ze.setNome("Z�");
		ze.setSalario(1000);
		ze.setAumento();
		ze.imprimir();
		System.out.println("");
		
		Funcionario joao = new Funcionario();
		joao.setNome("Jo�o");
		joao.setSalario(1000);
		joao.setAumento(15.0);
		joao.imprimir();
		System.out.println("");
		
		Programador roberto = new Programador();
		roberto.setNome("Roberto");
		roberto.setSalario(1000);
		roberto.setLinguagem("Java");
		roberto.setFerramenta("Eclipse");
		roberto.imprimir();
		
		Gerente claudia = new Gerente();
		claudia.setNome("Claudia");
		claudia.setSalario(3000);
		claudia.criarNovoSubordinado("Josefa");
		claudia.criarNovoSubordinado("Jos�");
		claudia.imprimir();
		claudia.listarSubordinados();
		
		Secretaria ana = new Secretaria();
		ana.setNome("Ana");
		ana.setSalario(4000);
		ana.addFornecedor("Rio Branco");
		ana.addFornecedor("Bureal de Imagens");
		ana.imprimir();
		ana.listarFornecedores();
		
		Analista paulo = new Analista();
		paulo.setNome("Paulo");
		paulo.setSalario(6000);
		paulo.setEspecialidade("Neg�cios");
		paulo.imprimir();
	}
}