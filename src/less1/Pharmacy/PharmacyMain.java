package lesson.src.less1.Pharmacy;


import java.util.Iterator;

public class PharmacyMain {

    public static void main(String[] args) {
        Component penicillin = new Component("Penicillin", "10mg", 100);
        Component salt = new Component("Salt", "5mg", 10);
        Component sugar = new Component("Sugar", "30mg", 20);
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponets(new Component[]{penicillin, salt});
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponets(new Component[]{penicillin, sugar});
        System.out.println(pharmacy1);
        Iterator<Component> iterator = pharmacy1;

        while(iterator.hasNext()) {
            System.out.println(pharmacy1.next());
            System.out.println(iterator.next());
        }

    }
}
