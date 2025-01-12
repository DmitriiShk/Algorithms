package Sorting_Algorithms.Selection_Sorting;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        int[] array = {9, 3, 7, 0, -2, 4, 8, 5, 2, 1};
        // Первый проход:
        //1.          {3, 9, 7, 0, -2, 4, 8, 5, 2, 1};
        //2.          {3, 9, 7, 0, -2, 4, 8, 5, 2, 1};
        //3.          {0, 9, 7, 3, -2, 4, 8, 5, 2, 1};
        //4.          {-2, 9, 7, 3, 0, 4, 8, 5, 2, 1};

        // Второй проход:
        //1.          {-2, 7, 9, 3, 0, 4, 8, 5, 2, 1};
        //2.          {-2, 3, 9, 7, 0, 4, 8, 5, 2, 1};
        //3.          {-2, 0, 9, 7, 3, 4, 8, 5, 2, 1};

        // Третий проход:
        //1.          {-2, 0, 7, 9, 3, 4, 8, 5, 2, 1};
        //2.          {-2, 0, 3, 9, 7, 4, 8, 5, 2, 1};
        //3.          {-2, 0, 2, 9, 7, 4, 8, 5, 3, 1};
        //4.          {-2, 0, 1, 9, 7, 4, 8, 5, 3, 2};



            arraySorting(array);

    }

    public static void arraySorting(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
