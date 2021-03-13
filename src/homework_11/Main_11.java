package homework_11;
import java.util.*;

public class Main_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Commodity> commodities = new ArrayList<>(Arrays.asList());

        menu();
        System.out.println("Enter number from menu:");
        int num = scanner.nextInt();

        while (num<10) {
            switch (num) {
                case 1: {
                    addCommodity(commodities);
                    show(commodities);
                }
                break;
                case 2: {
                    removeCommodity(commodities);
                    show(commodities);
                }
                break;
                case 3: {
                    changeCommodity(commodities);
                    show(commodities);
                }
                break;
                case 4:{
                    Collections.sort(commodities,new NameComperator());
                    show(commodities);
                }
                break;
                case 5:{
                    Collections.sort(commodities,new LengthComperator());
                    show(commodities);
                }
                break;
                case 6:{
                    Collections.sort(commodities,new WidthComperator());
                    show(commodities);
                }
                break;
                case 7:{
                    Collections.sort(commodities,new WeightComperator());
                    show(commodities);
                }
                break;
                case 8:{
                    System.out.println("Enter index:");
                    int index = scanner.nextInt();
                    System.out.println(commodities.get(index));
                }
                break;
                case 9: {
                    System.exit(0);
                }
            }
            System.out.println("Enter number from menu:");
            num = scanner.nextInt();
        }
    }

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1 - add new commodity");
        System.out.println("2 - delete commoduty");
        System.out.println("3 - change commodity");
        System.out.println("4 - sort by name");
        System.out.println("5 - sort by length");
        System.out.println("6 - sort by width");
        System.out.println("7 - sort by weight");
        System.out.println("8 - commodity with index i");
        System.out.println("9 - stop program");
    }

    public static void show(List<Commodity> commodities){
        ListIterator<Commodity> iterator = commodities.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public  static  Commodity someCommodity (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter length:");
        int length = scanner.nextInt();
        System.out.println("Enter width:");
        int width = scanner.nextInt();
        System.out.println("Enter weight:");
        int weight = scanner.nextInt();
        return new Commodity(name,length,width,weight);
    }

    public static void addCommodity(List<Commodity> commodities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Commodity> iterator = commodities.listIterator();

        System.out.println("Enter index:");
        int index = scanner.nextInt();

        if(commodities.isEmpty()){
            commodities.add(someCommodity());
        }
        else {
            while (iterator.hasNext()) {
                if (iterator.nextIndex() == index) {
                    iterator.add(someCommodity());
                }
                iterator.next();
            }
        }
    }

    public static void removeCommodity(List<Commodity> commodities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Commodity> iterator = commodities.listIterator();

        System.out.println("Enter index:");
        int index = scanner.nextInt();

        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.previousIndex() == index) {
                iterator.remove();
                if (index < commodities.size() - 1) {
                    iterator.next();
                }
            }
        }
    }

    public static void changeCommodity(List<Commodity> commodities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Commodity> iterator = commodities.listIterator();

        System.out.println("Enter index:");
        int index = scanner.nextInt();

        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.previousIndex() == index) {
                iterator.set(someCommodity());
            }
        }
    }
}
