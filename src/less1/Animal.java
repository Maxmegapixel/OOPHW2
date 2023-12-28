package lesson.src.less1;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;// protected - видны также в классах наследниках
    protected LocalDate birthDate;  // сосотояние это поле
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
        this.type = getClass().getSimpleName();//получение названия класса
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public List<String> getVaccinations() {
        return vaccinations;
    }
    public String getIllness() {
        return illness;
    }
    public String getOwner() {  // поведение это метод
        return owner;
    }

    protected void wakeup() {
        System.out.println("Animal is wakeup!");
    }

    private void wakeup(int time) { // Перегрузка
        System.out.println("Animal is wakeup in " + time);
    }

    protected void eat() {
        System.out.println("Animal eat");
    }

    protected void play() {
        System.out.println("Animal played");
    }

    protected void sleep() {
        System.out.println("Animal slipping");
    }

//    protected void toGo() {
//        System.out.println("Animal goes");
//    }

//    protected void swim() {
//        System.out.println("Animal swims");
//    }
//    protected void fly() {
//        System.out.println("Animal flies");
//    }

//    public abstract void lifeCycle();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

