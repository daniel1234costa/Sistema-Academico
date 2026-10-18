public class Matricula {
    private Aluno aluno;
    private Turma turma;
    private double nota1;
    private double nota2;
    private double nota3;
    private int faltas;

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.faltas = 0;
    }

    public void registrarNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void registrarFalta() {
        faltas++;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public int getFaltas() {
        return faltas;
    }

    public void exibirMedia() {
        System.out.println(turma.getDisciplina().getNome()
                + " (Turma " + turma.getCodigo() + "): média = "
                + String.format("%.2f", calcularMedia()));
    }

    public void exibirFaltas() {
        System.out.println(turma.getDisciplina().getNome()
                + " (Turma " + turma.getCodigo() + "): faltas = " + getFaltas());
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }
}
