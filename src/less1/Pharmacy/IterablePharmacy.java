package lesson.src.less1.Pharmacy;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterablePharmacy implements Iterable<Component> {
    private int index = 0;
    private final List<Component> components = new ArrayList();

    public IterablePharmacy() {
    }

    public void addComponets(Component... components) {
        if (components.length == 0) {
            System.out.println("You haven't added anything");
        } else {
            Collections.addAll(this.components, components);
        }

    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Component next() {
                return null;
            }
        };
    }

//    @Override                   // 1 способ
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }

}
