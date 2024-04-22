package org.example;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid); // Ordena a metade esquerda
            mergeSort(arr, temp, mid + 1, right); // Ordena a metade direita
            merge(arr, temp, left, mid, right); // Combina as duas metades ordenadas
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copia os elementos para o array temporário
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left; // Índice inicial da metade esquerda
        int j = mid + 1; // Índice inicial da metade direita
        int k = left; // Índice inicial do array final

        // Mescla as duas metades ordenadas
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        // Copia os elementos restantes da metade esquerda, se houver
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }
}