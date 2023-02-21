package operadorternario;

public class ComparacaoString {

	public static void main(String[] args) {
		String nome1 = "erlan";
	//	String nome2 = "erlan";
		String nome3 = new String("erlan");
		String res;
		res = (nome1.equals(nome3))? "igual":"diferente"; //equals serve para mostrar o conteudo de uma variavel
		System.out.println(res);

	}

}
