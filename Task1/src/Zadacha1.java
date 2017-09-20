import java.util.Scanner;
public class Zadacha1 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Number1: ");
		int randomNumber = userInput.nextInt();
		System.out.print("Number2: ");
		int randomNumber2 = userInput.nextInt();
		int Number3 = 0;
	if (randomNumber > randomNumber2) {
		Number3 = randomNumber;
		randomNumber = randomNumber2;
		randomNumber2 = Number3;
		
	}
	System.out.println(randomNumber);
	System.out.println(randomNumber2);
	}

}
