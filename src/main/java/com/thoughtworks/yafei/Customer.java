package com.thoughtworks.yafei;

public class Customer {
     private Person person;

    @Override
    public String toString() {
        return "this is customer and this is person" + person.toString();
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
