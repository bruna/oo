package slide37;

public class Cellphone{
	
	private static int cont = 0;
	
	public Cellphone(){
		cont++;
	}
	public static int getCont(){
		return cont;
	}
	public static void imprimir(){
		System.out.println("Quantidade de objetos criados = " + getCont());
	}
}