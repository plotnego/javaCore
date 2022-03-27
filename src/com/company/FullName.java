package com.company;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    private boolean exCheckName(String sc) {
        Pattern pattern = Pattern.compile("^[A-ZА-Я][a-zа-я]+");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }
    private String firstName,
                    lastName;

    public FullName(String firstName, String lastName) {
        try{
                if(!exCheckName(firstName) || !exCheckName(lastName))
                    throw new InputMismatchException("Введены некорректные данные");
                else{
                    this.firstName = firstName;
                    this.lastName = lastName;
                }
            } catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
