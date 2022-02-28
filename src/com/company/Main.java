package com.company;

import java.util.*;



public class Main {

    public static Set union(Set set1, Set set2){
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        return newSet;
    }

    public static Set intersect(Set set1, Set set2){
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.retainAll(set2);
        return newSet;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{2,4,8,9,5}));

        Set<Integer> unionSet = new HashSet<>(union(set1,set2));
        System.out.println(unionSet);

        Set<Integer> intersectSet = new HashSet<>(intersect(set1,set2));
        System.out.println(intersectSet);

        Map<String,String> personMap = new HashMap<>(10);
        personMap.put("Herz","Jack");
        personMap.put("Cher","Orest");
        personMap.put("Fizim","Dima");
        personMap.put("Doll","Ken");
        personMap.put("Covach","Ilya");
        personMap.put("Oction","Mande");
        personMap.put("Burk","Olya");
        personMap.put("Guvk","Dima");
        personMap.put("Zimzima","Liliya");

        for(Iterator i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Set<String> findDups = new HashSet<>();
        boolean check = false;
        String id = new String();
        for(Iterator i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            if(!findDups.add((String) entry.getValue())){
                check = true;
                id = (String) entry.getKey();
            }
        }
        if(check)
            System.out.println("\nИз 10 человек как минимум у 2 одинаковые именна : "+personMap.get(id)+"\n");
        else System.out.println("\nЛюдей с одинаковым именем нет"+"\n");

        personMap.values().removeIf(value -> value.contains("Orest"));

        for(Iterator i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        List<Student> std = new ArrayList<>();
        std.add(new Student("Alex",2));
        std.add(new Student("Bob",1));
        std.add(new Student("John",2));
        std.add(new Student("Torz",5));
        std.add(new Student("Jackz",3));

        System.out.println("\nMethod printStudents()");
        Student.printStudents(std,2);

        System.out.println("\nCompare to name:");
        std.sort(new nameComparator());
        for(Student student : std){
            System.out.println(student.getName());
        }
        System.out.println("\nCompare to course:");
        std.sort(new courseComparator());
        for(Student student : std){
            System.out.println(student.getCourse());
        }


    }
}
