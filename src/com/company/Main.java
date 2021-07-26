package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 22, 12, 15, 3, 5, 52, 17, 1, 6, 105};
        System.out.println("Array = " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        sortArrayAscdending(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));

        sortArrayDescending(arr);
        System.out.println("Sorted array descending: " + Arrays.toString(arr));

        int minVal = findMin(arr);
        System.out.println("Min value: " +Integer.toString(minVal));

        System.out.println("Max value: " + Integer.toString((findMax(arr))));

    }

    private static void sortArrayAscdending(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void sortArrayDescending(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void reverseArray(int[] arr){
        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}