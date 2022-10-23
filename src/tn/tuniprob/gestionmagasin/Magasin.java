package tn.tuniprob.gestionmagasin;


import tn.tuniprob.gestionmagasin.ProduitAlimentaire;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lou
 */
public class Magasin {
    int id ;
    String nom;
    String adresse;
    int capacit;
    int employeCapacit;
    Employe[] employe;
    ProduitAlimentaire[] produit;
    
    
    
    public Magasin(int id,String nom,String adresse){
    this.id=id;
    this.nom=nom;
    this.adresse=adresse;
    this.capacit=0;
    this.employeCapacit =0;
    this.produit = new ProduitAlimentaire[50];
    this.employe = new Employe[20];
    }
    
    public void afficherM(){
       System.out.println("id="+id);
       System.out.println("nom="+nom);
        System.out.println("adresse="+adresse);
         System.out.println("capacit="+capacit);
    for(int i =0; i<this.capacit;i++){
    System.out.println(produit[i]);
    }
    
    
    }
    public void ajouterProduit(ProduitAlimentaire p){
        if(this.recherche(p)){
            System.out.println("exist");
            }else{
                  if (this.capacit<50){ 
            this.produit[this.capacit]= p;
            this.capacit++;}
        System.out.println("magasin plein");}
            
            
            
        
    
    }
    
    public void nombrProduits (){
        
       System.out.println("nombre totale: "+this.capacit);
       
        
    
    }

    @Override
    public String toString() {
        String ch="";
        for(int i =0; i<capacit; i++){
        ch= ch +" "+ produit[i];
        }
        return "Magasin{" + "id=" + id +", nom="+ nom + ", adresse=" + adresse + ", capacit=" + capacit + ", produit=" + ch + '}';
    }
    
    public static boolean comparer(ProduitAlimentaire p1,ProduitAlimentaire p2){
    boolean comp =false;
    
    if ((p1.getId()==p2.getId()) && (p1.getLibelle().equals(p2.getLibelle())) && (p1.getPrix().equals(p2.getPrix()))){
    comp=true;
    }else{comp=false;}
    
    return comp;
    
    }
    
    public boolean recherche(ProduitAlimentaire p){
    boolean response =false;
    for(int i=0;i<capacit;i++){
                            
        if(response=comparer(produit[i],p)){
            response=true;
        
        }else{response=false;}
        
    }
    return response;
    
    
    }
    public int index(ProduitAlimentaire p){
            for (int i=0; i<capacit;i++){
            if(produit[i].comparer(p)){
            
            return i;}
            }
            return -1;
    }
    
    public void supprimer(ProduitAlimentaire p){
    if (index(p)==-1){
    System.out.println("produit n'existe pas ");}
    else{ 
        for(int i=0;i<capacit;i++){
    produit[i]=produit[i+1];
    this.produit[capacit]=null;
    this.capacit--; 
        }
    
    
    }
        
    }
    
    public Magasin comparerMAG(Magasin m){
       if (this.capacit>=m.capacit){
       return this ;
       }else{
       return m;}
    }
    
    public void ajouterEmploye(Employe e){
        if (this.employeCapacit<20){ 
            this.employe[this.employeCapacit]= e;
            this.employeCapacit++;}else{ System.out.println("pas de place");
            
        }
    }
    
    
    public void afficherMagasin(){
        int i;
        System.out.println("le magasin "+ id +"nom"+ nom +" localisée a "+ adresse + " de capacité "+ capacit );
        System.out.println("les produits de magasin");
        for(i=0;i<capacit;i++){
            produit[i].afficher();
        }
        System.out.println("les employes de magasin");
        for(i=0;i<employeCapacit;i++){
            employe[i].afficher();
        }
    }
    
        
    }

