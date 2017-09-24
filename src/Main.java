import model.*;

public class Main {
    public static void main(String[] args) {

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

        System.out.println(movie1.toJSON());
    }
}
