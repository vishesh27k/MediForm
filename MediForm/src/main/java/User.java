public class User {
    public String name;
    public String password;
   
    public User() {
    }

    public User(User userCopy) {
        this.name = userCopy.getName();
        this.username = userCopy.getUsername();
        this.password = userCopy.getPassword();
        this.roleID = userCopy.getRoleID();
    }

    public User(String name, String username, String password, int roleID) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
    }

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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleID() {
        return roleID;
    }
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
}
