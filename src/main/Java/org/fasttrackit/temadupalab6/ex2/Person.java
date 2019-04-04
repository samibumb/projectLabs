package org.fasttrackit.temadupalab6.ex2;


import java.util.Objects;

public class Person {

    private String name ;

    public Person(String persName){
        this.name = persName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


        public String toString () {
        return name;
    }

}
