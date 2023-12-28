package lesson.src.less1.Pharmacy;

public class Component implements Comparable<Component> {
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

    @Override
    public int compareTo(Component o) {// для сорт
        return Integer.compare(this.power, o.power);
//        if (this.power > o.power) return -1;
//        if (this.power < o.power) return 1;
//        return 0;
    }
}
