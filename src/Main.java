import model.*;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Database database = new Database();

        database.addCastMember("Tom Hanks", CastMember.Role.PRODUCER, "1950");
        database.addCastMember("Rick Astley", CastMember.Role.DIRECTOR, "1960");
        database.addCastMember("Antonio Banderas", CastMember.Role.SCREENWRITER, "1970");
        database.addCastMember("Ant", CastMember.Role.ACTOR, "1950");

        List<CastMember> castMemberList = database.getCastMemberList();

        database.addMovie("The Witcher",
                "2012",
                "Pretty good, I guess",
                castMemberList.get(0),
                castMemberList.get(1),
                castMemberList.get(2),
                castMemberList,
                2.50
        );

        List<Movie> movies = database.getMovieList();



        //Testing write
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Movie.txt"));
        out.writeObject(movies.get(0));

        //Testing read
        FileInputStream fileInput = null;
        ObjectInputStream objectInput = null;
        Movie movie2 = null;

        try {
            fileInput = new FileInputStream("Movie.txt");
            objectInput = new ObjectInputStream(fileInput);
            movie2 = (Movie) objectInput.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInput != null) {
                try {
                    objectInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.print(movie2.toString());
    }
}
