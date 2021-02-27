package homework_7;

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

        Scanner scanner = new Scanner(System.in);
        //num - number from menu
        int num=scanner.nextInt();

        Month [] months = Month.values();
        Seasons [] seasons = Seasons.values();

        switch (num){
            //check if such month exsists
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
            //months with the same season
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
            //months with the same number of days
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
            //months that have less days
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
            //month that have more days
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
            //next season
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
            //previous season
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
            //month with odd number of days
            case 8:{
                for (Month month : Month.values()){
                    if(month.getDays()%2!=0){
                        System.out.println(month.name());
                    }
                }            }
            break;
            //months with even number of days
            case 9:{
                for (Month month : Month.values()){
                    if(month.getDays()%2==0){
                        System.out.println(month.name());
                    }
                }
            }
            break;
            //check if month has even number of days
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
