package model.user;

import constants.Constants;

public class UserFactory {
    public UserFactory() {
    }

    ;

    public static User createAccount(Credentials credentials) {
        switch (credentials.getType()) {
            case Constants.MANAGER:
                return new Manager(credentials);
            case Constants.STUDENT:
                return new Student(credentials);
            case Constants.FACULTYMEMBER:
                return new FacultyMember(credentials);
            case Constants.NONFACULTYSTAFF:
                return new NonFacultyStaff(credentials);
            case Constants.VISITOR:
                return new Visitor(credentials);
            default:
                return null;
        }
    }
}
