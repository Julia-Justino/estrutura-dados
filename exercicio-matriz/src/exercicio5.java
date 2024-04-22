import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para preencher a matriz 3x3:");

        preencherMatriz(matriz, scanner);

        boolean ehQuadradoMagico = quadradoMagico(matriz);

        if (ehQuadradoMagico) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz NÃO é um quadrado mágico.");
        }
    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static boolean quadradoMagico(int[][] matriz) {
        int soma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[0][j];
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != soma || somaColuna != soma) {
                return false;
            }
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != soma) {
            return false;
        }

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        return somaDiagonalSecundaria == soma;
    }
}
