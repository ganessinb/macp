package api;

public class Voler implements DeplacementStrategie{
    @Override
    public void seDeplacer() {
        System.out.println("Je vole");
    }
}
