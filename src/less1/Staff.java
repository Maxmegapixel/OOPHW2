package less1;

import java.time.LocalDate;

public abstract class Staff {
    protected String name;
    protected LocalDate birthDate;
    protected String position;
    protected char gender;
    protected String type;

    public Staff(String name, LocalDate birthDate, String position, char gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.position = position;
        this.gender = gender;
        this.type = getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", position='" + position + '\'' +
                ", gender=" + gender +
                ", type='" + type + '\'' +
                '}';
    }
}
