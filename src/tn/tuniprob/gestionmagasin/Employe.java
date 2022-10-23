/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Lou
 */
public class Employe {
    private int id;
    private String nom;
    private String adresse;
    private int nbr_heures;

    public Employe() {}
    

    public Employe(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures=" + nbr_heures + '}';
    }
    
    public void afficher() {
        System.out.println( "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heure=" + nbr_heures);
    }
    
    
    
    
}
