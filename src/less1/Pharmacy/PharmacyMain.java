package lesson.src.less1.Pharmacy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {

    public static void main(String[] args) {
        Component penicillin = new Component("Penicillin", "10mg", 100);
        Component salt = new Component("Salt", "5mg", 10);
        Component sugar = new Component("Sugar", "30mg", 20);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponets(new Component[]{penicillin, salt});

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponets(new Component[]{penicillin, sugar});

        for (Component c: pharmacy2){
            System.out.println(c);
        }
//        System.out.println(pharmacy1);
//        Iterator<Component> iterator = pharmacy1;
//
//        while(iterator.hasNext()) {
//            System.out.println(pharmacy1.next());
//            System.out.println(iterator.next());
//        }

        List<Component> list = new ArrayList<>();
        list.add(salt);
        list.add(penicillin);
        list.add(sugar);
        Collections.sort(list);
        System.out.println(list);
    }
}
