package domain;

import java.util.List;

public class User {
    private String name;
    private List<Role> roles;

    public User(String name) {
        this.name = name;
        //roles.add(); will default to regular user further down the line
    }
}
