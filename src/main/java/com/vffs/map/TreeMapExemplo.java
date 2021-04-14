
package com.vffs.map;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author valeria
 */
public class TreeMapExemplo {
    
    public static void main(String[] args) {
        TreeMap<String, String> estadosBrasileiros = new TreeMap<>();
        
        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("AP", "Amapá");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("CE", "Ceará");
        estadosBrasileiros.put("ES", "Espírito Santo");
        estadosBrasileiros.put("GO", "Goiás");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("PA", "Pará");
        estadosBrasileiros.put("PB", "Paraíba");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piauí");
        estadosBrasileiros.put("PR", "Paraná");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("RO", "Rondônia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("TO", "Tocantins");
        
        System.out.println(estadosBrasileiros);
        estadosBrasileiros.remove("MG");
        System.out.println(estadosBrasileiros);
        estadosBrasileiros.put("DF", "Distrito Federal");
        System.out.println(estadosBrasileiros.size());
        System.out.println(estadosBrasileiros);
                
        for(Map.Entry<String, String> estados: estadosBrasileiros.entrySet()){
            System.out.println(estados.getValue() + " - " + estados.getKey());
            
        }
        System.out.println(estadosBrasileiros.containsKey("SC"));
        System.out.println(estadosBrasileiros.containsValue("Maranhão"));
    }
}
