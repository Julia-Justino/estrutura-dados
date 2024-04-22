package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ordenacao {

     int qtd = 0;
    int qtd1 = 0;
     int comp = 0;
    int comp1 = 0;


    public  void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
    public void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Trata arrays vazios ou com um único elemento
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    comp ++;
                    indiceMinimo = j;
                }
            }

            // Troca o elemento mínimo com o primeiro elemento do subarray não ordenado
            if (indiceMinimo != i) {
                int temp = arr[i];
                arr[i] = arr[indiceMinimo];
                arr[indiceMinimo] = temp;
                qtd++;
            }
        }
        System.out.println("""
                
                Quantidade de comparações: %d,
                Quantidade de trocas: %d
                ==========================================
                """.formatted(comp, qtd));
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }


        int n = arr.length;
        boolean trocado = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    comp1++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    qtd1++;

                    trocado = true;
                }
            }
            if (!trocado) {
                break;
            }
            trocado = false;
            System.out.println("""
                                
                    Quantidade de comparações: %d,
                    Quantidade de trocas: %d
                    ==========================================
                    """.formatted(comp1, qtd1));
            System.out.println(Arrays.toString(arr));
        }

    }
    public int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }
}
