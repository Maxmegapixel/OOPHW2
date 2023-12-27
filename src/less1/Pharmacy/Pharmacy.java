package lesson.src.less1.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private int index = 0;
    private final List<Component> components = new ArrayList();

    public Pharmacy() {
    }

    public void addComponets(Component... components) {
        if (components.length == 0) {
            System.out.println("You haven't added anything");
        } else {
            Collections.addAll(this.components, components);
        }

    }

    public boolean hasNext() {
        return this.index < this.components.size();
    }

    public Component next() {
        return (Component)this.components.get(this.index++);
    }
}