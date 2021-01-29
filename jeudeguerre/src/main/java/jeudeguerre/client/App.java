package client;

import api.*;

public class App {

    public static void main(String[] args) {

        Unite soldat = new Unite();
        soldat.setDeplacement(new Marcher());
        soldat.setAttaque(new Mitraillette());
        soldat.attaque();
        soldat.deplace();

        Unite chars = new Unite();
        chars.setDeplacement(new Rouler());
        chars.setAttaque(new Canon());
        chars.attaque();
        chars.deplace();

        Unite avions = new Unite();
        avions.setDeplacement(new Voler());
        avions.setAttaque(new Missile());
        avions.attaque();
        avions.deplace();


    }
}
