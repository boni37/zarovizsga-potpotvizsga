package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    String name;
    int weight;
    String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    abstract String status();

    abstract int feed();


}
