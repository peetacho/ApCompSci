/**
 * This is a class that tests the Card class.
 *
 * @author Peter Chow
 * @version 05/03/20
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card kingClubs = new Card("king", "clubs", 13);
      Card jackHearts1 = new Card("jack", "hearts", 11);
      Card jackHearts2 = new Card("jack", "hearts", 11);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2

      System.out.println("**** Tests Card 2: king of clubs ****");
      System.out.println("  rank: " + kingClubs.rank());
      System.out.println("  suit: " + kingClubs.suit());
      System.out.println("  pointValue: " + kingClubs.pointValue());
      System.out.println("  toString: " + kingClubs.toString());
      System.out.println();      

      // Test card 3

      System.out.println("**** Tests Card 3: jack of hearts ****");
      System.out.println("  rank: " + jackHearts1.rank());
      System.out.println("  suit: " + jackHearts1.suit());
      System.out.println("  pointValue: " + jackHearts1.pointValue());
      System.out.println("  toString: " + jackHearts1.toString());
      System.out.println();      

      // Test matches() method

      System.out.println("**** Tests matching method between jackHearts1 and jackHearts2 ****");
      System.out.println("  matching: " + jackHearts1.matches(jackHearts2));
      
      System.out.println("**** Tests matching method between jackHearts1 and kingClubs ****");
      System.out.println("  not matching: " + jackHearts1.matches(kingClubs));
      System.out.println();            

   }
}
