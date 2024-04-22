package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Profissao prof1 = new Profissao(3000.0, "Desenvolvedor", 1, "TI", "Plano de saúde", 1);
        Profissao prof2 = new Profissao(2500.0, "Analista de Dados", 2, "BI", "Vale-refeição", 2);
        Profissao prof3 = new Profissao(4000.0, "Engenheiro de Software", 3, "TI", "Plano de saúde, Vale-refeição", 1);
        Profissao prof4 = new Profissao(3500.0, "Gerente de Projetos", 4, "PMO", "Plano de saúde, Vale-alimentação", 3);
        Profissao prof5 = new Profissao(2800.0, "Analista de Sistemas", 5, "TI", "Vale-refeição", 2);
        Profissao prof6 = new Profissao(3200.0, "Arquiteto de Software", 6, "TI", "Plano de saúde, Vale-alimentação", 1);
        Profissao prof7 = new Profissao(2700.0, "DBA", 7, "DBA", "Vale-refeição", 2);
        Profissao prof8 = new Profissao(3800.0, "Scrum Master", 8, "PMO", "Plano de saúde, Vale-refeição", 3);

        Profissao[] vetorProfissoes = {prof1, prof2, prof3, prof4, prof5, prof6, prof7, prof8};

        for (Profissao profissao : vetorProfissoes) {
            System.out.println("Salário do funcionário: " + profissao.getSalario());
        }

        Funcionario funcionario = new Funcionario();
        funcionario.ordernarBubble(vetorProfissoes);

        System.out.println("\nCargos dos funcionários após ordenação pela ID:");
        for (Profissao profissao : vetorProfissoes) {
            System.out.println("Cargo do funcionário: " + profissao.getCargo());
        }

        double[] salarios = new double[vetorProfissoes.length];
        for (int i = 0; i < vetorProfissoes.length; i++) {
            salarios[i] = vetorProfissoes[i].getSalario();
        }

        funcionario.ordernarSelectionO(salarios);

        System.out.println("\nSalários dos funcionários após ordenação usando Selection Sort:");
        for (double salario : salarios) {
            System.out.println("Salário do funcionário: " + salario);
        }

        int[] idsSquad = new int[vetorProfissoes.length];
        for (int i = 0; i < vetorProfissoes.length; i++) {
            idsSquad[i] = vetorProfissoes[i].getIdSquad();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o ID do squad para pesquisar: ");
        int idSquadPesquisar = scanner.nextInt();
        int indice = funcionario.pesquisaBinaria(idsSquad, idSquadPesquisar);

        if (indice != -1) {
            System.out.println("Squad encontrado na posição: " + indice);
        } else {
            System.out.println("Squad não encontrado no array.");
        }
    }
}
