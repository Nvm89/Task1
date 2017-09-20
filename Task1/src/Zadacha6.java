import java.util.Scanner;
public class Zadacha6 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Masa na choveka na zemqta: ");
		int G1 = userInput.nextInt();
		double G2 = G1 * 0.17;
		double Otgovor = G1 - G2;
		System.out.println("Masata na chovek na lunata = " + Otgovor);
	}

}
