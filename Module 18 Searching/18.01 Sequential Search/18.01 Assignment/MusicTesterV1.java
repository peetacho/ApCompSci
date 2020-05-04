
/**
 * Purpose:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class MusicTesterV1{
	
	public static void printTable(Music [] r){
        System.out.printf("%-25s %-6s %-20s %n","Title","Year","Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
	}

    public static void findTitle(Music[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break; 
            }
        }
        
        if(found != -1)
        {  
            System.out.println("Find result:");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }
   
    public static void findArtist(Music[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getArtist().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }

    public static void findYear(Music[] r, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getYear() == toFind)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }

	public static void main(String[] args){
		Music[] music = new Music[10];

		// Music (title, year, artist)
        music[0] = new Music("Creep",1992,"Radiohead");
        music[1] = new Music("Someone You Loved",2018,"Lewis Capaldi");
        music[2] = new Music("Grow As We Go",2019,"Ben Platt");
        music[3] = new Music("Bruises",2017, "Lewis Capaldi");
        music[4] = new Music("Supermarket Flowers",2017,"Ed Sheeran");
        music[5] = new Music("Can I Be Him",2016,"James Arthur");
        music[6] = new Music("Photograph",2014,"Ed Sheeran");
        music[7] = new Music("Yesterday",1965,"The Beatles");
        music[8] = new Music("Too Late",2020,"The Weekend");
        music[9] = new Music("Hey Jude",1968,"The Beatles");

        printTable(music);


        System.out.println("<<<<<<<<<< Searching for Yesterday (Title) >>>>>>>>>>\n");
        findTitle(music, "Yesterday");
        System.out.println();
        
        System.out.println("<<<<<<<<<< Searching for Let it Be (Title) >>>>>>>>>>\n");
        findTitle(music, "Let it Be");
        System.out.println();
        
        System.out.println("<<<<<<<<<< Searching by 2017 (Year) >>>>>>>>>>\n");
        findYear(music, 2017);
        System.out.println();

        System.out.println("<<<<<<<<<< Searching by 2001 (Year) >>>>>>>>>>\n");
        findYear(music, 2001);
        System.out.println();
        
        System.out.println("<<<<<<<<<< Searching for Lewis Capaldi (Artist) >>>>>>>>>>\n");
        findArtist(music, "Lewis Capaldi");
        System.out.println();
        
        System.out.println("<<<<<<<<<< Searching for Bruno Mars (Artist) >>>>>>>>>>\n");
        findArtist(music, "Bruno Mars");
        System.out.println();
	}
}