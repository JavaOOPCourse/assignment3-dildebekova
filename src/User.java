// User.java
public abstract class User {
    protected String name;
    protected int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public abstract void manageService(Service s);
    public abstract void useService(Service s);

    public String getName() {
        return name;
    }
}
