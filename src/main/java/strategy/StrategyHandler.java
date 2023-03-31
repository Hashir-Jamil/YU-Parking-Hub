package strategy;

import constants.Constants;
import model.user.User;
import services.UserService;

public class StrategyHandler {

    public static ParkingRateStrategy calculateCost(String email) {
        User user = UserService.getInstance().getUserByEmail(email);
        if (user != null) {
            return getStrategy(user.getCredentials().getType());
        }
        return new VisitorParkingRate();
    }

    private static ParkingRateStrategy getStrategy(String type) {
        switch (type) {
            case Constants.FACULTYMEMBER:
                return new FacultyParkingRate();
            case Constants.NONFACULTYSTAFF:
                return new NonFacultyParkingRate();
            case Constants.STUDENT:
                return new StudentParkingRate();
            case Constants.VISITOR:
                return new VisitorParkingRate();
            default:
                return new VisitorParkingRate();
        }
    }
}
