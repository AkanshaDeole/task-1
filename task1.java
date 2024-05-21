package codsoft.com;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;


public class NumberGame {

	 
		public static void main(String args[]) throws IOException {
	        System.out.println("WELCOME TO NUMBER GAME");
	        System.out.println("The Application will generate a Random Number within a Specified range-1 to 100 ");
	        System.out.println("You have to guess that Random Number");
	        System.out.println("Your score will depends on the number of attempts you took to guess that number ");
	        
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        
	        System.out.println("Enter the number of rounds between (1-5) you want to play Game : ");
	        int round = sc.nextInt();
	        
	        for(int i =1; i<= round; i++) {
	        	
	         System.out.println();
	         System.out.println("Round"+ i +"begins....\n");
	         
	         System.out.println("Please enter the Difficulty level of game: \n 1.Easy [There is No Limit for number of attempts] \n 2.Hard [There is Limit for number of attempts]");
             int limits = sc.nextInt();
             
             switch (limits) {
             
             case 1:{ 
            	 System.out.println("Choosen the Easy option.\n Hence There is No Limit for number of attempts \n ");
                 
            	 int randomNumber = 1+ rand.nextInt(100);
            	 System.out.println("Random Number is generated ....");
            	 
                 int count = 1;
                 whileloop: while (true) {
                     System.out.print("\nEnter you guess number " + count + ": ");
                     int guess = sc.nextInt();
                     if (guess > randomNumber) {
                    	 System.out.print("The number " + guess + " is HIGHER than the Generated number . You have to guess again.. ");
                        }
                     else if(guess < randomNumber) {
                    	 System.out.print("The number " + guess + " is SMALLLER than the Generated number . You have to guess again.. ");
                     }
                     else {
                         System.out.println(
                                 "The number " + guess + " is EQUAL to the Generated Number.\nCongrats it took you "
                                         + count + " attempts.");
                         break whileloop;
                     }
                       count++;
                     }
            	 break;
             }
             case 2: {
            	 System.out.println("Choosen the Hard option.\n Hence There is a Limit for number of attempts \n ");
            	 System.out.println(" The Limit is only 5. If You have guessed the number in 5 or less attempts then You will won the Game.  ");
            	 System.out.println("Else you lose the game. ");
            	 int randomNumber = 1 + rand.nextInt(100);
                 System.out.println("Random Number is generated....");
                 int count = 1;
                    whileloop: while (count <= 5)  {             
                      System.out.println("\nNo of guesses remaining : " + (6 - count) + " ...\n");
                      System.out.print("Enter you guess number " + count + ": ");
                      int guess = sc.nextInt();
                      if (guess > randomNumber) {
                          System.out.println("The number " + guess
                                  + " is HIGHER than Generated Number. You have to Guess again...");
                      } else if (guess < randomNumber) {
                          System.out.println("The number " + guess
                                  + " is SMALLER than Generated Number. You have to Guess again...");
                      } else {
                          System.out.println(
                                  "The number " + guess + " is EQUAL to the Generated Number.\nCongrats it took you "
                                          + count + " attempts.");
                          break whileloop;
                      }
                      count++;
                  

                 }
                 if (count > 5) {
                     System.out.println(
                             "OOPS!! You were not able to guess the number in 5 attempts.\nThe Generated Number was "
                                     + randomNumber + "\nBETTER LUCK NEXT TIME\n");
                 }
                 break;
                }
                
	       default:
	           {
                 System.out.println("--- INVALID INPUT ---");

                 System.out.println("!!Sorry \n you are not able to play the game");
                 break;
               }
	        }
	        System.out.println("The ROUND " + i + " is OVER.");
        }

	        
	        System.out.println("\nAll the Rounds are over.");
	        

	        System.out.println("Thankyou for playing this Game.");
}
}
	        
	       
