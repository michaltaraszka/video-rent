import model.*;

import java.util.*;

public class Database {
    List<Movie> movieList;
    List<CastMember> castMemberList;
    List<Customer> customerList;
    List<Rent> rentList;

    Database() {
        movieList = new ArrayList<>();
        castMemberList = new ArrayList<>();
        customerList = new ArrayList<>();
        rentList = new ArrayList<>();
    }

    public void addCastMember(String name, CastMember.Role role, String yearOfBirth) {
        castMemberList.add(new model.CastMember(name, role, yearOfBirth));
    }

    public void addMovie(String title, String productionYear, String synopsis, CastMember producer, CastMember director, CastMember screenwriter, List<CastMember> actors, double price) {
        movieList.add(new Movie(title, productionYear, synopsis, producer, director, screenwriter, actors, price));
    }

    public void addConsumer(String name, String yearOfBirth) {
        customerList.add(new Customer(name, yearOfBirth));
    }

    public void addRent(Customer customer, Movie movie, Date rentDate, Date returnDate) {
        rentList.add(new Rent(rentList.size(), customer, movie, rentDate, returnDate));
    }

    public List<Movie> getMovieList() {return movieList;}
    public List<CastMember> getCastMemberList() {return castMemberList;}
    public List<Customer> getCustomerList() {return customerList;}
    public List<Rent> getRentList() {return rentList;}
}
