package tn.tuniprob.gestionmagasin;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lou
 * 
 */

public class ProduitAlimentaire {
    private int id;
    private String libelle;
    private String marque;
    private Double prix;
    private LocalDate d ;

    
    
    public ProduitAlimentaire(){}
    
    public ProduitAlimentaire(int id, String libelle,String marque){
    this.id=id;
    this.libelle=libelle;
    this.marque=marque;
    }
    public ProduitAlimentaire(int id, String libelle,String marque,Double prix){
    this.id=id;
    this.libelle=libelle;
    this.marque=marque;
    
    if(prix>0){
            this.prix = prix;
             }
            else{ System.err.println("Le prix doit etre positif ");}
   
    
    }
    public ProduitAlimentaire(int id,String libelle,String marque,Double prix,LocalDate d){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
            if(prix>0){
        this.prix=prix;
            }else{ System.err.println("Le prix doit etre positif ");}
            
        this.d=d;
    }
     void afficher(){
     System.out.println("id="+id+" libelle="+libelle+" marque="+marque+" prix="+prix+" dateExp="+d);
     
     }
     void modifier_Prix(Double p){
         if(p>0){
         prix=p;}
         else{ System.err.println("Le prix doit etre positif ");}
     }
     void affecter_Date(int year,int month, int day){
         
         this.d=LocalDate.of(year, month,day);
     
     }
     
     
     

    @Override
    public  String toString() {
        return  "ProduitAlimentaire{" + "id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", dateExp=" + d +  '}';
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public Double getPrix() {
        return prix;
    }

    public LocalDate getD() {
        return d;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(Double prix) {
        if(this.prix>0){
             this.prix = prix;
             }else{
            System.err.println("Le prix doit etre positif ");
       
        }
    }

    public void setD(LocalDate d) {
        this.d = d;
    }
    
    boolean comparer(ProduitAlimentaire p){
         boolean comp=false;
        if ((this.id==p.id) && (this.libelle== p.libelle) && (this.prix==p.prix)){
            comp=true;
        }else{comp=false;}
        
        return comp;
    }
    
   
    
    
   
   
    
    
}
