 
package selfdefine;

public class Syso {
	public static boolean cancelIt = false;

	public static void o() {
		if (cancelIt == false)
			System.out.println( );
		else if (cancelIt == true)
			System.out.println( );
	}
	
	public static void o(String str) {
		if (cancelIt == false)
			System.out.println(str);
		else if (cancelIt == true)
			System.out.println("");
	}
	
	public static void o(Object object) {
		if (cancelIt == false)
			System.out.println( object.toString() );
		else if (cancelIt == true)
			System.out.println();
	}

}

