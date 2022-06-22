package com.company;

public class Facture extends Documentcommercial{
    public Facture(long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }

    @Override
    public double getTotal() {
        double total=0;
        for (Ligne ligne:this.getDetail().ligne){
            total=total+ligne.getPrixTotal();
        }
        return total;
    }

    @Override
    public double getTVA() {
        return this.getTotal()*16/100;
    }
}
