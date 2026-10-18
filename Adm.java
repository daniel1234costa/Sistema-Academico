import java.util.ArrayList;

public class Adm {
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    public Adm() {
        this.alunos = new ArrayList<Aluno>();
        this.professores = new ArrayList<Professor>();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void cadastrarAluno(Aluno a) {
        alunos.add(a);
    }

    public Aluno buscarAluno(String registro) {
        for (Aluno a : alunos) {
            if (a.getRegistro().equals(registro)) {
                return a;
            }
        }
        return null;
    }

    public boolean editarAluno(String registro, String novoNome, String novoTelefone) {
        Aluno a = buscarAluno(registro);
        if (a == null) {
            return false;
        }
        a.atualizarDados(novoNome, novoTelefone);
        return true;
    }

    public boolean removerAluno(String registro) {
        Aluno a = buscarAluno(registro);
        if (a == null) {
            return false;
        }
        return alunos.remove(a);
    }

    public void cadastrarProfessor(Professor p) {
        professores.add(p);
    }

    public Professor buscarProfessor(String registro) {
        for (Professor p : professores) {
            if (p.getRegistro().equals(registro)) {
                return p;
            }
        }
        return null;
    }

    public void cadastrarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public Matricula matricular(String registroAluno, String codigoDisciplina, String codigoTurma) {
        Aluno a = buscarAluno(registroAluno);
        Disciplina d = buscarDisciplina(codigoDisciplina);
        if (a == null || d == null) {
            return null;
        }
        return d.matricular(a, codigoTurma);
    }
}
