package api;

public class Marcher implements DeplacementStrategie{
    @Override
    public void seDeplacer() {
        System.out.println("Je marche");
    }
}
