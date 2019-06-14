import Utilities.LoadData;
import Utilities.Menu;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;

import java.io.IOException;
import java.util.InputMismatchException;


public class Principal {

    public static void main(String[] args) throws ValorNoExisteException, ListaVaciaException {

        try {
            LoadData.load();
            new Menu();
        } catch (InputMismatchException | ValorNoExisteException | IOException e){
            System.out.println("Ingrese una opcion valida");
            new Menu();
        }


    }
}
