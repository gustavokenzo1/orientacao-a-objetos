import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		String operation;
		int n1, n2;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Entre com a operação a ser realizada (+, - ou *):");
		operation = reader.next();
		
		System.out.println("Entre com o primeiro número:");
		n1 = reader.nextInt();
		
		System.out.println("Entre com o segundo número:");
		n2 = reader.nextInt();
		
		switch (operation) {
			case "+":
				System.out.println("O resultado da operação é: " + (n1 + n2));
				break;
			case "-":
				System.out.println("O resultado da operação é: " + (n1 - n2));
				break;
			case "*":
				System.out.println("O resultado da operação é: " + (n1 * n2));
				break;
			default: 
				System.out.println("Operação inválida");
				break;
		}
	}
}
