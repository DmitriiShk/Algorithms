package Search_Algorithms.Minimum_element;

public class Example {

    public static void main(String[] args) {
        int[] array = {2, 0, -1, 5, 3, 8};

        int min_element = minimumElement(array);
        System.out.println(min_element);
    }

    public static int minimumElement(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min) {
                min = array[i+1];
            }
        }
         return min;
    }
}
