package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class third_otherwise {

    static int longest=0;
    static int numLongest=0;
    static int shortest=0;
    static int numShortest=1000;

    public static void isReading(String s){
        String [] words = s.split(" ");
        for (String str : words) {
            if (str.equals("var"))
                System.out.println(s);
        }
    }

    public static int CountSymbol(String s){
        return s.length();
    }
    public static void LongestShortes(String s, int count){
        if(CountSymbol(s)>numLongest){
            numLongest=CountSymbol(s);
            longest = count;
        }

        if(CountSymbol(s)<numShortest){
            numShortest=CountSymbol(s);
            shortest = count;
        }

    }


    public static void main(String[] args) {
        String fileName = "mtxt.txt";
        FileReader fr = null;
        BufferedReader br = null;
        int count=0;
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s =null;
            while((s= br.readLine())!=null){
                count++;
                System.out.println(CountSymbol(s));
                LongestShortes(s,count);
                isReading(s);
            }
            System.out.println("Longest: "+longest + ";Shortest: "+shortest);
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
