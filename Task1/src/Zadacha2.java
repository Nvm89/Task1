import java.util.Scanner;
public class Zadacha2 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Number1: ");
		int randomNumber = userInput.nextInt();
		System.out.print("Number2: ");
		int randomNumber2 = userInput.nextInt();
	if (randomNumber + randomNumber2 > 0) {
		System.out.println("+");		
	}
	else {
		System.out.println("-");
	}
	}
}