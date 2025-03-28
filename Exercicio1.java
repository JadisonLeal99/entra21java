import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor desejado");
		for(int i = 0; i <=4; i++) {
			System.out.println("Insira o numero");
			int numero = input.nextInt();
			if(numero %  2 == 0) {
				System.out.println(numero + " - é par");
			} else {
				System.out.println(numero + " - é impar");
			}	
		}
	}
}
