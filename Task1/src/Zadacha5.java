
import java.util.Scanner;
public class Zadacha5 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Visochina: ");
		int Visochina = userInput.nextInt();
		System.out.print("A: ");
		int A = userInput.nextInt();
		System.out.print("B: ");
		int B = userInput.nextInt();
		System.out.println("Liceto na trapeca e = " + Visochina / 2 * A * B);

	}

}
