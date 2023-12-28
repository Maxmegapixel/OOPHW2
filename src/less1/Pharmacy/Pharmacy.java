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
    @Override
    public boolean hasNext() {
        return index < components.size();
    }
    @Override
    public Component next() {
        return components.get(this.index++);
    }
}