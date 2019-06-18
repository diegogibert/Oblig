package uy.edu.um.clases;

import java.util.ArrayList;

public class Athlete {

    private int id;
    private String name;
    private SexType sex;
    private int age;
    private float height;
    private float weight;
    private NationalOlympicCommittee NOC;
    private ArrayList<AthleteOlympicParticipation> atleteOP = new ArrayList<>();
    private int oros = 0;
    private int platas = 0;
    private int broonces = 0;


    public Athlete(int id, String name, SexType sex, int age, float height, float weight) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public ArrayList<AthleteOlympicParticipation> getAtleteOP() {
        return atleteOP;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SexType getSex() {
        return sex;
    }

    public NationalOlympicCommittee getNOC() {
        return NOC;
    }

    public void setNOC(NationalOlympicCommittee NOC) {
        this.NOC = NOC;
    }

    public int getOros() {
        return oros;
    }

    public void setOros(int oros) {
        this.oros = oros;
    }

    public int getPlatas() {
        return platas;
    }

    public void setPlatas(int platas) {
        this.platas = platas;
    }

    public int getBroonces() {
        return broonces;
    }

    public void setBroonces(int broonces) {
        this.broonces = broonces;
    }
}
