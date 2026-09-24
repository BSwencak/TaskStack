import Layout.*;

import java.util.ArrayList;

public class TestInheritInterface {

    public static void main (String[] args){
        testClassHierarchy();
        testInterface();
    }

    public static void testClassHierarchy(){
        GridLayout gl1 = new GridLayout("First", "Grid", 3,5);
        ListLayout ll1 = new ListLayout("Second","List", "Vertical");
        GridLayout gl2 = new GridLayout("Third", "Grid", 8,2);
        ListLayout ll2 = new ListLayout("Fourth","List", "Horizontal");

        ArrayList<Layout> layouts = new ArrayList<>();
        layouts.add(gl1);
        layouts.add(ll1);
        layouts.add(gl2);
        layouts.add(ll2);

        for(Layout i:layouts){
            System.out.println(i.toString());
            i.display();
        }
    }

    public static void testInterface(){
        Calendar c = new Calendar("24","September","2026","Weekly","All");
        Task t = new Task("Math Homework","Finish problems 1-12","Description of Math Homework","09-24-2026","HIGH","Calc 100","Math Notes");
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(c);
        printables.add(t);
        for (Printable p: printables){
            p.printSetup();
            p.print();
        }
    }

}
