import java.util.Scanner;
public class Zadacha3 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Number1: ");
		int randomNumber = userInput.nextInt();
		System.out.print("Number2: ");
		int randomNumber2 = userInput.nextInt();
		System.out.print("Number3: ");
		int randomNumber3 = userInput.nextInt();
		int max = randomNumber;
	if (max < randomNumber2) {
		max = randomNumber2;
	}
	if (max < randomNumber3) {
		max = randomNumber3;
	}
	System.out.println(max);
	}

}
