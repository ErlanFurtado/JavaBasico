package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota");
		float nota = teclado.nextFloat();
		
		System.out.println("Digite o nome");
		String nome = teclado.next();
		
		System.out.format("a nota de %s é %.1f \n " ,  nome + nota );
	}

}
