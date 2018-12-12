package fr.istic.nplouzeau.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Bibliotheque implements Subject {
    private Collection<String> maBibli;
    private Collection<Observer> mesObs;

    public Bibliotheque(){
        maBibli = new ArrayList<>();
        mesObs = new ArrayList<>();
    }

    public void ajouteUnLivre(String unLivre){
        maBibli.add(unLivre);
        notifyObservers();
    }

    public int combienDeLivre(){
        return maBibli.size();
    }

    @Override
    public void register(Observer o) throws IllegalArgumentException {
        mesObs.add(o);
    }

    @Override
    public void unregister(Observer o) throws IllegalArgumentException {
        mesObs.remove(o);
    }

    @Override
    public boolean isRegistered(Observer o) {
        return mesObs.contains(o);
    }

    @Override
    public Object getValue() {
        return maBibli.size();
    }

    @Override
    public void setValue(Object v) {

    }

    public void notifyObservers(){
        for(Observer o : mesObs){
            o.doUpdate(this);
        }
    }
}
