package demo.timeclock;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> user = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return user;
    }

    public void setUsers(ArrayList<User> users) {
        this.user = users;
    }

    public User getUser(int index) {
        User user = null;

        if (index <= this.user.size() && index >= 0) {
            user = this.user.get(index);
        }

        return user;
    }

    public void addUser(User user) {
        this.user.add(user);
    }
}
