package model;

import java.io.Serializable;
import java.util.Date;

public class Rent implements Serializable {
    private int id;
    private Customer customer;
    private Movie movie;
    private Date rentDate;
    private Date returnDate;

    public Rent(int id, Customer customer, Movie movie, Date rentDate, Date returnDate) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public int getId(){return id;}
    public Customer getCustomer(){return customer;}
    public Movie getMovie() {return movie;}
    public Date getRentDate() {return rentDate;}
    public Date getReturnDate() {return returnDate;}
}