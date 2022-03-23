package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String firstName,
            lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        try {
            if (!exCheckName(firstName) || !exCheckName(lastName))
                throw new InputMismatchException("Введены некорректные данные при создании объекта");
            {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public int getAge() {
        int Age = 2022 - birthYear;
        return Age;
    }

    private boolean exCheckAge(String sc) {
        Pattern pattern = Pattern.compile("\\d{1,2}");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }

    private boolean exCheckName(String sc) {
//        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-я]{2,}");
        Pattern pattern = Pattern.compile("^[A-ZА-Я][a-zа-я]+");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите имя : ");
            String tempfirstname = scanner.nextLine();
            if (!exCheckName(tempfirstname)) throw new InputMismatchException("Введены некорректные данные");
            else this.firstName = tempfirstname;
            System.out.println("Введите фамилию : ");
            String templastname = scanner.nextLine();
            if (!exCheckName(templastname)) throw new InputMismatchException("Введены некорректные данные");
            else this.lastName = templastname;
            System.out.println("Введите возраст : ");
            String tempage = scanner.nextLine();
            if (!exCheckAge(tempage)) throw new InputMismatchException("Введены некорректные данные");
            else this.birthYear = Integer.parseInt(tempage);

        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public String output() {
        return "Имя : " + firstName + "\nОтчество : " + lastName + "\nГод рождения : " + birthYear;
    }

    public void changedName(String fn, String ln) {
        try {
            if (!exCheckName(fn) || !exCheckName(ln))
                throw new InputMismatchException("Введены некорректные данные при смене имени");
            {
                this.firstName = fn;
                this.lastName = ln;
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {

        try {
            if (birthYear <= 0 || birthYear > 2022)
                throw new InputMismatchException("Введен некорректный год /Setter " + birthYear);
            this.birthYear = birthYear;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setFirstName(String firstName) {
        try {
            if (!exCheckName(firstName))
                throw new InputMismatchException("Введено некорректное имя /Setter " + firstName);
            else this.firstName = firstName;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    public void setLastName(String lastName) {
        try {
            if (!exCheckName(lastName))
                throw new InputMismatchException("Введена некорректная фамилия /Setter " + lastName);
            else this.lastName = lastName;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public String info() {
        if (!(firstName == null || lastName == null || birthYear == 0))
            return output() + "\nВозраст : " + getAge();

        return "Объект заполнен не полностью";
    }

    public static final String ANSI_YELLOW = "\u001b[33m";

}
