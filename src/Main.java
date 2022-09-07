import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {8, -2, -4, 2, 3, 6, -8, -3, 4, -5, 7, -6, 15, 67, 80};
        boolean firstNegative = false;
        double sum = 0;
        for (double numbers : nums) {
            if (numbers < 0) {
                firstNegative = true;
                continue;
            }
            if (firstNegative) {
                sum += numbers;
            }
        }
        System.out.println("Среднее арифметическое чисел: " + sum / nums.length);


        boolean sorted = false;
        double res;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;

                    res = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = res;
                    System.out.println(Arrays.toString(nums));
                }

            }
        }

    }
}