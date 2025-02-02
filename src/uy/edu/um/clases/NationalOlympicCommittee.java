package uy.edu.um.clases;

import java.util.Objects;

public class NationalOlympicCommittee {

    private String noc;
    private String region;
    private int medallaOro = 0;
    private int medallaPlata = 0;
    private int medallaBronce = 0;

    public NationalOlympicCommittee( String noc, String region) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NationalOlympicCommittee that = (NationalOlympicCommittee) o;
        return Objects.equals(noc, that.noc) &&
                Objects.equals(region, that.region);
    }

}
