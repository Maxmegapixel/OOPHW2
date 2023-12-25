package less1;

import java.time.LocalDate;

public class Doctor extends Staff {


    private String specialization;

    public Doctor(String name, LocalDate birthDate, String position, char gender, String specialization) {
        super(name, birthDate, position, gender);
        this.specialization = specialization;
    }


    public void exams(Animal animal) {  // проводит осмотр

        System.out.printf("%s examing pacient %s", type, animal);

    }
    public void medications(Animal animal) {  // назначает лекарства
        System.out.printf("%s prescribe medications %s", type, animal);
    }
    public void diagnosis(Animal animal) {  // ставит диагноз
        System.out.printf("%s make diagnosis %s", type, animal);
    }

}
