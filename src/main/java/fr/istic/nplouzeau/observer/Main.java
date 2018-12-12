package fr.istic.nplouzeau.observer;

public class Main {

    public static void main(String[] args) {
        //on va faire une bibliotheque qui contient une collection de String de livre
        //et un bibliothecaire qui se doit de pouvoir donner le nombre exact de livre
        //dans la bibliotheque quand on l'interroge

        Bibliotheque maBib = new Bibliotheque();

        Bibliothecaire bib1 = new Bibliothecaire("Christiane", maBib);
        Bibliothecaire bib2 = new Bibliothecaire("Patrick", maBib);

        System.out.println(bib1.getNbLivre());
        System.out.println(bib2.getNbLivre());

        maBib.ajouteUnLivre("Toto a totoland");
        maBib.ajouteUnLivre("MN LA R");

        System.out.println(bib1.getNbLivre());
        System.out.println(bib2.getNbLivre());




    }
}
