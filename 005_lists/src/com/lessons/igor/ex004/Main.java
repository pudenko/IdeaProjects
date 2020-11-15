package com.lessons.igor.ex004;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,7,7,44,5,12};
        int[] array2 = {1,7,7,44,5,12};
//        System.out.println(array2.length);
//        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.binarySearch(array1,7));
        System.out.println(Arrays.equals(array1, array2));
        Arrays.fill(array1,12);
        System.out.println(Arrays.toString(array1));
    }
}
