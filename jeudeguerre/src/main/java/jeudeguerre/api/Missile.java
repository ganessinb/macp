package api;

public class Missile implements AttaqueStrategie{
    @Override
    public void attaque() {
        System.out.println("J'attaque avec un missile");
    }
}
