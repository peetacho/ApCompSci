/**
 * This program demonstrates how to assign values to individual
 * positions in a String array by reading the values from
 * a text file.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StringArrayDemoV3
{
    public static void main(String[ ] args) throws IOException
    {   
        File fileName = new File("seven.txt");
        Scanner inFile = new Scanner(fileName);

        int numValues = 0;
        while (inFile.hasNextLine())
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        String [] dwarfNames = new String[numValues];
        inFile = new Scanner(fileName);
        int index = 0;


        // Input: read from text file and assign values one at a time to the array
        while (inFile.hasNext())
        {
            dwarfNames[index] = inFile.next();
            index++;
        }
        inFile.close();

        // Output: traverse the array and display the contents
        for(int n = 0; n < dwarfNames.length; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: "
                                  + dwarfNames[n] + ".  He is in array position "
                                  + n + ".");    

        }
        
        System.out.println();
        System.out.println("The length of the array is: " + dwarfNames.length);

    }//end of main method
}//end of class
