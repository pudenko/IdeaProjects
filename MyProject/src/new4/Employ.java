package new4;

public class Employ {
    String name = "";
    String password = "";
    String access = "";

    public Employ(){}

    public Employ(String name, String password, String access) {
        this.name = name;
        this.password = password;
        this.access = access;
    }
    public Employ(String name, String password) {
        this(name,password,"default");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
