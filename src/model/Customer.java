package model;

import java.io.Serializable;

public class Customer extends Person implements Serializable {

    public Customer (String name, String yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
