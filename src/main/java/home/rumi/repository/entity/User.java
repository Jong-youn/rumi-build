package home.rumi.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
