import model.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Movie movie1 = new Movie(
                "The Witcher",
                1920,
                "Nie no, spoko",
                new CastMember("Tom Hanks", CastMember.Role.PRODUCER, 1950),
                new CastMember("Rick Astley", CastMember.Role.DIRECTOR, 1960),
                new CastMember("Antonio Banderas", CastMember.Role.SCREENWRITER, 1970),
                new CastMember[]{
                        new CastMember("Ant", CastMember.Role.ACTOR, 1950),
                        new CastMember("Boy", CastMember.Role.ACTOR, 1966),
                        new CastMember("Lel", CastMember.Role.ACTOR, 1977),
                        new CastMember("Ziggy", CastMember.Role.ACTOR, 1988)
                },
                1.99
        );

        //Testing write
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Movie.txt"));
        out.writeObject(movie1);

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
