package br.com.hazaru.heroes.enums;

public enum HeroClass {

    HUMAN(1),
    ELF(2),
    ORC(3),
    DARK_ELF(4),
    DWARF(5);

    private int heroClass;

    HeroClass(int heroClass){
        this.heroClass =  heroClass;
    }

    public int getHeroClass(){
        return heroClass;
    }



}
