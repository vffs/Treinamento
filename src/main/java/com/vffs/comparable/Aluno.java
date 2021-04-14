
package com.vffs.comparable;

/**
 *
 * @author valeria
 */
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;
    
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public Aluno(){        
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }

    @Override
    public int compareTo(Aluno t) {
        return this.getMatricula() - t.getMatricula();
    }    
    
}
