import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int num;

		Scanner reader = new Scanner(System.in);

		System.out.println("Digite o numero:");
		num = reader.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
