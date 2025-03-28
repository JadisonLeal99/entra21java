import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double somaDasAlturasGrupo = 0;
		double somaDasAlturasMulheres = 0;
		int contadorGeral = 0;
		double somaDasAlturasFeminino = 0;
		int contadorFeminino = 0;
		
		
		for(int j = 0; j <= 1000; j++) {
			
			System.out.println("Informe o sexo da pessoa:");
			char sexo = input.next().charAt(0);
			contadorGeral = j;
			if(sexo == 'M' || sexo == 'm'  || sexo == 'f' || sexo == 'F') {
				System.out.println("Informe a altura da pessoa");
				double altura = input.nextDouble();
				somaDasAlturasGrupo += altura;
				if(altura == 0) {
					break;
				}
				
				if(sexo == 'F' || sexo == 'f') {
					somaDasAlturasFeminino += altura;
					contadorFeminino += j;
				}
			
			}else {	
			System.out.println("Entrada Inválida!");
			}
		
		}
		
		double mediaAlturaGeral = somaDasAlturasGrupo / contadorGeral;
		double mediaAlturaFeminino = somaDasAlturasFeminino / contadorFeminino;
		System.out.println("A média de altura GERAL do grupo é: " + mediaAlturaGeral);
		System.out.println("A média de altura das MULHERES do grupo é: " + mediaAlturaFeminino);
		
		
	}
}