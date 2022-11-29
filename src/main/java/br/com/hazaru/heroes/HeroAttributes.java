package br.com.hazaru.heroes;

public abstract class HeroAttributes {

    private Integer stregth;
    private Integer defense;
    private Integer agility;
    private Integer velocity;
    private Integer wisdow;


    public HeroAttributes(Integer stregth, Integer defense, Integer agility, Integer velocity, Integer wisdow) {
        this.stregth = stregth;
        this.defense = defense;
        this.agility = agility;
        this.velocity = velocity;
        this.wisdow = wisdow;
    }

    public HeroAttributes() {}

    public Integer getStregth() {
        return stregth;
    }

    public void setStregth(Integer stregth) {
        this.stregth = stregth;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public void setVelocity(Integer velocity) {
        this.velocity = velocity;
    }

    public Integer getWisdow() {
        return wisdow;
    }

    public void setWisdow(Integer wisdow) {
        this.wisdow = wisdow;
    }

    @Override
    public String toString() {
        return "HeroAttributes{" +
                "stregth=" + stregth +
                ", defense=" + defense +
                ", agility=" + agility +
                ", velocity=" + velocity +
                ", wisdow=" + wisdow +
                '}';
    }
}
