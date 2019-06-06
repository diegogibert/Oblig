package uy.edu.um.prog2.tad.linkedList;

public class ListaEnlazada<T> implements Lista<T> {
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
            if(nodoActual.getSiguiente() == null){
                nodoActual.setSiguiente(newNodo);
            }
        }
        size++;
    }

    public void remove(int position) {
        Nodo<T> actualNode = primero;
        if(size != 0 && position == 0){
            primero = actualNode.getSiguiente();
            size--;
        }
        if(0 < position && position < size){
            for(int i = 0; i < position-1; i++){
                actualNode = actualNode.getSiguiente();
            }
            actualNode.setSiguiente((actualNode.getSiguiente()).getSiguiente());
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

    public boolean existeElemento(T value){
        boolean exist = true;
        Nodo<T> nodoActual = primero;
        while(!value.equals(nodoActual.getValue()) && nodoActual.getSiguiente() !=null){
            nodoActual=nodoActual.getSiguiente();
        }
        if(!value.equals(nodoActual.getValue())){
            exist = false;
        }
        return exist;
    }
}
