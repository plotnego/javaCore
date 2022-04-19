package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Подскажи пожалуйста есть ли из этих методов какой-то вменяемый ? потому что кажется что я перемудрил...

    //В первух двух методах не придумал как обыграть знаки которые начинаются после последних букв в большом и нижнем регистре.(
    public static String encrypt(String s , int n){
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            chars[i]+=(char)n;
        }
        return s = new String(chars);
    }
    public static String decrypt(String s , int n){
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            chars[i]-=(char)n;
        }
        return s = new String(chars);
    }
    // В этих методах сделал строку алфавита повторяющуюся несколько раз .
    // например если нужно в качесте целочисленного значения подставить большое число то можно просто удленнить строку
    public static String Encrypt(String s,int n){
        String  ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLowerCase(ch[i])) {
                int index = abc.indexOf(ch[i]);
                ch[i]= abc.charAt(index+n);
            } else {
                int index = ABC.indexOf(ch[i]);
                ch[i]= ABC.charAt(index+n);
            }
        }
        return s=new String(ch);
    }

    public static String Decrypt(String s,int n){
        String  ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLowerCase(ch[i])) {
                int index = abc.indexOf(ch[i]);
                ch[i]= abc.charAt((abc.length()/3*2)+index-n);
            } else {
                int index = ABC.indexOf(ch[i]);
                ch[i]= ABC.charAt((abc.length()/3*2)+index-n);
            }
        }
        return s=new String(ch);
    }
    //А в этих методах я попробовал отлавливать выход за пределы масива и задавать им нужное расположение.
    public static String ENCRYPT(String s,int n){
        String  ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            int index = 0;
            try {
                if (Character.isLowerCase(ch[i])) {
                    index = abc.indexOf(ch[i]);
                    ch[i] = abc.charAt(index + n);
                }
                else {
                    index = ABC.indexOf(ch[i]);
                    ch[i]= ABC.charAt(index+n);
                }
            } catch (StringIndexOutOfBoundsException e) {
                int remainder = 26 - index;
                int offset = n-remainder;
                if(Character.isLowerCase(ch[i])) ch[i]= (char) (abc.charAt(0)+offset);
                else ch[i]= (char) (ABC.charAt(0)+offset);
            }
        }
        return s=new String(ch);
    }
    public static String DECRYPT(String s,int n){
        String  ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            int index = 0;
            try {
                if (Character.isLowerCase(ch[i])) {
                    index = abc.indexOf(ch[i]);
                    ch[i] = abc.charAt(index - n);
                }
                else {
                    index = ABC.indexOf(ch[i]);
                    ch[i]= ABC.charAt(index - n);
                }
            } catch (StringIndexOutOfBoundsException e) {
                int remainder = n-index;
                if(Character.isLowerCase(ch[i])) ch[i]= abc.charAt(abc.length()-remainder);
                else ch[i]= ABC.charAt(ABC.length()-remainder);
            }
        }
        return s=new String(ch);
    }

    public static boolean Validate(String str){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate date = formatter.parse(str, LocalDate::from);
        } catch (DateTimeParseException e) {
//            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
	List<String> list1 = Arrays.asList("ABC","AB","ABCDEF","ABCDEFJ","ABCDE");
	List<String> list2 = new ArrayList<>(list1);
    list2.removeIf(x->x.length()>=5);
    System.out.println("list1:"+list1+"\n"+
                        "list2"+list2);

    String s = "AbC";
        System.out.print(
                "Method encrypt: "+encrypt(s,3)+"\n"+
                "Method decrypt: "+decrypt(s,3)+"\n"+
                "Method Encrypt: "+Encrypt(s,3)+"\n"+
                "Method Decrypt: "+Decrypt(s,3)+"\n"+
                "Method ENCRYPT: "+ENCRYPT(s,3)+"\n"+
                "Method DECRYPT: "+DECRYPT(s,3)+"\n"
        );

        String date = "01.22.22";
        System.out.print("Date "+date+" is valid : "+Validate(date));

    }
}
