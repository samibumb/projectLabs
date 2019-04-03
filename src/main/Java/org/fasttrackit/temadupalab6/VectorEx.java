package org.fasttrackit.temadupalab6;

import java.util.Vector;

public class VectorEx {

    public static void main(String[] sami) {

        Vector v=new Vector();

        v.addElement("Sami");
        v.add("Beni");
        v.add(1,"Robot");


        System.out.println("Vectorul "+v+" are "+v.size()+" elemente.");
        v.remove(2);
       try {
           v.set(3,"Capsuni");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Will give "+e+" because you removed an element " +
                   "and remained 2 elements.");
       }

       v.add(2,"Capsuni");
        System.out.println(v);

    }
}
