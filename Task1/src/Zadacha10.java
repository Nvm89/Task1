import java.util.Scanner;
public class Zadacha10 {
	static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
    		System.out.print("abcd: ");
    		int abcd = userInput.nextInt();
            int a,b,c,d;
            d = abcd % 10;
            c = abcd / 10 % 10;
            b = abcd / 100 % 10;
            a = abcd / 1000 % 10;
            System.out.println(a+b+c+d);
            Object dcba = d + "" + c + "" + b + "" + a;
            System.out.println(dcba);
            Object dabc = d + "" + a + "" + b + "" + c;
            System.out.println(dabc);
            Object acbd = a + "" + c + "" + b + "" + d;
            System.out.println(acbd);
            
      }

}