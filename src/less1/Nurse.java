package lesson.src.less1;

import java.time.LocalDate;

public class Nurse extends Staff {

    private String assingDoctor;

    public Nurse(String name, LocalDate birthDate, String position, char gender, String assingDoctor) {
        super(name, birthDate, position, gender);
        this.assingDoctor = assingDoctor;
    }

    public void injections (Animal animal) {  // ������ ����
        System.out.printf("%s make injections %s", type, animal);
    }


}
