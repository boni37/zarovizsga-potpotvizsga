package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    List<Fish> fishes = new ArrayList<>();


    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : fishes) {
            String record = fish.status();
            result.add(record);
        }
        return result;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish() {
        Iterator<Fish> itr = fishes.listIterator();
        while (itr.hasNext()) {
            if (itr.next().getWeight() > 10) {
                itr.remove();
            }
        }
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.weight = fish.feed();
        }
    }

}
