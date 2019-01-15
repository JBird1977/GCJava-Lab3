import java.util.Scanner;



public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int iNum = 0;
		String name = "";
		char cont = 'n';
		
		do {
		
		System.out.println("Welcome to the Integral Integer Fun Machine!");
		
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		do {
		System.out.println(name + ", please enter an integer from 1 to 100: ");
		iNum = scan.nextInt();
		if (iNum < 1) {
			System.out.println("Invalid input! Please enter a number between 1 and 100.");
		}
		}while (iNum < 1 || iNum > 100);
			
		if (iNum % 2 != 0 && iNum <= 60) {
			System.out.println(name + ", your number is " + iNum + " and it is Odd.");
		}
		
		else if (iNum % 2 == 0 && iNum >= 2 && iNum <= 25) {
			System.out.println(name + ", your number is Even and less than or equal to 25.");
		}
		
		else if (iNum % 2 == 0 && iNum >= 26 && iNum <= 60) {
			System.out.println(name + ", your number is Even.");
		}
		
		else if (iNum % 2 == 0 && iNum > 60) {
			System.out.println(name + ", your number is " + iNum + ". Even.");
		}
		
		else if (iNum % 2 != 0 && iNum > 60) {
			System.out.println(name + ", your number is " + iNum + ". It is Odd and over 60");
		}
		
		do {
		System.out.println("Would you like to play again " + name + "? (y/n)");
		cont = scan.next().charAt(0);
		scan.nextLine(); //this is done to consume the new line from scan.next()
		
		System.out.println();
		if (cont != 'n' && cont != 'N' && cont != 'y' && cont != 'Y') {
			System.out.println("Invalid input! Please try again. ");
		}
		
		}while (cont != 'n' && cont != 'N' && cont != 'y' && cont != 'Y');
		
		
		}while (cont != 'n' && cont != 'N');
		
		System.out.println("Goodbye, " + name + "!!!");
		scan.close();
	}

}
