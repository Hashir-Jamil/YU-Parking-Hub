package model.user;

import constants.Constants;

import java.util.Objects;

public class User {
    private Credentials credentials;
    private boolean validated= false;;

    public User(Credentials credentials) {
        this.credentials = credentials;
    }

    public User(String email, String password, String type) {
        Credentials newCredentials = new Credentials(email, password, type);
        this.credentials = newCredentials; 
        
        if(type.equals(Constants.VISITOR) || type.equals(Constants.MANAGER)){
            validated = true;
        }
    }

    public Credentials getCredentials() {
        return this.credentials;
    }
    
   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(credentials, user.credentials);
    }

    public void validateAccount(){
        this.validated=true;
    }

    public boolean getValidationStatus(){
        return validated;
    }
}
