package lesson.src.less1.Pharmacy;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String toString() {
        return "Component{name='" + this.name + "', weight='" + this.weight + "', power=" + this.power + "}";
    }
}
