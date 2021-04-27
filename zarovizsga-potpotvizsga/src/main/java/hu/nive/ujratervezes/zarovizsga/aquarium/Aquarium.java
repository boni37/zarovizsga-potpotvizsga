package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aquarium {

    List<Fish> fishes = new ArrayList<>();


    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish fish : fishes) {
            status.add(fish.toString());
        }
        return status;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish() {
        for (int i = 0; i < fishes.size(); i++) {
            if (fishes.get(i).getWeight() > 10) {
                fishes.remove(i);
            }
        }
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }
}
