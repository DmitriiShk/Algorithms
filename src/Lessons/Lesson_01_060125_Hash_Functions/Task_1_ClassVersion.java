package Lessons.Lesson_01_060125_Hash_Functions;

import java.util.HashMap;
import java.util.Map;

public class Task_1_ClassVersion {

    public static void main(String[] args) {

        int[] array = {7, 11, 3, 23, 45,  6, 4};
        int value = 9;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == value){
                    System.out.println("Index 1 = " + i + "; " + "Index 2 = " + j);
                }
            }
        }



    }

}
