package Lessons.Lesson_01_060125_Hash_Functions;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Task_3 {

    /*
    Есть три слова: "ate", "eat", "tea". Написать на Java код проверки того, являются ли эти слова анаграммами.
    */

    public static void main(String[] args) {

       boolean result = isAnagram("ate", "eat", "tea");

        System.out.println(result);

    }

    public static boolean isAnagram(String...s){

        char[][] chars = new char[s.length][];

        for (int i = 0; i < s.length; i++) {
            chars[i] = s[i].toCharArray();
            Arrays.sort(chars[i]);
        }

        for (int i = 0; i < chars.length; i++) {
            if(!Arrays.equals(chars[0], chars[i]))
                return false;
        }
        return true;
    }

}
