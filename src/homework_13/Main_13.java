package homework_13;

import java.util.*;

public class Main_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Person, List<Animal>> zooClub = new LinkedHashMap<>();

        menu();
        int num = scanner.nextInt();
        while (num<7) {

            switch (num) {
                case 1: {
                    addNewPerson(zooClub);
                    break;
                }
                case 2: {
                    addNewAnimal(zooClub);
                    break;
                }
                case 3:{
                    removeAnimal(zooClub);
                    break;
                }
                case 4:{
                    removePerson(zooClub);
                    break;
                }
                case 5:{
                    printZooClub(zooClub);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }
            System.out.println("Enter number from menu:");
            num = scanner.nextInt();
        }
    }

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1 - add new person");
        System.out.println("2 - add new animal to the person");
        System.out.println("3 - remove animal");
        System.out.println("4 - remove person");
        System.out.println("5 - print ZooClub");
        System.out.println("6 - stop program");
    }

    public static void printZooClub(Map<Person, List<Animal>> zooClub) {
        for(Map.Entry<Person, List<Animal>> somePerson: zooClub.entrySet()){
            System.out.println("Person = " + somePerson.getKey().toString() +
                    " Animals:" + somePerson.getValue().toString());
        }
    }

    public static void addNewPerson (Map<Person, List<Animal>> zooClub){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();

        if(zooClub.containsKey(new Person(name,age))) {
            System.out.println("This person already exists");
        }
        else{
            List<Animal> personsAnimals = new ArrayList<>();
            zooClub.put(new Person(name, age), personsAnimals);
        }
    }

    public static void addNewAnimal(Map<Person, List<Animal>> zooClub){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of person:");
        String nameOfPerson = scanner.next();
        System.out.println("Enter age of person:");
        int ageOfPerson = scanner.nextInt();

        if(zooClub.containsKey(new Person(nameOfPerson,ageOfPerson))) {

            System.out.println("Enter type of animal:");
            String typeOfAnimal = scanner.next();
            System.out.println("Enter name of animal:");
            String nameOfAnimal = scanner.next();

            List<Animal> animals = new ArrayList<>(zooClub.get(new Person(nameOfPerson, ageOfPerson)));

            if(animals.contains(new Animal(typeOfAnimal,nameOfAnimal))){
                System.out.println("there is such animal");
            }
            else {
                animals.add(new Animal(typeOfAnimal, nameOfAnimal));
                zooClub.replace(new Person(nameOfPerson, ageOfPerson), animals);
            }
        }
        else{
            System.out.println("No such person");
        }
    }

    public static void removeAnimal(Map<Person, List<Animal>> zooClub){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String nameOfPerson = scanner.next();
        System.out.println("Enter age:");
        int ageOfPerson = scanner.nextInt();

        if(zooClub.containsKey(new Person(nameOfPerson,ageOfPerson))) {

            List<Animal> animals = new ArrayList<>(zooClub.get(new Person(nameOfPerson, ageOfPerson)));
            System.out.println("Enter type of animal:");
            String typeOfAnimal = scanner.next();
            System.out.println("Enter name of animal:");
            String nameOfAnimal = scanner.next();

            if(animals.contains(new Animal(typeOfAnimal,nameOfAnimal))) {
                animals.remove(new Animal(typeOfAnimal, nameOfAnimal));
                zooClub.replace(new Person(nameOfPerson, ageOfPerson), animals);
            }
            else{
                System.out.println("No such animal");
            }
        }
        else{
            System.out.println("No such person");
        }
    }

    public static void removePerson(Map<Person, List<Animal>> zooClub){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age;");
        int age = scanner.nextInt();

        if(zooClub.containsKey(new Person(name,age))){
            zooClub.remove(new Person(name,age));
        }
        else{
            System.out.println("No such person");
        }
    }
}