package model;

import java.io.Serializable;

public class Movie implements Serializable{
    //Basic info
    private String title;
    private int productionYear;

    //Cast and crew
    private String synopsis;
    private CastMember producer;
    private CastMember director;
    private CastMember screenwriter;
    private CastMember[] cast;

    //Rental info
    private double price;
    private boolean taken;

    //Getters
    public String getTitle() {return title;}
    public int getProductionYear() {return productionYear;}
    public String getSynopsis() {return synopsis;}
    public CastMember getProducer() {return producer;}
    public CastMember getDirector() {return director;}
    public CastMember getScreenwriter() {return screenwriter;}
    public boolean isTaken() {return taken;}
    public CastMember[] getCast() {return cast;}
    public double getPrice() {return price;}

    //Constructor
    public Movie(
            String title,
            int productionYear,
            String synopsis,
            CastMember producer,
            CastMember director,
            CastMember screenwriter,
            CastMember[] cast,
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

    public String toJSON() {
        StringBuffer JSON =  new StringBuffer("{\n");

        JSON.append("title: \"").append(title).append("\", \n");
        JSON.append("productionYear: \"").append(productionYear).append("\", \n");
        JSON.append("synopsis: \"").append(synopsis).append("\", \n");
        JSON.append("producer: ").append(producer.toJSON()).append(", \n");
        JSON.append("director: ").append(director.toJSON()).append(", \n");
        JSON.append("screenwriter: ").append(screenwriter.toJSON()).append(", \n");

        JSON.append("cast:[ \n");
        for (CastMember actor: cast) {
            JSON.append("    ").append(actor.toJSON()).append(", \n");
        }
        JSON.deleteCharAt(JSON.length() - 3);

        JSON.append("], \n");

        JSON.append("price: ").append(price).append(", \n");
        JSON.append("taken: ").append(taken).append("\n");

        JSON.append("}");

        return JSON.toString();
    }
}