/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  

  /** Activity 8 methods */

  /** Method to test copy */
  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture flower1 = new Picture("flower1.jpg");
    canvas.explore();
    canvas.copy(flower1,9,40);
    canvas.explore();
  }

  /** Method to test copy */
  public static void testCopyPart()
  {
    Picture barb = new Picture("barbaraS.jpg");
    Picture mark = new Picture("blue-mark.jpg");
    barb.explore();
    barb.copy(mark,211,300,272,366,37,30);
    barb.explore();
  }

  /** Method to test myCollage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("femaleLionAndHall.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  /** Activity 9 methods */

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopyPart();
    //testMyCollage();
    
    // Activity 9
    testEdgeDetection();
    testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












