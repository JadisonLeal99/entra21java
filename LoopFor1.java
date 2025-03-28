import java.util.Scanner;

public class LoopFor1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira até que número você deseja contar: ");
		int j = input.nextInt();
		
		System.out.println("Agora insira apartir de qual número deseja iniciar a contagem: ");
		for(int i = input.nextInt(); i <= j; i++) {
			System.out.println(i);
		}
	}
}
