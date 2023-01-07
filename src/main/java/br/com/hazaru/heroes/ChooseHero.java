package br.com.hazaru.heroes;

import br.com.hazaru.heroes.enums.HeroClass;

import java.io.Console;
import java.util.EventListener;
import java.util.function.Consumer;


public class ChooseHero implements EventListener {
    private String heroname;
    Console console = System.console();

    String chooseHeroName() {
        this.heroname = console.readLine();
        System.out.println("Choose your hero name");
        console.readLine();

        return heroname;
    }

    public void getHeroName(String heroname) {
        this.heroname = heroname;
    }

    public HeroClass chooseHero(Consumer<Integer> consumer) {
        System.out.println("Choose your hero class");

        HeroClass listHeroClass = HeroClass.valueOf(HeroClass.values().toString());

        System.out.println(listHeroClass.getHeroClass());

        System.out.println("1 - Human");
        System.out.println("2 - Elf");
        System.out.println("3 - Orc");
        System.out.println("4 - DarkElf");
        System.out.println("5 - Dwarf");
        Integer heroClassChoosed = 0;

        console.readLine();
        consumer.accept(heroClassChoosed);

        return listHeroClass;
    }

    public void chooseHeroClass() {
        System.out.println("Choose your hero Class");
        System.out.println("1 - Fighter");
        System.out.println("2 - Mage");
    }

    public void chooseHeroGender() {
        System.out.println("Choose your hero Gender");
        System.out.println("1 - Male");
        System.out.println("2 - Female");
    }

    public void chooseHeroStyle() {
        System.out.println("Choose your hero style");
    }

}
