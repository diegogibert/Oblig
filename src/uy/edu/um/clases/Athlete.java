package uy.edu.um.clases;

public class Athlete {

    private long id;
    private String name;
    private SexType sex;
    private float height;
    private float weight;

    public Athlete(long id, String name, SexType sex, float height, float weight) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
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
}
