package br.com.hazaru.heroes;

import br.com.hazaru.heroes.enums.HeroClass;
import br.com.hazaru.heroes.enums.HeroGender;
import br.com.hazaru.heroes.enums.HeroStyle;

import java.io.*;

public class AppBoot {
    public static void main(String[] args) {

        ChooseHero chooseHero = new ChooseHero();

        Console c = System.console();

        String heroClass = chooseHero.chooseHeroName();

        String heroType = c.readLine("Hero type:");


        Heroes hero = new Heroes(1L, "Hazaru", HeroClass.valueOf(HeroClass.values().toString()), HeroStyle.MAGIC, new ElfAttributes(10, 10, 10, 10, 10), HeroGender.MALE);

        System.out.println(hero);

    }


}


