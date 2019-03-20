package agendaTelefonica.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nameAgenda;
    private String owner;
    private List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args){

        Agenda agenda=new Agenda();

        Contact contact0 = new Contact("Vasi","Muresan");
        System.out.println(contact0.getNume());

        Contact contact1 = new Contact("Marius","Virgil","Romania");
        System.out.println(contact1.getNume());

        Contact om1 = new Contact();
        om1.setNume("Bumb");
        om1.setPrenume("Sami");
        om1.setAdresa("Romania");
        om1.setTelefon("0746564743");
        System.out.println(om1.toString());

        agenda.getContactList().add(om1);


        Contact om2 = new Contact();
        om2.setNume("Bumb");
        om2.setPrenume("Laura");
        om2.setAdresa("Romania");
        om2.setTelefon("0746564743");
        System.out.println(om2.toString());

        agenda.getContactList().add(om2);

        System.out.println("check equals == "+(om2==om1));
        System.out.println("check equals with "+om2.equals(om1));


    }

    public String getNameAgenda() {

        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {

        return owner;
    }

    public void setOwner(String owner) {

        this.owner = owner;
    }

    public List<Contact> getContactList() {

        return contactList;
    }

    public void setContactList(List<Contact> contactList) {

        this.contactList = contactList;
    }
}
