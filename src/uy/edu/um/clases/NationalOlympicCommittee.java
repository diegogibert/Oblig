package uy.edu.um.clases;

public class NationalOlympicCommittee {

    private String noc;
    private String region;


    public NationalOlympicCommittee(String noc, String region) {
        this.noc = noc;
        this.region = region;
    }

    public String getNoc() {
        return noc;
    }

    public String getRegion() {
        return region;
    }
}
