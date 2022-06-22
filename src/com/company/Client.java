package com.company;

public class Client extends Personne {
    private String numero;

    public Client(Adresse adresse, String nom, String prenom, String numero) {
        super(adresse, nom, prenom);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
