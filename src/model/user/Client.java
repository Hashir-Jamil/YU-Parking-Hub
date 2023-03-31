package model.user;

public class Client extends User {
    public Client(Credentials credentials) {
        super(credentials);
    }

    public Client(String email, String password, String type) {
        super(email, password, type);
    }


}
