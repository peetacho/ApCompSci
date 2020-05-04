
/**
 * Purpose:
 *
 * @author Peter Chow
 * @version 05/04/20
 *
 */
public class MusicTesterV3{
	

	public static void printTable(Music [] r){
        System.out.printf("%-25s %-6s %-20s %n","Title","Year","Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
	}

    // Selection Sorting for TITLE
    public static void sortTitle(Music[] source, int parameter){
        int i;
        int k;
        int posMax;
        Music temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getTitle().compareTo( source[posMax].getTitle() ) > 0  )
                        posMax = k;
                }
                else{
                    if (source[k].getTitle().compareTo( source[posMax].getTitle() ) < 0  )
                        posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;

            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Assignment a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getLocation() );
        } 
    }

    // Selection Sorting for YEAR
    public static void sortYear(Music[] source, int parameter){
        int i;
        int k;
        int posMax;
        Music temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getYear() >= source[posMax].getYear())
                        posMax = k;
                }
                else{
                    if (source[k].getYear() <= source[posMax].getYear())
                        posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;

            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Assignment a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getLocation() );
        } 
    }

    // Selection Sorting for ARTIST
    public static void sortArtist(Music[] source, int parameter){
        int i;
        int k;
        int posMax;
        Music temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getArtist().compareTo( source[posMax].getArtist() ) > 0  )
                        posMax = k;
                }
                else{
                    if (source[k].getArtist().compareTo( source[posMax].getArtist() ) < 0  )
                        posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;

            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Assignment a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getLocation() );
        } 
    }

    public static int binarySearchTitle(Music[] r, String toFind ){
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void binarySearchArtist(Music[] r, String toFind){
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
        {
            linearPrintArtist(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintArtist(Music[] r, int low, String toFind){
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        System.out.println("Found:");
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void binarySearchYear(Music[] r, int toFind){
        int high = r.length;
        int low = -1;
        int probe;
        int location = 0;
        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getYear() >= toFind){
                high = probe;
                location = probe;
            }
            else
            {
                low = probe;
                if( r[probe].getYear() == toFind)
                {   
                    location = probe;
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[location].getYear() == toFind))
        {
            linearPrintYear(r, location, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintYear(Music[] r, int low, int toFind){
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getYear() == toFind))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getYear() == toFind))
        {
            end = i;
            i++;
        }
        // now print out the matches
        System.out.println("Found:");
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

	public static void main(String[] args){
		int test = 0;

        Music[] music = new Music[10];

		// Music (title, year, artist)
        music[0] = new Music("Creep",1992,"Radiohead");
        music[1] = new Music("Someone You Loved",2019,"Lewis Capaldi");
        music[2] = new Music("Grow As We Go",2018,"Ben Platt");
        music[3] = new Music("Bruises",2017, "Lewis Capaldi");
        music[4] = new Music("Supermarket Flowers",2017,"Ed Sheeran");
        music[5] = new Music("Can I Be Him",2016,"James Arthur");
        music[6] = new Music("Photograph",2014,"Ed Sheeran");
        music[7] = new Music("Yesterday",1965,"The Beatles");
        music[8] = new Music("Too Late",2020,"The Weekend");
        music[9] = new Music("Hey Jude",1968,"The Beatles");

        System.out.println("\n<<<<<<<<<< Original >>>>>>>>>>");
        printTable(music);

        System.out.println("\n<<<<<<<<<< Searching for Yesterday (Title) >>>>>>>>>>");
        sortTitle(music,1);
        test = binarySearchTitle(music, "Yesterday");
        if(test != -1)
            System.out.println("Found: \n" + music[test]);
        else
            System.out.println("NOT found: Yesterday" );        
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for Let it Be (Title) >>>>>>>>>>");
        sortTitle(music,1);
        test = binarySearchTitle(music, "Let it Be");
        if(test != -1)
            System.out.println("Found: \n" + music[test]);
        else
            System.out.println("NOT found: Let it Be");
        System.out.println();

        
        System.out.println("\n<<<<<<<<<< Searching by 2017 (Year) >>>>>>>>>>");
        
        // Music[] music1 = sortYear(music, 1);
        sortYear(music, 1);
        binarySearchYear(music,2017);
        System.out.println();

        
        System.out.println("\n<<<<<<<<<< Searching by 2001 (Year) >>>>>>>>>>");
        sortYear(music, 1);
        binarySearchYear(music,2001);
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for Lewis Capaldi (Artist) >>>>>>>>>>");
        sortArtist(music,1);
        binarySearchArtist(music, "Lewis Capaldi");
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for Bruno Mars (Artist) >>>>>>>>>>");
        sortArtist(music,1);
        binarySearchArtist(music, "Bruno Mars");
        System.out.println();
        
	}
}