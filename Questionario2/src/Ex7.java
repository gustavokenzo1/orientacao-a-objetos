import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num;
		
		try {
			System.out.println("Digite o caracter a ser verificado:");
			num = reader.nextInt();
			
			System.out.println(true);
		} catch (Exception e) {
			System.out.println(false);
		}
	}
}
