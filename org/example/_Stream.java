package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        // imperative approach
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        // stream approach
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int sum2 = Arrays.stream(arr2)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sum2);

        // stream operations
        List<Integer> intLists = new Random()
                .ints(1, 11)
                .distinct()
                .limit(10)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Normal List: " + intLists);

        List<Integer> filtList = intLists.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("List of all the even elements: " + filtList);

        List<Integer> mappedList = filtList.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println("List of square of the element of filtered list: " + mappedList);

        System.out.println("Max is: " + mappedList.stream()
                .max(Integer::compare)
                .orElse(0));

        System.out.println("Min is: " + mappedList.stream()
                .min(Integer::compare)
                .orElse(0));

    }
}
