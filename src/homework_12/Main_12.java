package homework_12;

import java.util.*;

public class Main_12 {
    public static void main(String[] args) {

       Commodity commodity1 = new Commodity("P", 1455);
       Commodity commodity2 = new Commodity("P", 23);
       Commodity commodity3 = new Commodity("B", 798);

       hashSet(commodity1,commodity2,commodity3);
       linkedHashSet(commodity1,commodity2,commodity3);
       treeSet(commodity1,commodity2,commodity3);
    }

    public static void hashSet(Commodity c1, Commodity c2, Commodity c3){
        Set <Commodity> hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);

        System.out.println("HashSet:");
        for(Commodity commodity: hashSet){
            System.out.println(commodity.toString());
        }

        List<Commodity> sortedHashSet = new ArrayList<>(hashSet);
        Collections.sort(sortedHashSet);

        System.out.println("Sorted HashSet:");
        for(Commodity commodity: sortedHashSet){
            System.out.println(commodity.toString());
        }
        System.out.println();
    }

    public static void linkedHashSet(Commodity c1, Commodity c2, Commodity c3){
        Set <Commodity> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(c1);
        linkedHashSet.add(c2);
        linkedHashSet.add(c3);

        System.out.println("LinkedHashSet:");
        for(Commodity commodity: linkedHashSet){
            System.out.println(commodity.toString());
        }

        List<Commodity> sortedLinkedHashSet = new ArrayList<>(linkedHashSet);
        Collections.sort(sortedLinkedHashSet);

        System.out.println("Sorted LinkedHashSet:");
        for(Commodity commodity: sortedLinkedHashSet){
            System.out.println(commodity.toString());
        }
        System.out.println();
    }

    public static void treeSet(Commodity c1, Commodity c2, Commodity c3){
        Set <Commodity> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);

        System.out.println("TreeSet:");
        for(Commodity commodity: treeSet){
            System.out.println(commodity.toString());
        }
    }
}
