import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private ArrayList<Matricula> matriculas;

    public Turma(String codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.matriculas = new ArrayList<Matricula>();
    }

    public void adicionarMatricula(Matricula m) {
        matriculas.add(m);
    }

    public String getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
}
