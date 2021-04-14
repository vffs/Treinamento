
package com.vffs.optional;

import java.util.Optional;

/**
 *
 * @author valeria
 */
public class OptionalExemplo {
    
    public static void main(String[] args) {
        Optional<String> optionalPresente = Optional.of("Valor presente");
        Optional<String> optionalVazio = Optional.empty();
        Optional<String> optionalNull = Optional.ofNullable(null);
        
        optionalPresente.ifPresentOrElse(System.out::println,() -> System.err.println("Não está Presente"));
        optionalVazio.ifPresentOrElse(System.out::println, () -> System.err.println("Está vazio"));
        if(optionalPresente.isPresent()){
            String valor = optionalPresente.get();
            System.err.println(valor);
        }
        optionalPresente.map((valor) -> valor.concat(" **** ")).ifPresent(System.out::println);
        optionalNull.orElseThrow(IllegalStateException::new);
        
        
    }
}
