
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ 
        String[][] list = new String[2][names.length];
        Random rand = new Random();

        for (int i = 0; i < names.length; i++) {
            if(rand.nextBoolean()) {
                list[0][i] = names[i];
            } else {
                list[1][i] = names[i];
            }
        }
        return list; 
    }

    public static void main(String[] args) {
    }
}



