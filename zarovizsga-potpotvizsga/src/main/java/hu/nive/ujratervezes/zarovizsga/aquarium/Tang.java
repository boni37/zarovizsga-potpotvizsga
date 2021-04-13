package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish {

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short term memory loss: " + hasMemoryLoss();
    }

    public int feed() {
        return getWeight() + 1;
    }

    public boolean hasMemoryLoss() {
        return true;
    }
}