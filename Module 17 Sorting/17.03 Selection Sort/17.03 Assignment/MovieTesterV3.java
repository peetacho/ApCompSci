
/**
 * Purpose: Uses a selection sorting algorithm to sort Movie objects by title, studio, and year.
 *
 * @author Peter Chow
 * @version 05/03/20
 *
 */
public class MovieTesterV3{

    public static void sortTitle(Movie[] source, int parameter){
        int i;
        int k;
        int posMax;
        Movie temp;

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
        } 
    }

    public static void sortStudio(Movie[] source, int parameter){
        int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getStudio().compareTo( source[posMax].getStudio() ) > 0  )
                        posMax = k;
                }
                else{
                    if (source[k].getStudio().compareTo( source[posMax].getStudio() ) < 0  )
                        posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        } 
    }

    public static void sortYear(Movie[] source, int parameter){
        int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){
                // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if ( source[ k ].getYear() > source[ posMax ].getYear() )
                        posMax = k;
                }
                else{
                    if ( source[ k ].getYear() < source[ posMax ].getYear() )
                        posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        } 
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
		sortTitle(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by TITLE in descending order >>>>\n");
		sortTitle(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by YEAR in ascending order >>>>\n");
		sortYear(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by YEAR in descending order >>>>\n");
		sortYear(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by STUDIO in ascending order >>>>\n");
	   sortStudio(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by STUDIO in descending order >>>>\n");
		sortStudio(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(movies[i] );		
        }


	}

}