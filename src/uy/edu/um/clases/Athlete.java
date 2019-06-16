package uy.edu.um.clases;

public class Athlete {

    private long id;
    private String name;
    private SexType sex;
    private int age;
    private float height;
    private float weight;
    private NationalOlympicCommittee NOC;


    public Athlete(long id, String name, SexType sex, int age, float height, float weight) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age=age;
        this.height = height;
        this.weight = weight;
    }


    public NationalOlympicCommittee getNOC() {
        return NOC;
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
