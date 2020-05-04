
/**
 * Purpose:
 *
 * @author Peter Chow
 * @version 05/04/20
 *
 */
public class ContactTester{

	public static void printTable(Contact[] r){
        System.out.printf("%-15s %-13s %-11s %-10s %-25s %n", "Name", 
									"Relationship", "Birthday", "Phone #", "Email");
        System.out.println("---------------------------------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
	}

    //////////////// Selection Sorting for NAME ///////////////// 
    public static void sortName(Contact[] source, int parameter){
        int i;
        int k;
        int posMax;
        Contact temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getName().compareTo( source[posMax].getName() ) > 0  )
                        posMax = k;
                }
                else{
                    if (source[k].getName().compareTo( source[posMax].getName() ) < 0  )
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

    //////////////// Binary Search for NAME ///////////////// 
    public static int binarySearchName(Contact[] r, String toFind ){
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    //////////////// Selection Sorting for RELATION ///////////////// 
    public static void sortRelation(Contact[] source, int parameter){
        int i;
        int k;
        int posMax;
        Contact temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- ){

            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if (parameter == 1){
                    if (source[k].getRelation().compareTo( source[posMax].getRelation() ) > 0  )
                        posMax = k;
                }
                else{
                    if (source[k].getRelation().compareTo( source[posMax].getRelation() ) < 0  )
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

    //////////////// Binary Search for RELATION /////////////////
    public static void binarySearchRelation(Contact[] r, String toFind){
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 ){
            probe = ( high + low ) / 2;

            if(r[probe].getRelation().compareTo(toFind) > 0){
                high = probe;
            }
            else{
            	low = probe;
                if( r[probe].getRelation().compareTo(toFind) == 0){
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getRelation().compareTo(toFind) == 0 )){
            linearPrintRelation(r, low, toFind);
        }
        else{
        	System.out.println("NOT Found: ");
            System.out.println(toFind + " is not in contacts");
        }
    }

    //////////////// Linear Print for RELATION /////////////////
    public static void linearPrintRelation(Contact[] r, int low, String toFind){
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        System.out.println("Found:");
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    //////////////// Sequential Search for BDAY MONTH /////////////////
    public static void findMonth(Contact[] r, String toFind){
        int found = 0;
        //String sub = 
 		
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getBday().substring(0,3).compareTo(toFind.substring(0,3)) == 0)
            {	
                found++;
                if(found==1){
                	System.out.println("Found: ");
                }
                System.out.println(r[i]);
                
            }
        }
        
        if(found == 0)
        {   // we have not found the location
        	System.out.println("NOT Found: ");
            System.out.println(toFind + " is not in the contacts");
        }
    }

    //////////////// Sequential Search for PHONE NUMBER /////////////////
    public static void findPhone(Contact[] r, int toFind){
        int found = 0;

        
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getPhone() == toFind)
            {	
            	System.out.println("Found: ");
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
        	System.out.println("NOT Found: ");
            System.out.println(toFind + " is not in contacts");
        }
    }

    //////////////// Sequential Search for EMAIL /////////////////
    public static void findEmail(Contact[] r, String toFind){
        int found = 0;

        
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getEmail().compareTo(toFind) == 0)
            {	
            	System.out.println("Found: ");
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
        	System.out.println("NOT Found: ");
            System.out.println(toFind + " is not in the contacts");
        }
    }

	public static void main(String[] args){
		int test = 0;
		Contact [] contact = new Contact[10];

		//Contact(String name, String relation, String bday, 
							// int phone, String email)
        contact[0] = new Contact("Peter Chow","friend", "Nov 2",69694209,"peter259@gmail.com");
        contact[1] = new Contact("Madison Beer","wife", "Oct 23",92126290,"madisonbeer@gmail.com");
        contact[2] = new Contact("Randal Cheng","friend", "Jan 4",96839284,"catdestroyer96@gmail.com");
        contact[3] = new Contact("Lily Chee","daughter", "Jul 9",67392481,"lilchee@gmail.com");
        contact[4] = new Contact("Peter Parker","friend", "Mar 3",91023942,"spiderman@gmail.com");
        contact[5] = new Contact("Kim Kardashian","sister", "Mar 3",33026980,"plastic100@gmail.com");
        contact[6] = new Contact("Elvis Yung","nemesis", "Dec 31",89573918,"elvis@gmail.com");
        contact[7] = new Contact("Timothy Lau","friend", "Feb 21",92019420,"timotimo@gmail.com");
        contact[8] = new Contact("Kim Jong Un","uncle", "Mar 3",93240132,"shareeverything@gmail.com");
        contact[9] = new Contact("Donald Trump","father", "Mar 17",99019992,"viruschinese@gmail.com");

        System.out.println("\n<<<<<<<<<< Original >>>>>>>>>>");
        printTable(contact);

        System.out.println("\n<<<<<<<<<< Searching for Lily Chee (Name) >>>>>>>>>>");
        sortName(contact,1);
        test = binarySearchName(contact, "Lily Chee");
        if(test != -1)
            System.out.println("Found: \n" + contact[test]);
        else
            System.out.println("NOT found:\n Lily Chee" );        
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for Waldo (Name) >>>>>>>>>>");
        sortName(contact,1);
        test = binarySearchName(contact, "Waldo");
        if(test != -1)
            System.out.println("Found: \n" + contact[test]);
        else
            System.out.println("NOT found:\nWaldo");
        System.out.println();

        System.out.println("\n<<<<<<<<<< Searching for friends (Relationship) >>>>>>>>>>");
        sortRelation(contact,1);
        binarySearchRelation(contact, "friend");
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for son (Relationship) >>>>>>>>>>");
        sortRelation(contact,1);
        binarySearchRelation(contact, "son");
        System.out.println();

        System.out.println("\n<<<<<<<<<< Searching for birthdays in March (Bday) >>>>>>>>>>");
        findMonth(contact, "Mar ");
        System.out.println();

        System.out.println("\n<<<<<<<<<< Searching for birthdays in September (Bday) >>>>>>>>>>");
        findMonth(contact, "Sep ");
        System.out.println();


        System.out.println("\n<<<<<<<<<< Searching for 92126290 (Phone) >>>>>>>>>>");
        findPhone(contact,92126290);
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for 66639992 (Phone) >>>>>>>>>>");
        findPhone(contact,66639992);
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for shareeverything@gmail.com (Email) >>>>>>>>>>");
        findEmail(contact,"shareeverything@gmail.com");
        System.out.println();
        
        System.out.println("\n<<<<<<<<<< Searching for janedoe@gmail.com (Email) >>>>>>>>>>");
        findEmail(contact,"janedoe@gmail.com");
        System.out.println();

	}

}