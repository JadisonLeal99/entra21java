package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contIdadeAcimaDe20 = 0;
		String alunosCom18Anos = "";
		
		System.out.println("Insira o nome do aluno");
		String nome = input.next();
		if(nome.equals("fim")) {
			return;
		}
		
		for(int i = 0; i <= Double.MAX_VALUE; i++) {
			System.out.println("Insira a idade do aluno");
			int idade = input.nextInt();
			
			if(idade > 20) {
				contIdadeAcimaDe20 ++;
				System.out.println(contIdadeAcimaDe20 + " Alunos tem mais de 20 anos");
			}
			
			if(idade == 18) {
				alunosCom18Anos = nome;
				System.out.println(nome + " Tem 18 anos");
			}
			
			System.out.println("Insira o nome do aluno");	
			nome = input.next();
			if(nome.equals("fim")) {
				return;
			}
			
			
		}
		
		if(contIdadeAcimaDe20 == 0) {
			System.out.println("Nenhum Aluno tem mais de 20 anos");
		} else {
			System.out.println(contIdadeAcimaDe20 + " Alunos tem mais de 20 anos");
		}
		
	}
}	
