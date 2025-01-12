package Search_Algorithms.Binary_Search;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        int[] array = {17, 9, 3, 8, -1, 0, 4, 6, 5};

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        binarySearch(array, 0);
    }

    public static void binarySearch(int[] array, int number) {
        int start = 0; // Индекс первого элемента
        int end = array.length - 1; // Индекс последнего элемента

        while (start <= end) {
            int middle = (start + end)/2; //Индекс среднего элемента

            if (array[middle] == number) {//Если элемент, расположенный в середине, равен искомому числу, выводим число.
                System.out.println("There is such element in the array, it is located at the index " + middle);
                return; // Завершаем выполнение метода
            } else if (array[middle] > number) {
                end = middle - 1; // Ищем в левой части
            } else {
                start = middle + 1; // Ищем в правой части
            }
        }

        // Если цикл завершился, значит элемент не найден
        System.out.println("There is no such element in the array.");
    }


}

