package controller;

import model.Aluno;
import java.util.ArrayList;

public class AlunoController {
    private ArrayList<Aluno> listaAlunos;

    public AlunoController(){
        listaAlunos = new ArrayList<>();
    }

    public void setAluno(Aluno a){
        listaAlunos.add(a);
    }
    public Aluno getAluno(int index){
        return listaAlunos.get(index);
    }
    public String mostrarAlunos(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a :listaAlunos){
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void removerAluno(int index){
        listaAlunos.remove(index);
    }

    public int acharAluno(Aluno aluno_procurado){
        return listaAlunos.indexOf(aluno_procurado);
    }

    public void atualizarCiclo(){
        for(Aluno aluno : listaAlunos){
            aluno.setCiclo(aluno.getCiclo()+1);
        }
    }

    public void esvaziarAluno(){
        listaAlunos.clear();
    }
}
