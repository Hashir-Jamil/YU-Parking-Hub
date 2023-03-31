package model.user;

public class Credentials {
    private String login;
    private String password;
    private String type;

    public Credentials(String login, String password, String type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Credentials)) {
            return false;
        }
        Credentials curr = (Credentials) (o);
        Boolean cond1 = this.login.equals(curr.getLogin());
        Boolean cond2 = this.type.equals(curr.getType());

        return (cond1 && cond2);
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
