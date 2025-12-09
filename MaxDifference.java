public class MaxDifference {
    public static void main(String[] args) {
        int [] numbers1= {1,5,2,8,9,12};
        System.out.println("Max difference in numbers1: " + findMaxDifference(numbers1));
        int[] numbers2 = {10, 2, 4, 1, 5};
        System.out.println("Max difference in numbers2: " + findMaxDifference(numbers2));

    }
    public static int findMaxDifference(int []arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal - minVal;
    }
}
