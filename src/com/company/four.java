package com.company;

import java.io.*;
import java.util.ArrayList;

public class four {
    public static void main(String[] args) {

        ArrayList<String> file = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            String s;
            while ((s=br.readLine())!=null){
                    file.add(s);
                }
                br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));
            bw.write("Number of lines : "+file.size()+"\n");
            int max=0;
            for (int i = 0; i < file.size(); i++) {
                if(file.get(i).length() > max) max = i;
            }
            bw.write("longest line : "+file.get(max)+"\n");
            bw.write("Kirill 11.01.1997");
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
