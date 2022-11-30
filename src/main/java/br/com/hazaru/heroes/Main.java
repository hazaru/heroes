package br.com.hazaru.heroes;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.DoubleStream;

public class Main{
    public static void main(String[] args) {

        Heroes hero = new Heroes(1L, "Hazaru", HeroClass.DARK_ELF, HeroStyle.MAGIC, new ElfAttributes(10, 10, 10, 10, 10), HeroGender.MALE);

        System.out.println(hero);

    }


}


