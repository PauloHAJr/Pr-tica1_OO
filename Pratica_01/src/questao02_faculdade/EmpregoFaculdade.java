package questao02_faculdade;

public class EmpregoFaculdade {

        private String nome;
        private double salario;
        private int horasAula;

        public static void main(String args[]) {
            EmpregoFaculdade empregado = new EmpregoFaculdade();
            empregado.setDadosEmpregado(empregado);

            System.out.println("Gastos: " + empregado.getGastos());
            System.out.println("Info: " + empregado.getInfo());
        }

        double getGastos(){
            double bonus = horasAula * 40;
            salario += bonus;
            return this.salario;
        }
        String getInfo(){
            return "nome: " + this.nome +  " com salário: "  + getGastos();
        }
        public void setDadosEmpregado(EmpregoFaculdade empregado) {
        empregado.setNome("Pedro Madrigal");
        empregado.setSalario(2500);
        empregado.setHorasAula(8);
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public int getHorasAula() {
            return horasAula;
        }
        public void setHorasAula(int horasAula) {
            this.horasAula = horasAula;
        }

}
