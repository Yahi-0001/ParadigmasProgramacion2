package org.example.iteratorBasics;

public class Film {

    private String title;
    private int year;

    public Film (String title, int year)
    {
        this.title = title;
        this.year = year;
    }

    // agregué el metodo toString para que los ciclos impriman bien los datos
    @Override
    public String toString(){
        return "Film:" + title + " "  + year;
    }

}