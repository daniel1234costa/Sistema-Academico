import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private ArrayList<Turma> turmas;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.turmas = new ArrayList<Turma>();
    }

    public Turma adicionarTurma(String codigoTurma) {
        Turma t = new Turma(codigoTurma, this);
        turmas.add(t);
        return t;
    }

    public Turma buscarTurma(String codigoTurma) {
        for (Turma t : turmas) {
            if (t.getCodigo().equals(codigoTurma)) {
                return t;
            }
        }
        return null;
    }

    public Matricula matricular(Aluno aluno, String codigoTurma) {
        Turma t = buscarTurma(codigoTurma);
        if (t == null) {
            return null;
        }
        for (Matricula existente : t.getMatriculas()) {
            if (existente.getAluno() == aluno) {
                return null;
            }
        }
        Matricula m = new Matricula(aluno, t);
        t.adicionarMatricula(m);
        aluno.adicionarMatricula(m);
        return m;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
