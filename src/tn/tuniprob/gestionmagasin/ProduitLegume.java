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
public class ProduitLegume extends ProduitAgricole {

    public ProduitLegume(double quantite, String saison, int id, String libelle) {
        super(quantite, saison, id, libelle);
    }

   /*String[] saisons={"janvier","Fevrié","Mars"};
    @Override
    public boolean estFrais(String saison) {
       int cpt;
       if(this.saison==saison)return true;
       else{
       for(int i =0;i<saisons.length;i++){
       if(saisons[i] == this.saison){cpt=i+1;}
       }
       }
    }*/

    @Override
    public boolean estFrais(String saison) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}
