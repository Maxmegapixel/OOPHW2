package less1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> pacients = new ArrayList<>();

    public void addPacient(Animal animal) {
        pacients.add(animal);
    }

    public void addPacients(Animal ... animals) {
        Collections.addAll(pacients, animals);
    }

    public List<Animal> getPacients() {
        return pacients;
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(pacients.size());
        for (Animal animal: pacients) {
            if(animal instanceof Goable) {
                result.add((Goable) animal);
            }
        }
        return result;
    }

}
