package com.company;

public abstract class Personne {
    private Adresse adresse;
    private String nom;
    private String prenom;

    public Personne(Adresse adresse, String nom, String prenom) {
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

