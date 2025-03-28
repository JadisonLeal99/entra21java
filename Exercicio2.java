import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		int impar = 0;
		int par = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				par += i;
			} else {
				impar += i;
			}

		}
		System.out.println("A soma dos números par é: " + par);
		System.out.println("A soma dos números impar é: " + impar);
	}
}