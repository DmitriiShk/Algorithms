package HomeWork.HW_Lesson_1;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 8, 4, 9, 6, 1, 5};
        int target = 9;

        List<int[]> results = findAllTwoSums(array, target);
        if (!results.isEmpty()) {
            System.out.println("Найденные пары индексов:");
            for (int[] pair : results) {
                System.out.println("Индексы: " + pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("Пары не найдены");
        }
    }

    public static List<int[]> findAllTwoSums(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                results.add(new int[]{map.get(complement), i});
            }
            map.put(nums[i], i);
        }
        return results;
    }
}
