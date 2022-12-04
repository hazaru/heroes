package br.com.hazaru.heroes;

import java.io.*;
import java.util.function.Consumer;

public class Main{
    public static void main(String[] args) {

        Console c = System.console();

        String heroClass = c.readLine("Hero class:");

        String heroType = c.readLine("Hero type:");


        Heroes hero = new Heroes(1L, "Hazaru", HeroClass.DARK_ELF, HeroStyle.MAGIC, new ElfAttributes(10, 10, 10, 10, 10), HeroGender.MALE);

        System.out.println(hero);

    }


}


