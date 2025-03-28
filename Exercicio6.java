import java.util.Scanner;


public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		double somaDasAlturas = 0;
		
//		while(i < 1000) {
//			System.out.println("Insira a altura: ");
//			double altura = input.nextDouble();
//			somaDasAlturas += altura;
//	
//			if(altura == 0) {
//				break;
//			}
//			i++;
//		}
		
		for(int j = 0; j <= 1000; j++) {
			System.out.println("Insira a altura: ");
			double altura = input.nextDouble();
			contador = j;
			somaDasAlturas += altura;
			
			if(altura == 0) {
				break;
			}
		}
		double mediaDasAlturas = (somaDasAlturas / contador);
		System.out.println(mediaDasAlturas);
	}
}








































