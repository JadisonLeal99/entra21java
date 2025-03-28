import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double media = 0;
		
			
		for(int j = 0; j <= 1000; j++) {
			System.out.println("Insira o nome do aluno");
			String nomeAluno = input.next();
			if (nomeAluno.equals("fim")) {
				break;
			}
			
			System.out.println("Insira a nota da primeria prova");
			double notaProva1 = input.nextDouble();
			
			System.out.println("Insira a nota da segunda prova");
			double notaProva2 = input.nextDouble();
			
			
			media = (notaProva1 + notaProva2) / 2;
			System.out.println("Nome:" + nomeAluno + " Média: "+ media);
			System.out.println(" ");
		}
		

	}
}
