package homework_7;
import java.util.Locale;
import  java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {

        System.out.println("Menu:");
        System.out.println("1 - перевірити чи є такий місяць");
        System.out.println("2 - вивести всі місяці з такою ж порою року");
        System.out.println("3 - вивести всі місяці, які мають таку саму кількість днів");
        System.out.println("4 - вивести всі місяці, які мають меншу кількість днів");
        System.out.println("5 - вивести всі місяці, які мають більшу кількість днів");
        System.out.println("6 - вивести наступну пору року");
        System.out.println("7 - вивести попередню пору року");
        System.out.println("8 - вивести всі місяці, які мають непарну кількість днів");
        System.out.println("9 - вивести всі місяці, які мають парну кількість днів");
        System.out.println("10 - вивести, чи має місяць парну кількість днів");

        Month [] months = Month.values();
        Seasons [] seasons = Seasons.values();
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();

        switch (num){
            case 1: {
                System.out.println("Введіть місяць: ");
                String newMonth = scanner.next();
                int i=0;
                for(Month month : months) {
                    if (month.name().equals(newMonth.toUpperCase())) {
                        i++;
                    }
                }
                    if(i==1) {
                        System.out.println("Такий місяць є.");
                    }
                    else{
                        System.out.println("Такого місяця немає.");
                    }
            }
            break;
            case 2:{
                System.out.println("Введіть місяць: ");
                String newMonth = scanner.next();
                String newSeason = "";
                for(Month month : months) {
                    if (month.name().equals(newMonth.toUpperCase())) {
                        newSeason = month.getSeason().toString();
                    }
                }
                for(Month month : months) {
                    if (month.getSeason().name().equals(newSeason)) {
                        System.out.println(month.name());
                    }
                }

            }
            break;
            case 3:{
                System.out.println("Введіть місяць: ");
                String newMonth = scanner.next();
                int day=0;
                for(Month month : months) {
                    if (month.name().equals(newMonth.toUpperCase())) {
                        day = month.getDays();
                    }
                }
                for(Month month : months) {
                    if (month.getDays()==day) {
                        System.out.println(month.name());
                    }
                }            }
            break;
            case 4: {
                System.out.println("Введіть місяць: ");
                String newMonth= scanner.next();
                int d=0;
                for (Month month: months){
                    if(month.name().equals(newMonth.toUpperCase())){
                        d=month.getDays();
                    }
                }
                for (Month month: months){
                    if(month.getDays()<d){
                        System.out.println(month.name());
                    }
                }
            }
            break;
            case 5:{
                System.out.println("Введіть місяць: ");
                String newMonth= scanner.next();
                int d=0;
                for (Month month: months){
                    if(month.name().equals(newMonth.toUpperCase())){
                        d=month.getDays();
                    }
                }
                for (Month month: months){
                    if(month.getDays()>d){
                        System.out.println(month.name());
                    }
                }
            }
            break;
            case 6:{
                System.out.println("Введіть пору року: ");
                String newSeason = scanner.next();
                for (int i=0; i<seasons.length;i++){
                    if(seasons[i].name().equals(newSeason.toUpperCase())){
                        if(i==3){
                            System.out.println(seasons[0]);
                        }
                        else {
                            System.out.println(seasons[i + 1]);
                        }
                    }
                }
            }
            break;
            case 7: {
                System.out.println("Введіть пору року: ");
                String newSeason = scanner.next();
                for (int i=0; i< seasons.length;i++){
                    if(seasons[i].name().equals(newSeason.toUpperCase())){
                        if(i==0){
                            System.out.println(seasons[3]);
                        }
                        else {
                            System.out.println(seasons[i -1]);
                        }
                    }
                }
            }
            break;
            case 8:{
                for (Month month : Month.values()){
                    if(month.getDays()%2!=0){
                        System.out.println(month.name());
                    }
                }            }
            break;
            case 9:{
                for (Month month : Month.values()){
                    if(month.getDays()%2==0){
                        System.out.println(month.name());
                    }
                }
            }
            break;
            case 10: {
                System.out.println("Введіть місяць: ");
                String newMonth = scanner.next();
                for (Month month : Month.values()){
                    if(month.name().equals(newMonth.toUpperCase())){
                        if(month.getDays()%2==0){
                            System.out.println("Цей місяць має парну кількість днів.");
                        }
                        else{
                            System.out.println("Цей місяць має непарну кількість днів.");
                        }
                    }
                }
            }
            break;

        }
    }
}
