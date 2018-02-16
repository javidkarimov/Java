package com.recomp.master;

import java.util.Scanner;

public class MasterClass {

    public static void main(String[] args) {

AuthenticationMenu();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Sexslerin sayi:");
//        int count = scan.nextInt();
//        Person[] persons = Util.PersonFillerCount(count);
//        System.out.println("Axtarmaq istediyiniz sozu daxil edin:");
//        String text = scan.next();
//        Person searchPerson = Util.SearchCompetitors(persons, text);
//        System.out.println(searchPerson);

    }

    public static void AuthenticationMenu() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Please fill your credentials to according field: \n"
                    + "\nAttemp count: " + i);
            Scanner scan = new Scanner(System.in);
            System.out.println("Your Username: ");
            String username = scan.next();
            System.out.println("Your Password: ");
            String password = scan.next();

            if (username.equals(DataStore.USER1_USERNAME) && password.equals(DataStore.USER1_PASSWORD)) {
                System.out.println("You are already logged in!!!\n"
                        + "=========================================\n");
                MainMenu();
                break;
            } else {
                System.out.println("Please, check your credentials!!!\n"
                        + "===========================================");
            }

        }
    }

    public static void MainMenu() {
        Person[] persons = null;
        while (true) {
            System.out.println("Please, choose these options:\n"
                    + "-------------------------------\n"
                    + "1.Registration of Competitor\n"
                    + "2.Search Competitors\n"
                    + "3.Game\n"
                    + "4.About Profile\n"
                    + "5.Log Out");
            Scanner scan = new Scanner(System.in);
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("How much Competitor will you insert? \n"
                            + "============================\n"
                            + "Please, insert count");
                    int count = scan.nextInt();
                    persons = Util.PersonFillerCount(count);
                    
                    break;
                case 2:
                    System.out.println("Please, enter what you want:\n"
                            + "------------------------------");
                        String text = scan.next();
                        Person searchPerson = Util.SearchCompetitors(persons, text);
                        System.out.println("++++++++++++++++++++++++++++\n"
                                + searchPerson + "\n"
                                        + "++++++++++++++++++++++++++++\n");
                    break;
                case 3:
                    System.out.println("Burada Game olacaq");
                    break;
                case 4:
                    System.out.println("Burada profile haqqinda olacaq");
                    break;
                case 5:
                    System.out.println("Burada user log out olunacaq");
                    break;
                default:
                    break;
            }
        }
    }

}
