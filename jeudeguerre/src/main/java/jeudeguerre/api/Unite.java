package api;

public class Unite {
    private DeplacementStrategie deplacement;
    private AttaqueStrategie attaque;

    public void setAttaque(AttaqueStrategie attaque) {
        this.attaque = attaque;
    }

    public void setDeplacement(DeplacementStrategie deplacement) {
        this.deplacement = deplacement;
    }

    public void attaque() {
        this.attaque.attaque();
    }

    public void deplace(){
        this.deplacement.seDeplacer();
    }
}
