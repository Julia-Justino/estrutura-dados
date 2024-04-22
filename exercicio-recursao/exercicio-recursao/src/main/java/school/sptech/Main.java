package school.sptech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int somaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }
    public static int somaIterativa(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
    public static int somaElementos(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
    public static int somaElementos(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        }
        return vetor[indice] + somaElementos(vetor, indice + 1);
    }
    public static int somaElementosPares(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // Verifica se o elemento é par
                soma += vetor[i];
            }
        }
        return soma;
    }
    public static int somaElementosParesR(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        }
        int elementoAtual = vetor[indice];
        if (elementoAtual % 2 == 0) {
            return elementoAtual + somaElementosParesR(vetor, indice + 1);
        }
        return somaElementosParesR(vetor, indice + 1);
    }
    public static int contarElementosImpares(int[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) { // Verifica se o elemento é ímpar
                contador++;
            }
        }
        return contador;
    }
    public static int contarOcorrencias(int[] vetor, int x) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                contador++;
            }
        }
        return contador;
    }
    public static int contarOcorrenciasR(int[] vetor, int x, int indice) {
        if (indice == vetor.length) {
            return 0;
        }
        if (vetor[indice] == x) {
            return 1 + contarOcorrenciasR(vetor, x, indice + 1);
        }
        return contarOcorrenciasR(vetor, x, indice + 1);
    }
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int mdcR(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdcR(b, a % b);
        }
    }
    public static int encontrarMaiorElemento(int[] vetor) {
        if (vetor.length == 0)
            throw new IllegalArgumentException("O vetor não pode estar vazio");

        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static int encontrarMaiorElemento(int[] vetor, int n) {
        if (n == 1)
            return vetor[0];

        return Math.max(vetor[n - 1], encontrarMaiorElemento(vetor, n - 1));
    }
    public static int somaDigitosi(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
    public static int somaDigitosr(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero % 10 + somaDigitosr(numero / 10);
    }

    public static String representacaoBinariai(int numero) {
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int resto = numero % 2;
            binario.insert(0, resto); // Insere o resto no início da string binária
            numero /= 2;
        }
        return binario.toString();
    }
    public static String representacaoBinariar(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }
        int resto = numero % 2;
        return representacaoBinariar(numero / 2) + resto;
    }


    public static void main(String[] args) {
        int n = 5; // Altere o valor de n conforme necessário
        int soma = somaRecursiva(n);
        int somai = somaIterativa(n);
        System.out.println("Recursiva A soma dos números de 0 até " + n + " é: " + soma);
        System.out.println("Interativa A soma dos números de 0 até " + n + " é: " + somai);

        int[] vetor = {7, 3,8, 5, 2}; // Altere os valores do vetor conforme necessário
        int resultado = somaElementos(vetor);
        System.out.println("A soma dos elementos do vetor é: " + resultado);

        int[] vetorR = {1, 2, 3, 4, 5};
        int resultadoR = somaElementos(vetorR, 0);
        System.out.println("A soma dos elementos do vetor é: " + resultadoR);


        int resultadoPar = somaElementosPares(vetor);
        System.out.println("A soma dos elementos pares do vetor é: " + resultadoPar);


        int resultadoRP = somaElementosParesR(vetor, 0);
        System.out.println("A soma dos elementos pares do vetor é: " + resultadoRP);


        int quantidadeImpares = contarElementosImpares(vetor);
        System.out.println("A quantidade de elementos ímpares no vetor é: " + quantidadeImpares);

        int valorX = 3; // Valor a ser contado
        int ocorrencias = contarOcorrencias(vetor, valorX);
        System.out.println("O valor " + valorX + " ocorre " + ocorrencias + " vezes no vetor.");

        int[] vetorOR = {1, 2, 3, 4, 3, 2, 1};
        int x = 2;
        int resultadoOR = contarOcorrenciasR(vetorOR, x, 0);
        System.out.println("O número de ocorrências de " + x + " no vetor é: " + resultadoOR);


        int num1 = 90;
        int num2 = 54;
        int resultado1 = mdc(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + resultado1);

        int num3 = 42;
        int num4 = 4;
        int resultado2 = mdcR(num3, num4);
        System.out.println("O MDC de " + num3+ " e " + num4 + " é: " + resultado2);

        int[] vetor1 = {7, 3, 9, 5, 2}; // Altere os valores do vetor conforme necessário
        int maiorElemento = encontrarMaiorElemento(vetor1);
        System.out.println("O maior elemento do vetor é: " + maiorElemento);

        int[] vetor2 = {7, 3, 9, 5, 2}; // Altere os valores do vetor conforme necessário
        int maiorElemento2 = encontrarMaiorElemento(vetor2, vetor.length);
        System.out.println("O maior elemento do vetor é: " + maiorElemento2);

        int numero1 = 132;
        int numero2 = 3417;
        System.out.println("Soma dos dígitos de " + numero1 + " é: " + somaDigitosi(numero1));
        System.out.println("Soma dos dígitos de " + numero2 + " é: " + somaDigitosi(numero2));

        int numero3 = 1324;
        int numero4 = 341;
        System.out.println("Soma dos dígitos de " + numero3 + " é: " + somaDigitosr(numero3));
        System.out.println("Soma dos dígitos de " + numero4 + " é: " + somaDigitosr(numero4));

        int numero6 = 9;
        int numero7 = 12;
        int numero8 = 32;
        System.out.println("Representação binária de " + numero6 + " é: " + representacaoBinariai(numero6));
        System.out.println("Representação binária de " + numero7 + " é: " + representacaoBinariai(numero7));
        System.out.println("Representação binária de " + numero8 + " é: " + representacaoBinariai(numero8));

        int numero9 = 5;
        int numero10 = 1;
        int numero11= 2;
        System.out.println("Representação binária de " + numero9 + " é: " + representacaoBinariar(numero9));
        System.out.println("Representação binária de " + numero10 + " é: " + representacaoBinariar(numero10));
        System.out.println("Representação binária de " + numero11+ " é: " + representacaoBinariar(numero11));

    }
}