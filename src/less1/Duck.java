package lesson.src.less1;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flieble, Goable, Swimble{
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 30;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 10.0;
    }
}
