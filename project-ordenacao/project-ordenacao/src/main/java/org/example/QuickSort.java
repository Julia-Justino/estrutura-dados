package org.example;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Encontra o índice do pivô após a partição
            quickSort(arr, low, pivotIndex - 1); // Recursivamente ordena os elementos menores que o pivô
            quickSort(arr, pivotIndex + 1, high); // Recursivamente ordena os elementos maiores que o pivô
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Escolhe o último elemento como pivô
        int i = low - 1; // Índice do menor elemento

        for (int j = low; j < high; j++) {
            // Se o elemento atual for menor ou igual ao pivô, troca com o próximo elemento do menor índice
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Coloca o pivô na posição correta
        return i + 1; // Retorna o índice do pivô
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}