package api;

public class Canon implements AttaqueStrategie{
    @Override
    public void attaque() {
        System.out.println("J'attaque avec un canon");
    }
}
