
package com.vffs.comparable;

import java.util.Comparator;

/**
 *
 * @author valeria
 */
public class AlunoOrdenar implements Comparator<Aluno>{

    @Override
    public int compare(Aluno t, Aluno t1) {
       return t.getMatricula() - t1.getMatricula();
    }
    
}
