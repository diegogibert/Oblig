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
    private int totales = 0;
    private int lastMedalGold = 0;
    private int firstMedalGold = 0;
    private int lastMedalSilver = 0;
    private int firstMedalSilver = 0;
    private int lastMedalBronze = 0;
    private int firstMedalBronze = 0;
    private int lastMedalTotal = 0;
    private int firstMedalTotal = 0;
    private boolean agregado = false;

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

    public void setAtleteOP(ArrayList<AthleteOlympicParticipation> atleteOP) {
        this.atleteOP = atleteOP;
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

    public int getTotales() {
        return totales;
    }

    public void setTotales(int totales) {
        this.totales = totales;
    }

    public int getLastMedalGold() {
        return lastMedalGold;
    }

    public void setLastMedalGold(int lastMedalGold) {
        this.lastMedalGold = lastMedalGold;
    }

    public int getFirstMedalGold() {
        return firstMedalGold;
    }

    public void setFirstMedalGold(int firstMedalGold) {
        this.firstMedalGold = firstMedalGold;
    }

    public int getLastMedalSilver() {
        return lastMedalSilver;
    }

    public void setLastMedalSilver(int lastMedalSilver) {
        this.lastMedalSilver = lastMedalSilver;
    }

    public int getFirstMedalSilver() {
        return firstMedalSilver;
    }

    public void setFirstMedalSilver(int firstMedalSilver) {
        this.firstMedalSilver = firstMedalSilver;
    }

    public int getLastMedalBronze() {
        return lastMedalBronze;
    }

    public void setLastMedalBronze(int lastMedalBronze) {
        this.lastMedalBronze = lastMedalBronze;
    }

    public int getFirstMedalBronze() {
        return firstMedalBronze;
    }

    public void setFirstMedalBronze(int firstMedalBronze) {
        this.firstMedalBronze = firstMedalBronze;
    }

    public int getLastMedalTotal() {
        return lastMedalTotal;
    }

    public void setLastMedalTotal(int lastMedalTotal) {
        this.lastMedalTotal = lastMedalTotal;
    }

    public int getFirstMedalTotal() {
        return firstMedalTotal;
    }

    public void setFirstMedalTotal(int firstMedalTotal) {
        this.firstMedalTotal = firstMedalTotal;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }
}
