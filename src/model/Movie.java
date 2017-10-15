package model;

import java.io.Serializable;
import java.util.*;

public class Movie implements Serializable {
    //Basic info
    private String title;
    private String productionYear;

    //Cast and crew
    private String synopsis;
    private CastMember producer;
    private CastMember director;
    private CastMember screenwriter;
    private List<CastMember> cast;

    //Rental info
    private double price;
    private boolean taken;

    //Getters
    public String getTitle() {return title;}
    public String getProductionYear() {return productionYear;}
    public String getSynopsis() {return synopsis;}
    public CastMember getProducer() {return producer;}
    public CastMember getDirector() {return director;}
    public CastMember getScreenwriter() {return screenwriter;}
    public boolean isTaken() {return taken;}
    public List<CastMember> getCast() {return cast;}
    public double getPrice() {return price;}

    //Constructor
    public Movie(
            String title,
            String productionYear,
            String synopsis,
            CastMember producer,
            CastMember director,
            CastMember screenwriter,
            List<CastMember> cast,
            double price
    ) {
        this.title = title;
        this.productionYear = productionYear;
        this.synopsis = synopsis;
        this.producer = producer;
        this.director = director;
        this.screenwriter = screenwriter;
        this.cast = cast;
        this.price = price;
        this.taken = false;
    }
}