package com.company;


public class Ligne {
    private int quantite;
    private Produit produit;
    private int numero;

    public Ligne(int numero,Produit produit,int quantite) {
        this.quantite = quantite;
        this.produit = produit;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }


    public double getPrixTotal(){
        return this.produit.getPrix()*this.quantite;
    }
}
