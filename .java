import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Que horas?");
		horas = sc.nextInt();
		
		if (horas <= 12) {
			System.out.println("Bom dia!");
		}
		else if (horas <= 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
	
		sc.close();
	}
}
