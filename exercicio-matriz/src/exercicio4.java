import java.util.Scanner;
public class exercicio4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n;

            do {
                System.out.print("Digite um número (maior que 1 e menor que 6): ");
                n = scanner.nextInt();
            } while (n <= 1 || n >= 6);

            int[][] matriz = new int[n][n];

            System.out.println("Digite os valores para preencher a matriz " + n + "x" + n + ":");

            preencherMatriz(matriz, scanner);

            int somaDiagonalPrincipal = calcularSomaDiagonalPrincipal(matriz);
            int somaDiagonalSecundaria = calcularSomaDiagonalSecundaria(matriz);

            System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
            System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
        }

        public static void preencherMatriz(int[][] matriz, Scanner scanner) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][i];
            }
            return soma;
        }

        public static int calcularSomaDiagonalSecundaria(int[][] matriz) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][matriz.length - 1 - i];
            }
            return soma;
        }
}
