package org.example.iteratorBasics;

// definir comportamiento de colección


import java.util.Iterator;

public class MyMarvelCollection implements Iterable<Film> {

    private Film[] films;
    private int count;

    public MyMarvelCollection(Film[] filmVector){
        this.films = filmVector;
        this.count = 0;
    }

    public void add(Film film){
        if(count < films.length){
            films[count] = film;
            count++;
        }
    }

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


