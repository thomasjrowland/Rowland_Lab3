package lab3_Rowland;

import java.util.Scanner;

public class Lab3Rowland {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		System.out.print("Hi, what's youre name? ");
		String userName = scnr.nextLine();
				
		while (keepGoing) {
					
			System.out.print("Hi " + userName + ", please enter a whole number between 1 and 100: ");
			int userNum = scnr.nextInt();
			
			if (userNum > 100 || userNum < 1) {
				System.out.println("Sorry that is not a valid entry " + userName + ". Please try again.");
				continue;
			}
		
			System.out.println("You entered: " + userNum);
			
			if (userNum % 2 == 0) {
				
				//System.out.println("Your number is even.");
					
					if (userNum >= 2 && userNum <=25) {
						System.out.println(userNum + " Even and less than 25.");
					} else if (userNum >=26 && userNum <= 60) {
						System.out.println(userNum + " Even.");
					} else if (userNum > 60) {
						System.out.println(userNum + " Even.");
					}
					
					
			} else {
				//System.out.println("Your number is odd");
				if (userNum > 60) {
					System.out.println(userNum + " Odd and over 60.");
				}
			}
						
			System.out.println("Would you like to exit? (y) or (n) ");
			keepGoing = scnr.next().startsWith("n");
		}

		System.out.println("Goodbye " + userName);

	}

}
