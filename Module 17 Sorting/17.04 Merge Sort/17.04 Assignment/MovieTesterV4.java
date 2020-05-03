
/**
 * Purpose: Uses a merge sorting algorithm to sort Movie objects by title, studio, and year.
 *
 * @author Peter Chow
 * @version 05/03/20
 *
 */
public class MovieTesterV4{

    public static void mergeSortStudio(Movie[] a, int low, int high){
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortStudio( a, low, mid );       
        mergeSortStudio( a, mid + 1, high);   
                
        mergeStudio( a, low, mid, high);
    }

    public static void mergeStudio( Movie[] a, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getStudio().compareTo(a[ j ].getStudio()) < 0)
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    }

    public static void mergeSortTitle(Movie[] a, int low, int high){
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortTitle( a, low, mid );       
        mergeSortTitle( a, mid + 1, high);   
                
        mergeTitle( a, low, mid, high);
    }

    public static void mergeTitle( Movie[] a, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getTitle().compareTo(a[ j ].getTitle()) < 0)
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    }

    public static void mergeSortYear(Movie[] a, int low, int high){
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortYear( a, low, mid );       
        mergeSortYear( a, mid + 1, high);   
                
        mergeYear( a, low, mid, high);
    }

    public static void mergeYear( Movie[] a, int low, int mid, int high ){
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getYear() < a[ j ].getYear() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    }

	public static void main(String [] args){
		Movie[] movies = new Movie[10];
		Movie[] sorted = new Movie[10];

		movies[0] = new Movie("Onward",2020,"Pixar");
		movies[1] = new Movie("Avengers: Endgame",2019,"Marvel");
		movies[2] = new Movie("Toy Story 4",2019,"Pixar");
		movies[3] = new Movie("Black Panther",2018,"Marvel");
		movies[4] = new Movie("A Quiet Place",2018,"Paramount");
		movies[5] = new Movie("Inception",2010,"Legendary Pictures");
		movies[6] = new Movie("Venom",2018,"Marvel");
		movies[7] = new Movie("Meet the Robinsons",2007,"Disney");
		movies[8] = new Movie("Shrek 2",2004,"DreamWorks");
		movies[9] = new Movie("Frozen II",2019,"Disney");

        System.out.println("\n     <<<< Before Sorting >>>>");
        System.out.println("");
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by TITLE in ascending order >>>>\n");
		mergeSortTitle(movies,0,9);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by YEAR in ascending order >>>>\n");
		mergeSortYear(movies,0,9);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by STUDIO in ascending order >>>>\n");
	    mergeSortStudio(movies,0,9);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }


	}

}