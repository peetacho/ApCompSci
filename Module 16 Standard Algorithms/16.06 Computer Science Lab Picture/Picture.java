/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/


import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width, height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() 
                       + " height " + getHeight() 
                       + " width " + getWidth();
    return output;
    
  }
  
  /////////////////////////// Activity 5 ////////////////////////////
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  // keepOnlyBlue
  // keepOnlyRed
  // keepOnlyGreen
  // nagate
  // grayscale
  // fixUnderWater - optional
  
  /////////////////////////// Activity 6 ////////////////////////////
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  // mirrorVerticalRightToLeft 
  // mirrorHorizontal 
  // mirrorHorizontalBotToTop 
  
  /////////////////////////// Activity 7 ////////////////////////////
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  // mirrorArms 
  // mirrorGull 
  
  
  /////////////////////////// Activity 8 ////////////////////////////
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param fromStartRow the row to start coping
    * from in the from picture
    * @param fromStartCol the column to start
    * copying from in the from picture
    * @param fromEndRow the row to stop before in the from picture 
    * @param fromEndCol the column to stop before in the from picture
    * @param toStartRow the row to start copying to
    * @param toStartCol the column to start copying to
    */
  public void copy(Picture fromPic, 
                   int fromStartRow,
                   int fromStartCol,
                   int fromEndRow,
                   int fromEndCol,
                   int toStartRow, 
                   int toStartCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = fromStartRow, toRow = toStartRow; 
         fromRow < fromEndRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = fromStartCol, toCol = toStartCol; 
           fromCol < fromEndCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  // myCollage
  
  public void myCollage()
  {
    Picture mark = new Picture("blue-mark.jpg");
    this.copy(mark,211,300,272,366,231,363);    

    Picture mark1 = new Picture(mark);
    mark1.keepOnlyBlue();
    this.copy(mark1,211,300,272,366,111,0);

    Picture mark2 = new Picture(mark);
    mark2.mirrorHorizontal();
    this.copy(mark2,211,300,272,366,289,100);
    
    Picture flower1 = new Picture("flower1.jpg");
    flower1.grayscale();
    this.copy(flower1,0,24,65,78,160,79);

  }

  // keepOnlyBlue (to use for myCollage)

  public void keepOnlyBlue(){
    
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  // grayscale (to use for myCollage)

  public void grayscale(){
    
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      { 
        int sumPix = pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue();
        int averagePix = sumPix/3;

        pixelObj.setRed(averagePix);
        pixelObj.setGreen(averagePix);
        pixelObj.setBlue(averagePix);
      }
    }
  }

  // mirrorHorizontal (to use for myCollage)

  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel upPixel = null;
    Pixel downPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
      for (int row = 0; row < pixels.length/2; row++)
      {
        upPixel = pixels[row][col];
        downPixel = pixels[pixels.length - 1 - row][col];
        downPixel.setColor(upPixel.getColor());
      }
    } 
  }

  // mirrorHorizontalBotToTop (to use for myCollage)

  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel upPixel = null;
    Pixel downPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
      for (int row = 0; row < pixels.length/2; row++)
      {
        upPixel = pixels[row][col];
        downPixel = pixels[pixels.length - 1 - row][col];
        upPixel.setColor(downPixel.getColor());
      }
    } 
  }

  
  /////////////////////////// Activity 9 ////////////////////////////
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }  
  
  // edgeDetection2

  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel downPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color downColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        downPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        downColor = downPixel.getColor();


        if ((leftPixel.colorDistance(rightColor) > edgeDist) || (leftPixel.colorDistance(downColor) > edgeDist)){
          leftPixel.setColor(Color.BLACK);
        }
        else{
          leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }  

  
} // this } is the end of class Picture, put all new methods before this
