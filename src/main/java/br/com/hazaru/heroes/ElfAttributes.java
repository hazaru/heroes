package br.com.hazaru.heroes;

public abstract class ElfAttributes extends HeroAttributes {

    private Integer stregth;
    private Integer defense;
    private Integer agility;
    private Integer velocity;

    public ElfAttributes(Integer stregth, Integer defense, Integer agility, Integer velocity) {
        this.stregth = stregth;
        this.defense = defense;
        this.agility = agility;
        this.velocity = velocity;
    }

    public Integer getStregth() {
        return stregth;
    }

    public void setStregth(Integer stregth) {
        this.stregth = 10;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = 7;
    }

    public Integer getAgility() {
        return 12;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public void setVelocity(Integer velocity) {
        this.velocity = 14;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
