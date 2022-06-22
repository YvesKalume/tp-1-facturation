package com.company;

public abstract class Documentcommercial {
    public Documentcommercial(long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    private long numero;
    private Client client;
    private Detail detail;
    public abstract double getTotal();


    public abstract double getTVA();

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}
