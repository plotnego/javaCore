package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkWithRegExp(String userName){
        Pattern pattern = Pattern.compile("^[\\w_]{3,15}$");
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

    public static void main(String[] args) throws IOException {

        String s1 = "IT";
        String s2 = "IT Academy";
        Boolean contain = s2.contains(s1);
        System.out.println(contain);

        String fullName = "Сокол Иван Алексеевич";

        String [] fio = fullName.split(" ");

        System.out.printf("%s %.1s.%.1s.\n",fio[0],fio[1],fio[2]);
        System.out.println(fio[1]);
        System.out.printf("%s %s %s\n",fio[1],fio[2],fio[0]);

//        System.out.println(fio[0]+" "+fio[1].substring(0,1)+"."+fio[2].substring(0,1)+".");
//        System.out.println(fio[1]);
//        System.out.println(fio[1]+" "+fio[2]+" "+fio[0]);


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 имен. Имя пользователя может содержать от 3 до 15 символов латинского алфавита, цифр и символов подчеркивания.");

        String[] names =new String[5];

        for (int i =0;i<names.length;i++){
            names[i]= bf.readLine();
        }

        for (String s:names){
            System.out.printf("%s : %b\n",s,checkWithRegExp(s));
        }




    }
}
