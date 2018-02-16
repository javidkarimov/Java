package com.recomp.master;

import java.util.Scanner;

public class Util {

    public static Person[] PersonFillerCount(int personCount) {
        Person[] person = new Person[personCount];
        for (int i = 0; i < person.length; i++) {
            System.out.println("Please enter information about user: " + (i+1));//burada i haqqinda elave yeniden baxmaq lazimdi
            person[i] = Personfiller();
        }
        System.out.println("All Competitors datas are saved!!!\n");
        return person;

    }

    public static Person Personfiller() {
        Scanner scan = new Scanner(System.in);
        //Inserting Name of Competitor
        System.out.println("Please, insert name:");
        String name = scan.next();
        //Inserting Surname of Competitor
        System.out.println("Please, insert surname:");
        String surname = scan.next();
        //Inserting Age of Competitor
        System.out.println("Please, insert age:");
        int age = scan.nextInt();

        Person p = new Person(name, surname, age);
        System.out.println(p);
        return p;
    }
    
    public static void PrintAllObjects(Object[] objects){
        for (Object object : objects) {
            System.out.println(object);
        }
    }
    
    
    public static Person SearchCompetitors(Person[] person, String text){
        for (Person p : person) {
            if (p.getName().equals(text) || p.getSurname().equals(text) || String.valueOf(p.getAge()).equals(text)) {
                return p;
            }
        }
        return null;
    }
    
    

}
