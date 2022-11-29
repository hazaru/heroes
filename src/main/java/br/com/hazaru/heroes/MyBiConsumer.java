package br.com.hazaru.heroes;

import java.util.function.BiConsumer;

public class MyBiConsumer implements BiConsumer<Integer, Contas> {

    public void accept(Integer k, Contas v){
        System.out.print("Key = " + k);
        System.out.print("\t Value = " + v.getId() + " " + v.getDescricao() + " " + v.getDescricao() + " " + v.getValor());
        System.out.println();
    }

}
