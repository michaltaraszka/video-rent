import model.*;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;

public class Database implements Serializable {
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

    public void save(String filename) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(this);
    }

    public static Database read(String filename) {
        //Testing read
        FileInputStream fileInput = null;
        ObjectInputStream objectInput = null;
        Database db = null;

        try {
            fileInput = new FileInputStream(filename);
            objectInput = new ObjectInputStream(fileInput);
            db = (Database) objectInput.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInput != null) {
                    objectInput.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return db;
    }
}
