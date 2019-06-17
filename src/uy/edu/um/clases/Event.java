package uy.edu.um.clases;

import java.util.Objects;

public class Event {

    private String name;
    private int cantidadMujeres;
    private int cantidadHombres;

    public int getCantidadMujeres() {
        return cantidadMujeres;
    }

    public int getCantidadHombres() {
        return cantidadHombres;
    }

    public void setCantidadMujeres(int cantidadMujeres) {
        this.cantidadMujeres = cantidadMujeres;
    }

    public void setCantidadHombres(int cantidadHombres) {
        this.cantidadHombres = cantidadHombres;
    }

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name);
    }


}
