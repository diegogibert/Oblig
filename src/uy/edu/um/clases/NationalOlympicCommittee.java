package uy.edu.um.clases;

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


}
