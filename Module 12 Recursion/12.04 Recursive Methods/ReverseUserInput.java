
 /**
 * This class uses recursion to reverse a series of words entered from the keyboard.
 *
 * @author Elle Navan
 * @version 06/12/17
 */
import java.util.Scanner;
public class ReverseUserInput
{
    Scanner in = new Scanner(System.in);                    //creates new Scanner object

    //a recursive method to reverse the order of user input
    public int fOf(int x){
        if(x <= 10){
            return -5;//the base case
        }
        else {
            return fOf(x-3) + 2;//recursive call
        }
    }

    public static void main(String[] args)
    {
        ReverseUserInput reverseIt = new ReverseUserInput(); //creates new object
        System.out.println("Enter a list of words,");
        System.out.println("press Enter after each word.");
        System.out.println("Type \'q\' to end the list.");
        System.out.println();

        System.out.println(reverseIt.fOf(25));                           //invokes reverseInput() method
    }
}
