package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short term memory loss: " + hasMemoryLoss();
    }

    public int feed() {
        return getWeight() + 2;
    }


    public boolean hasMemoryLoss() {
        return false;
    }
}
