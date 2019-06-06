package uy.edu.um.prog2.tad.linkedList;

public class ListaCircularDoble<T> implements Lista<T> {
    private Nodo<T> primero;
    private int size = 0;

    public int size(){
        return size;
    }
    public void add(T value) {
        Nodo<T> newNodo = new Nodo(value);
        if (primero == null){
            primero = newNodo;
            primero.setSiguiente(primero);
            primero.setPrevio(primero);
        }else{
           Nodo<T> nodoActual = primero;
           while (nodoActual.getSiguiente()!= primero){
               nodoActual = nodoActual.getSiguiente();
           }
           nodoActual.setSiguiente(newNodo);
           newNodo.setPrevio(nodoActual);
           newNodo.setSiguiente(primero);
           primero.setPrevio(newNodo);
        }
        size++;
    }

    public void remove(int position) {
        while(position <= size - 1) {
            Nodo<T> nodoActual = primero;
            Nodo<T> nodoAnterior = primero.getPrevio();
            if(size != 0 && position == 0){
                primero = nodoActual.getSiguiente();
                nodoActual.setPrevio(nodoAnterior);
            }
            if(0 < position && position < size -1){
                for(int i = 0; i < position-1; i++){
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoActual.setSiguiente((nodoActual.getSiguiente()).getSiguiente());
                nodoActual = nodoActual.getSiguiente();
                nodoActual.setPrevio(nodoActual.getPrevio().getPrevio());
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
        while ( nodoActual.getSiguiente() != primero && contador <= (position - 1)){
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        return nodoActual.getValue();
    }
}
