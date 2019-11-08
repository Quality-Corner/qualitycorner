package demo.timeclock;

public class User {
    private String name;
    private String username;
    private String role;
    private byte active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active == 1 ? true : false;
    }

    public void setActive(boolean isActive) {
        if (isActive) {
            active = 1;
        } else {
            active = 0;
        }
    }
}
