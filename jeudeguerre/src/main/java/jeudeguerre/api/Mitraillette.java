package api;

public class Mitraillette implements AttaqueStrategie{
    @Override
    public void attaque() {
        System.out.println("J'attaque avec une mitraillette");
    }
}
