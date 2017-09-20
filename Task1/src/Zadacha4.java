import java.util.Scanner;
public class Zadacha4 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Number1: ");
		int Visochina = userInput.nextInt();
		System.out.print("Number2: ");
		int Dyljina = userInput.nextInt();
		System.out.println(Visochina * 2 + Dyljina * 2);
		System.out.println(Visochina *  Dyljina);
	}

}
