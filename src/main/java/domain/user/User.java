package domain.user;

import java.util.List;

public class User {
    private String name;
    //private List<Role> roles; //roles not needed at present

    public User(String name) {
        this.name = name;
        //roles.add(); will default to regular user further down the line
    }
}
