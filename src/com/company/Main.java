package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    Enter in the console sentence of five words.
//    display the longest word in the sentence
//    determine the number of its letters
//    bring the second word in reverse order
        //Enter a sentence that contains the words between more than one space.
        // Convert all spaces, consecutive, one.
        // For example, if we introduce the sentence "I    am      learning     Java   Core»,
        // we have to get the "I'm learning Java Core»



// проверка на 5 слов.
    public static boolean fiveWords(String sent){
//        Pattern pattern = Pattern.compile("^([a-zA-z]+\\s+)([a-zA-z]+\\s+)([a-zA-z]+\\s+)([a-zA-z]+\\s+)([a-zA-z]+)");
        Pattern pattern = Pattern.compile("^(([a-zA-zа-яА-Я]+\\s+){4})([a-zA-zа-яА-Я]+)");
        Matcher m = pattern.matcher(sent);
        return m.matches();
    }

    public static void patternUs(String usa){
        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{0,2})?");
        Matcher m = pattern.matcher(usa);
        while(m.find()){
            double US = Double.parseDouble(usa.substring(m.start()+1, m.end()));
            System.out.printf("$%.2f\n",US);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите предложение из 5 слов.");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        if(!fiveWords(sentence))
            System.out.println("В предложении не пять слов или присутствуют цифры.");
        else {
            String[] words = sentence.split(" ");
            String largest = words[0];
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > largest.length())
                    largest = words[i];
            }
            StringBuilder reverse = new StringBuilder(words[1]).reverse();

            //Вопрос : обязательно ли переводить стрингбилдер обратно в стринг?

            System.out.printf("Самое длинное слово: %s\nКол-во букв: %s\nВторое слово в обратном порядке: %s\n",largest,largest.length(),reverse);
        }
        System.out.println("Введите предложение, содержащее слова между несколькими пробелами.");
        String sentSpace = sc.nextLine();
        String patternSpace = "[\\s]+";
        String [] spaseWord = sentSpace.split(patternSpace);
        String spaceOut = String.join(" ",spaseWord);
        System.out.println(spaceOut);

        System.out.println("Введите текст из консоли, который содержит несколько вхождений валюты США.");

//        Строка для проверки с разными вариантами вхождения валюты.
//        Some contains $5684.557 and $78.69874 and $7.7 and $89 and $0.7 and no $.24

        String usaString = sc.nextLine();
        patternUs(usaString);
    }
}
