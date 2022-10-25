/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Lou
 */
public class ProduitFruit extends ProduitAgricole {

    public ProduitFruit(int id, String libelle,double quantite, String saison ) {
        super(quantite, saison, id, libelle);
    }

    @Override
    public boolean estFrais(String saison) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
    
}
