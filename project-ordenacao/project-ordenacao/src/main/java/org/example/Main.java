package org.example;

import java.util.Arrays;

import static org.example.MergeSort.mergeSort;
import static org.example.QuickSort.quickSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ordenacao od = new Ordenacao();
        int vetor[] = {1,8,6,8,5,2,3,7,5,1,0,2,9};
        //od.bubbleSort(vetor);
        od.sort(vetor);

        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array antes da ordenação Merge:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nArray após a ordenação Merge:");
        printArray(arr);
        System.out.println("Array antes da ordenação Quick:");
        printArray(arr);

        quickSort(arr);

        System.out.println("\nArray após a ordenação Quick:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}