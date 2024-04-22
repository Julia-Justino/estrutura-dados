import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 2;
        int colunas = 3;

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores para preencher a matriz 2x3:");

        preencherMatriz(matriz, scanner);

        System.out.println("\nMatriz resultante:");

    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
