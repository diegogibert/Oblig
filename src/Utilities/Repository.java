package Utilities;


import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;

public class Repository {

    protected static HeapMax medallasNoc = new HeapMax(1000000);
    protected static HeapMax medallasOro = new HeapMax(1000000);
    protected static HeapMax medallasPlata = new HeapMax(230);
    protected static HeapMax medallasBronce = new HeapMax(230);
    protected static HeapMax medallasTotales = new HeapMax(230);

    public static void preg2() throws ValorNoExisteException, ListaVaciaException {
        //Iterar sobre el hash sumar las medallas del atleta y poner en un heap
    }



}
