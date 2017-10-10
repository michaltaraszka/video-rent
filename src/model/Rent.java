package model;

import java.io.Serializable;

public class Rent implements Serializable {
    private int id;
    private Customer customer;
    private Movie movie;
}