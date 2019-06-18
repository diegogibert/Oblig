package uy.edu.um.clases;

import java.util.Objects;

public class OlympicGame {

    private String name;
    private int year;
    private SeasonType season;
    int cantidadDeAtletasFemeninos;
    int cantidadDeAtletasMasculinos;
    int cantidadDeAtletasOtros;

    public OlympicGame(String name, int year, SeasonType season) {
        this.name = name;
        this.year = year;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public SeasonType getSeason() {
        return season;
    }

    public int getCantidadDeAtletasFemeninos() {
        return cantidadDeAtletasFemeninos;
    }

    public void setCantidadDeAtletasFemeninos(int cantidadDeAtletasFemeninos) {
        this.cantidadDeAtletasFemeninos = cantidadDeAtletasFemeninos;
    }

    public void setCantidadDeAtletasMasculinos(int cantidadDeAtletasMadculinos) {
        this.cantidadDeAtletasMasculinos = cantidadDeAtletasMadculinos;
    }

    public void setCantidadDeAtletasOtros(int cantidadDeAtletasOtros) {
        this.cantidadDeAtletasOtros = cantidadDeAtletasOtros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OlympicGame that = (OlympicGame) o;
        return year == that.year &&
                Objects.equals(name, that.name) &&
                season == that.season;
    }


}
