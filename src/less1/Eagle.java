package less1;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flieble, Goable{
    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 50.0;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }
}
