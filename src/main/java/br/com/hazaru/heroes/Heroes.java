package br.com.hazaru.heroes;

public class Heroes {

    private Long heroId;
    private String heroName;
    private HeroClass heroClass = HeroClass.HUMAN;
    private HeroStyle heroStyle;
    private HeroAttributes heroAttributes;
    private HeroGender heroGender;


    public Heroes(Long heroId, String heroName, HeroClass heroClass, HeroStyle heroStyle, HeroAttributes heroAttributes, HeroGender heroGender) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.heroClass = heroClass;
        this.heroStyle = heroStyle;
        this.heroAttributes = heroAttributes;
        this.heroGender = heroGender;
    }

    public Heroes(){}

    public Long getHeroId() {
        return heroId;
    }

    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public HeroStyle getHeroStyle() {
        return heroStyle;
    }

    public void setHeroStyle(HeroStyle heroStyle) {
        this.heroStyle = heroStyle;
    }

    public HeroAttributes getHeroAttributes() {
        return heroAttributes;
    }

    public void setHeroAttributes(HeroAttributes heroAttributes) {
        this.heroAttributes = heroAttributes;
    }

    public HeroGender getHeroGender() {
        return heroGender;
    }

    public void setHeroGender(HeroGender heroGender) {
        this.heroGender = heroGender;
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
        return "Heroes{" +
                "heroId=" + heroId +
                ", heroName='" + heroName + '\'' +
                ", heroClass=" + heroClass +
                ", heroStyle=" + heroStyle +
                ", heroAttributes=" + heroAttributes +
                ", heroGender=" + heroGender +
                '}';
    }
}
