package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunosT1 = new String[10];
        String[] alunosT2 = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a turma do aluno " + nome + " (T1 ou T2): ");
            String turma = scanner.nextLine();

            if (turma.equalsIgnoreCase("T1")) {
                alunosT1[i] = nome;
            } else if (turma.equalsIgnoreCase("T2")) {
                alunosT2[i] = nome;
            } else {
                System.out.println("Turma inválida! Digite T1 ou T2.");
                i--;
            }
        }

        System.out.println("\nQuantidade de alunos na Turma T1: " + contarAlunos(alunosT1));
        System.out.println("Alunos da Turma T1:");
        exibirAlunos(alunosT1);

        System.out.println("\nQuantidade de alunos na Turma T2: " + contarAlunos(alunosT2));
        System.out.println("Alunos da Turma T2:");
        exibirAlunos(alunosT2);
    }

    public static int contarAlunos(String[] turma) {
        int count = 0;
        for (String aluno : turma) {
            if (aluno != null) {
                count++;
            }
        }
        return count;
    }

    public static void exibirAlunos(String[] turma) {
        for (String aluno : turma) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }
    }
}