package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReaderV1
{
    public static void main(String[] args) throws IOException
    {

      String token = "";
      double doubleToken = 0.0;
      File fileName = new File("data4.txt");
      Scanner inFile = new Scanner(fileName);
      double total = 0;

      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         doubleToken = inFile.nextDouble( );      //read next token from file
         System.out.println(doubleToken);   //print value of token
         total += doubleToken;
      }//end while

      System.out.println("\nTotal: " + total);
      inFile.close();   
    }//end of main method
}//end of class


