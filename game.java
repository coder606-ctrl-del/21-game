
import java.util.Scanner;




public class game {

	

	public static void main(String[] args) {

		

		int numSticks = 21;

		System.out.println("Would you like to go first? (Y/n)");

		Scanner input = new Scanner(System.in);

		String goFirst = input.nextLine();

		Scanner take = new Scanner(System.in);

		int numToTake = 0;

		

		while (numSticks > 0) {

			

			if (goFirst.equals("y") || goFirst.equals("Y")) {

				System.out.println("There are " + numSticks + " sticks");

				System.out.println("How many sticks will you take (1 or 2 or 3)");

				numToTake = take.nextInt();

				

				if (numToTake > 3) {

					numToTake = 3;

				}

				else if (numToTake < 1){

					numToTake = 1;

				}

				numSticks = numSticks - numToTake;

				if (numSticks <= 0) {

				System.out.println("You lose!");

				}

				else {

					if ((numSticks - 1) % 4 == 0 || numSticks - 2 == 0)  {

						numToTake = 1;

					}

					else if ((numSticks - 2) % 4 == 0 || numSticks - 3 == 0)  {

						numToTake = 2;

					}

					else if ((numSticks - 3) % 4 == 0 || numSticks - 4 == 0)  {

						numToTake = 3;

					}

					else {

						numToTake = 1;

					}

					System.out.println("Computer takes " + numToTake + " sticks");

					numSticks = numSticks - numToTake;

			

					if (numSticks <= 0) {

						System.out.println("You win!");

					}

				}

			}

			else {

				if ((numSticks - 1) % 4 == 0 || numSticks - 2 == 0)  {

					numToTake = 1;

				}

				else if ((numSticks - 2) % 4 == 0 || numSticks - 3 == 0)  {

					numToTake = 2;

				}

				else if ((numSticks - 3) % 4 == 0 || numSticks - 4 == 0)  {

					numToTake = 3;

				}

				else {

					numToTake = 1;

				}

				System.out.println("Computer takes " + numToTake + " sticks");

				numSticks = numSticks - numToTake;




				if (numSticks <= 0) {

						System.out.println("You win!");

					}

				else {

					System.out.println("There are " + numSticks + " sticks");

					System.out.println("How many sticks will you take (1 or 2 or 3)");

					numToTake = take.nextInt();

					if (numToTake > 3) {

						numToTake = 3;

					}

					else if (numToTake < 1){

						numToTake = 1;

					}

					numSticks = numSticks - numToTake;

					if (numSticks <= 0) {

						System.out.println("You lose!");

					}




				}

			}

		}

	}

}
