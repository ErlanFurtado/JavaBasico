package programamedia;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Que ano vc nasceu?");
		int nasc = t.nextInt();
		int i = 2023-nasc;
		System.out.println("sua idade é " + i);
		if (i>18) {
			System.out.println("maior de idade");
			
		}else {
			System.out.println("menor de idade.");
		}


	}

}
