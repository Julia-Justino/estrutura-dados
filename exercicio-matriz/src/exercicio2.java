import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 2;
        int colunas = 3;

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] somaMatrizes = new int[linhas][colunas];

        System.out.println("Digite os valores para preencher a primeira matriz 2x3:");
        preencherMatriz(matriz1, scanner);

        System.out.println("Digite os valores para preencher a segunda matriz 2x3:");
        preencherMatriz(matriz2, scanner);

        somaMatrizes = somarMatrizes(matriz1, matriz2);

        System.out.println("\nMatriz resultante da soma:");
        exibeMatriz(somaMatrizes);
    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
}
