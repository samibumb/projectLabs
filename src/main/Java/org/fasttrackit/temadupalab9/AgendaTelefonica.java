package org.fasttrackit.temadupalab9;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
        private int id;
        private String owner;
        List<Contact> contactList = new ArrayList<>();

    public void add(Contact contact){
        contactList.add(contact);

    }

    public AgendaTelefonica(int id ,String owner) {
        this.id=id;
        this.owner = owner;

    }

    public String toString(){
        return owner+" is the owner of agenda :\n"+contactList;
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    public void numarContacte(){
        System.out.println("Nr. of contacts :"+contactList.size()+" contacts available.");
    }
}
