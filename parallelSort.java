//并行排序

import java.util.Arrays;

public class parallelSort {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 84, 9}, {3, 76, 4, 85, 23, 35, 90}};
        Arrays.parallelSort(arr[0]);
        Arrays.parallelSort(arr[1]);
        System.out.println("sort of index 0:");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }
        System.out.println("sort of index 1:");
        for (int i = 0; i < arr[1].length; i++) {
            System.out.println(arr[1][i]);
        }
    }
}
