package programaswitch;

import java.util.Scanner;

public class ProgramaEscolha {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("quantas pernas?");
		int perna = tec.nextInt();
		String tipo;
		System.out.println("isso é um ");
		switch (perna) {
		case 1:
			tipo = "saci";
			break;
		case 2:
			tipo = "bipede";
			break;
		case 3:
			tipo = "tripe";
			break;
		case 4:
			tipo = "quadrupede";
			break;
		case 6:
			tipo = "aranha";
			break;
		default:
			tipo = "et";
			break;
			
		}
		System.out.println(tipo);

	}

}
