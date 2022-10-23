/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

/**
 *
 * @author Lou
 */
public class ProduitAgricole extends ProduitAlimentaire {
   public double quantite;
   public String saison;

    public ProduitAgricole(double quantite, String saison, int id, String libelle) {
        super(id, libelle);
        this.quantite = quantite;
        this.saison = saison;
    }

    public double getQuantite() {
        return quantite;
    }

    public String getSaison() {
        return saison;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

 
   
   
    
    
}
