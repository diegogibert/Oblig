import Utilities.LoadData;
import Utilities.Menu;
import java.util.InputMismatchException;


public class Principal {

    public static void main(String[] args) {

        try {
            LoadData.load();
            new Menu();
        } catch (InputMismatchException e){
            System.out.println("Ingrese una opcion valida");
            new Menu();
        }


    }
}
