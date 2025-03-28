
public class continue1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				continue; // pula a interação quando i == 3
			}
			System.out.println("Número: " + i);
		}
		
		
	}
}
