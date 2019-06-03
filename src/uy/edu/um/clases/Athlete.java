package uy.edu.um.clases;

public class Athlete {

    private long id;
    private String name;
    private SexType sex;
    private int age;
    private float height;
    private float weight;
    private NationalOlympicCommittee NOC;
    int BronzeMedals=0;
    int SilverMedals=0;
    int GoldMedals=0;

    public Athlete(long id, String name, SexType sex, int age, float height, float weight, NationalOlympicCommittee NOC) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age=age;
        this.height = height;
        this.weight = weight;
        this.NOC=NOC;
    }


    public NationalOlympicCommittee getNOC() {
        return NOC;
    }

    public int getBronzeMedals() {
        return BronzeMedals;
    }

    public int getSilverMedals() {
        return SilverMedals;
    }

    public int getGoldMedals() {
        return GoldMedals;
    }

    public void setBronzeMedals(int bronzeMedals) {
        BronzeMedals = bronzeMedals;
    }

    public void setSilverMedals(int silverMedals) {
        SilverMedals = silverMedals;
    }

    public void setGoldMedals(int goldMedals) {
        GoldMedals = goldMedals;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SexType getSex() {
        return sex;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
