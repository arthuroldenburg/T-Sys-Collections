import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        class Aluno {
            String nome;
            double nota;

            public Aluno() {}

            public Aluno(String nome, double nota) {
                this.nome = nome;
                this.nota = nota;
            }
        }

        Map<String, Aluno> alunos = new HashMap<>();
        alunos.put("Arthur", new Aluno("Arthur", 60));
        alunos.put("Alexsandro", new Aluno("Alexsandro", 70));
        alunos.put("Aldino", new Aluno("Aldino", 80));
        alunos.put("Alvino", new Aluno("Alvino", 90));
        alunos.put("Alcino", new Aluno("Alcino", 65));

//        ----------------------------------- Criacao do hash e adicao de valores --------------------------------------------------


//        alunos.entrySet().stream().forEach(e -> System.out.println("Nome: " + e.getKey() + " Nota: " + e.getValue().nota));

//        ----------------------------------- 1 Questao --------------------------------------------------

//        System.out.println("Digite o nome do aluno:");
//        String name = s.nextLine();
//
//        alunos.entrySet().stream()
//                .filter(e -> e.getKey().equals(name))
//                .findFirst()
//                .ifPresentOrElse(e -> System.out.println(e.getValue().nota), () -> System.out.println("Nao existe esse aluno"));
//
//        System.out.println("Nota maior que:");
//        double grade = s.nextDouble();
//
//        alunos.entrySet().stream()
//                .filter(e -> e.getValue().nota > grade)
//                .forEach(e -> System.out.println(e.getKey()));

//        ----------------------------------- 2 Questao --------------------------------------------------

//        System.out.println("Nota de corte:");
//        double cutGrade = s.nextDouble();
//
//        alunos.entrySet().stream()
//                .filter(e -> e.getValue().nota < cutGrade)
//                .forEach(e -> System.out.println(e.getKey()));

//        ----------------------------------- 3 Questao --------------------------------------------------

//        System.out.println("Digite a nota para classificar os alunos:");
//        double grade = s.nextDouble();
//
//        alunos.entrySet().stream()
//                .filter(e -> e.getValue().nota >= grade)
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(e -> System.out.println(e.getKey() + " - Nota: " + e.getValue().nota));

//        ----------------------------------- 4 Questao --------------------------------------------------

        Map<String, List<Aluno>> alunoAgrupadosPorNota = new HashMap<>();

        List<Aluno> alunosAcimaDe89 = new ArrayList<>();
        List<Aluno> alunosAcimaDe79 = new ArrayList<>();
        List<Aluno> alunosAcimaDe69 = new ArrayList<>();
        List<Aluno> alunosAcimaDe59 = new ArrayList<>();
        List<Aluno> alunosAcimaDe49 = new ArrayList<>();
        List<Aluno> alunosAcimaDe39 = new ArrayList<>();
        List<Aluno> alunosAcimaDe29 = new ArrayList<>();
        List<Aluno> alunosAcimaDe19 = new ArrayList<>();
        List<Aluno> alunosAcimaDe09 = new ArrayList<>();
        List<Aluno> alunosAbaixoDe10 = new ArrayList<>();


        for(Map.Entry<String, Aluno> aluno : alunos.entrySet()) {
            if(aluno.getValue().nota >= 90 && aluno.getValue().nota <= 100) {
                alunosAcimaDe89.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 80 && aluno.getValue().nota < 90) {
                alunosAcimaDe79.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 70 && aluno.getValue().nota < 80) {
                alunosAcimaDe69.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 60 && aluno.getValue().nota < 70) {
                alunosAcimaDe59.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 50 && aluno.getValue().nota < 60) {
                alunosAcimaDe49.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 40 && aluno.getValue().nota < 50) {
                alunosAcimaDe39.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 30 && aluno.getValue().nota < 40) {
                alunosAcimaDe29.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 20 && aluno.getValue().nota < 30) {
                alunosAcimaDe19.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 10 && aluno.getValue().nota < 20) {
                alunosAcimaDe09.add(aluno.getValue());
            }
            if (aluno.getValue().nota >= 0 && aluno.getValue().nota < 10) {
                alunosAbaixoDe10.add(aluno.getValue());
            }

        }

        alunoAgrupadosPorNota.put("A", alunosAcimaDe89);
        alunoAgrupadosPorNota.put("B", alunosAcimaDe79);
        alunoAgrupadosPorNota.put("C", alunosAcimaDe69);
        alunoAgrupadosPorNota.put("D", alunosAcimaDe59);
        alunoAgrupadosPorNota.put("E", alunosAcimaDe49);
        alunoAgrupadosPorNota.put("F", alunosAcimaDe39);
        alunoAgrupadosPorNota.put("G", alunosAcimaDe29);
        alunoAgrupadosPorNota.put("H", alunosAcimaDe19);
        alunoAgrupadosPorNota.put("I", alunosAcimaDe09);
        alunoAgrupadosPorNota.put("J", alunosAbaixoDe10);

        alunoAgrupadosPorNota.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

//        ----------------------------------- 5 Questao --------------------------------------------------


    }
}