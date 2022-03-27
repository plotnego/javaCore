package com.company;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee  {
    private static boolean exCheckName(String sc) {
        Pattern pattern = Pattern.compile("^[A-ZА-Я][a-zа-я]+");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }
    static EmpComp EmpComp = new EmpComp();

    public static Comparator getEmpComp() {
        return EmpComp;
    }


    private static int count;
    private  final int employeeId;
    private String name;

    public Employee( String name) {
        try{
            if(!exCheckName(name))
                throw new InputMismatchException("Некорректное имя : "+name);
            this.name = name;

        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }
        count++;
        this.employeeId=getCount();
    }

    public static int getCount() {
        return count;
    }

    public  int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void info(){

    }

}
