
/**
 * Purpose:
 *
 * @author Peter Chow
 * @version 05/03/20
 *
 */
public class MovieTesterV2{

    public static Movie[] sortTitle(Movie[] source, int parameter)
    {
    	Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
            	if(parameter == 1){
            		if(next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;
            	}
            	else{
            		if(next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;            		
            	}
            }

            dest[ insertIndex ] = next;
        } return dest;
    }

    public static Movie[] sortStudio(Movie[] source, int parameter)
    {
    	Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
            	if(parameter == 1){
            		if(next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;
            	}
            	else{
            		if(next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;            		
            	}
            }

            dest[ insertIndex ] = next;
        } return dest;
    }

    public static Movie[] sortYear(Movie[] source, int parameter)
    {
    	Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
            	if(parameter == 1){
            		if(next.getYear() > dest[k-1].getYear() ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;
            	}
            	else{
            		if(next.getYear() < dest[k-1].getYear() ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;            		
            	}
            }

            dest[ insertIndex ] = next;
        } return dest;
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
		sorted = sortTitle(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by TITLE in descending order >>>>\n");
		sorted = sortTitle(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by YEAR in ascending order >>>>\n");
		sorted = sortYear(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by YEAR in descending order >>>>\n");
		sorted = sortYear(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }

        System.out.println("\n     <<<< After Sorting>>>>");
        System.out.println("<<<< by STUDIO in ascending order >>>>\n");
		sorted = sortStudio(movies, 1);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by STUDIO in descending order >>>>\n");
		sorted = sortStudio(movies, 2);

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i] );		
        }


	}

}