package br.com.hazaru.heroes;

import br.com.hazaru.heroes.enums.HeroClass;

import java.util.EventListener;
import java.util.Scanner;
import java.util.logging.Logger;


public class ChooseHero implements EventListener {
    private static String heroName;
    private static int HERO_LIST_NUMBERED = 1;

    private Scanner scanner;

    public ChooseHero(Scanner scanner) {
        this.scanner = scanner;

    }

    public ChooseHero() {
        this.scanner = scanner;

    }


    private static String chooseHeroName() {

        Scanner scannerToChooseName = new Scanner(System.in);

        System.out.println("Choose your hero name");
        heroName = scannerToChooseName.nextLine();

        return heroName;
    }

    public String alreadyChoosedHeroNameByUser() {
        return chooseHeroName();
    }

    public void getHeroName(String heroname) {
        this.heroName = heroname;
    }

    public HeroClass chooseOptionHeroClass() {

        int consumer;
        System.out.println("Choose your hero class:");

        //List all heroes from actual list
        listHeroClassPerKeyAndValue();

        Scanner scanerHeroClass = new Scanner(System.in);

        consumer = scanerHeroClass.nextInt();

        isChoosedValidHero(consumer);

        return heroChoosed(consumer);

    }

    private HeroClass heroChoosed(int consumer) {

        HeroClass heroClass = HeroClass.values()[consumer];

        return heroClass;
    }


    private static void listHeroClassPerKeyAndValue() {
        for (HeroClass hero : HeroClass.values()
        ) {
            System.out.println(HERO_LIST_NUMBERED + " - " + hero.name());
            HERO_LIST_NUMBERED++;
        }
    }

    private Boolean isChoosedValidHero(int heroListNumber) {
        if (heroListNumber <= 0 || heroListNumber > 5)
            System.out.println("Choose a Hero Class between 1 and 5");
        return false;
    }

    public void chooseOptionHeroStyleClass() {
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
