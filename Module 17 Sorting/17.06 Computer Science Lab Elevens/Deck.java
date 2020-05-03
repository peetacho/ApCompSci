import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 * @author Peter Chow
 * @version 05/03/20
 */
public class Deck
{
   private List<Card> cards;    //contains all the cards in the deck
   private List<Card> discard = new ArrayList<Card>();

   private int size, discardSize;   // size is the number of not-yet-dealt cards.
                       // Cards are dealt from the top (highest index) down.
                       // The next card to be dealt is at size - 1.

   /**
    * Creates a new Deck instance.<BR>
    * It pairs each element of ranks with each element of suits,
    * and produces one of the corresponding card.
    * @param ranks is an array containing all of the card ranks.
    * @param suits is an array containing all of the card suits.
    * @param values is an array containing all of the card point values.
    */
   public Deck(String[] ranks, String[] suits, int[] values)
   {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

      // initialize cards as a new ArrayList
      cards = new ArrayList<Card>();
      
      // loop through the parameter arrays to add new cards
      for(int j = 0, k = 0; j<ranks.length && k<values.length; j++, k++){
        for(int i = 0; i<suits.length; i++){
          //for(int k = 0; k<values.length; k++){
            String rankJ = ranks[j];
            String suitsI = suits[i];
            int valuesK = values[k];
            cards.add(new Card(rankJ, suitsI, valuesK));
          //}
        }
      }
      // assign size of cards to the size instance variable

      size = cards.size();

      // shuffle cards

   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * @return the number of undealt cards in this deck.
    */
   public int size()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      return cards.size();
   }

   /**
    * Randomly permute the given collection of cards
    * and reset the size to represent the entire deck.
    */
   public void shuffle()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
      /* For Activity 2, this method will do nothing. */
   }

   /**
    * Deals a card from this deck.
    * @return the card just dealt, or null if all the cards have been
    *         previously dealt.
    */
   public Card deal()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      
        if (size == 0)
        {
            return null;
        }
        else
        {
            size--;
            return cards.get(size);
        }

      /*
      discard.add(new Card("0","0",1));

      discardSize = discard.size() - 1;
      
      int temp = cards.size() - 1 - discardSize ;
      
      discard.add(cards.get(temp));
      
      cards.remove(temp);

      if(discardSize == cards.size()){
        return null;
      }
      else{
        return discard.get(discardSize + 1);
      }
      */
   }

   /**
    * Generates and returns a string representation of this deck.
    * @return a string representation of this deck.
    */
   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = cards.size() - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}
