package br.com.hazaru.heroes;

import br.com.hazaru.heroes.enums.HeroClass;
import br.com.hazaru.heroes.enums.HeroGender;
import br.com.hazaru.heroes.enums.HeroStyle;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class AppBoot {
    public static void main(String[] args) {

        ChooseHero chooseHero = new ChooseHero();

        Console c = System.console();

        String choosedHeroName = chooseHero.alreadyChoosedHeroNameByUser();

        Long showCountOfExistingClasses = Arrays.stream(HeroClass.values()).count();

        Logger.getLogger("Select between " + showCountOfExistingClasses + " classes");

        HeroClass heroClass = chooseHero.chooseOptionHeroClass();

        Heroes hero = new Heroes(1L, choosedHeroName, heroClass, HeroStyle.MAGIC, new InitialElfAttributes(10, 10, 10, 10, 10), HeroGender.valueOf(HeroGender.MALE.name()));

        System.out.println(hero);

    }


}


