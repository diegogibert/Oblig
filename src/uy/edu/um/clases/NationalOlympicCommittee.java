package uy.edu.um.clases;

import java.util.ArrayList;

public class NationalOlympicCommittee {

    private String noc;
    private String region;
    private ArrayList<Athlete> atleta;
    private int medallaOro;
    private int medallaPlata;
    private int medallaBronce;

    public NationalOlympicCommittee(ArrayList<Athlete> atleta, String noc, String region) {
        this.atleta = atleta;
        this.noc = noc;
        this.region = region;
    }

    public String getNoc() {
        return noc;
    }

    public String getRegion() {
        return region;
    }

    public int getMedallaOro() {
        return medallaOro;
    }

    public void setMedallaOro(int medallaOro) {
        this.medallaOro = medallaOro;
    }

    public int getMedallaPlata() {
        return medallaPlata;
    }

    public void setMedallaPlata(int medallaPlata) {
        this.medallaPlata = medallaPlata;
    }

    public int getMedallaBronce() {
        return medallaBronce;
    }

    public void setMedallaBronce(int medallaBronce) {
        this.medallaBronce = medallaBronce;
    }

    public ArrayList<Athlete> getAtleta() {
        return atleta;
    }

    public void setAtleta(ArrayList<Athlete> atleta) {
        this.atleta = atleta;
    }
}
