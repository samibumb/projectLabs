package org.fasttrackit.lab5magazin;

public class MagazinApplication {

    public static void main(String[] args){

        CatalogDeProduse catalog = new CatalogDeProduse();
        Produs paine1 = new Produs();
        paine1.setName("Paine");

        Produs produs2 = new Produs();
        produs2.setName("Pateu");


        Produs paine2 = new Produs();
        paine2.setName("Paine");


        catalog.addProduct(paine1);
        catalog.addProduct(paine2);
        catalog.addProduct(produs2);

        System.out.println("Numar de produse :"+catalog.getNumberOfProducts());

    }
}
