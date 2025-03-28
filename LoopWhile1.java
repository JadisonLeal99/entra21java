import java.util.Scanner;

public class LoopWhile1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o número: ");
		int numero = input.nextInt();
		
		while(numero >= 10) {
			System.out.println(numero);
			numero--;
		}
	}
}
