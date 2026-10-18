public class Main {
    public static void main(String[] args) {
        Adm adm = new Adm();

        Aluno aluno = new Aluno("Maria Silva", "123.456.789-00", "(84) 99999-0000", "2026001");
        adm.cadastrarAluno(aluno);

        Professor professor = new Professor("Carlos Souza", "987.654.321-00", "(84) 98888-0000", "P001");
        adm.cadastrarProfessor(professor);

        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO");
        poo.adicionarTurma("T01");
        poo.adicionarTurma("T02");
        adm.cadastrarDisciplina(poo);
        professor.adicionarDisciplina(poo);

        Disciplina bd = new Disciplina("Banco de Dados", "BD");
        bd.adicionarTurma("T01");
        adm.cadastrarDisciplina(bd);
        professor.adicionarDisciplina(bd);

        Matricula m1 = adm.matricular("2026001", "POO", "T02");
        Matricula m2 = adm.matricular("2026001", "BD", "T01");

        m1.registrarNotas(8.0, 7.5, 9.0);
        m1.registrarFalta();
        m1.registrarFalta();

        m2.registrarNotas(6.0, 7.0, 5.5);
        m2.registrarFalta();

        System.out.println("Aluno: " + aluno.getNome());
        aluno.exibirMedias();
        aluno.exibirFaltas();

        System.out.println("Faltas em POO: " + m1.getFaltas());
        System.out.println("Média em BD: " + String.format("%.2f", m2.calcularMedia()));

        aluno.atualizarDados("Maria S. Silva", "(84) 97777-0000");
        System.out.println("Aluno atualizado: " + aluno.getNome());

        adm.removerAluno("2026001");
        System.out.println("Aluno encontrado após remoção: " + (adm.buscarAluno("2026001") != null));
    }
}
