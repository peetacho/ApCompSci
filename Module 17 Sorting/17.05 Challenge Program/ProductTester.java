
/**
 * Purpose:
 *
 * @author Peter Chow
 * @version 05/03/20
 *
 */
public class ProductTester{

	// Insertion Sorting for PRICE
    public static Product[] sortPrice(Product[] source, int parameter){
    	Product[] dest = new Product[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Product next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
            	if(parameter == 1){
            		if(next.getPrice() > dest[k-1].getPrice() ){
                    	insertIndex = k;
                	}
                	else{
                    	dest[ k ] = dest[ k - 1 ];
                	}
                	k--;
            	}
            	else{
            		if(next.getPrice() < dest[k-1].getPrice() ){
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

    // Selection Sorting for NAME
    public static void sortName(Product[] source, int parameter){
        int i;
        int k;
        int posMax;
        Product temp;

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
        } 
    }

    // Merge Sorting for NUMBER
    public static void mergeSortNumber(Product[] a, int low, int high){
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortNumber( a, low, mid );       
        mergeSortNumber( a, mid + 1, high);   
                
        mergeNumber( a, low, mid, high);
    }

    public static void mergeNumber(Product[] a, int low, int mid, int high ){
        Product[] temp = new Product[ high - low + 1 ];

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
            else if( a[ i ].getNumber() < a[ j ].getNumber() )
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
		Product[] products = new Product[10];
		Product[] sorted = new Product[10];
		
		// Product(String name, int number, double price, int quanity)
		products[0] = new Product("Pet bed",103,59.99,12);
		products[1] = new Product("Sofa covers",144,19.99,59);
		products[2] = new Product("Jewelry",395,1399.99,10);
		products[3] = new Product("Razor",243,34.50,25);
		products[4] = new Product("Backpack",15,43.99,13);
		products[5] = new Product("Hoodie",201,20.59,10);
		products[6] = new Product("Clock",893,19.99,20);
		products[7] = new Product("Shoes",702,369.00,15);
		products[8] = new Product("Fan",190,250.75,5);
		products[9] = new Product("Fish Tank",135,560.00,3);

        System.out.println("\n             <<<< Before Sorting >>>>");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
        for(int i = 0; i < products.length; i++){
            System.out.println(products[i] );		
        }

        System.out.println("\n             <<<< After Sorting>>>>");
        System.out.println("<<<< by NAME in ascending order (SelectionSort) >>>>\n");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
		sortName(products,1);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(products[i] );		
        }

        System.out.println("\n             <<<< After Sorting>>>>");
        System.out.println("<<<< by NAME in descending order (SelectionSort) >>>>\n");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
		sortName(products,2);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(products[i] );		
        }

        System.out.println("\n             <<<< After Sorting>>>>");
        System.out.println("<<<< by NUMBER in ascending order (MergeSort) >>>>\n");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
		mergeSortNumber(products,0,9);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(products[i] );		
        }

        System.out.println("\n             <<<< After Sorting>>>>");
        System.out.println("<<<< by PRICE in ascending order (InsertionSort) >>>>\n");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
	    Product[] newPrice = sortPrice(products,1);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(newPrice[i] );		
        }

        System.out.println("\n             <<<< After Sorting>>>>");
        System.out.println("<<<< by PRICE in descending order (InsertionSort) >>>>\n");
        System.out.printf("%-15s%-10s%-10s%-10s%n","Product","Number","Price","Quantity");
        System.out.println("");
		newPrice = sortPrice(products,2);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(newPrice[i] );		
        }

    }
}