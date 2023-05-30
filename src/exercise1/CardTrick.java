package exercise1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jaskeerat Singh 30 mar
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        int value;
        int suit;
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        System.out.println("Enter your card number and suit: ");
        value = input.nextInt();
        if(value >= 1 && value <= 13){
        return;
        }
     
        suit = input.nextInt();
        if(suit >= 1 && suit <= 4){
            return;
        }

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit -1]);
        
        boolean cardFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
    }
        if (cardFound) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }
    }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jaskeerat Singh, but you can call me Jai");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Be more active on LinkedIn");
        System.out.println("Have all semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Always having a task to do");
        System.out.println("Hiking");
        System.out.println("Playing video games");
        System.out.println("Long drives");

        System.out.println();
        
    
    }

}
