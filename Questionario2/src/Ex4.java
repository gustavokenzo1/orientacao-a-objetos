import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			num = reader.nextInt();
			sum += num;
		} while (num >= 0);
		
		System.out.println("A soma é: " + (sum - num));
	}
}
