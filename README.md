# Sistema Acadêmico — Modelagem de Classes de Projeto

Atividade da disciplina de Análise e Projeto de Sistemas Orientado a Objetos (UFERSA — Pau dos Ferros).

**Aluno:** [Francisco Daniel Costa de Souza]
**Professor:** José Ferdinandy Silva Chagas

## Descrição

Modelo de classes de projeto de um sistema acadêmico, com o diagrama feito no Astah UML e o código Java equivalente.

Requisitos atendidos:
- Cadastro de disciplinas, alunos, professores e turmas
- Registro de faltas
- Cálculo da média do aluno: `M = (nota1 + nota2 + nota3) / 3`

Regras de negócio:
- Cada aluno está matriculado em várias disciplinas
- Cada professor pode lecionar várias disciplinas
- Cada disciplina tem várias turmas



## Classes

| Classe | Responsabilidade |
|---|---|
| `Aluno` | Guarda os dados do aluno e a lista de matrículas; exibe médias e faltas de todas as suas turmas |
| `Matricula` | Liga um aluno a uma turma; guarda as três notas e as faltas; calcula a média |
| `Turma` | Pertence a uma disciplina; guarda as matrículas dos alunos da turma |
| `Disciplina` | Guarda suas turmas; cria turmas e realiza a matrícula do aluno em uma turma |
| `Professor` | Guarda os dados do professor e as disciplinas que leciona |
| `Adm` | Centraliza os cadastros e a busca de alunos, professores e disciplinas |

## Objetivos da atividade

| Objetivo | Método |
|---|---|
| Calcular a média de um aluno | `Matricula.calcularMedia()` |
| Obter as faltas de um aluno | `Matricula.getFaltas()` |
| Exibir a média e as faltas de um aluno | `Matricula.exibirMedia()`, `Matricula.exibirFaltas()`, `Aluno.exibirMedias()`, `Aluno.exibirFaltas()` |

## Como a matrícula funciona

1. A `Disciplina` cria suas turmas com `adicionarTurma()`.
2. `Adm.matricular()` busca o aluno e a disciplina.
3. `Disciplina.matricular()` procura a turma e cria a `Matricula`.
4. A matrícula é adicionada à lista da `Turma` e à lista do `Aluno`.

Se a turma não existir ou o aluno já estiver nela, nenhuma matrícula é criada.

