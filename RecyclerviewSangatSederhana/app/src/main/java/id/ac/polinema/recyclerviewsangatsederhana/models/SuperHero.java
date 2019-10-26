package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName, image;

    public SuperHero(String heroName, String image) {
        this.heroName = heroName;
        this.image = image;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

        public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
