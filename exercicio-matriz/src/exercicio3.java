import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para preencher a matriz 3x3:");

        preencherMatriz(matriz, scanner);

        int[] totalColunas = calcularTotalColunas(matriz);

        System.out.println("\nTotal de cada coluna:");
        exibeVetor(totalColunas);
    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[] calcularTotalColunas(int[][] matriz) {
        int[] totalColunas = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            int total = 0;
            for (int i = 0; i < matriz.length; i++) {
                total += matriz[i][j];
            }
            totalColunas[j] = total;
        }

        return totalColunas;
    }

    public static void exibeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
