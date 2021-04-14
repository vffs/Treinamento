
package com.vffs.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author valeria
 */
public class ComparableExamplo {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno("Pedro", 115));
        alunos.add(new Aluno("João", 113));
        alunos.add(new Aluno("Maria", 114));
        alunos.add(new Aluno("Carlos", 111));
        
       for(Aluno aluno: alunos){
           System.out.println(aluno.getNome() + " " + aluno.getMatricula());
       }
       Collections.sort(alunos , new AlunoOrdenar());
       System.out.println(alunos);
       Collections.sort(alunos);
       System.out.println(alunos);
       alunos.sort((first, second) -> second.getMatricula() - first.getMatricula() );
       System.out.println(alunos);
       alunos.sort(Comparator.comparingInt(Aluno::getMatricula));
       System.out.println(alunos);
       alunos.sort(Comparator.comparingInt(Aluno::getMatricula).reversed());
       System.out.println(alunos);
    }
}
