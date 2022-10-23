/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Lou
 */
public class Caissier extends Employe{
   
    private int numeroDeCaisse;
    
    
    public Caissier(){}

    public Caissier(int numeroDeCaisse, int id, String nom, String adresse, int nbr_heures) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}';
    }
   
    @Override
    public void afficher() {
        System.out.println("Caissier{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nb_heure=" + getNbr_heures() +", numcaisse=" + numeroDeCaisse + "}");
    }
    
    
    public void Salaire(){
        float s;
        if (getNbr_heures()<=180)
            s =(getNbr_heures()*5);
        else
            s =(getNbr_heures()-180)*0.75f+ (180*5);
        System.out.println("le salaire de ce caissier est "+s); 
    }
}
