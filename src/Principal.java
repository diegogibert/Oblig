import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;
import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import Utilities.LoadData;
import Utilities.Menu;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static uy.edu.um.clases.SexType.valueOf;

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
