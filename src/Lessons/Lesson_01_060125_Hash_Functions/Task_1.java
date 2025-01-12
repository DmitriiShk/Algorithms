package Lessons.Lesson_01_060125_Hash_Functions;

import java.util.HashMap;

public class Task_1 {
    /*
    Задание: Есть массив int[] array = {2, 7, 11, 15}.
    Найти значения индексов элементов, сумма которых равна 9.
     */

    public static void main(String[] args) {
        int[] array = {2, 11, 7, 15};
        int target = 9;

        int[] result = findTwoSum(array, target);
        if (result != null) {
            System.out.println("Индексы: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Пара не найдена");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null; // Если пара не найдена
    }

}
