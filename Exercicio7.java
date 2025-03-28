import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador = 0;
		double somaDasAlturas = 0;
		double alturaMaiorAtleta = Double.MIN_VALUE;
		String numeroMaiorAtleta = "";
		double alturaMenorAtleta = Double.MAX_VALUE;
		String numeroMenorAtleta = "";
		
		
		for(int j = 0; j <= 1000000000; j++) {
			System.out.println("Insira o número de inscrição do atleta: ");
			String numeroInscricao = input.next();
			contador = j;
			if(numeroInscricao.equals("0")) {
				break;
			}
			
			System.out.println("Insira a altura do atleta: ");
			double altura = input.nextDouble();
			somaDasAlturas += altura;
			
			
			if(altura > alturaMaiorAtleta) {
				alturaMaiorAtleta = altura;
				numeroMaiorAtleta = numeroInscricao;
			}  
			if(altura < alturaMenorAtleta) {
				alturaMenorAtleta = altura;
				numeroMenorAtleta = numeroInscricao;
			}
					
		}
		
		double mediaDasAlturas = (somaDasAlturas / contador);
		System.out.println("O número de inscrição do MAIOR Atleta é: " + numeroMaiorAtleta + " e a sua altura é " + alturaMaiorAtleta);
		System.out.println("O número de inscrição do MENOR Atleta é: " + numeroMenorAtleta + " e a sua altura é " + alturaMenorAtleta);
		System.out.println("A média de altura dos atletas é: " + mediaDasAlturas);
		System.out.println("A quantidade de atletas cadastrados é: " + (contador));
	}
}
