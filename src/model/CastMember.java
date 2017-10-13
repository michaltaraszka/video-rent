package model;

import java.io.Serializable;

public class CastMember extends Person implements Serializable {
    public enum Role {
        ACTOR,
        DIRECTOR,
        PRODUCER,
        SCREENWRITER
    }

    private Role role;

    public CastMember(String name, Role role, String yearOfBirth) {
        this.name = name;
        this.role = role;
        this.yearOfBirth = yearOfBirth;
    }
}