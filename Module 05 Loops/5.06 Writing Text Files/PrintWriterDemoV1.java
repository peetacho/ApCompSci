import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class PrintWriterDemoV1
{
    public static void main (String [ ] args) throws IOException
    {
        
       PrintWriter outFile = new PrintWriter(new File("hello.txt"));

       for (int loop = 1; loop <= 5; loop++)
       {
           outFile.println("Ya gay" + loop);
       }

       outFile.close( );    //close the file when finished
    }//end of main method
}//end of class
