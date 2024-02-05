public class Exercise2_4 {
    
    public static void main(String args[]) {
	
        for ( int k = 0 ; k < 4 ; k++ ) {

	    for ( int i = 9 ; i > 0 ; i-- ) {

		for ( int j = i ; j > 0 ; j-- ) {

		    String i_str = "";

		    if ( i == 1 ) {

			switch (k+1) {

			case 1 -> i_str = "One" ;

			case 2 -> i_str = "Two" ;

			case 3 -> i_str = "Three" ;

			case 4 -> i_str = "Four" ;

			}

		    } else {

			i_str = String.valueOf(i);

		    }

		    System.out.print(i_str);

		}
	    
	    }

	    System.out.println();

	}
    }

}
