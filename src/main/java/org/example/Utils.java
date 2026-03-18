package org.example;

public class Utils {

    //Restricción para que solo acepte números
    public static <T extends Number & Comparable<T>> T[] ordena(T[] vector){
        // Buena práctica, por si el array esta vaccio
        if (vector == null || vector.length == 0){
            return vector;
        }

        // Creamos una copia del vector
        T[] resultado = vector.clone();
        /* Le pasamos al metodo la copia del resultado, indice donde empieza el
        arreglo y el indice donde termina el arreglo */
        quickSort(resultado, 0, resultado.length - 1);
        return resultado;
    }

    /* Esta es la parte recursiva, tenemos nuestro caso base
    low = indice del primer elemento
    high = indice del ultimo elemento

    si low llega a se <= que high significa que nuestro sub-arreglo tiene un solo elemento o ninguno
    y se detiene porque se considera ordenado

    pi = punto de particion del array acomoda el pivote en el lugar correcto y devuelve su posicion

    quickSort(arr, low, pi - 1); ordenamos el lado izquierdo los numeros mas pequeños

    quickSort(arr, pi + 1, high); ordenamos el lado derecho el lado de los mayores
    * */
    private static <T extends Number & Comparable<T>> void quickSort(T[] arr, int low, int high ){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static <T extends Number & Comparable<T>> int partition(T[] arr, int low, int high){

        //elegimos el pivote y el indice
        T pivot = arr[high];
        int i = (low - 1);

        /* utilizamos compareTo porque no podemos utilizar < con objetos T
        si el resultado es cero o negativo significa que el numero es menos o igual al pivote.

        si es menor movemos i a un lugar a la derecha y hacemos un swap
        * */
        for (int j = low; j < high; j++){
            if(arr[j].compareTo(pivot) <= 0){
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /* se utiliza para saber donde esta el pivote y hacer la particion sabemos que los numeros mayores
        estan en i + 1 en adelante y que los menores estan entre low e i, devolvemos la posicion del pivote
        y ya sabemos donde dividir.
        * */
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

/* QUICKSORT
*
* proceso:
*
* [101, 99, 12, 19, 21, 111, 345, 25, 77, 81]
* pivot 81
*
* 101 <= 81 Falso jajajjaa no hace nada
* 99 <= 81 Falso no hace nada
* 12 <= 81 verdadero aumentamos i de -1 a 0 intercambiamos 101 con 12
* 19 <= 81 verdadero aumentamos i de 0 a 1 intercambiamos 99 con 19
* 21 <= 81 verdadero aumentamos i de 1 a 2 intercambiamos 101 con 21
* 111 <= 81 falso no hace nada
* 345 <= 81 falso no hace nada
* 25 <= 81  verdadero aumentamos i de 2 a 3 intercambiamos 99 con 25
* 77 <= 81 verdadero aumentamos i de 3 a 4 intercambiamos 101 con 77*
*
* Al salir del bucle el pivote se coloca después del último número menor encontrado *
*  [12, 19, 21, 25, 77] [81, 345, 99, 101, 111]  */

