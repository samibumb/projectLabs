package org.fasttrackit.temadupalab9;

public class Main {

    public static void main(String[] args){

        AgendaTelefonica agendaTelefonica = new AgendaTelefonica(1,"Sami");

        Contact contact1 = new Contact("Sami","Bumb","745362738");
        Contact contact2 = new Contact("Marius","Dan","745364567");
        Contact contact3 = new Contact("Andrei","Olar","745375478");
        Contact contact4 = new Contact("Dan","Pop","745374386");
        Contact contact5 = new Contact("Mircea","Anghel","724652738");
        Contact contact6 = new Contact("Ion","Nelu","745743738");
        Contact contact7 = new Contact("Danut","Leontin","736743475");
        Contact contact8 = new Contact("Gabriel","Vasile","7453645648");

        agendaTelefonica.add(contact1);
        agendaTelefonica.add(contact2);
        agendaTelefonica.add(contact3);
        agendaTelefonica.add(contact4);
        agendaTelefonica.add(contact5);
        agendaTelefonica.add(contact6);
        agendaTelefonica.add(contact7);
        agendaTelefonica.add(contact8);
        System.out.println(agendaTelefonica.getOwner()+" has the following contacts in the agenda :\n");
        int count=1;
        for (Contact agenda : agendaTelefonica.contactList){
                System.out.println("no"+count+". "+agenda);
                count++;
        }

        agendaTelefonica.numarContacte();
    }
}
