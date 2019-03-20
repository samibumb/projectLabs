package agendaTelefonica.domain;

public class Contact {

    private String nume;

    private String prenume;

    private String adresa;

    private String telefon;

    public Contact(){
        super();
        telefon ="";
    }

    public Contact(String nume , String prenume){
        this();
        this.nume=nume;
        this.prenume=prenume;
    }

    public Contact(String nume , String prenume , String adresa){
        this(nume,prenume);
        this.adresa=adresa;

    }


    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        if(nume.equals("")){
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.nume = nume;
    }


    public String getPrenume() {

        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


    public String getTelefon() {

        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return "Numele este "+nume+" "+prenume;
    }

    public boolean equals(Object o){
        Contact second = (Contact)o;
        if(second.getNume().equals(this.nume) && second.getPrenume().equals(this.prenume)){
            return true;
        }else{
            return false;
        }
    }



}
