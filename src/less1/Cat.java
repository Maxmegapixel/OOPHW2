package lesson.src.less1;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable{// extends расширяет класс (Cat класс наследник класса Animal)
// implements (наследник интерфейса Goable)
    private int legsCount; // количество лап


    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);//вызывает конструктор из энимал
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }


    @Override
    public double run() {
        System.out.printf("%s going", type); //
        return 20.0;
    }
}
