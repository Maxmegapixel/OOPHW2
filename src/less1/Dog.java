package lesson.src.less1;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimble {
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);//вызывает конструктор из энимал

    }


    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 30.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 10.0;
    }
}
