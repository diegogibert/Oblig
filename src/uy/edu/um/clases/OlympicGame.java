package uy.edu.um.clases;

public class OlympicGame {

    private String name;
    private int year;
    private SeasonType season;

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
}
