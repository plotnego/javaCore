package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//	List<Employee> emp = new ArrayList<Employee>();
//    emp.add(new ContractEmployee("Vadya",1450,789546));
//    emp.add(new ContractEmployee("Lesha",1350,74546));
//    emp.add(new ContractEmployee("Alex",1500,789654));
//    emp.add(new SalariedEmployee("Ivan",10,40,7896545));
//    emp.add(new SalariedEmployee("Kolya",5,20,7896545));
//
//        emp.sort(new ListSalaryComparator());
//        for(Employee l:emp){
//            l.info();
//        }

    Set<Employee> empS = new TreeSet(Employee.getSetSalaryComparator());
        empS.add(new ContractEmployee("Vadya",1450,789546));
        empS.add(new ContractEmployee("Lesha",1350,74546));
        empS.add(new ContractEmployee("Alex",1500,789654));
        empS.add(new SalariedEmployee("Ivan",10,40,7896545));
        empS.add(new SalariedEmployee("Kolya",5,20,7896545));

                for(Employee l:empS){
                    l.info();
        }
    }
}
