import java.util.ArrayList;

public class Professor {
    private String nome;
    private String cpf;
    private String telefone;
    private String registro;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String telefone, String registro) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.registro = registro;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void atualizarDados(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRegistro() {
        return registro;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
