package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		if(args.length == 0){
			System.out.println( "Welcome SIN NOMBRE"  );
		}else {
			System.out.println( "Welcome " + args[0] +"!"  );
		}
    }
}
