import Utilities.LoadData;
import Utilities.Menu;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;

import java.io.IOException;
import java.util.InputMismatchException;


public class Principal {
    private static boolean finished;

    public static void main(String[] args) throws ValorNoExisteException, ListaVaciaException, InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LoadData.load();

                    synchronized (Principal.class) {
                        finished = true;
                    }
                } catch (NullPointerException | ValorNoExisteException | IOException | ListaVaciaException e) {
                   e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                Menu menu = new Menu();
                menu.displayMenu();

                try {
                    while (true) {
                        synchronized (Principal.class) {
                            if (!finished) {
                                System.out.print("Esperando... ");

                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else break;
                        }
                    }
                    System.out.println(" ");
                    System.out.println("Selection:");
                    menu.selection();

                } catch (InputMismatchException | ValorNoExisteException | ListaVaciaException e) {
                    System.out.println("Ingrese una opcion valida");
                    try {
                        new Menu();
                        menu.selection();
                    } catch (ValorNoExisteException | ListaVaciaException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });
        thread.start();
        thread2.start();
        thread.join();


    }
}
