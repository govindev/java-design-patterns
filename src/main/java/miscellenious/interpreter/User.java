package miscellenious.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {
    private String username;
    private List<String> permissions;


    public User(String username, String... permissions) {
        this.username = username;
        this.permissions = new ArrayList<>();
        Stream.of(permissions).forEach(e -> this.permissions.add(e.toLowerCase()));
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }
}