package questao03_notas_alunos;
import java.util.Scanner;

public class TesteNota {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Número de matricula: ");
        aluno.setMatricula(sc.nextLine());
        System.out.println("Nota da AV1: ");
        aluno.setNotaAV1(sc.nextDouble());
        System.out.println("Nota da AV2: ");
        aluno.setNotaAV2(sc.nextDouble());
        System.out.println("Nota da AE: ");
        aluno.setNotaAE(sc.nextDouble());
        System.out.println("Nome do curso: ");
        aluno.setCurso(sc.next());
        System.out.println("Período: ");
        aluno.setPeriodo(sc.next());

        System.out.println(aluno.avaliarAluno());

        if(aluno.avaliarAluno().equals("Reprovado"))
            System.out.println(aluno.avaliarRecuperacao(0));

        sc.close();
    }

}

