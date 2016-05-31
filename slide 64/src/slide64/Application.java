package slide64;

public class Application {
	public static void main(String args[]){
		Funcionario ze = new Funcionario();
		ze.setNome("Zé");
		ze.setSalario(1000);
		ze.imprimirCompleto();
		System.out.println("");
		
		Funcionario joao = new Funcionario();
		joao.setNome("João");
		joao.setSalario(1000);
		joao.imprimirCompleto();
		System.out.println("");
		
		Programador roberto = new Programador();
		roberto.setNome("Roberto");
		roberto.setSalario(1000);
		roberto.setLinguagem("Java");
		roberto.setFerramenta("Eclipse");
		roberto.imprimirProgramador();
		
		Gerente claudia = new Gerente();
		claudia.setNome("Claudia");
		claudia.setSalario(3000);
		claudia.criarNovoSubordinado("Josefa");
		claudia.criarNovoSubordinado("José");
		claudia.imprimirGerente();
		claudia.listarSubordinados();
		
		Secretaria ana = new Secretaria();
		ana.setNome("Ana");
		ana.setSalario(4000);
		ana.addFornecedor("Rio Branco");
		ana.addFornecedor("Bureal de Imagens");
		ana.imprimirSecretaria();
		ana.listarFornecedores();
		
		Analista paulo = new Analista();
		paulo.setNome("Paulo");
		paulo.setSalario(6000);
		paulo.setEspecialidade("Negócios");
		paulo.imprimirAnalista();
	}
}
