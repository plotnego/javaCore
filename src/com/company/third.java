package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class third {
    public static void main(String[] args) {

                System.out.println("-Third task");
                ArrayList<String> txtarr = new ArrayList<>();
                try{
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("mtxt.txt"));
                    String s;
                    while ((s=bufferedReader.readLine())!=null){
                        txtarr.add(s);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String l  = txtarr.get(0),
                        s = txtarr.get(0);

        String [][] strM = new String[txtarr.size()][];
        String regEx = "[\\W]";
        Set<String> varSet = new TreeSet<>();

                for (int i = 0;i<txtarr.size();i++) {
                    System.out.println("line :"+(i+1)+" Number of symbols :"+txtarr.get(i).length());
                    if(l.length() < txtarr.get(i).length()) l = txtarr.get(i);
                    if(s.length() > txtarr.get(i).length()) s = txtarr.get(i);
                    if(txtarr.get(i).toLowerCase().contains("var")) System.err.println("Contains var: "+txtarr.get(i));
                    strM[i] = txtarr.get(i).split(" ");
                    for (int j = 0; j < strM[i].length; j++) {
                        strM[i][j] = strM[i][j].replaceAll(regEx,"");
                        if(strM[i][j].equals("var")) {
                            varSet.add(txtarr.get(i));
                        }
                    }
                }
                for (String string:varSet) {
                    System.out.println("Consist var: "+string);
                }
                System.out.println("longest line : "+l);
                System.out.println("Shortest line : "+s);

            }
        }
