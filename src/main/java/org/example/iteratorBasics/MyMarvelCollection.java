package org.example.iteratorBasics;

// definir comportamiento de colección


import java.util.Iterator;

public class MyMarvelCollection implements Iterable<Film> {

    // creamos un array fijo  y un count para la posicion
    private Film[] films;
    private int count;

    // Constructor para contener los objetos
    public MyMarvelCollection(Film[] filmVector){
        this.films = filmVector;
        this.count = 0;
    }

    /* El metodo add recibe la pelicula, verifiamos que el array no este lleno
    * lo coloca en la posicion actual manteniendo orden en la insercion
    * */
    public void add(Film film){
        if(count < films.length){
            films[count] = film;
            count++;
        }
    }

    /* el metodo iterator crea un objeto para recorrer el array
    * con hasNext verificamos no pasarnos del numero de peliculas
    * con Next damos la pelicula actual y avanzamos a la siguiente posición
    * */
    @Override
    public Iterator<Film> iterator(){
        return new Iterator<Film>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public Film next() {
                return films[currentIndex++];
            }
        };
    }

}


