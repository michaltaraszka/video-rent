package model;

public class CastMember extends Person {
    public enum Role {
        ACTOR,
        DIRECTOR,
        PRODUCER,
        SCREENWRITER
    }

    private Role role;

    public CastMember(String name, Role role, int yearOfBirth) {
        this.name = name;
        this.role = role;
        this.yearOfBirth = yearOfBirth;
    }
}