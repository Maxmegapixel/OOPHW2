package lesson.src.less1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static final LocalDate LocalDate = null;

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
                new ArrayList<>(), "Chumka", "Boss", 4);
//        System.out.println(barsik);
//        System.out.println(barsik.getLegsCount());
        Animal sharik = new Dog("Sharik", LocalDate.of(2002, 1, 12),
                new ArrayList<>(), "Chumka", "Boss");
        Animal bubble = new Fish("Bubble", LocalDate.of(2012, 12, 2),
                new ArrayList<>(), "Chumka", "Boss");
        Animal claw = new Eagle("Claw", LocalDate.of(2023, 1, 12),
                new ArrayList<>(), "Chumka", "Boss");
        Animal donald = new Duck("Donald", LocalDate.of(2012, 12, 2),
                new ArrayList<>(), "Chumka", "Boss");
        Doctor aibolit = new Doctor("Aibolit", LocalDate.of(2023, 1, 12), "surgeon", 'm', "surgery");
        VeterinaryClinic app1 = new VeterinaryClinic();
        app1.appointment(aibolit, barsik);
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPacients(barsik, sharik, bubble, claw, donald);
        System.out.println(clinic.getPacients());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFliebles());
        System.out.println(clinic.getSwimbles());

    }
}

