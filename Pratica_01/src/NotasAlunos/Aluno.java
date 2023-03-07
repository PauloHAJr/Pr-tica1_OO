package NotasAlunos;

public class Aluno {
    String nome;
    String matricula;
    double notaAV1, notaAV2, notaAE;
    String curso;
    String periodo;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, String periodo) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alternaNotaAV1(double notaAV1){
        if(this.notaAV1 != notaAV1){
            this.notaAV1 = notaAV1;
        }
    }

    public void alternaNotaAV2(double notaAV2){
        if(this.notaAV2 != notaAV2){
            this.notaAV2 = notaAV2;
        }
    }
    public void alternaNotaAE(double notaAE){
        if(this.notaAE != notaAE){
            this.notaAE = notaAE;
        }
    }

    public String avaliarAluno() {
        if(this.notaAV1 + this.notaAV2 >= 60) {
            return "Aluno aprovado.";
        } else {
            return "Recuperação.";
        }
    }

    public String avaliarRecuperacao(double notaAE) {
        if((this.notaAV1 + this.notaAV2 + notaAE)/3 >= 60) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAE() {
        return notaAE;
    }

    public void setNotaAE(double notaAE) {
        this.notaAE = notaAE;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
