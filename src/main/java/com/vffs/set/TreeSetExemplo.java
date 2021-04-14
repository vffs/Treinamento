
package com.vffs.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author valeria
 */
public class TreeSetExemplo {
    
    public static void main(String[] args) {
        TreeSet<Integer> notasAluno = new TreeSet<>();
        
        notasAluno.add(3);
        notasAluno.add(88);
        notasAluno.add(20);
        notasAluno.add(44);
        notasAluno.add(3);
        
        for(Integer nota: notasAluno){
            System.out.println("for => " + nota);
        }
        
        Iterator itaratorNotasAluno = notasAluno.iterator();
        
        while(itaratorNotasAluno.hasNext()){
            System.out.println("iterator => " + itaratorNotasAluno.next());
        }
        
        notasAluno.remove(3);        
        System.out.println(notasAluno);
        notasAluno.add(23);
        System.out.println(notasAluno);
        System.out.println("tamanho " + notasAluno.size());
        System.out.println(notasAluno.isEmpty());
        
    }
}
