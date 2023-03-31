package model.user;

public class SuperManager extends User {
    private static final SuperManager supermanager = new SuperManager();

    private SuperManager() {
        super(new Credentials("Admin", "Admin", "SuperManager"));
    }

    public SuperManager getInstance() {
        return supermanager;
    }
}
