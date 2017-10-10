package model;

import java.io.Serializable;

public class Customer extends Person implements Serializable {

    public Customer (String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
