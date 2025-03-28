import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		System.out.println("Insira a altura da primeira pessoa: ");
		double altura1 = input.nextDouble();
		
		System.out.println("Insira a altura da segunda pessoa: ");
		double altura2 = input.nextDouble();
		
		System.out.println("Insira a altura da terceira pessoa: ");
		double altura3 = input.nextDouble();
		
		System.out.println("Insira altura da quarta pessoa: ");
		double altura4 = input.nextDouble();
		
		System.out.println("Insira altura da quinta pessoa: ");
		double altura5 = input.nextDouble();
		
		double media = (altura1 + altura2 + altura3 + altura4 + altura5) / 5;
		
		System.out.println("A média das alturas é: " + df.format(media));
		
		
	}
}
