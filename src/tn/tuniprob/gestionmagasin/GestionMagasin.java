package tn.tuniprob.gestionmagasin;


import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.ProduitAlimentaire;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lou
 */
public class GestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1,"m1","Centre-ville");
        Magasin m2 = new Magasin(2,"Monoprix","Menzah 6");
        
        Caissier c1 =new Caissier(1,1,"louay","mornag",20);
        Caissier c2 =new Caissier(2,2,"monsof","lac",30);          
        Caissier c3 =new Caissier(3,3,"louay","menzah",50);
        Vendeur v1=new Vendeur(7,1,"ali","ben arous",60);
        Vendeur v2=new Vendeur(8,2,"amine","marsa",45);
        Vendeur v3=new Vendeur(5,3,"lasaad","libya",10);
        Vendeur v4=new Vendeur(4,4,"samia","jerba",70);
        Responsable r1=new Responsable(4,1,"med ali","gamarth",60);
        Responsable r2=new Responsable(6,1,"mourad","zahrouni",80);
        
        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
        m1.ajouterEmploye(v1);
        m1.ajouterEmploye(r1);
        
        m2.ajouterEmploye(c3);
        m2.ajouterEmploye(v2);
        m2.ajouterEmploye(v3);
        m2.ajouterEmploye(v4);
        m2.ajouterEmploye(r2);
        
        c1.afficher();
        
        ProduitAlimentaire prod1 =new ProduitAlimentaire(1021,"lait","Delice");
        ProduitAlimentaire prod2 =new ProduitAlimentaire(2510,"Yaourt","Vitalait");
        ProduitAlimentaire prod3 =new ProduitAlimentaire(3250,"Tomate","Sicam",1.200);
        
        
        m1.ajouterProduit(prod3);
        m1.ajouterProduit(prod2);
        
        m2.ajouterProduit(prod1);
        m2.ajouterProduit(prod2);
        
        m1.afficherMagasin();
        m2.afficherMagasin();
        
        
        v1.Salaire();
        c1.Salaire();
        r1.Salaire();
   
       
    }
    
}
