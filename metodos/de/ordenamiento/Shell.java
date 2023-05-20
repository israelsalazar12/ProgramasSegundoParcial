package metodos.de.ordenamiento;

public class Shell {

    public static void shell(int[] arreglo) {
        int salto, aux, i;
        boolean cambios;

        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < arreglo.length; i++) {
                    if (arreglo[i - salto] > arreglo[i]) {
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
}

//int tamaño = arreglo.length;
//      for (int minina = tamaño / 2; minina > 0; minina /= 2) {
//        for (int i = minina; i < tamaño; i += tamaño) {
//          int temp = arreglo[i];
//        int j;
//      for (j = i; j >= minina && arreglo[j - minina] > temp; j -= minina) {
//    }
//  arreglo[j] = temp;
//}
//}

    //}
