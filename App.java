package za.ac.cput.projects;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    static Scanner console = new Scanner(System.in);
    public static void main( String[] args )

    {
        int radius;
        double area;

        //User input
        System.out.print( "Please enter radius: " );
        String input = console.next();
        radius = Integer.parseInt(input);

        //processing
        area = Math.PI * Math.pow(radius, 2);

        //output
        System.out.println("The area is: " + area);
    }
}
