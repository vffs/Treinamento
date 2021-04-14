
package com.vffs.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author valeria
 */
public class QueueExemplo {
    
    public static void main(String[] args) {
        Queue<String> filaPadaria = new LinkedList<>();

        filaPadaria.add("Juliana");
        filaPadaria.add("Pedro");
        filaPadaria.add("Carlos");
        filaPadaria.add("Larissa");
        filaPadaria.add("João");
        
        for(String cliente: filaPadaria){
            System.err.println("for => " + cliente);
        }
        
        Iterator<String> interatorFilaPadaria = filaPadaria.iterator();
        
        while(interatorFilaPadaria.hasNext()){
            System.out.println("interator => " + interatorFilaPadaria.next());
        }
        
        System.out.println(filaPadaria.peek());
        String cliente = filaPadaria.poll();
        System.out.println(cliente);
        System.out.println(filaPadaria);
        filaPadaria.add("Daniel");
        System.out.println(filaPadaria);
        System.out.println("Quantos estão na fila => " + filaPadaria.size());
        System.err.println("Carlos está na lista? " +  filaPadaria.contains("Carlos"));
       
        
    }
}
