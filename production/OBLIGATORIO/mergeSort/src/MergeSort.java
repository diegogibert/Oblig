public class MergeSort {

    public static int[] mergeSortImpl(int[] vector) {
        if (vector.length <= 1) {
            return vector;
        }
        int mitad = (vector.length / 2);
        int[] mitadIzquierda = new int[mitad];
        for (int i = 0; i < mitad; i++) {
            mitadIzquierda[i] = vector[i];
        }
        int[] mitadDerecha = new int[vector.length - mitad];
        for (int i = 0; i < vector.length - mitad; i++) {
            mitadDerecha[i] = vector[mitad + i];
        }
        int[] izquierdaOrdenada = mergeSortImpl(mitadIzquierda);
        int[] derechaOrdenada = mergeSortImpl(mitadDerecha);
        int i = 0;
        int j = 0;
        int[] vectorOrdenado = new int[izquierdaOrdenada.length + derechaOrdenada.length];

        while (i + j < izquierdaOrdenada.length + derechaOrdenada.length) {
            if (i == izquierdaOrdenada.length) {
                vectorOrdenado[i + j] = derechaOrdenada[j];
                j++;
                continue;
            }
            if (j == derechaOrdenada.length) {
                vectorOrdenado[i + j] = izquierdaOrdenada[i];
                i++;
                continue;
            }
            int elementoIzquierdo = izquierdaOrdenada[i];
            int elementoDerecho = derechaOrdenada[j];
            if (elementoIzquierdo <= elementoDerecho) {
                vectorOrdenado[i + j] = elementoIzquierdo;
                i++;
            } else {
                vectorOrdenado[i + j] = elementoDerecho;
                j++;
            }
        }
        return vectorOrdenado;
    }
}
