/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Lou
 */
public class Vendeur extends Employe{
     private int tauxDeVente;

     public Vendeur(){}
     
    public Vendeur(int tauxDeVente, int id, String nom, String adresse, int nbr_heures) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}';
    }
    
    @Override
    public void afficher() {
        System.out.println("Vendeur{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nb_heure=" + getNbr_heures() +", numcaisse=" + tauxDeVente + "}");
    }
    
    public void Salaire(){
        float s= 450*tauxDeVente;
        System.out.println("le salaire de ce vendeur est "+s); 
    }
     
     
}
