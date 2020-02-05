package things.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class add{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list);
    }
}
class get {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list.get(0));
    }
}
class set {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list);
        list.set(0, "Kamion");
        System.out.println(list);
    }
}
class remove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
class clear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
class size {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        System.out.println(list.size());
    }
}
class loop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Auto");
        list.add("Motorka");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (String i : list){
            System.out.println(i);
        }
    }
}
class integer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(20);
        list.add(10);
        list.add(15);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}