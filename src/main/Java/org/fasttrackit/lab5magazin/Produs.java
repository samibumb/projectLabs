package org.fasttrackit.lab5magazin;

import java.util.List;

public class Produs {

    private String name;

    private int pret;

    private int stock;

    private int gramaj;

    private String descriere;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private List<CategorieProdus> categorii;


    public boolean equals(Object o) {

        if (o instanceof Produs) {
          return this.getName().equals(((Produs) o).getName());

        } else {
            return false;
        }
    }


}
