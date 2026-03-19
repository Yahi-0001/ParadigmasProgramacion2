package org.example.iteratorBasics;

/*
* No tenemos la variable filmVector
* */
public class Main {
    public static void main(String[] args) {

        // Agregamos la variable filmVector creamos un array con 10 espacios
        Film[] filmVector = new Film[10];

        // Se crea una colección, entregando el array
        var myCol = new MyMarvelCollection(filmVector);

        // Con el metodo add se agrega cada pelicula en el array
        myCol.add (new Film ("Ironman", 2008));
        myCol.add (new Film ("Captain America", 2010));
        myCol.add (new Film ("The Avengers", 2012));


        //Se crea un objeto apuntando al inicio en -1
        var iterator = myCol.iterator ();

        //Preguntamos si hay algo adelante
        while (iterator.hasNext ()) {
            //se mueve, imprime información y espera la instruccion
            System.out.println (iterator.next ());
        }

        // para este proceso agregamos a la clase implements Iterable
        //Preguntamos si es una coleccion y entregamos un objeto e imprimimos los datos
        for (var film: myCol) {
            System.out.println (film);
        }

    }
}