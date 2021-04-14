
package com.vffs.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author valeria
 */
public class ListExemplo {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
        for(String nome: nomes){
            System.err.println("Nome = " + nome);
        }
        
        nomes.set(3, "Roberto");
        System.out.println("posição 1 é: " + nomes.get(1));
        nomes.remove(4);
        nomes.remove("João");
        System.out.println("qt itens da lista é: " + nomes.size());
        System.err.println("existe na lista? " + nomes.contains("Juliana"));
        List<String> nomesNovo = new ArrayList<>();
        nomesNovo.add("Smael");
        nomesNovo.add("Rodrigo");
        nomesNovo.addAll(nomes);
        System.err.println("Nova lista" + nomesNovo ); 
        Collections.sort(nomesNovo);
        System.err.println("Nova lista" + nomesNovo ); 
        System.err.println("Está vazio? " + nomesNovo.isEmpty()); 
        
        
        
    }
}
