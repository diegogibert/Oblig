package uy.edu.um.prog2.tad.linkedList;

public class ListaDobleEnlazada<T> implements Lista<T> {
    private Nodo<T> primero;
    private int size = 0;

    public int size(){
        return size;
    }

    public void add(T value) {
        Nodo<T> newNodo = new Nodo(value);
        if(primero == null){
            primero = newNodo;
        }else {
            Nodo<T> nodoActual = primero;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }

            nodoActual.setSiguiente(newNodo);
            newNodo.setPrevio(nodoActual);
        }
        size++;
    }

    public void remove(int position) {
        Nodo<T> actualNode = primero;
        while(position <= size - 1) {
            if (size != 0 && position == 0) {
                primero = actualNode.getSiguiente();
            }
            if (0 < position && position < size - 1) {
                for (int i = 0; i < position - 1; i++) {
                    actualNode = actualNode.getSiguiente();
                }
                actualNode.setSiguiente((actualNode.getSiguiente()).getSiguiente());
                actualNode = actualNode.getSiguiente();
                actualNode.setPrevio(actualNode.getPrevio().getPrevio());
            }
            position = position + 2*size;
            size--;
        }


    }

    public T get(int position) {
        if(size <= position ){
            return null;
        }
        int contador = 0;
        Nodo<T> nodoActual = primero;
        while ( nodoActual.getSiguiente() != null && contador <= (position - 1)){
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        return nodoActual.getValue();
    }
}
