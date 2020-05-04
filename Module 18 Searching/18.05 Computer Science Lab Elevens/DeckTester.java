/**
 * This is a class that tests the Deck class.
 *
 * @author Peter Chow
 * @version 05/03/20
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */
/*
      String[] myRanks = {"queen","king","jack","9","8"};
      String[] mySuits = {"hearts","clubs","spades"};
      int[] myPointValues = {12,13,11,9,8};
      Deck myDeck = new Deck(myRanks,mySuits,myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: " );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: "  );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " );
      System.out.println();
      System.out.println();
*/

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      String[] ranks52 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
      String[] suits52 = {"Hearts","Diamonds","Spades","Clubs"};
      int[] values52 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
      Deck deck52 = new Deck(ranks52,suits52,values52);

      System.out.println("  The Starting Deck ");
      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + deck52.toString());
      System.out.println("  isEmpty: " + deck52.isEmpty());
      System.out.println("  size: " + deck52.size());
      System.out.println();
      System.out.println();

      System.out.println("<<<< Shuffleing the Deck the first time >>>>");
      deck52.shuffle();

      System.out.println("\n  The Shuffled Deck ");
      System.out.println("**** Shuffled Deck Methods ****");
      System.out.println("  toString: \n" + deck52.toString());
      System.out.println("  isEmpty: " + deck52.isEmpty());
      System.out.println("  size: " + deck52.size());
      System.out.println();
      System.out.println();      

      System.out.println("<<<< Deal a Card >>>>");
      System.out.println("  deal: " + deck52.deal());
      System.out.println("  deal: " + deck52.deal());
      System.out.println("  deal: " + deck52.deal());
      System.out.println("  deal: " + deck52.deal());
      System.out.println();
      System.out.println();

      System.out.println("<<<< Shuffleing the Deck the second time >>>>");
      deck52.shuffle();

      System.out.println("\n  The Shuffled Deck ");
      System.out.println("**** Shuffled Deck Methods ****");
      System.out.println("  toString: \n" + deck52.toString());
      System.out.println("  isEmpty: " + deck52.isEmpty());
      System.out.println("  size: " + deck52.size());
      System.out.println();
      System.out.println();  

   }
}
