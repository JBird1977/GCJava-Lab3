import java.util.Scanner;



public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int iNum = 0;
		String name = "";
		String cont = "n";
		
		do {
		System.out.println("Welcome to the Integral Integer Fun Machine!");
		
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		
		System.out.println(name + ", please enter an integer from 1 to 100: ");
		iNum = scan.nextInt();
		
		if (iNum % 2 != 0 && iNum <= 60) {
			System.out.println(name + ", your number is Odd.");
		}
		
		else if (iNum % 2 == 0 && iNum >= 2 && iNum <= 25) {
			System.out.println(name + ", your number is Even and less than 25.");
		}
		
		else if (iNum % 2 == 0 && iNum >= 26 && iNum <= 60) {
			System.out.println(name + ", your number is Even.");
		}
		
		else if (iNum % 2 == 0 && iNum > 60) {
			System.out.println(name + ", your number is Even.");
		}
		
		else if (iNum % 2 != 0 && iNum > 60) {
			System.out.println(name + ", your number is Odd and over 60");
		}
		
		System.out.println("Would you like to play again " + name + "? (y/n)");
		cont = scan.nextLine();
		
		
		
		
		
		
		}while (cont != "n" && cont !="N");
		
		System.out.println("Thank you come again!");
		scan.close();
	}

}
