public class Exercise2_3 {
    public static void main(String args[]) {
        for ( int k = 0 ; k < 4 ; k++ ) {

	    for ( int i = 9 ; i >= 0 ; i-- ) {

		for ( int j = i ; j > 0 ; j-- ) {

		    String i_str = "";

		    if ( i > 1 ) {

			i_str = Integer.toString(i);

		    } else {

			i_str = "One";

		    }

		    System.out.print(i_str);

		}
	    
	    }

	    System.out.println();

	}
    }

}
