package org.example;

public class Funcionario {
    public double[] ordernarSelectionO(double[] salario){
        int n = salario.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (salario[j] < salario[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = salario[minIndex];
                salario[minIndex] = salario[i];
                salario[i] = temp;
            }
        }
        return salario;
    }

    public Profissao[] ordernarBubble(Profissao[] profissoes){
        int n = profissoes.length;
        boolean mesmo;

        for (int i = 0; i < n - 1; i++) {
            mesmo = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (profissoes[j].getIdFuncionario() > profissoes[j + 1].getIdFuncionario()) {
                    // Troca os elementos se estiverem fora de ordem
                    Profissao temp = profissoes[j];
                    profissoes[j] = profissoes[j + 1];
                    profissoes[j + 1] = temp;
                    mesmo = true;
                }
            }
            // Se nenhum elemento foi trocado na iteração interna, o array está ordenado
            if (!mesmo) {
                break;
            }
        }
        return profissoes;
    }


    public static int pesquisaBinaria(int[] idSquad, int t) {
        int esq = 0;
        int dir = idSquad.length - 1;

        while (esq <= dir) {
            int media = esq + (dir - esq) / 2;
            if (idSquad[media] == t) {
                return media;
            }
            if (idSquad[media] > t) {
                dir = media - 1;
            }
            else {
                esq = media + 1;
            }
        }
        return -1;
    }
}
