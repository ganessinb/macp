package api;

public class LanceFlamme implements AttaqueStrategie{
    @Override
    public void attaque() {
        System.out.println("J'attaque avec une lance flamme");
    }
}
