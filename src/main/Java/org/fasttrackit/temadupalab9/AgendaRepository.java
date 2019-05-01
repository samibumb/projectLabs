package org.fasttrackit.temadupalab9;

import java.sql.*;

public class AgendaRepository {
    private final static String url= "jdbc:mysql://localhost:3306/world";
    private final static String user="root";
    private final static String password="Material1!";

public static void createTable() {
        {
            try {

                  Connection connection = DriverManager.getConnection(url, user, password);
//                PreparedStatement preparedStatement = connection.prepareStatement(
//                    "Create table AgendaTelefonica(" +
//                        "id int not null," +
//                        "owner varchar(20)," +
//                        "primary key (id)" +
//                        ");");
//                preparedStatement.execute();
//                System.out.println("Table AgendaTelefonica created.");
//                preparedStatement.close();


//                PreparedStatement preparedStatement1 = connection.prepareStatement(
//                        "Create table Contact(" +
//                                "contactID int not null," +
//                                "firstName varchar(20)," +
//                                "lastName varchar(20)," +
//                                "phone varchar(10)," +
//                                "primary key (contactID)," +
//                                "fkID int not null," +
//                                "foreign key (fkID) references AgendaTelefonica(id)" +
//                                ");");
//                preparedStatement1.execute();
//                System.out.println("Table Contact created.");
//                preparedStatement1.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

//    public static void insertIntoTable(AgendaTelefonica agendaTelefonica){
//
//       try {
//           Connection connection = DriverManager.getConnection(url, user, password);
//
//           PreparedStatement preparedStatement =connection.prepareStatement("insert into AgendaTelefonica(id,owner)"+
//                   "values(?,?);");
//           preparedStatement.setInt(1,agendaTelefonica.getId());
//           preparedStatement.setString(2,agendaTelefonica.getOwner());
//
//           preparedStatement.execute();
//           System.out.println("Row inserted");
//           preparedStatement.close();
//       }catch (Exception e){
//        e.printStackTrace();
//       }
//    }

    public static void insertIntoTable(Contact contact){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into contact(contactID,firstName,lastName,phone,fkID)" +
                    "values(?,?,?,?,?);");

            preparedStatement.setInt(1,contact.getId());
            preparedStatement.setString(2,contact.getNume());
            preparedStatement.setString(3,contact.getPrenume());
            preparedStatement.setString(4,contact.getNumarDeTelefon());
            preparedStatement.setInt(5,contact.getFk());
            preparedStatement.execute();
            System.out.println("Row inserted");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void showTables(){
       try {
           Connection connection = DriverManager.getConnection(url, user, password);

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("Select * from agendaTelefonica;");

           Thread.sleep(1000);
           System.out.println("Agenda table\nID / OWNER");

           while (resultSet.next()){
               System.out.println(resultSet.getString("id")+". "+resultSet.getString("owner"));
           }

           Thread.sleep(1000);

           System.out.println();

           ResultSet resultSet1 = statement.executeQuery("Select * from Contact;");

           System.out.println("Contact table\nID/fName/lName/phoneNr/fk");

           while (resultSet1.next()){
               Thread.sleep(1000);
               System.out.println(resultSet1.getString("contactID")+". "+resultSet1.getString("firstName")+
                       " "+resultSet1.getString("lastName")+" "+resultSet1.getString("phone")+
                       " "+resultSet1.getString("fkID"));
           }


       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args){

    createTable();

        AgendaTelefonica agendaTelefonica = new AgendaTelefonica(1,"Samuel Bumb");
//        insertIntoTable(agendaTelefonica);
        Contact contact1 = new Contact(1,"Sami","Bumb","745362738",1);
        Contact contact2 = new Contact(2,"Marius","Dan","745364567",1);
        Contact contact3 = new Contact(3,"Andrei","Olar","745375478",1);
        Contact contact4 = new Contact(4,"Dan","Pop","745374386",1);
        Contact contact5 = new Contact(5,"Mircea","Anghel","724652738",1);
        Contact contact6 = new Contact(6,"Ion","Nelu","745743738",1);
        Contact contact7 = new Contact(7,"Danut","Leontin","736743475",1);
        Contact contact8 = new Contact(8,"Gabriel","Vasile","7453645648",1);
//        insertIntoTable(contact1);
//        insertIntoTable(contact2);
//        insertIntoTable(contact3);
//        insertIntoTable(contact4);
//        insertIntoTable(contact5);
//        insertIntoTable(contact6);
//        insertIntoTable(contact7);
//        insertIntoTable(contact8);

        System.out.println("Will display the existing tables in :");
        try {
            int i=3;
            while(i!=0){
                Thread.sleep(1500);
                System.out.println(i);
                i--;
                if (i==0){
                    System.out.println("GO!");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e){}

        System.out.println("----Tables----\n");
          showTables();
}
}
