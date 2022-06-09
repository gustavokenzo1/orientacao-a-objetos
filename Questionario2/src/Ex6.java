import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		String[] position = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};
		int[] inputs = {0, 0, 0, 0, 0};
		
		Scanner reader = new Scanner(System.in);
		
		int len = position.length;
		
		for (int i = 0; i < len; i++) {
			System.out.println("Entre com o " + position[i] + " numero:");
			inputs[i] = reader.nextInt();
		}
		
		int temp = 0;
		
		for (int i = 0; i < len; i++) {
			if (inputs[i] > temp) {
				temp = inputs[i];
			}
		}
		
		System.out.println(temp);
	}
}
