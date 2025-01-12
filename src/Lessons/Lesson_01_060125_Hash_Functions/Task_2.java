package Lessons.Lesson_01_060125_Hash_Functions;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 11, 23, 46};
        int target = 9;

        List<int[]> results = findTwoSumSorted(array, target);
        if (!results.isEmpty()) {
            System.out.println("Найденные пары индексов:");
            for (int[] pair : results) {
                System.out.println("Индексы: " + pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("Пары не найдены");
        }
    }

    public static List<int[]> findTwoSumSorted(int[] nums, int target) {
        List<int[]> results = new ArrayList<>();
        int left = 0; // Указатель на начало массива
        int right = nums.length - 1; // Указатель на конец массива

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                results.add(new int[]{left, right}); // Сохраняем индексы
                left++;  // Сдвигаем левый указатель вправо
                right--; // Сдвигаем правый указатель влево
            } else if (sum < target) {
                left++; // Увеличиваем сумму, сдвигая левый указатель
            } else {
                right--; // Уменьшаем сумму, сдвигая правый указатель
            }
        }
        return results;
    }


}
