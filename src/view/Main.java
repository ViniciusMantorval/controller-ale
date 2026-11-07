package view;

import controller.AlunoController;
import model.Aluno;

public class Main {

    public static void main(String[] args) {
        AlunoController ac = new AlunoController();
        Aluno a = new Aluno(67,"Cabinha","PQ",2);

        ac.setAluno(a);
        ac.setAluno(new Aluno(10, " ALe", "ADS", 1));
        ac.setAluno(new Aluno(10, " São Paulo", "DSM", 6));
        ac.setAluno(new Aluno(10, " Jundiai", "MKT", 3));
        ac.setAluno(new Aluno(10, " Mark", "DSM", 2));

        System.out.println(ac.getAluno(2));
        System.out.println(ac.mostrarAlunos());
        System.out.println(ac.acharAluno(a));
        ac.removerAluno(0);
        System.out.println(ac.mostrarAlunos());
        ac.atualizarCiclo();
        System.out.println(ac.mostrarAlunos());
        ac.esvaziarAluno();
        System.out.println(ac.mostrarAlunos());
    }
}