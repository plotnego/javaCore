package com.company;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;


public class Main {

    public static void Sort(List<String> stringList){

        stringList.sort(String::compareTo);

    }

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter n");
            Random random = new Random();
            int n = Integer.parseInt(br.readLine());
            if(n<=0) throw new InputMismatchException("zero or negative");
//Закомментировал первые выводы т.к. захотел работать с одним списком рандомных чисел для наглядности.
            // 1
//            random.ints().limit(n).forEach(System.out::println);
            // 2
//            random.ints().limit(n).sorted().forEach(System.out::println);

            //3

            List<Integer> integerList = random.ints().limit(n).distinct().boxed().toList();

            System.out.println("Original");
            integerList.forEach(System.out::println);

            System.out.println("Sorted");
//Вопрос : какой вариант сортировки оптимальней? Collections.sort(integerList); или ↓
            integerList.stream().sorted().forEach(System.out::println);

//вариант поиска мах 1
            IntSummaryStatistics statistics = integerList.stream().mapToInt(x->x).summaryStatistics();
            System.out.println("max1 ="+statistics.getMax());
//вариант поиска мах 2
            Optional<Integer> max2 = integerList.stream().max(Comparator.naturalOrder());
            System.out.println("max2 ="+max2.get());
//вариант поиска мах 3 какой лучше? последние два видимо почти одно и тоже.
            Optional<Integer> max3 = integerList.stream().max((x,y)->x.compareTo(y));
            System.out.println("max3 ="+max3.get());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        LocalDate dayOfWeek = LocalDate.now();
        LocalDate firstMonday = dayOfWeek.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.printf(Locale.ENGLISH,"Day of a week: %tA\nFirst monday for current month: %s\n",dayOfWeek,firstMonday);

        List<String> stringList =  Arrays.asList("Kolya","Andy","Denis","Zeta");
        System.out.println("Original :"+stringList);
        Sort(stringList);
        System.out.println("Sorted :"+stringList);
    }
}

