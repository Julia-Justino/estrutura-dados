import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAluno;

        do {
            System.out.print("Digite o número máximo de alunos (entre 5 e 15): ");
            maxAluno = scanner.nextInt();
        } while (maxAluno < 5 || maxAluno > 15);

        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] media = new double[2];
        double[] mediaAluno = new double[maxAluno];

        System.out.println("Digite os nomes dos alunos:");
        for (int i = 0; i < maxAluno; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            aluno[i] = scanner.next();
        }

        for (int i = 0; i < maxAluno; i++) {
            System.out.println("Digite as notas do aluno " + aluno[i] + ":");
            System.out.print("Nota AC1: ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Nota AC2: ");
            notas[i][1] = scanner.nextDouble();
        }

        calcularMedia(notas, media);
        calcularMediaAluno(notas, mediaAluno);

        System.out.println("\n-------------------------------------------");
        System.out.println("NOME DO ALUNO    NOTA AC1    NOTA AC2    MÉDIA DO ALUNO");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < maxAluno; i++) {
            System.out.printf("%-16s %8.1f %11.1f %14.1f\n", aluno[i], notas[i][0], notas[i][1], mediaAluno[i]);
        }
        System.out.println("-------------------------------------------");
        System.out.printf("MÉDIA DA AC%10.1f %11.1f\n", media[0], media[1]);
    }

    public static void calcularMedia(double[][] notas, double[] media) {
        double somaAC1 = 0, somaAC2 = 0;
        for (int i = 0; i < notas.length; i++) {
            somaAC1 += notas[i][0];
            somaAC2 += notas[i][1];
        }
        media[0] = somaAC1 / notas.length;
        media[1] = somaAC2 / notas.length;
    }

    public static void calcularMediaAluno(double[][] notas, double[] mediaAluno) {
        for (int i = 0; i < notas.length; i++) {
            mediaAluno[i] = (notas[i][0] + notas[i][1]) / 2;
        }
    }
}
