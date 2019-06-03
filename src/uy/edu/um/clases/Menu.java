package uy.edu.um.clases;

import java.util.Scanner;

public class Menu{

    public void displayMenu(){
        System.out.println ( "1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n5) Question 5\n6) EXIT" );
        System.out.print ( "Selection: " );
    }

    public  Menu() {
        Scanner in = new Scanner ( System.in );

        displayMenu();
        switch ( in.nextInt() ) {
            case 1:
                System.out.println ( "result 1" );
                new Menu();
                break;
            case 2:
                System.out.println ( "result 2" );
                new Menu();
                break;
            case 3:
                System.out.println ( "result 3" );
                new Menu();
                break;
            case 4:
                System.out.println ( "result 4" );
                new Menu();
                break;
            case 5:
                System.out.println ( "result 5" );
                new Menu();
                break;
            case 6:
                break;

            default:
                System.err.println ( "Ingrese una opcion Valida" );
                new Menu();
                break;
        }
    }
}
