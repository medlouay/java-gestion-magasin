/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Lou
 */
public class Responsable extends Employe{
    private int prime;
    
    
public Responsable(){}
    
    
    public Responsable(int prime, int id, String nom, String adresse, int nbr_heures) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}';
    }
    
    @Override
    public void afficher() {
        System.out.println("Responsable{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nb_heure=" + getNbr_heures() +", numcaisse=" + prime + "}");
    }
    
    public void Salaire(){
        float s;
        if (getNbr_heures()<=160)
            s =(getNbr_heures()*10)+prime ;
        else
            s =(getNbr_heures()-160)*2+ (160*10)+prime;
        System.out.println("le salaire de ce reponsable est "+s); 
    }

    
}
