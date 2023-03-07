package NotasAlunos;
import java.util.Scanner;

public class TesteNota {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Matricula: ");
        aluno.setMatricula(sc.nextLine());
        System.out.println("AV1: ");
        aluno.setNotaAV1(sc.nextDouble());
        System.out.println("AV2: ");
        aluno.setNotaAV2(sc.nextDouble());
        System.out.println("AE: ");
        aluno.setNotaAE(sc.nextDouble());
        System.out.println("Curso: ");
        aluno.setCurso(sc.nextLine());
        System.out.println("Periodo: ");
        aluno.setPeriodo(sc.nextLine());

        System.out.println(aluno.avaliarAluno());

        if(aluno.avaliarAluno().equals("Reprovado"))
            System.out.println(aluno.avaliarRecuperacao(0));

        sc.close();
    }

}

