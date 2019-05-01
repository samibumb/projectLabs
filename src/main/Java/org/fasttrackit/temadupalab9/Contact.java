package org.fasttrackit.temadupalab9;

public class Contact {

    private int id;

    private String nume;

    private String prenume;

    private String numarDeTelefon;

    private int fk;

    public Contact(String nume, String prenume, String numarDeTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.numarDeTelefon = numarDeTelefon;
    }

    public Contact(int id, String nume, String prenume, String numarDeTelefon , int foreignKey) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.numarDeTelefon = numarDeTelefon;
        this.fk=foreignKey;
    }

    @Override
    public String toString() {
        return getNume()+" "+getPrenume()+" "+getNumarDeTelefon();
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public int getFk() {
        return fk;
    }
}
