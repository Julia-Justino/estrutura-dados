package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaObj<Heroi> listaHerois = new ListaObj<>(5);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar um heroi na lista");
            System.out.println("2 - Exibir os herois cadastrados");
            System.out.println("3 - Ordenar a lista");
            System.out.println("4 - Fim do programa");
            System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner
                switch (opcao) {
                    case 1:
                        adicionarHeroi(listaHerois, scanner);

                        break;
                    case 2:
                        exibirHerois(listaHerois);
                        break;
                    case 3:
                        ordenarLista(listaHerois);
                        break;
                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");

            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void adicionarHeroi(ListaObj<Heroi> listaHerois, Scanner scanner) {
        System.out.println("Digite o ID do heroi:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o nome do heroi:");
        String nome = scanner.nextLine();
        System.out.println("Digite o nível do heroi:");
        int nivel = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o poder principal do heroi:");
        String poderPrincipal = scanner.nextLine();
        System.out.println("Digite os pontos de vida do heroi:");
        int pontosVida = scanner.nextInt();
        System.out.println("Digite os pontos de mana do heroi:");
        int pontosMana = scanner.nextInt();
        System.out.println("Digite a força do heroi:");
        double forca = scanner.nextDouble();
        System.out.println("Digite a destreza do heroi:");
        int destreza = scanner.nextInt();
        System.out.println("Digite a inteligência do heroi:");
        int inteligencia = scanner.nextInt();
        System.out.println("Digite a resistência ao fogo do heroi:");
        int resistenciaFogo = scanner.nextInt();
        System.out.println("Digite a resistência ao gelo do heroi:");
        int resistenciaGelo = scanner.nextInt();
        System.out.println("Digite a resistência à eletricidade do heroi:");
        int resistenciaEletricidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite as habilidades especiais do heroi (separadas por vírgula):");
        String[] habilidadesEspeciais = scanner.nextLine().split(",");
        System.out.println("Digite o inventário do heroi (separado por vírgula):");
        String[] inventario = scanner.nextLine().split(",");
        System.out.println("Digite os aliados do heroi (separados por vírgula):");
        String[] aliados = scanner.nextLine().split(",");

        Heroi heroi = new Heroi(id, nome, nivel, poderPrincipal, pontosVida, pontosMana, forca, destreza, inteligencia,
                resistenciaFogo, resistenciaGelo, resistenciaEletricidade, habilidadesEspeciais, inventario, aliados);

        listaHerois.adiciona(heroi);
        System.out.println("Herói adicionado com sucesso!");
    }

    public static void exibirHerois(ListaObj<Heroi> listaHerois) {
        if (listaHerois.getTamanho() == 0) {
            System.out.println("\nA lista de heróis está vazia.");
        } else {
            System.out.println("\nLista de Heróis:");
            System.out.printf("%-5s | %-15s | %-5s | %-15s | %-10s | %-10s%n",
                    "ID", "Nome", "Nível", "Poder Principal", "Pontos Vida", "Pontos Mana");
            System.out.println("-------------------------------------------------------------");
            for (int i = 0; i < listaHerois.getTamanho(); i++) {
                Heroi heroi = listaHerois.getElemento(i);
                System.out.printf("%-5d | %-15s | %-5d | %-15s | %-10d | %-15d%n",
                        heroi.getId(), heroi.getNome(), heroi.getNivel(), heroi.getPoderPrincipal(),
                        heroi.getPontosVida(), heroi.getPontosMana());
            }
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static void ordenarLista(ListaObj<Heroi> listaHerois) {
        // Lógica para ordenar a lista de heróis utilizando o Quicksort
        quickSort(listaHerois, 0, listaHerois.getTamanho() - 1);
        System.out.println("Lista de heróis ordenada.");
    }

    public static void quickSort(ListaObj<Heroi> listaHerois, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particiona(listaHerois, inicio, fim);
            quickSort(listaHerois, inicio, indicePivot - 1);
            quickSort(listaHerois, indicePivot + 1, fim);
        }
    }

    public static int particiona(ListaObj<Heroi> listaHerois, int inicio, int fim) {
        Heroi pivot = listaHerois.getElemento(fim);
        int indiceMenor = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (listaHerois.getElemento(j).getId() < pivot.getId()) {
                indiceMenor++;
                troca(listaHerois, indiceMenor, j);
            }
        }

        troca(listaHerois, indiceMenor + 1, fim);
        return indiceMenor + 1;
    }

    public static void troca(ListaObj<Heroi> listaHerois, int i, int j) {
        Heroi temp = listaHerois.getElemento(i);
        listaHerois.adiciona(listaHerois.getElemento(j));
        listaHerois.adiciona(temp);
    }
}
