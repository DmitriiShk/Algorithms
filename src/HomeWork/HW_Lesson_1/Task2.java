package HomeWork.HW_Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

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
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                results.add(new int[]{left, right});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return results;
    }
}
