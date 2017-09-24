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

    public String toJSON() {
        StringBuffer JSON = new StringBuffer("{");
        JSON.append("name: \"").append(name).append("\", ");
        JSON.append("role: \"").append(role).append("\", ");
        JSON.append("yearOfBirth: ").append(yearOfBirth);
        JSON.append("}");

        return JSON.toString();
    }
}