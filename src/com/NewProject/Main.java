package com.NewProject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // With Scanner, you write your BirthDay Date in the run menu.
        LocalDate todayDate = LocalDate.now();
        Scanner inputDate = new Scanner(System.in);
        System.out.print("Your Birth Day Date: ");
        String yourDate = inputDate.nextLine();

        LocalDate newDate = LocalDate.parse(yourDate);
        Period age = Period.between(newDate,todayDate);
        System.out.println("You Age: " + age.getYears() + " Years "
                + age.getMonths()+" months "
                + age.getDays() + " Days");






        // Without Scanner ..
        LocalDate todayDate1 = LocalDate.now();

        LocalDate newDate1 = LocalDate.of(1999,7,5);

        Period age1 = Period.between(newDate1,todayDate1);

        System.out.println("You Age: " + age1.getYears() + " Years "
                + age1.getMonths()+" months "
                + age1.getDays() + " Days");

    }
}
