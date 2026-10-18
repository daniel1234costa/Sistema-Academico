import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private String telefone;
    private String registro;
    private ArrayList<Matricula> matriculas;

    public Aluno(String nome, String cpf, String telefone, String registro) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.registro = registro;
        this.matriculas = new ArrayList<Matricula>();
    }

    public void adicionarMatricula(Matricula m) {
        matriculas.add(m);
    }

    public void exibirMedias() {
        for (Matricula m : matriculas) {
            m.exibirMedia();
        }
    }

    public void exibirFaltas() {
        for (Matricula m : matriculas) {
            m.exibirFaltas();
        }
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

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
}
