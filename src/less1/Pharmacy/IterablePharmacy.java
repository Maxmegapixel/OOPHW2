package lesson.src.less1.Pharmacy;



import java.util.*;


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
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

//    @Override                   // 1 способ
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }
    @Override
    public String toString() {
        return "IterablePharmacy{" +
                "index=" + index +
                ", components=" + components +
                '}';
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IterablePharmacy that = (IterablePharmacy) o;
        return index == that.index && Objects.equals(components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }

}
