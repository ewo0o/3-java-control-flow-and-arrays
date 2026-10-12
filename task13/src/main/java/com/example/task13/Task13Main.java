package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        int[] result = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(result));


    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                count += 1;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                result[j] = arr[i];
                j += 1;
            }
        }

        return  result;
    }

}