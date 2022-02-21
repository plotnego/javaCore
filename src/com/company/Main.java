package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	List<Integer> myCollection = new ArrayList<>(10);

    //Если чисел которые больше 20 много.
    //Размер списка становиться маленьким и при добавлении элемента на позицию 8 вылетает ошибка.
    //Немного не понял , либо это нужно было как-то обработать либо я что-то неправильно сделал..

//        myCollection.addAll(Arrays.asList(new Integer[] {50,60,2,4,70,2,3,50,60,35}));


        myCollection.addAll(Arrays.asList(new Integer[] {2,8,20,7,6,56,3,9,89,1}));




//    for(int i = 0; i<10;i++){
//        String s = bf.readLine();
//        myCollection.add(Integer.parseInt(s));
//
//    }

    List<Integer> newCollection = new LinkedList<>();

    Iterator<Integer> iterator = myCollection.iterator();

        int i=0;
        while(iterator.hasNext()){
            Integer ch=iterator.next();
            if(ch>5){
                newCollection.add(i);
            }
            if(ch>20){
                iterator.remove();
            }
            i++;
        }
        System.out.println(newCollection);
        System.out.println(myCollection);

            myCollection.add(2,1);
            myCollection.add(5,-4);
            myCollection.add(8,-3);


        Iterator<Integer> listIterator = myCollection.listIterator();
        int n=0;
        while(listIterator.hasNext()){
            System.out.println("position - "+n+", value of element "+listIterator.next());
            n++;
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);

        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(15,"Tek");
        employeeMap.put(47,"Jek");
        employeeMap.put(11,"Hexler");
        employeeMap.put(77,"Lerx");
        employeeMap.put(54,"Ken");
        employeeMap.put(33,"Joji");
        employeeMap.put(8,"Dexter");

        for(Iterator k = employeeMap.entrySet().iterator();k.hasNext();){
            Map.Entry entry = (Map.Entry) k.next();
            System.out.println("\nKey "+entry.getKey()+" Value "+entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите ID");
        int id = sc.nextInt();


            if(employeeMap.containsKey(id)){
                System.out.println(employeeMap.get(id));
            } else System.out.println("По такому ID значений нет");

        System.out.println("Введите имя");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();

        if(employeeMap.containsValue(name)) {
            for (Map.Entry entry : employeeMap.entrySet()) {
                if(entry.getValue().equals(name))
                    System.out.println(entry.getKey());
            }
        }
        else System.out.println("По такому имени значений нет");

        }
    }


