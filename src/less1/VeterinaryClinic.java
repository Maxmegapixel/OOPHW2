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
    public List<Flieble> getFliebles() {
        List<Flieble> result = new ArrayList<>(pacients.size());
        for (Animal animal: pacients) {
            if(animal instanceof Flieble) {
                result.add((Flieble) animal);
            }
        }
        return result;
    }
    public List<Swimble> getSwimbles() {
        List<Swimble> result = new ArrayList<>(pacients.size());
        for (Animal animal: pacients) {
            if(animal instanceof Swimble) {
                result.add((Swimble) animal);
            }
        }
        return result;
    }
    public void appointment(Doctor doctor, Animal animal){
        doctor.equals(animal);
        doctor.diagnosis(animal);
        doctor.medications(animal);

    }



}
