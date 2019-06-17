package Utilities;

import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;

import java.util.Scanner;

public class Menu {

    public void displayMenu() {
        System.out.println(" ");
        System.out.println("--------------------Menu Principal--------------------");
        System.out.println("1) Indicar el top 10 de atletas que consiguieron la mayor cantidad de medallas en la historia de los juegos");
        System.out.println(" ");
        System.out.println("2) Indicar el top 10 de regiones que consiguieron la mayor cantidad de medallas en la historia de los juegos.");
        System.out.println(" ");
        System.out.println("3)Indicar el top 10 de ediciones de los juegos olímpicos donde se tuvo mayor participación de atletas femeninos. ");
        System.out.println(" ");
        System.out.println("4) Indicar las 5 competiciones donde se presentan la mayor cantidad de atletas de cierto sexo. ");
        System.out.println(" ");
        System.out.println("5) Indicar los 5 equipos mas efectivos entre un rango de años ");
        System.out.println(" ");
        System.out.println("6) Exit ");
        System.out.println(" ");

    }

    public Menu() {

    }

    public void selection() throws ValorNoExisteException, ListaVaciaException {
        Scanner in = new Scanner(System.in);

        switch (in.nextInt()) {
            case 1:
                Questions.Question1();
                displayMenu();
                selection();
                break;
            case 2:
                System.out.println("result 2");
                displayMenu();
                selection();
                break;
            case 3:
                Questions.Question3();
                displayMenu();
                selection();
                break;
            case 4:
                Questions.Question4();
                displayMenu();
                selection();
                break;
            case 5:
                Questions.Question5();
                displayMenu();
                selection();
                break;
            case 6:
                break;

            default:
                System.err.println("Ingrese una opcion Valida");
                displayMenu();
                selection();
                break;

        }
    }
}
