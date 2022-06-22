package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Noms
 * ______
 *
 * Yowa Mukala Ruth | MSI
 * Kabembo Julie Julienne | MSI
 * Katshaka Mukandayi Cathy | MSI
 * Lutumba Kalombo Kevin | GL
 * Kalume Nsenga Yves | GL
 */


public class Main {

    public static void main(String[] args) {
       Produit <String>produit1 = new Produit("0001","ordinateur",55,"dollar",new Date());
        Produit <String>produit2 = new Produit("0002","chaussure",80,"dollar",new Date());
        Produit <String>produit3 = new Produit("0003","pentalon",50,"dollar",new Date());
        Produit <String>produit4 = new Produit("0004","robe",10,"dollar",new Date());
	// write your code here
        Adresse adresse1 =new Adresse("ruwe","55b","88h","golf","lubumbashi","lubumbashi","congo");
        Client client1 = new Client(adresse1,"lutumba","kevin","004");

        List<Ligne> lignesfacture1 = new ArrayList();
        lignesfacture1.add(new Ligne(1,produit1,3));
        lignesfacture1.add(new Ligne(2,produit2,2));
        lignesfacture1.add(new Ligne(3,produit3,10));
        lignesfacture1.add(new Ligne(3,produit3,10));
        lignesfacture1.add(new Ligne(4,produit4,7));

        Detail detailFacture1 = new Detail(lignesfacture1);

        Facture facture = new Facture(1,client1,detailFacture1);
    }
}
