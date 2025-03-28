import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o primeiro numero: ");
		int valor1 = input.nextInt();
		if(valor1 < 1 || valor1 > 1000) {
			System.err.println("Inválido");
			return;
		}
		
		System.out.println("Insira o segundo numero: ");
		int valor2 = input.nextInt();
		if(valor2 < 1 || valor2 > 1000) {
			System.err.println("Inválido");
			return;
		}
		
		System.out.println("Insira o terceiro numero: ");
		int valor3 = input.nextInt();
		if(valor3 < 1 || valor3 > 1000) {
			System.err.println("Inválido");
			return;
		}
		
		System.out.println("Insira o quarto numero: ");
		int valor4 = input.nextInt();
		if(valor4 < 1 || valor4 > 1000) {
			System.err.println("Inválido");
			return;
		}
		
		System.out.println("Insira o quinto numero: ");
		int valor5 = input.nextInt();
		if(valor5 < 1 || valor5 > 1000) {
			System.err.println("Inválido");
			return;
		}
		
		for(int i = 0; i <= 1000; i++) {
			if(valor1 == i || valor2 == i || valor3 == i || valor4 == i || valor5 == i) {
			}
					
		}
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		System.out.println(valor5);
  }
}























