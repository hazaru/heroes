package br.com.hazaru.heroes;

import java.io.Console;


public class ChooseHero {

    Console console = System.console();
    public String chooseHeroName() {
        String nome = console.readLine();
        System.out.println("Choose your hero name");
        console.readLine();

        return nome;
    }



    public void chooseHero() {
        System.out.println("Choose your hero class");
        System.out.println("1 - Human");
        System.out.println("2 - Elf");
        System.out.println("3 - Orc");
        System.out.println("4 - DarkElf");
        System.out.println("5 - Dwarf");
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
