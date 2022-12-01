package br.com.hazaru.heroes;

public class ElfAttributes extends HeroAttributes {


    private Integer stregth;
    private Integer defense;
    private Integer agility;
    private Integer velocity;
    private Integer wisdow;

    private HeroBurst heroBurst = HeroBurst.HEARTH;

    public HeroBurst getHeroBurst() {
        return heroBurst;
    }

    public void setHeroBurst(HeroBurst heroBurst) {
        this.heroBurst = heroBurst;
    }

    public ElfAttributes(Integer stregth, Integer defense, Integer agility, Integer velocity, Integer wisdow) {
        this.stregth = stregth;
        this.defense = defense;
        this.agility = agility;
        this.velocity = velocity;
        this.wisdow = wisdow;
        this.heroBurst = HeroBurst.DARKNESS;
    }

    public ElfAttributes(){}

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
        return "ElfAttributes{" +
                "stregth=" + stregth +
                ", defense=" + defense +
                ", agility=" + agility +
                ", velocity=" + velocity +
                ", wisdow=" + wisdow +
                '}';
    }

    public Integer getWisdow() {
        return wisdow;
    }

    public void setWisdow(Integer wisdow) {
        this.wisdow = wisdow;
    }

}
