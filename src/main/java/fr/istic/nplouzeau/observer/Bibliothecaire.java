package fr.istic.nplouzeau.observer;

public class Bibliothecaire implements Observer{
    private String Name;
    private int nbLivre;

    public Bibliothecaire(String Name, Bibliotheque laBib){
        this.Name = Name;
        laBib.register(this);
    }

    public int getNbLivre(){
        return nbLivre;
    }

    @Override
    public void doUpdate(Subject s) {
        Bibliotheque bibTemp;
        if(s instanceof Bibliotheque){
            bibTemp = (Bibliotheque) s;
            nbLivre = (int) bibTemp.getValue();
        }
    }

}
