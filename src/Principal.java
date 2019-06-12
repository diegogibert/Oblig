import Utilities.LoadData;
import Utilities.Menu;
import double_linked_list.ValorNoExisteException;

import java.util.InputMismatchException;


public class Principal {

    public static void main(String[] args) throws ValorNoExisteException {

        try {
            LoadData.load();
            new Menu();
        } catch (InputMismatchException | ValorNoExisteException e){
            System.out.println("Ingrese una opcion valida");
            new Menu();
        }


    }
}
