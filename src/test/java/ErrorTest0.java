import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        services.UserService userService0 = new services.UserService();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials4, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = userService0.registerUser((model.user.User) nonFacultyStaff7);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        model.booking.Booking booking0 = new model.booking.Booking();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = booking0.getTotalCost();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = clientServices0.getParkingSpaceById(10, 0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = clientServices0.getParkingSpaceById((int) (short) 10, (int) '#');
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        services.UserService userService0 = new services.UserService();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials4, "hi!");
        model.user.Credentials credentials8 = nonFacultyStaff7.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = userService0.registerUser((model.user.User) nonFacultyStaff7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = clientServices0.bookParkingSpace(booking4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("SuperManager");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = booking0.getTotalCost();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList2 = clientServices0.getAllUsersBookings("");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = clientServices0.getParkingSpaceById((int) (short) -1, (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = booking0.getTotalCost();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        facultyMember14.setFacultyName("Parking Lot 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember14);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList2 = clientServices0.getAllUsersBookings("Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = clientServices0.enableParkingSpaceById((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = clientServices0.updateCompleteBooking(booking3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        services.UserService userService0 = new services.UserService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user3 = userService0.loginUser("Parking Lot 97 is already enabled.", "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("NonFacultyStaff");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.getUserByEmail("Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        boolean boolean12 = user6.equals((java.lang.Object) credentials10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("There is no Such Parking Lot", "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("Manager");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.getType();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials8, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        boolean boolean14 = credentials3.equals((java.lang.Object) "Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials8", credentials3.equals(credentials8) ? credentials3.hashCode() == credentials8.hashCode() : true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        nonFacultyStaff17.setRole("");
        nonFacultyStaff17.setRole("hi!");
        userRepository3.removeUser((model.user.User) nonFacultyStaff17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials14", credentials7.equals(credentials14) ? credentials7.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        facultyMember7.setFacultyName("Parking Lot 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        java.lang.String str12 = nonFacultyStaff10.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) nonFacultyStaff10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        userRepository3.addUser((model.user.User) facultyMember15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials14", credentials7.equals(credentials14) ? credentials7.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        model.user.SuperManager superManager1 = model.user.SuperManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = superManagerServices0.createAccount((model.user.User) superManager1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("Student", "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space 97 has been enabled.");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        java.lang.String str8 = facultyMember7.getFacultyId();
        facultyMember7.setFacultyId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        facultyMember7.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str10 = facultyMember7.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.cancenlBooking((int) (byte) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        java.lang.String str6 = credentials4.toString();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = superManagerServices0.createAccount((model.user.User) visitor7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = booking0.getTotalCost();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str10 = nonFacultyStaff9.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = booking0.getTotalCost();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllUsersBookings("There is no Such Parking Lot");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '#');
        parkingSpace9.setStatus(true);
        boolean boolean12 = parkingSpace9.getStatus();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setCost((double) 100L);
        parkingSpace9.setBooking(booking13);
        java.lang.String str24 = booking13.toString();
        int int25 = booking13.getStartTime();
        boolean boolean26 = clientServices0.updateCompleteBooking(booking13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList28 = clientServices0.getAllUsersBookings("Student");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        services.UserService userService4 = new services.UserService();
        boolean boolean6 = userService4.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService4.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        userRepository7.addUser((model.user.User) facultyMember12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        repo.UserRepository userRepository3 = new repo.UserRepository();
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        facultyMember8.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str11 = facultyMember8.getFacultyId();
        userRepository3.addUser((model.user.User) facultyMember8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = superManagerServices0.createAccount((model.user.User) facultyMember8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        services.UserService userService10 = new services.UserService();
        boolean boolean12 = userService10.isValidEmail("SuperManager");
        repo.UserRepository userRepository13 = userService10.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        userRepository13.addUser((model.user.User) facultyMember18);
        userRepository0.removeUser((model.user.User) facultyMember18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials17", credentials4.equals(credentials17) ? credentials4.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "FacultyMember");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user5 = new model.user.User(credentials4);
        userRepository0.addUser(user5);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials10);
        model.user.User user13 = new model.user.User(credentials10);
        model.user.Credentials credentials14 = user13.getCredentials();
        java.lang.String str15 = credentials14.getPassword();
        model.user.Student student16 = new model.user.Student(credentials14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) student16);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15, "hi!");
        model.user.Credentials credentials19 = nonFacultyStaff18.getCredentials();
        model.user.Client client20 = new model.user.Client(credentials19);
        userRepository3.removeUser((model.user.User) client20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials15", credentials7.equals(credentials15) ? credentials7.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials6);
        model.user.User user9 = new model.user.User(credentials6);
        model.user.Credentials credentials10 = user9.getCredentials();
        java.lang.String str11 = credentials10.getPassword();
        model.user.Student student12 = new model.user.Student(credentials10);
        java.lang.String str13 = student12.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = userService0.registerUser((model.user.User) student12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.booking.Booking booking8 = clientServices0.getBookingById((int) (short) -1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        facultyMember10.setFacultyId("Parking Lot 97 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.booking.Booking booking6 = clientServices0.getBookingById((int) (byte) -1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        java.lang.String str12 = credentials8.getPassword();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials8);
        boolean boolean14 = credentials3.equals((java.lang.Object) visitor13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials8", credentials3.equals(credentials8) ? credentials3.hashCode() == credentials8.hashCode() : true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        facultyMember4.setFacultyName("Parking Lot 97 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        boolean boolean12 = facultyMember4.equals((java.lang.Object) str11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials10", credentials3.equals(credentials10) ? credentials3.hashCode() == credentials10.hashCode() : true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials6);
        model.user.User user9 = new model.user.User(credentials6);
        model.user.Credentials credentials10 = user9.getCredentials();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = userService0.registerUser((model.user.User) facultyMember11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff7.setRole("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        booking2.setId((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking2.getTotalCost();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getEndTime();
        int int2 = booking0.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = booking0.getTotalCost();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials12);
        model.user.Client client14 = new model.user.Client(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) client14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        model.user.Credentials credentials19 = user18.getCredentials();
        java.lang.String str20 = credentials19.getPassword();
        model.user.Student student21 = new model.user.Student(credentials19);
        java.lang.String str22 = student21.getStudentId();
        student21.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str25 = student21.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) student21);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        boolean boolean13 = credentials3.equals((java.lang.Object) nonFacultyStaff12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials9", credentials3.equals(credentials9) ? credentials3.hashCode() == credentials9.hashCode() : true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = clientServices0.cancenlBooking((int) (byte) 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        java.lang.String str15 = facultyMember14.getFacultyId();
        userRepository0.removeUser((model.user.User) facultyMember14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials13", credentials4.equals(credentials13) ? credentials4.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("Parking Lot 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList12 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStatus("There is no Such Parking Lot");
        int int12 = booking0.getStartTime();
        java.lang.String str13 = booking0.getLicensePlate();
        java.lang.String str14 = booking0.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        java.lang.String str8 = facultyMember7.getFacultyId();
        facultyMember7.setFacultyId("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = booking0.getTotalCost();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        model.user.Credentials credentials9 = facultyMember8.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("Parking Space 35 is already enabled.");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.lang.String str6 = clientServices0.enableParkingSpaceById((int) (short) 10, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.cancenlBooking((int) (short) -1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        model.user.Client client6 = new model.user.Client(credentials4);
        model.user.Student student7 = new model.user.Student(credentials4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) student7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Visitor");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("Success: Parking Space 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("Parking Lot 97 is already enabled.", "Parking Space 32 is already enabled.");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        services.UserService userService4 = new services.UserService();
        boolean boolean6 = userService4.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService4.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials11);
        userRepository7.addUser((model.user.User) facultyMember12);
        facultyMember12.setFacultyName("Parking Space 32 is already enabled.");
        model.user.Credentials credentials16 = facultyMember12.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = clientServices0.cancenlBooking((int) ' ');
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        nonFacultyStaff10.setRole("");
        nonFacultyStaff10.setRole("hi!");
        boolean boolean15 = nonFacultyStaff10.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) nonFacultyStaff10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        nonFacultyStaff11.setRole("");
        model.user.Credentials credentials14 = nonFacultyStaff11.getCredentials();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) visitor15);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        repo.UserRepository userRepository5 = new repo.UserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        facultyMember10.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str13 = facultyMember10.getFacultyId();
        userRepository5.addUser((model.user.User) facultyMember10);
        java.lang.String str15 = facultyMember10.getFacultyName();
        java.lang.String str16 = facultyMember10.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) facultyMember10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        java.lang.String str9 = credentials7.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = superManagerServices0.createAccount((model.user.User) manager10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getSpaceId();
        java.util.Date date7 = booking0.getStartDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking0.getTotalCost();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.loginUser("Success: Parking Space 1 has been disabled.", "users.json");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.User user4 = null;
        userRepository3.removeUser(user4);
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        model.user.Credentials credentials13 = nonFacultyStaff12.getCredentials();
        model.user.Client client14 = new model.user.Client(credentials13);
        java.lang.String str15 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13);
        userRepository3.addUser((model.user.User) nonFacultyStaff16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff16", nonFacultyStaff12.equals(nonFacultyStaff16) ? nonFacultyStaff12.hashCode() == nonFacultyStaff16.hashCode() : true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        java.lang.String str16 = credentials11.getPassword();
        java.lang.String str17 = credentials11.toString();
        model.user.Client client18 = new model.user.Client(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = superManagerServices0.createAccount((model.user.User) client18);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user3 = userService0.getUserByEmail("(O3fsOXXJ");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials15);
        facultyMember16.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember16.setFacultyId("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember16);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials5);
        model.user.User user8 = new model.user.User(credentials5);
        model.user.Credentials credentials9 = user8.getCredentials();
        java.lang.String str10 = credentials9.getPassword();
        model.user.Student student11 = new model.user.Student(credentials9);
        student11.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) student11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("SuperManager");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        facultyMember10.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember10.setFacultyId("Success: Parking Space 97 has been enabled.");
        boolean boolean15 = credentials3.equals((java.lang.Object) facultyMember10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials9", credentials3.equals(credentials9) ? credentials3.hashCode() == credentials9.hashCode() : true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 1, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = clientServices0.cancenlBooking((int) ' ');
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        facultyMember7.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str10 = facultyMember7.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = superManagerServices0.createAccount((model.user.User) facultyMember7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials6);
        java.lang.String str8 = facultyMember7.getFacultyId();
        facultyMember7.setFacultyId("hi!");
        facultyMember7.setFacultyName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) facultyMember7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.getType();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials12, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = userService0.registerUser((model.user.User) facultyMember17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        java.lang.String str18 = credentials16.toString();
        model.user.Visitor visitor19 = new model.user.Visitor(credentials16);
        java.lang.String str20 = credentials16.toString();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials16, "Student", "Manager");
        facultyMember23.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean26 = facultyMember10.equals((java.lang.Object) "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials16", credentials3.equals(credentials16) ? credentials3.hashCode() == credentials16.hashCode() : true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("FacultyMember", "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Client client12 = new model.user.Client(credentials11);
        java.lang.String str13 = credentials11.getPassword();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount((model.user.User) facultyMember14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = clientServices0.cancenlBooking(10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        nonFacultyStaff6.setRole("NonFacultyStaff");
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials14);
        model.user.User user17 = new model.user.User(credentials14);
        model.user.Credentials credentials18 = user17.getCredentials();
        java.lang.String str19 = credentials18.getPassword();
        model.user.Student student20 = new model.user.Student(credentials18);
        java.lang.String str21 = student20.getStudentId();
        student20.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str24 = student20.getStudentId();
        boolean boolean25 = nonFacultyStaff6.equals((java.lang.Object) student20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials14", credentials3.equals(credentials14) ? credentials3.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Lot 97 is already disabled.");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking2 = clientServices0.getBookingById((int) (short) 1);
        model.booking.Booking booking4 = clientServices0.getBookingById((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.cancenlBooking(97);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList9 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllUsersBookings("Give Id for parking Space is wrong");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        services.ClientServices clientServices8 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot10 = clientServices8.getParkingLotByAddress("");
        java.lang.String str13 = clientServices8.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        java.util.List<java.lang.String> strList14 = clientServices8.getAllLocations();
        boolean boolean15 = credentials3.equals((java.lang.Object) strList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str11 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials13, "Student", "Manager");
        boolean boolean21 = facultyMember5.equals((java.lang.Object) "Student");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials13", credentials4.equals(credentials13) ? credentials4.hashCode() == credentials13.hashCode() : true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials5);
        facultyMember6.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str9 = facultyMember6.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = userService0.registerUser((model.user.User) facultyMember6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 1, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = clientServices0.cancenlBooking(1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = booking0.getTotalCost();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        boolean boolean7 = clientServices0.updateBooking(100, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        model.user.Client client11 = new model.user.Client(credentials9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) client11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = nonFacultyStaff7.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        model.user.Student student11 = new model.user.Student(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = clientServices0.cancenlBooking((int) (short) 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        java.util.Date date3 = booking0.getStartDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = booking0.getTotalCost();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("Success: Parking Space 97 has been disabled.", "Parking Space 35 is already enabled.");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        booking0.setStatus("Student");
        java.util.Date date8 = booking0.getEndDateTime();
        java.lang.String str9 = booking0.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "Success: Parking Lot 100 has been disabled.");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        facultyMember10.setFacultyName("Success: Parking Space 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        java.lang.String str16 = credentials14.toString();
        model.user.User user17 = new model.user.User(credentials14);
        java.lang.String str18 = credentials14.getType();
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials14, "Parking Space -1 is already enabled.", "Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) facultyMember21);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot5 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllUsersBookings("Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.Visitor visitor20 = new model.user.Visitor(credentials17);
        java.lang.String str21 = credentials17.toString();
        java.lang.String str22 = credentials17.getPassword();
        java.lang.String str23 = credentials17.getType();
        model.user.Student student24 = new model.user.Student(credentials17);
        userRepository3.removeUser((model.user.User) student24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials17", credentials7.equals(credentials17) ? credentials7.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("HGL)]pX%+");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.util.List<model.user.User> userList10 = userRepository0.getUsers();
        model.user.User user14 = new model.user.User("", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "Credentials{login='hi!', password='hi!', type='hi!'}");
        userRepository0.removeUser(user14);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        visitor22.validateAccount();
        boolean boolean24 = visitor22.getValidationStatus();
        boolean boolean26 = visitor22.equals((java.lang.Object) (-1.0d));
        userRepository0.removeUser((model.user.User) visitor22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials19", credentials4.equals(credentials19) ? credentials4.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("Student");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = booking0.getTotalCost();
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        boolean boolean13 = clientServices0.updateBooking(100, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllUsersBookings("NonFacultyStaff");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("Parking Space 97 is already disabled.");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        model.user.Client client13 = new model.user.Client(credentials12);
        model.user.Manager manager14 = new model.user.Manager(credentials12);
        java.lang.String str15 = credentials12.getLogin();
        model.user.User user16 = new model.user.User(credentials12);
        model.user.Student student17 = new model.user.Student(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) student17);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        java.lang.String str12 = credentials8.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials8, "Student", "Manager");
        facultyMember15.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str18 = facultyMember15.getFacultyId();
        java.lang.String str19 = facultyMember15.getFacultyName();
        java.lang.String str20 = facultyMember15.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) facultyMember15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        model.user.Client client8 = new model.user.Client("Student", "Give Id for parking Space is wrong", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = superManagerServices0.createAccount((model.user.User) client8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllUsersBookings("Give Id for parking Space is wrong");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "hi!");
        model.user.Credentials credentials15 = nonFacultyStaff14.getCredentials();
        model.user.Client client16 = new model.user.Client(credentials15);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials15);
        boolean boolean18 = credentials3.equals((java.lang.Object) nonFacultyStaff17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Success: Parking Lot 97 has been disabled.");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        model.user.Credentials credentials13 = nonFacultyStaff11.getCredentials();
        model.user.User user14 = model.user.UserFactory.createAccount(credentials13);
        model.user.User user15 = new model.user.User(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount(user15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials5);
        model.user.User user8 = new model.user.User(credentials5);
        model.user.Credentials credentials9 = user8.getCredentials();
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "(O3fsOXXJ");
        model.user.Student student14 = new model.user.Student(credentials9, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student16 = new model.user.Student(credentials9, "Parking Lot 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository1.updateUser((model.user.User) student16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = userService0.registerUser((model.user.User) nonFacultyStaff14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) (short) 100, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        boolean boolean11 = credentials7.equals((java.lang.Object) 776.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials16);
        model.user.User user19 = new model.user.User(credentials16);
        model.user.Credentials credentials20 = user19.getCredentials();
        java.lang.String str21 = credentials20.getPassword();
        model.user.Student student22 = new model.user.Student(credentials20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser((model.user.User) student22);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str8 = facultyMember7.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("pUdP465**");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "There is no Such Parking Lot", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) '#');
        parkingSpace15.setStatus(true);
        boolean boolean18 = parkingSpace15.getStatus();
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        java.lang.String str23 = booking19.getEmail();
        booking19.setCost((double) (byte) 0);
        int int26 = booking19.getLotId();
        booking19.setCost((double) 100L);
        parkingSpace15.setBooking(booking19);
        boolean boolean30 = parkingSpace15.getStatus();
        boolean boolean31 = credentials3.equals((java.lang.Object) parkingSpace15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("Success: Parking Space 100 has been disabled.");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.getType();
        java.lang.String str13 = credentials10.toString();
        java.lang.String str14 = credentials10.getLogin();
        model.user.User user15 = model.user.UserFactory.createAccount(credentials10);
        model.user.Client client16 = new model.user.Client(credentials10);
        model.user.Manager manager17 = new model.user.Manager(credentials10);
        model.user.Student student19 = new model.user.Student(credentials10, "Parking Space 35 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = userService0.registerUser((model.user.User) student19);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking7.getTotalCost();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = clientServices0.cancenlBooking((int) '4');
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.util.List<model.user.User> userList10 = userRepository0.getUsers();
        java.util.List<model.user.User> userList11 = userRepository0.getUsers();
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials15, "hi!");
        model.user.Credentials credentials19 = nonFacultyStaff18.getCredentials();
        model.user.Client client20 = new model.user.Client(credentials19);
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials19);
        userRepository0.removeUser((model.user.User) nonFacultyStaff21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials15", credentials4.equals(credentials15) ? credentials4.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("Success: Parking Space 35 has been disabled.", "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        int int13 = booking6.getLotId();
        booking6.setId((int) '#');
        java.lang.String str16 = booking6.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = clientServices0.updateCompleteBooking(booking6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        java.util.List<model.user.User> userList15 = userRepository3.getUsers();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials19, "hi!");
        model.user.Credentials credentials23 = nonFacultyStaff22.getCredentials();
        model.user.Client client24 = new model.user.Client(credentials23);
        java.lang.String str25 = credentials23.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials23);
        userRepository3.removeUser((model.user.User) nonFacultyStaff26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials19", credentials7.equals(credentials19) ? credentials7.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        java.lang.String str8 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("Success: Parking Space 97 has been disabled.", "Parking Lot 97 is already disabled.");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        model.user.Student student15 = new model.user.Student(credentials10, "users.json");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials10);
        facultyMember16.setFacultyId("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) facultyMember16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        services.ManagerServices managerServices9 = services.ManagerServices.getInstance();
        managerServices9.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList11 = managerServices9.getAllParkingLots();
        managerServices9.loadLots();
        repo.ParkingRepository parkingRepository13 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot16 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean17 = parkingLot16.getStatus();
        model.parking.ParkingLot parkingLot20 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean21 = parkingLot20.getStatus();
        boolean boolean22 = parkingLot20.getStatus();
        model.parking.ParkingLot parkingLot25 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean26 = parkingLot25.getStatus();
        boolean boolean27 = parkingLot25.getStatus();
        model.parking.ParkingLot parkingLot30 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean31 = parkingLot30.getStatus();
        boolean boolean32 = parkingLot30.getStatus();
        parkingLot30.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray35 = new model.parking.ParkingLot[] { parkingLot16, parkingLot20, parkingLot25, parkingLot30 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList36 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList36, parkingLotArray35);
        parkingRepository13.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList36);
        managerServices9.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList36);
        model.parking.ParkingLot parkingLot42 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList43 = parkingLot42.getParkingSpaces();
        int int44 = parkingLot42.getLotID();
        managerServices9.addParkingLot(parkingLot42);
        model.parking.ParkingLot parkingLot48 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList49 = parkingLot48.getParkingSpaces();
        parkingLot48.setLotID((int) (byte) -1);
        managerServices9.addParkingLot(parkingLot48);
        model.parking.ParkingLot parkingLot55 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean56 = parkingLot55.getStatus();
        boolean boolean57 = parkingLot55.getStatus();
        parkingLot55.setLotID((int) (byte) 100);
        int int60 = parkingLot55.getLotID();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList61 = parkingLot55.getParkingSpaces();
        managerServices9.addParkingLot(parkingLot55);
        boolean boolean63 = credentials7.equals((java.lang.Object) parkingLot55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.util.Date date5 = booking0.getStartDateTime();
        booking0.setId((int) (byte) 100);
        java.util.Date date8 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        java.lang.String str11 = booking0.getStatus();
        booking0.setId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        java.lang.String str9 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "hi!");
        model.user.Credentials credentials15 = nonFacultyStaff14.getCredentials();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials15);
        model.user.Student student17 = new model.user.Student(credentials15);
        java.lang.String str18 = credentials15.getPassword();
        boolean boolean19 = credentials3.equals((java.lang.Object) credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        int int5 = booking0.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = booking0.getTotalCost();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Ss!n_uj18");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        model.parking.ParkingLot parkingLot13 = clientServices0.getParkingLotByAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.User user12 = new model.user.User(credentials9);
        model.user.Credentials credentials13 = user12.getCredentials();
        java.lang.String str14 = credentials13.getPassword();
        model.user.Student student15 = new model.user.Student(credentials13);
        student15.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) student15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.Manager manager9 = new model.user.Manager(credentials6);
        userRepository2.removeUser((model.user.User) manager9);
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        model.user.Credentials credentials18 = nonFacultyStaff17.getCredentials();
        model.user.User user19 = model.user.UserFactory.createAccount(credentials18);
        model.user.Student student20 = new model.user.Student(credentials18);
        java.lang.String str21 = student20.getStudentId();
        userRepository2.removeUser((model.user.User) student20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials6 and credentials14", credentials6.equals(credentials14) ? credentials6.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        int int3 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = booking0.getTotalCost();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setCost((double) 100L);
        parkingSpace1.setBooking(booking5);
        java.lang.String str16 = booking5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking5.getTotalCost();
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("There is no Such Parking Lot");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("pUdP465**");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) (short) 100, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = clientServices0.updateBooking((int) ' ', (int) (short) 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.util.Date date5 = booking0.getDate();
        booking0.setEndTime((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking0.getTotalCost();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Client client10 = new model.user.Client(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        repo.BookingRepository bookingRepository7 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList8 = bookingRepository7.getAllBookings();
        repo.BookingRepository bookingRepository9 = new repo.BookingRepository();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        booking15.setCost((double) (byte) 0);
        model.booking.Booking booking22 = new model.booking.Booking();
        int int23 = booking22.getStartTime();
        int int24 = booking22.getId();
        booking22.setEndTime((int) 'a');
        model.booking.Booking booking27 = new model.booking.Booking();
        int int28 = booking27.getStartTime();
        booking27.setEndTime((int) (short) 10);
        java.lang.String str31 = booking27.getEmail();
        booking27.setCost((double) (byte) 0);
        int int34 = booking27.getLotId();
        booking27.setEmail("Manager");
        model.booking.Booking booking37 = new model.booking.Booking();
        int int38 = booking37.getStartTime();
        int int39 = booking37.getId();
        model.booking.Booking booking40 = new model.booking.Booking();
        int int41 = booking40.getStartTime();
        int int42 = booking40.getId();
        booking40.setEndTime((int) 'a');
        model.booking.Booking booking45 = new model.booking.Booking();
        int int46 = booking45.getStartTime();
        booking45.setEndTime((int) (short) 10);
        booking45.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray51 = new model.booking.Booking[] { booking10, booking15, booking22, booking27, booking37, booking40, booking45 };
        java.util.ArrayList<model.booking.Booking> bookingList52 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList52, bookingArray51);
        bookingRepository9.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        bookingRepository7.updateBookings((java.util.List<model.booking.Booking>) bookingList52);
        services.ClientServices clientServices56 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot58 = clientServices56.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList59 = clientServices56.getAllLocations();
        java.util.List<model.booking.Booking> bookingList60 = clientServices56.getAllBookings();
        bookingRepository7.updateBookings(bookingList60);
        boolean boolean62 = credentials3.equals((java.lang.Object) bookingRepository7);
        model.user.User user63 = new model.user.User(credentials3);
        java.lang.String str64 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user63", user6.equals(user63) ? user6.hashCode() == user63.hashCode() : true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.getType();
        java.lang.String str14 = credentials11.toString();
        java.lang.String str15 = credentials11.getLogin();
        java.lang.String str16 = credentials11.toString();
        boolean boolean17 = credentials3.equals((java.lang.Object) credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isValidEmail("SuperManager");
        services.UserService userService10 = new services.UserService();
        boolean boolean12 = userService10.isValidEmail("SuperManager");
        repo.UserRepository userRepository13 = userService10.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        userRepository13.addUser((model.user.User) facultyMember18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount((model.user.User) facultyMember18);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        java.util.Date date16 = booking11.getStartDateTime();
        int int17 = booking11.getTotalHours();
        booking11.setEndTime((int) ' ');
        boolean boolean20 = clientServices0.updateCompleteBooking(booking11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList22 = clientServices0.getAllUsersBookings("Parking Space 100 is already disabled.");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Student student13 = new model.user.Student(credentials11, "Parking Space 35 is already enabled.");
        model.user.Student student14 = new model.user.Student(credentials11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "users.json");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials12);
        java.lang.String str14 = facultyMember13.getFacultyId();
        facultyMember13.setFacultyId("hi!");
        facultyMember13.setFacultyName("hi!");
        java.lang.String str19 = facultyMember13.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount((model.user.User) facultyMember13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff7.setRole("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor10", visitor6.equals(visitor10) ? visitor6.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllUsersBookings("pUdP465**");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot10 = clientServices0.getParkingLotByAddress("Parking Lot 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = clientServices0.cancenlBooking(1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        facultyMember7.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.BookingRepository bookingRepository14 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList15 = bookingRepository14.getAllBookings();
        repo.BookingRepository bookingRepository16 = new repo.BookingRepository();
        model.booking.Booking booking17 = new model.booking.Booking();
        int int18 = booking17.getStartTime();
        booking17.setEndTime((int) (short) 10);
        java.lang.String str21 = booking17.getEmail();
        model.booking.Booking booking22 = new model.booking.Booking();
        int int23 = booking22.getStartTime();
        booking22.setEndTime((int) (short) 10);
        java.lang.String str26 = booking22.getEmail();
        booking22.setCost((double) (byte) 0);
        model.booking.Booking booking29 = new model.booking.Booking();
        int int30 = booking29.getStartTime();
        int int31 = booking29.getId();
        booking29.setEndTime((int) 'a');
        model.booking.Booking booking34 = new model.booking.Booking();
        int int35 = booking34.getStartTime();
        booking34.setEndTime((int) (short) 10);
        java.lang.String str38 = booking34.getEmail();
        booking34.setCost((double) (byte) 0);
        int int41 = booking34.getLotId();
        booking34.setEmail("Manager");
        model.booking.Booking booking44 = new model.booking.Booking();
        int int45 = booking44.getStartTime();
        int int46 = booking44.getId();
        model.booking.Booking booking47 = new model.booking.Booking();
        int int48 = booking47.getStartTime();
        int int49 = booking47.getId();
        booking47.setEndTime((int) 'a');
        model.booking.Booking booking52 = new model.booking.Booking();
        int int53 = booking52.getStartTime();
        booking52.setEndTime((int) (short) 10);
        booking52.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray58 = new model.booking.Booking[] { booking17, booking22, booking29, booking34, booking44, booking47, booking52 };
        java.util.ArrayList<model.booking.Booking> bookingList59 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList59, bookingArray58);
        bookingRepository16.updateBookings((java.util.List<model.booking.Booking>) bookingList59);
        bookingRepository14.updateBookings((java.util.List<model.booking.Booking>) bookingList59);
        services.ClientServices clientServices63 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot65 = clientServices63.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList66 = clientServices63.getAllLocations();
        java.util.List<model.booking.Booking> bookingList67 = clientServices63.getAllBookings();
        bookingRepository14.updateBookings(bookingList67);
        services.ClientServices clientServices69 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot71 = clientServices69.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList72 = clientServices69.getAllBookings();
        java.lang.String str75 = clientServices69.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking77 = clientServices69.getBookingById(100);
        java.util.List<model.booking.Booking> bookingList78 = clientServices69.getAllBookings();
        bookingRepository14.updateBookings(bookingList78);
        boolean boolean80 = credentials3.equals((java.lang.Object) bookingList78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("ngy(gkqsc");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        model.booking.Booking booking0 = new model.booking.Booking();
        java.lang.String str1 = booking0.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = booking0.getTotalCost();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        model.user.Credentials credentials15 = student14.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.RepositoryProvider repositoryProvider9 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository10 = repositoryProvider9.getBookingRepository();
        repo.BookingRepository bookingRepository11 = repositoryProvider9.getBookingRepository();
        repo.BookingRepository bookingRepository12 = repositoryProvider9.getBookingRepository();
        repo.UserRepository userRepository13 = repositoryProvider9.getUserRepository();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        model.user.Credentials credentials21 = nonFacultyStaff20.getCredentials();
        userRepository13.addUser((model.user.User) nonFacultyStaff20);
        java.lang.String str23 = nonFacultyStaff20.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff20);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Lot 1 is already enabled.");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        services.UserService userService0 = services.UserService.getInstance();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        java.lang.String str6 = credentials4.toString();
        model.user.User user7 = new model.user.User(credentials4);
        model.user.Student student9 = new model.user.Student(credentials4, "Parking Space 97 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = userService0.registerUser((model.user.User) student9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        repo.UserRepository userRepository1 = new repo.UserRepository();
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials5);
        facultyMember6.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str9 = facultyMember6.getFacultyId();
        userRepository1.addUser((model.user.User) facultyMember6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = superManagerServices0.createAccount((model.user.User) facultyMember6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        nonFacultyStaff17.setRole("");
        model.user.Credentials credentials20 = nonFacultyStaff17.getCredentials();
        model.user.Credentials credentials21 = nonFacultyStaff17.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("SBu-sSijR");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        java.lang.String str15 = facultyMember14.getFacultyId();
        java.lang.String str16 = facultyMember14.getFacultyId();
        java.lang.String str17 = facultyMember14.getFacultyName();
        java.lang.String str18 = facultyMember14.getFacultyId();
        facultyMember14.setFacultyName("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) facultyMember14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Client client8 = new model.user.Client("Success: Parking Space -1 has been disabled.", "Success: Parking Space -1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) client8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials9, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = userService0.registerUser((model.user.User) facultyMember13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        model.user.Student student13 = new model.user.Student(credentials7, "Parking Space 100 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff11", nonFacultyStaff9.equals(nonFacultyStaff11) ? nonFacultyStaff9.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        nonFacultyStaff10.setRole("");
        model.user.Credentials credentials13 = nonFacultyStaff10.getCredentials();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials13);
        model.user.Client client15 = new model.user.Client(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = userService0.registerUser((model.user.User) client15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        student5.setStudentId("]82UgsU=G");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Success: Parking Space 1 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        facultyMember9.setFacultyId("HGL)]pX%+");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember9", facultyMember5.equals(facultyMember9) ? facultyMember5.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Client client12 = new model.user.Client(credentials11);
        model.user.Manager manager13 = new model.user.Manager(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = userService0.registerUser((model.user.User) manager13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials8);
        model.user.User user11 = new model.user.User(credentials8);
        model.user.Credentials credentials12 = user11.getCredentials();
        java.lang.String str13 = credentials12.getPassword();
        model.user.Student student14 = new model.user.Student(credentials12);
        java.lang.String str15 = student14.getStudentId();
        java.lang.String str16 = student14.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) student14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.getLicensePlate();
        double double6 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = booking0.getTotalCost();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        services.UserService userService0 = services.UserService.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user2 = userService0.getUserByEmail("Parking Space 97 is already disabled.");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository8 = userService0.userRepository;
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials12);
        model.user.User user15 = new model.user.User(credentials12);
        model.user.Credentials credentials16 = user15.getCredentials();
        java.lang.String str17 = credentials16.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials16, "(O3fsOXXJ");
        model.user.Client client20 = new model.user.Client(credentials16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) client20);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.getType();
        java.lang.String str14 = credentials11.toString();
        java.lang.String str15 = credentials11.getLogin();
        java.lang.String str16 = credentials11.toString();
        model.parking.ParkingSpace parkingSpace18 = new model.parking.ParkingSpace((int) '#');
        parkingSpace18.setStatus(true);
        boolean boolean21 = parkingSpace18.getStatus();
        model.booking.Booking booking22 = new model.booking.Booking();
        int int23 = booking22.getStartTime();
        booking22.setEndTime((int) (short) 10);
        java.lang.String str26 = booking22.getEmail();
        booking22.setCost((double) (byte) 0);
        int int29 = booking22.getLotId();
        booking22.setCost((double) 100L);
        parkingSpace18.setBooking(booking22);
        java.lang.String str33 = booking22.toString();
        java.lang.String str34 = booking22.getStatus();
        boolean boolean35 = credentials11.equals((java.lang.Object) booking22);
        boolean boolean36 = credentials3.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials11", credentials3.equals(credentials11) ? credentials3.hashCode() == credentials11.hashCode() : true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("]cT(-?mBj");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Student student13 = new model.user.Student(credentials11, "Parking Space 35 is already enabled.");
        student13.setStudentId("Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.getUserByEmail("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.RepositoryProvider repositoryProvider4 = new repo.RepositoryProvider();
        repo.UserRepository userRepository5 = repositoryProvider4.getUserRepository();
        repo.UserRepository userRepository6 = repositoryProvider4.getUserRepository();
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        model.user.Student student15 = new model.user.Student(credentials10, "users.json");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials10);
        facultyMember16.setFacultyId("Visitor");
        userRepository6.removeUser((model.user.User) facultyMember16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = userService0.registerUser((model.user.User) facultyMember16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("_0OsrHq9&", "Give Id for parking Space is wrong");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("(O3fsOXXJ");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("]82UgsU=G", "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("]82UgsU=G");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        int int13 = booking11.getId();
        int int14 = booking11.getTotalHours();
        booking11.setId((int) 'a');
        boolean boolean17 = clientServices0.bookParkingSpace(booking11);
        java.util.List<model.booking.Booking> bookingList18 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllUsersBookings("Parking Lot -1 is already enabled.");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        boolean boolean7 = clientServices0.updateBooking(100, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList9 = clientServices0.getAllUsersBookings("1bR(76zCD");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.booking.Booking booking8 = new model.booking.Booking();
        int int9 = booking8.getStartTime();
        int int10 = booking8.getId();
        booking8.setEndTime((int) 'a');
        booking8.setEndTime((-1));
        boolean boolean15 = credentials3.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot5 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean8 = clientServices0.updateBooking((int) (short) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = clientServices0.cancenlBooking((-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("wMB&=eDYD");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = booking0.getTotalCost();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials6, "hi!");
        nonFacultyStaff9.setRole("");
        nonFacultyStaff9.setRole("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) nonFacultyStaff9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff9.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials12);
        model.user.Client client14 = new model.user.Client(credentials12);
        model.user.Student student15 = new model.user.Student(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        userRepository8.addUser((model.user.User) client16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client14 and client16", client14.equals(client16) ? client14.hashCode() == client16.hashCode() : true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.loginUser("Parking Space 1 is already enabled.", "Success: Parking Lot -1 has been enabled.");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.User user11 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isStrongPassword("");
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount((model.user.User) facultyMember14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        java.lang.String str7 = credentials5.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials5);
        visitor8.validateAccount();
        boolean boolean10 = visitor8.getValidationStatus();
        boolean boolean12 = visitor8.equals((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) visitor8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("Visitor", "Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("9z6wsHuxQ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("Success: Parking Lot -1 has been enabled.", "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        nonFacultyStaff16.setRole("");
        model.user.Credentials credentials19 = nonFacultyStaff16.getCredentials();
        nonFacultyStaff16.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getSpaceId();
        int int8 = booking6.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking6.getTotalCost();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        repo.RepositoryProvider repositoryProvider3 = new repo.RepositoryProvider();
        repo.UserRepository userRepository4 = repositoryProvider3.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider3.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        model.user.Student student14 = new model.user.Student(credentials9, "users.json");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials9);
        facultyMember15.setFacultyId("Visitor");
        userRepository5.removeUser((model.user.User) facultyMember15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) facultyMember15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '#');
        parkingSpace9.setStatus(true);
        boolean boolean12 = parkingSpace9.getStatus();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setCost((double) 100L);
        parkingSpace9.setBooking(booking13);
        java.lang.String str24 = booking13.toString();
        int int25 = booking13.getStartTime();
        boolean boolean26 = clientServices0.updateCompleteBooking(booking13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = booking13.getTotalCost();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        int int13 = booking6.getLotId();
        booking6.setEndTime((int) (short) 100);
        booking6.setId((-1));
        booking6.setCost((double) (short) 100);
        booking6.setLicensePlate("Success: Parking Space 100 has been disabled.");
        booking6.setId((int) (byte) 1);
        boolean boolean24 = clientServices0.bookParkingSpace(booking6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = clientServices0.cancenlBooking(35);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("]82UgsU=G");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("Parking Space 100 is already disabled.");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("Parking Space 100 is already enabled.");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.parking.ParkingLot parkingLot4 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("DYp5a&9eU");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("X?EhgrKDV", "A%v5&YzsA");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff11.setRole("(O3fsOXXJ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff11", nonFacultyStaff9.equals(nonFacultyStaff11) ? nonFacultyStaff9.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "wMB&=eDYD", "Parking Space 1 is already disabled.");
        model.user.User user16 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("pUdP465**");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("Parking Space 35 is already enabled.", "users.json");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        boolean boolean5 = clientServices0.updateBooking(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList6 = clientServices0.getAllLocations();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        model.parking.ParkingLot parkingLot13 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str14 = parkingLot13.enableParkingLot();
        java.lang.String str15 = parkingLot13.enableParkingLot();
        int int16 = parkingLot13.getLotID();
        java.lang.String str17 = parkingLot13.enableParkingLot();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList18 = parkingLot13.getParkingSpaces();
        java.util.List<model.parking.ParkingSpace> parkingSpaceList19 = parkingLot13.getParkingSpaces();
        java.lang.String str20 = parkingLot13.enableParkingLot();
        boolean boolean21 = nonFacultyStaff10.equals((java.lang.Object) parkingLot13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff10", nonFacultyStaff9.equals(nonFacultyStaff10) ? nonFacultyStaff9.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        model.user.User user12 = new model.user.User("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "X5G?ZJ!c@", "Parking Space 1 is already disabled.");
        model.user.Credentials credentials13 = user12.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository8.updateUser(user12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("Parking Space 100 is already disabled.");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (short) 10);
        java.util.Date date12 = booking0.getDate();
        booking0.setId(10);
        int int15 = booking0.getEndTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = booking0.getTotalCost();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("=B3fAbMGq");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("_0OsrHq9&");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        booking0.setLicensePlate("(O3fsOXXJ");
        java.lang.String str13 = booking0.toString();
        java.util.Date date14 = booking0.getEndDateTime();
        booking0.setLicensePlate("Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking0.getTotalCost();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.Manager manager9 = new model.user.Manager(credentials6);
        userRepository2.removeUser((model.user.User) manager9);
        model.user.Credentials credentials14 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials14, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client18 = new model.user.Client(credentials14);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials14);
        java.lang.String str20 = nonFacultyStaff19.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) nonFacultyStaff19);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        model.user.Client client16 = new model.user.Client(credentials12);
        model.user.Student student18 = new model.user.Student(credentials12, "Student");
        userRepository2.addUser((model.user.User) student18);
        model.user.Credentials credentials23 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials23, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client27 = new model.user.Client(credentials23);
        model.user.NonFacultyStaff nonFacultyStaff28 = new model.user.NonFacultyStaff(credentials23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) nonFacultyStaff28);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = clientServices0.cancenlBooking((int) (byte) 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        model.user.Visitor visitor5 = new model.user.Visitor(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor4 and visitor5", visitor4.equals(visitor5) ? visitor4.hashCode() == visitor5.hashCode() : true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        java.lang.String str7 = booking2.getEmail();
        booking2.setStatus("Parking Space 1 is already disabled.");
        int int10 = booking2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking2.getTotalCost();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("4]z?3Qs%M", "Parking Lot 97 is already disabled.");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        services.ManagerServices managerServices9 = services.ManagerServices.getInstance();
        managerServices9.loadLots();
        managerServices9.loadLots();
        repo.RepositoryProvider repositoryProvider12 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository13 = repositoryProvider12.getBookingRepository();
        repo.UserRepository userRepository14 = repositoryProvider12.getUserRepository();
        model.user.Credentials credentials18 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user19 = new model.user.User(credentials18);
        userRepository14.addUser(user19);
        model.user.Credentials credentials24 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str25 = credentials24.getPassword();
        java.lang.String str26 = credentials24.toString();
        model.user.Visitor visitor27 = new model.user.Visitor(credentials24);
        model.user.Client client28 = new model.user.Client(credentials24);
        model.user.Student student30 = new model.user.Student(credentials24, "Student");
        userRepository14.addUser((model.user.User) student30);
        repo.ParkingRepository parkingRepository32 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList33 = parkingRepository32.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList34 = parkingRepository32.getAllParkingLots();
        boolean boolean35 = student30.equals((java.lang.Object) parkingLotList34);
        managerServices9.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList34);
        managerServices9.loadLots();
        repo.ParkingRepository parkingRepository38 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot41 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean42 = parkingLot41.getStatus();
        model.parking.ParkingLot parkingLot45 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean46 = parkingLot45.getStatus();
        boolean boolean47 = parkingLot45.getStatus();
        model.parking.ParkingLot parkingLot50 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean51 = parkingLot50.getStatus();
        boolean boolean52 = parkingLot50.getStatus();
        model.parking.ParkingLot parkingLot55 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean56 = parkingLot55.getStatus();
        boolean boolean57 = parkingLot55.getStatus();
        parkingLot55.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray60 = new model.parking.ParkingLot[] { parkingLot41, parkingLot45, parkingLot50, parkingLot55 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList61 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList61, parkingLotArray60);
        parkingRepository38.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList61);
        repo.ParkingRepository parkingRepository64 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot67 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean68 = parkingLot67.getStatus();
        model.parking.ParkingLot parkingLot71 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean72 = parkingLot71.getStatus();
        boolean boolean73 = parkingLot71.getStatus();
        model.parking.ParkingLot parkingLot76 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean77 = parkingLot76.getStatus();
        boolean boolean78 = parkingLot76.getStatus();
        model.parking.ParkingLot parkingLot81 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean82 = parkingLot81.getStatus();
        boolean boolean83 = parkingLot81.getStatus();
        parkingLot81.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray86 = new model.parking.ParkingLot[] { parkingLot67, parkingLot71, parkingLot76, parkingLot81 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList87 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList87, parkingLotArray86);
        parkingRepository64.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList87);
        parkingRepository38.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList87);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList91 = parkingRepository38.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList92 = parkingRepository38.getAllParkingLots();
        managerServices9.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList92);
        boolean boolean94 = credentials3.equals((java.lang.Object) parkingLotList92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials24", credentials3.equals(credentials24) ? credentials3.hashCode() == credentials24.hashCode() : true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user13 = new model.user.User(credentials10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        boolean boolean10 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str11 = superManagerServices0.generateStrongPassword();
        boolean boolean13 = superManagerServices0.isStrongPassword("FacultyMember");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getLogin();
        strategy.StudentParkingRate studentParkingRate19 = new strategy.StudentParkingRate();
        double double21 = studentParkingRate19.calculateRate((double) 1.0f);
        boolean boolean22 = credentials17.equals((java.lang.Object) 1.0f);
        model.user.User user23 = new model.user.User(credentials17);
        model.user.Student student24 = new model.user.Student(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = superManagerServices0.createAccount((model.user.User) student24);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("wMB&=eDYD", "Success: Parking Lot -1 has been enabled.");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.loginUser("[qIbnc7Xj", "Success: Parking Space 97 has been disabled.");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        java.lang.String str12 = credentials8.toString();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials8, "Student", "Manager");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Space 35 is already enabled.");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("Success: Parking Lot 97 has been disabled.", "X5G?ZJ!c@");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        int int7 = parkingSpace1.getSpaceID();
        model.parking.ParkingSpace parkingSpace9 = new model.parking.ParkingSpace((int) '#');
        parkingSpace9.setStatus(true);
        boolean boolean12 = parkingSpace9.getStatus();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setCost((double) 100L);
        parkingSpace9.setBooking(booking13);
        java.lang.String str24 = booking13.toString();
        java.lang.String str25 = booking13.getStatus();
        int int26 = booking13.getId();
        parkingSpace1.setBooking(booking13);
        int int28 = booking13.getLotId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double29 = booking13.getTotalCost();
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = clientServices0.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.toString();
        int int11 = booking0.getId();
        booking0.setEndTime((int) (short) 10);
        java.util.Date date14 = booking0.getDate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        java.lang.String str18 = credentials16.toString();
        model.user.User user19 = new model.user.User(credentials16);
        repo.BookingRepository bookingRepository20 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList21 = bookingRepository20.getAllBookings();
        repo.BookingRepository bookingRepository22 = new repo.BookingRepository();
        model.booking.Booking booking23 = new model.booking.Booking();
        int int24 = booking23.getStartTime();
        booking23.setEndTime((int) (short) 10);
        java.lang.String str27 = booking23.getEmail();
        model.booking.Booking booking28 = new model.booking.Booking();
        int int29 = booking28.getStartTime();
        booking28.setEndTime((int) (short) 10);
        java.lang.String str32 = booking28.getEmail();
        booking28.setCost((double) (byte) 0);
        model.booking.Booking booking35 = new model.booking.Booking();
        int int36 = booking35.getStartTime();
        int int37 = booking35.getId();
        booking35.setEndTime((int) 'a');
        model.booking.Booking booking40 = new model.booking.Booking();
        int int41 = booking40.getStartTime();
        booking40.setEndTime((int) (short) 10);
        java.lang.String str44 = booking40.getEmail();
        booking40.setCost((double) (byte) 0);
        int int47 = booking40.getLotId();
        booking40.setEmail("Manager");
        model.booking.Booking booking50 = new model.booking.Booking();
        int int51 = booking50.getStartTime();
        int int52 = booking50.getId();
        model.booking.Booking booking53 = new model.booking.Booking();
        int int54 = booking53.getStartTime();
        int int55 = booking53.getId();
        booking53.setEndTime((int) 'a');
        model.booking.Booking booking58 = new model.booking.Booking();
        int int59 = booking58.getStartTime();
        booking58.setEndTime((int) (short) 10);
        booking58.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray64 = new model.booking.Booking[] { booking23, booking28, booking35, booking40, booking50, booking53, booking58 };
        java.util.ArrayList<model.booking.Booking> bookingList65 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList65, bookingArray64);
        bookingRepository22.updateBookings((java.util.List<model.booking.Booking>) bookingList65);
        bookingRepository20.updateBookings((java.util.List<model.booking.Booking>) bookingList65);
        services.ClientServices clientServices69 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot71 = clientServices69.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList72 = clientServices69.getAllLocations();
        java.util.List<model.booking.Booking> bookingList73 = clientServices69.getAllBookings();
        bookingRepository20.updateBookings(bookingList73);
        boolean boolean75 = credentials16.equals((java.lang.Object) bookingRepository20);
        model.user.Student student76 = new model.user.Student(credentials16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = userService0.registerUser((model.user.User) student76);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        nonFacultyStaff10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        services.UserService userService10 = new services.UserService();
        boolean boolean12 = userService10.isValidEmail("SuperManager");
        repo.UserRepository userRepository13 = userService10.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        model.user.Credentials credentials21 = nonFacultyStaff20.getCredentials();
        model.user.Credentials credentials22 = nonFacultyStaff20.getCredentials();
        userRepository13.removeUser((model.user.User) nonFacultyStaff20);
        java.util.List<model.user.User> userList24 = userRepository13.getUsers();
        model.user.User user28 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        userRepository13.addUser(user28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = superManagerServices0.createAccount(user28);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 97 is already disabled.");
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEndTime((int) (short) 100);
        booking9.setEmail("(O3fsOXXJ");
        boolean boolean21 = credentials3.equals((java.lang.Object) booking9);
        java.util.Date date22 = booking9.getStartDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = booking9.getTotalCost();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        boolean boolean8 = superManagerServices0.isValidEmail("");
        boolean boolean10 = superManagerServices0.isStrongPassword("");
        model.user.Client client14 = new model.user.Client("Success: Parking Space 97 has been disabled.", "Success: Parking Space 100 has been disabled.", "Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount((model.user.User) client14);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.loginUser("Success: Parking Lot 97 has been disabled.", "cmB$K&uw+");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials6);
        boolean boolean9 = facultyMember8.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = superManagerServices0.createAccount((model.user.User) facultyMember8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "wMB&=eDYD", "Parking Space 1 is already disabled.");
        java.lang.Object obj16 = null;
        boolean boolean17 = facultyMember15.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        boolean boolean8 = superManagerServices0.isValidEmail("");
        boolean boolean10 = superManagerServices0.isStrongPassword("");
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.Student student16 = new model.user.Student(credentials14, "Success: Parking Space 97 has been enabled.");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        java.lang.String str15 = credentials14.getType();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials14, "X?EhgrKDV", "]82UgsU=G");
        java.lang.String str19 = facultyMember18.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember18", facultyMember10.equals(facultyMember18) ? facultyMember10.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository9 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client9", client7.equals(client9) ? client7.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        java.lang.String str11 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor10", visitor6.equals(visitor10) ? visitor6.hashCode() == visitor10.hashCode() : true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("Student", "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        boolean boolean14 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.getUserByEmail("Give Id for parking Space is wrong");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("cZ=IAx!!l", "pUdP465**");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user5 = new model.user.User(credentials4);
        userRepository0.addUser(user5);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials10, "Student", "Manager");
        facultyMember17.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str20 = facultyMember17.getFacultyId();
        java.lang.String str21 = facultyMember17.getFacultyName();
        model.user.Credentials credentials22 = facultyMember17.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) facultyMember17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        model.user.User user11 = new model.user.User("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "X5G?ZJ!c@", "Parking Space 1 is already disabled.");
        model.user.Credentials credentials12 = user11.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser(user11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.Manager manager12 = new model.user.Manager(credentials7);
        repo.UserRepository userRepository13 = new repo.UserRepository();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials17);
        facultyMember18.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str21 = facultyMember18.getFacultyId();
        userRepository13.addUser((model.user.User) facultyMember18);
        java.lang.String str23 = facultyMember18.getFacultyId();
        boolean boolean24 = credentials7.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials17", credentials7.equals(credentials17) ? credentials7.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        java.lang.String str16 = facultyMember15.getFacultyId();
        java.lang.String str17 = facultyMember15.getFacultyId();
        java.lang.String str18 = facultyMember15.getFacultyId();
        java.lang.String str19 = facultyMember15.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository10.updateUser((model.user.User) facultyMember15);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("pUdP465**");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.Manager manager12 = new model.user.Manager(credentials7);
        model.user.Student student13 = new model.user.Student(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager11 and manager12", manager11.equals(manager12) ? manager11.hashCode() == manager12.hashCode() : true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        java.lang.String str15 = credentials14.getType();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials14, "X?EhgrKDV", "]82UgsU=G");
        facultyMember18.setFacultyId("cmB$K&uw+");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember18", facultyMember10.equals(facultyMember18) ? facultyMember10.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.loginUser("", "success");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "", "Parking Space 97 is already disabled.");
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember10", facultyMember4.equals(facultyMember10) ? facultyMember4.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str8 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        model.booking.Booking booking8 = new model.booking.Booking();
        booking8.setId(0);
        booking8.setEmail("Student");
        java.util.Date date13 = booking8.getStartDateTime();
        boolean boolean14 = clientServices0.updateCompleteBooking(booking8);
        java.util.List<java.lang.String> strList15 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList17 = clientServices0.getAllUsersBookings("Success: Parking Lot -1 has been disabled.");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "Success: Parking Lot 32 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        boolean boolean11 = superManagerServices0.isValidEmail("");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        model.user.Student student20 = new model.user.Student(credentials15, "users.json");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials15);
        facultyMember21.setFacultyId("Success: Parking Space 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) facultyMember21);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client5 and client7", client5.equals(client7) ? client5.hashCode() == client7.hashCode() : true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str8 = superManagerServices0.generateStrongPassword();
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials13 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials13, "=K*eY67RK");
        model.user.Student student16 = new model.user.Student(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) student16);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean13 = student9.getValidationStatus();
        student9.setStudentId("Manager");
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials19);
        services.ClientServices clientServices21 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot23 = clientServices21.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList24 = clientServices21.getAllBookings();
        java.lang.String str27 = clientServices21.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean30 = clientServices21.updateBooking((int) '#', (int) (short) 0);
        boolean boolean31 = credentials19.equals((java.lang.Object) (short) 0);
        boolean boolean32 = student9.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        services.UserService userService0 = services.UserService.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user2 = userService0.getUserByEmail("Y@mMCI7!u");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        student14.setStudentId("Y@mMCI7!u");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean2 = parkingSpace1.hasBooking();
        parkingSpace1.setSpaceID(100);
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        int int7 = booking5.getId();
        int int8 = booking5.getTotalHours();
        java.util.Date date9 = booking5.getEndDateTime();
        parkingSpace1.setBooking(booking5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking5.getTotalCost();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("Student");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.", "Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        java.util.List<model.user.User> userList1 = userRepository0.getUsers();
        repo.RepositoryProvider repositoryProvider2 = new repo.RepositoryProvider();
        repo.UserRepository userRepository3 = repositoryProvider2.getUserRepository();
        java.util.List<model.user.User> userList4 = userRepository3.getUsers();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.getType();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials8, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember13.setFacultyId("NonFacultyStaff");
        userRepository3.addUser((model.user.User) facultyMember13);
        model.user.Credentials credentials17 = facultyMember13.getCredentials();
        userRepository0.addUser((model.user.User) facultyMember13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on userList1 and userList4", userList1.equals(userList4) ? userList1.hashCode() == userList4.hashCode() : true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getLogin();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "", "Parking Space 97 is already disabled.");
        facultyMember10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember10", facultyMember4.equals(facultyMember10) ? facultyMember4.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials18, "hi!");
        nonFacultyStaff21.setRole("");
        model.user.Credentials credentials24 = nonFacultyStaff21.getCredentials();
        model.user.Credentials credentials25 = nonFacultyStaff21.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) nonFacultyStaff21);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials4);
        model.user.User user7 = new model.user.User(credentials4);
        model.user.Credentials credentials8 = user7.getCredentials();
        java.lang.String str9 = credentials8.getPassword();
        model.user.Student student10 = new model.user.Student(credentials8);
        java.lang.String str11 = student10.getStudentId();
        student10.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean14 = student10.getValidationStatus();
        student10.setStudentId("Manager");
        userRepository0.removeUser((model.user.User) student10);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        java.lang.String str23 = credentials21.toString();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials21);
        model.user.Student student26 = new model.user.Student(credentials21, "users.json");
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) facultyMember27);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        model.user.Client client18 = new model.user.Client("Parking Lot 100 is already enabled.", "(O3fsOXXJ", "HGL)]pX%+");
        userRepository3.addUser((model.user.User) client18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff26 = new model.user.NonFacultyStaff(credentials23, "hi!");
        model.user.Visitor visitor27 = new model.user.Visitor(credentials23);
        java.lang.String str28 = credentials23.getPassword();
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials23, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember31);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking9 = clientServices0.getBookingById((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = clientServices0.cancenlBooking((-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        java.util.List<model.user.User> userList9 = userRepository2.getUsers();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials13);
        model.user.User user16 = new model.user.User(credentials13);
        model.user.Credentials credentials17 = user16.getCredentials();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        userRepository2.removeUser((model.user.User) facultyMember20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember15 and facultyMember20", facultyMember15.equals(facultyMember20) ? facultyMember15.hashCode() == facultyMember20.hashCode() : true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        java.lang.String str14 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff13", nonFacultyStaff10.equals(nonFacultyStaff13) ? nonFacultyStaff10.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setId((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = booking0.getTotalCost();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "There is no Such Parking Lot");
        java.lang.String str10 = credentials7.getPassword();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        model.user.Client client16 = new model.user.Client(credentials14);
        boolean boolean17 = credentials7.equals((java.lang.Object) client16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials14", credentials7.equals(credentials14) ? credentials7.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.User user10 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client9", client7.equals(client9) ? client7.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.parking.ParkingLot parkingLot4 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("Manager");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("R14et$0r@", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        int int3 = booking0.getEndTime();
        int int4 = booking0.getEndTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = booking0.getTotalCost();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        model.parking.ParkingSpace parkingSpace5 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        parkingSpace5.setBooking(booking6);
        java.lang.String str14 = parkingSpace5.enableParkingSpace();
        parkingSpace5.setSpaceID((int) (byte) -1);
        model.booking.Booking booking17 = new model.booking.Booking();
        booking17.setId(0);
        booking17.setEmail("Student");
        java.util.Date date22 = booking17.getStartDateTime();
        parkingSpace5.setBooking(booking17);
        boolean boolean24 = clientServices0.updateCompleteBooking(booking17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = booking17.getTotalCost();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Student");
        boolean boolean5 = superManagerServices0.isStrongPassword("9z6wsHuxQ");
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.User user12 = new model.user.User(credentials9);
        model.user.Credentials credentials13 = user12.getCredentials();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials13, "success", "Success: Parking Space 100 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) facultyMember16);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setId((int) '#');
        booking0.setStartTime(0);
        booking0.setStatus("Parking Space 100 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isValidEmail("SuperManager");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials13);
        boolean boolean16 = facultyMember15.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) facultyMember15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user8 = new model.user.User("There is no Such Parking Lot", "Parking Space -1 is already enabled.", "Wm(OGK*DZ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = userService0.registerUser(user8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Credentials credentials10 = student9.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials10, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials16 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean17 = credentials10.equals((java.lang.Object) credentials16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("l)d9[%+Se");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("B7Q7?T8bL", ")CAoHm8t(");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        model.parking.ParkingSpace parkingSpace8 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        int int11 = booking9.getId();
        parkingSpace8.setBooking(booking9);
        model.booking.Booking booking13 = parkingSpace8.getBooking();
        int int14 = booking13.getSpaceId();
        int int15 = booking13.getStartTime();
        boolean boolean16 = clientServices0.updateCompleteBooking(booking13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking13.getTotalCost();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials11, "Student", "Manager");
        facultyMember18.setFacultyId("Give Id for parking Space is wrong");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) facultyMember18);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot5 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllUsersBookings("2g]O0QGM)");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials4);
        facultyMember5.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str8 = facultyMember5.getFacultyId();
        userRepository0.addUser((model.user.User) facultyMember5);
        java.util.List<model.user.User> userList10 = userRepository0.getUsers();
        repo.UserRepository userRepository11 = new repo.UserRepository();
        model.user.Credentials credentials15 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user16 = new model.user.User(credentials15);
        userRepository11.addUser(user16);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials21, "hi!");
        model.user.Credentials credentials25 = nonFacultyStaff24.getCredentials();
        model.user.Client client26 = new model.user.Client(credentials25);
        model.user.Manager manager27 = new model.user.Manager(credentials25);
        userRepository11.addUser((model.user.User) manager27);
        userRepository0.addUser((model.user.User) manager27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials4 and credentials21", credentials4.equals(credentials21) ? credentials4.hashCode() == credentials21.hashCode() : true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.toString();
        int int11 = booking0.getId();
        booking0.setEndTime((int) (short) 10);
        java.util.Date date14 = booking0.getDate();
        booking0.setLicensePlate("NonFacultyStaff");
        booking0.setStartTime((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = booking0.getTotalCost();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isStrongPassword("There is no Such Parking Lot");
        boolean boolean15 = userService11.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository16 = userService11.userRepository;
        boolean boolean18 = userService11.isStrongPassword("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository19 = userService11.userRepository;
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        java.lang.String str25 = credentials23.toString();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials23);
        java.lang.String str27 = credentials23.toString();
        model.user.User user28 = model.user.UserFactory.createAccount(credentials23);
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials23, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client32 = new model.user.Client(credentials23);
        userRepository19.removeUser((model.user.User) client32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = superManagerServices0.createAccount((model.user.User) client32);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("2g]O0QGM)");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.getUserByEmail("");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        services.UserService userService10 = new services.UserService();
        boolean boolean12 = userService10.isValidEmail("SuperManager");
        repo.UserRepository userRepository13 = userService10.userRepository;
        model.user.User user14 = null;
        userRepository13.removeUser(user14);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials19);
        model.user.User user22 = new model.user.User(credentials19);
        model.user.Credentials credentials23 = user22.getCredentials();
        java.lang.String str24 = credentials23.getPassword();
        model.user.Student student25 = new model.user.Student(credentials23);
        java.lang.String str26 = student25.getStudentId();
        java.lang.String str27 = student25.getStudentId();
        student25.setStudentId("(O3fsOXXJ");
        student25.validateAccount();
        userRepository13.addUser((model.user.User) student25);
        student25.setStudentId("l)d9[%+Se");
        userRepository3.removeUser((model.user.User) student25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials19", credentials7.equals(credentials19) ? credentials7.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff10.setRole("1bR(76zCD");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff10", nonFacultyStaff9.equals(nonFacultyStaff10) ? nonFacultyStaff9.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("B7Q7?T8bL");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        userRepository5.addUser((model.user.User) facultyMember14);
        java.util.List<model.user.User> userList16 = userRepository5.getUsers();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getLogin();
        strategy.StudentParkingRate studentParkingRate22 = new strategy.StudentParkingRate();
        double double24 = studentParkingRate22.calculateRate((double) 1.0f);
        boolean boolean25 = credentials20.equals((java.lang.Object) 1.0f);
        java.lang.String str26 = credentials20.getType();
        model.user.Visitor visitor27 = new model.user.Visitor(credentials20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) visitor27);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("9z6wsHuxQ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("Parking Space 35 is already disabled.");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager10 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials7, "HcpxBjAE]", "4]z?3Qs%M");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials7, "Parking Space 10 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember13", facultyMember9.equals(facultyMember13) ? facultyMember9.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) 'a', (int) (byte) 100);
        java.lang.String str6 = clientServices0.disableParkingSpaceById(1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("Y@mMCI7!u");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("Qw$TanXAv");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "=B3fAbMGq", "Parking Lot -1 is already enabled.");
        facultyMember7.setFacultyId("Success: Parking Lot 97 has been enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isValidEmail("Success: Parking Space 100 has been enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        model.user.Student student15 = new model.user.Student(credentials10, "users.json");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials10);
        facultyMember16.setFacultyId("Success: Parking Space 97 has been enabled.");
        facultyMember16.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount((model.user.User) facultyMember16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) 'a', 100);
        java.lang.String str14 = clientServices0.enableParkingSpaceById((int) ' ', (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking((-87));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.lang.String str14 = clientServices0.enableParkingSpaceById(1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList16 = clientServices0.getAllUsersBookings("Parking Space 35 is already enabled.");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        services.ClientServices clientServices6 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot8 = clientServices6.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList9 = clientServices6.getAllLocations();
        java.util.List<model.booking.Booking> bookingList10 = clientServices6.getAllBookings();
        model.parking.ParkingSpace parkingSpace12 = new model.parking.ParkingSpace((int) '#');
        parkingSpace12.setStatus(true);
        boolean boolean15 = parkingSpace12.getStatus();
        model.booking.Booking booking16 = new model.booking.Booking();
        int int17 = booking16.getStartTime();
        booking16.setEndTime((int) (short) 10);
        java.lang.String str20 = booking16.getEmail();
        booking16.setCost((double) (byte) 0);
        int int23 = booking16.getLotId();
        booking16.setCost((double) 100L);
        parkingSpace12.setBooking(booking16);
        java.lang.String str27 = booking16.toString();
        int int28 = booking16.getId();
        boolean boolean29 = clientServices6.bookParkingSpace(booking16);
        model.parking.ParkingSpace parkingSpace31 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking32 = new model.booking.Booking();
        int int33 = booking32.getStartTime();
        int int34 = booking32.getId();
        parkingSpace31.setBooking(booking32);
        model.booking.Booking booking36 = parkingSpace31.getBooking();
        int int37 = booking36.getId();
        int int38 = booking36.getSpaceId();
        boolean boolean39 = clientServices6.bookParkingSpace(booking36);
        boolean boolean40 = student5.equals((java.lang.Object) clientServices6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        visitor14.validateAccount();
        boolean boolean16 = visitor14.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) visitor14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getSpaceId();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setCost((double) '4');
        java.lang.String str10 = booking0.toString();
        java.util.Date date11 = booking0.getStartDateTime();
        booking0.setId((int) (byte) -1);
        java.lang.String str14 = booking0.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking6 = new model.booking.Booking();
        int int7 = booking6.getStartTime();
        booking6.setEndTime((int) (short) 10);
        java.lang.String str10 = booking6.getEmail();
        booking6.setCost((double) (byte) 0);
        int int13 = booking6.getLotId();
        booking6.setEndTime((int) (short) 100);
        booking6.setId((-1));
        booking6.setCost((double) (short) 100);
        booking6.setLicensePlate("Success: Parking Space 100 has been disabled.");
        booking6.setId((int) (byte) 1);
        boolean boolean24 = clientServices0.bookParkingSpace(booking6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList26 = clientServices0.getAllUsersBookings("Give Id for parking Space is wrong");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials8);
        model.user.User user11 = new model.user.User(credentials8);
        model.user.Credentials credentials12 = user11.getCredentials();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials12);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials12);
        nonFacultyStaff14.setRole("Success: Parking Lot 32 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        java.lang.String str12 = credentials11.getLogin();
        model.user.Student student13 = new model.user.Student(credentials11);
        java.lang.String str14 = credentials11.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        boolean boolean12 = clientServices0.updateBooking((int) (byte) 0, (int) (byte) -1);
        model.booking.Booking booking14 = clientServices0.getBookingById(1);
        java.lang.String str17 = clientServices0.enableParkingSpaceById((int) (byte) 1, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Parking Space 97 is already enabled.");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getPassword();
        java.lang.String str7 = credentials5.toString();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials5);
        java.lang.String str9 = credentials5.toString();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials5, "Student", "Manager");
        facultyMember12.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str15 = facultyMember12.getFacultyId();
        facultyMember12.setFacultyName("Give Id for parking Space is wrong");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository1.updateUser((model.user.User) facultyMember12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList12 = clientServices0.getAllUsersBookings("Success: Parking Space 32 has been enabled.");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        model.user.Client client18 = new model.user.Client("Parking Lot 100 is already enabled.", "(O3fsOXXJ", "HGL)]pX%+");
        userRepository3.addUser((model.user.User) client18);
        repo.UserRepository userRepository20 = new repo.UserRepository();
        model.user.Credentials credentials24 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials24);
        facultyMember25.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str28 = facultyMember25.getFacultyId();
        userRepository20.addUser((model.user.User) facultyMember25);
        java.lang.String str30 = facultyMember25.getFacultyName();
        java.lang.String str31 = facultyMember25.getFacultyId();
        java.lang.String str32 = facultyMember25.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember25);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        boolean boolean8 = clientServices0.updateBooking(10, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllUsersBookings("%IlXqo&_Y");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        model.user.SuperManager superManager6 = model.user.SuperManager.getInstance();
        superManager6.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = userService0.registerUser((model.user.User) superManager6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost((double) 100.0f);
        java.util.Date date9 = booking0.getDate();
        booking0.setId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = booking0.getTotalCost();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        boolean boolean6 = superManagerServices0.isValidEmail("Qw$TanXAv");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.setFacultyId("hi!");
        facultyMember11.setFacultyName("hi!");
        java.lang.String str17 = facultyMember11.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = superManagerServices0.createAccount((model.user.User) facultyMember11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("%IlXqo&_Y", "Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "wMB&=eDYD", "Parking Space 1 is already disabled.");
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        boolean boolean13 = clientServices0.updateBooking((int) (byte) 100, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllUsersBookings("2g]O0QGM)");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        model.user.Client client10 = new model.user.Client(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client10", client7.equals(client10) ? client7.hashCode() == client10.hashCode() : true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "=B3fAbMGq", "Parking Lot -1 is already enabled.");
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository8 = userService0.userRepository;
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        java.lang.String str16 = credentials12.toString();
        model.user.User user17 = model.user.UserFactory.createAccount(credentials12);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials12, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client21 = new model.user.Client(credentials12);
        userRepository8.removeUser((model.user.User) client21);
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str27 = credentials26.getPassword();
        java.lang.String str28 = credentials26.getType();
        java.lang.String str29 = credentials26.toString();
        java.lang.String str30 = credentials26.getLogin();
        model.user.User user31 = model.user.UserFactory.createAccount(credentials26);
        java.lang.String str32 = credentials26.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff33 = new model.user.NonFacultyStaff(credentials26);
        model.user.User user34 = new model.user.User(credentials26);
        model.user.NonFacultyStaff nonFacultyStaff36 = new model.user.NonFacultyStaff(credentials26, "SuperManager");
        userRepository8.removeUser((model.user.User) nonFacultyStaff36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials12 and credentials26", credentials12.equals(credentials26) ? credentials12.hashCode() == credentials26.hashCode() : true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        java.lang.String str8 = booking2.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking2.getTotalCost();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials7);
        model.user.User user10 = new model.user.User(credentials7);
        model.user.Credentials credentials11 = user10.getCredentials();
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.getPassword();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = userService0.registerUser((model.user.User) visitor14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User("Parking Space 100 is already enabled.", "Parking Lot 1 is already enabled.", "=B3fAbMGq");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = superManagerServices0.createAccount(user12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        nonFacultyStaff11.setRole("");
        model.user.Credentials credentials14 = nonFacultyStaff11.getCredentials();
        nonFacultyStaff11.setRole("Qw$TanXAv");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) nonFacultyStaff11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = facultyMember10.getFacultyId();
        repo.RepositoryProvider repositoryProvider14 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository15 = repositoryProvider14.getBookingRepository();
        repo.UserRepository userRepository16 = repositoryProvider14.getUserRepository();
        boolean boolean17 = facultyMember10.equals((java.lang.Object) userRepository16);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials21, "Success: Parking Lot -1 has been disabled.");
        model.user.User user25 = model.user.UserFactory.createAccount(credentials21);
        model.user.Visitor visitor26 = new model.user.Visitor(credentials21);
        userRepository16.addUser((model.user.User) visitor26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials21", credentials3.equals(credentials21) ? credentials3.hashCode() == credentials21.hashCode() : true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("");
        boolean boolean10 = userService0.isStrongPassword("Parking Lot 97 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setCost((double) 100L);
        parkingSpace1.setBooking(booking5);
        int int16 = booking5.getLotId();
        java.util.Date date17 = booking5.getEndDateTime();
        int int18 = booking5.getEndTime();
        java.lang.String str19 = booking5.getEmail();
        int int20 = booking5.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = booking5.getTotalCost();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Student student13 = new model.user.Student(credentials11, "Parking Space 35 is already enabled.");
        java.lang.String str14 = student13.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        java.lang.String str12 = credentials8.toString();
        java.lang.String str13 = credentials8.getPassword();
        java.lang.String str14 = credentials8.toString();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials8, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getLogin();
        strategy.StudentParkingRate studentParkingRate10 = new strategy.StudentParkingRate();
        double double12 = studentParkingRate10.calculateRate((double) 1.0f);
        boolean boolean13 = credentials8.equals((java.lang.Object) 1.0f);
        java.lang.String str14 = credentials8.getType();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = userService0.registerUser((model.user.User) visitor15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        repo.UserRepository userRepository6 = userService0.userRepository;
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.getType();
        java.lang.String str13 = credentials10.toString();
        java.lang.String str14 = credentials10.getLogin();
        model.user.User user15 = model.user.UserFactory.createAccount(credentials10);
        java.lang.String str16 = credentials10.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials10);
        nonFacultyStaff17.setRole("Success: Parking Lot 100 has been disabled.");
        java.lang.String str20 = nonFacultyStaff17.getRole();
        nonFacultyStaff17.setRole("Parking Space 97 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        model.user.User user11 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials10 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        java.lang.String str16 = credentials14.getType();
        model.user.Student student17 = new model.user.Student(credentials14);
        boolean boolean18 = credentials10.equals((java.lang.Object) student17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials10 and credentials14", credentials10.equals(credentials14) ? credentials10.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.RepositoryProvider repositoryProvider6 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository7 = repositoryProvider6.getBookingRepository();
        repo.UserRepository userRepository8 = repositoryProvider6.getUserRepository();
        model.user.Credentials credentials12 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user13 = new model.user.User(credentials12);
        userRepository8.addUser(user13);
        user13.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser(user13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("Student");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.getType();
        java.lang.String str16 = credentials13.toString();
        java.lang.String str17 = credentials13.getLogin();
        model.user.User user18 = model.user.UserFactory.createAccount(credentials13);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials13, "]82UgsU=G");
        nonFacultyStaff20.setRole("l@=7Kn[?f");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff20);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        userRepository5.addUser((model.user.User) facultyMember14);
        java.util.List<model.user.User> userList16 = userRepository5.getUsers();
        services.UserService userService17 = new services.UserService();
        repo.UserRepository userRepository18 = userService17.userRepository;
        repo.UserRepository userRepository19 = userService17.userRepository;
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        java.lang.String str25 = credentials23.toString();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials23);
        java.lang.String str27 = credentials23.toString();
        java.lang.String str28 = credentials23.getPassword();
        java.lang.String str29 = credentials23.getType();
        model.user.Student student30 = new model.user.Student(credentials23);
        model.user.Credentials credentials31 = student30.getCredentials();
        java.lang.String str32 = student30.getStudentId();
        userRepository19.removeUser((model.user.User) student30);
        userRepository5.removeUser((model.user.User) student30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials9 and credentials23", credentials9.equals(credentials23) ? credentials9.hashCode() == credentials23.hashCode() : true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        int int13 = booking11.getId();
        int int14 = booking11.getTotalHours();
        booking11.setId((int) 'a');
        boolean boolean17 = clientServices0.bookParkingSpace(booking11);
        java.util.List<model.booking.Booking> bookingList18 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking(10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3, "SuperManager");
        nonFacultyStaff13.setRole("xQ)b!n)sD");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff13", nonFacultyStaff10.equals(nonFacultyStaff13) ? nonFacultyStaff10.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isValidEmail("NonFacultyStaff");
        repo.RepositoryProvider repositoryProvider11 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository12 = repositoryProvider11.getBookingRepository();
        repo.UserRepository userRepository13 = repositoryProvider11.getUserRepository();
        repo.BookingRepository bookingRepository14 = repositoryProvider11.getBookingRepository();
        repo.UserRepository userRepository15 = repositoryProvider11.getUserRepository();
        repo.ParkingRepository parkingRepository16 = repositoryProvider11.getParkingRepository();
        repo.UserRepository userRepository17 = repositoryProvider11.getUserRepository();
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials21);
        java.lang.String str24 = facultyMember23.getFacultyName();
        facultyMember23.setFacultyId("Parking Space -1 is already enabled.");
        userRepository17.removeUser((model.user.User) facultyMember23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = userService0.registerUser((model.user.User) facultyMember23);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getSpaceId();
        int int8 = booking6.getStartTime();
        java.util.Date date9 = booking6.getDate();
        int int10 = booking6.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking6.getTotalCost();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str11 = credentials7.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.toString();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials6);
        model.user.Student student11 = new model.user.Student(credentials6, "users.json");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials6);
        facultyMember12.setFacultyId("Visitor");
        userRepository2.removeUser((model.user.User) facultyMember12);
        model.user.Credentials credentials19 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Visitor visitor20 = new model.user.Visitor(credentials19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) visitor20);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials13, "Student", "Manager");
        facultyMember20.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember20.setFacultyName("Parking Space 35 is already disabled.");
        facultyMember20.setFacultyName("Parking Lot 1 is already enabled.");
        java.lang.String str27 = facultyMember20.getFacultyName();
        facultyMember20.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) facultyMember20);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        model.user.User user18 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "NonFacultyStaff", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        userRepository3.addUser(user18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        java.lang.String str25 = credentials23.toString();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials23);
        visitor26.validateAccount();
        boolean boolean28 = visitor26.getValidationStatus();
        boolean boolean29 = visitor26.getValidationStatus();
        model.user.Credentials credentials30 = visitor26.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) visitor26);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        student13.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student13", student11.equals(student13) ? student11.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) (short) 100, (int) (byte) 0);
        boolean boolean6 = clientServices0.updateBooking((int) (short) -1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("cjn@voHRz");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str11 = credentials7.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Space -1 has been enabled.");
        model.user.Credentials credentials16 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Student student18 = new model.user.Student(credentials16, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) student18);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        java.lang.String str16 = credentials14.toString();
        model.user.Visitor visitor17 = new model.user.Visitor(credentials14);
        java.lang.String str18 = credentials14.toString();
        java.lang.String str19 = credentials14.getPassword();
        java.lang.String str20 = credentials14.toString();
        model.user.Client client21 = new model.user.Client(credentials14);
        userRepository3.addUser((model.user.User) client21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials14", credentials7.equals(credentials14) ? credentials7.hashCode() == credentials14.hashCode() : true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student13", student11.equals(student13) ? student11.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("?qqRirU!a");
        boolean boolean8 = superManagerServices0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.Student student14 = new model.user.Student(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount((model.user.User) student14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("T#NJctMi&");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        services.UserService userService0 = new services.UserService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user2 = userService0.getUserByEmail("Give Id for parking Space is wrong");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("taSI0*=tM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager12 = new model.user.Manager(credentials11);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials11, "Parking Space -1 is already enabled.", "X?EhgrKDV");
        model.user.Student student17 = new model.user.Student(credentials11, "cZ=IAx!!l");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) student17);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff10", nonFacultyStaff9.equals(nonFacultyStaff10) ? nonFacultyStaff9.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setEmail("(O3fsOXXJ");
        booking0.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        booking0.setCost(8000.0d);
        booking0.setStatus("Parking Space -1 is already enabled.");
        int int18 = booking0.getStartTime();
        int int19 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = booking0.getTotalCost();
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        model.user.Credentials credentials5 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str6 = credentials5.getLogin();
        strategy.StudentParkingRate studentParkingRate7 = new strategy.StudentParkingRate();
        double double9 = studentParkingRate7.calculateRate((double) 1.0f);
        boolean boolean10 = credentials5.equals((java.lang.Object) 1.0f);
        model.user.User user11 = new model.user.User(credentials5);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials5);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository1.updateUser((model.user.User) nonFacultyStaff13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student7", student6.equals(student7) ? student6.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials7);
        model.user.User user13 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff12", nonFacultyStaff10.equals(nonFacultyStaff12) ? nonFacultyStaff10.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setId(0);
        booking6.setEmail("Student");
        boolean boolean11 = clientServices0.updateCompleteBooking(booking6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllUsersBookings("Parking Space 97 is already enabled.");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        java.lang.String str11 = credentials3.getLogin();
        java.lang.String str12 = credentials3.getPassword();
        services.UserService userService13 = new services.UserService();
        boolean boolean15 = userService13.isStrongPassword("There is no Such Parking Lot");
        boolean boolean17 = userService13.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository18 = userService13.userRepository;
        boolean boolean20 = userService13.isStrongPassword("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository21 = userService13.userRepository;
        model.user.Credentials credentials25 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str26 = credentials25.getPassword();
        java.lang.String str27 = credentials25.toString();
        model.user.Visitor visitor28 = new model.user.Visitor(credentials25);
        java.lang.String str29 = credentials25.toString();
        model.user.User user30 = model.user.UserFactory.createAccount(credentials25);
        model.user.FacultyMember facultyMember33 = new model.user.FacultyMember(credentials25, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client34 = new model.user.Client(credentials25);
        userRepository21.removeUser((model.user.User) client34);
        boolean boolean36 = credentials3.equals((java.lang.Object) client34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials25", credentials3.equals(credentials25) ? credentials3.hashCode() == credentials25.hashCode() : true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student11 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        services.SuperManagerServices superManagerServices14 = services.SuperManagerServices.getInstance();
        java.lang.String str15 = superManagerServices14.generateRandomEmail();
        boolean boolean17 = superManagerServices14.isValidEmail("FacultyMember");
        boolean boolean19 = superManagerServices14.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean21 = superManagerServices14.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str22 = superManagerServices14.generateStrongPassword();
        boolean boolean23 = student13.equals((java.lang.Object) superManagerServices14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student13", student11.equals(student13) ? student11.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        double double10 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking0.getTotalCost();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.User user12 = new model.user.User(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7);
        model.user.Manager manager14 = new model.user.Manager(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff13", nonFacultyStaff6.equals(nonFacultyStaff13) ? nonFacultyStaff6.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        boolean boolean10 = userService0.isValidEmail("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("", "=K*eY67RK");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.loginUser("Success: Parking Space -1 has been disabled.", "Success: Parking Space 100 has been enabled.");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user5 = new model.user.User(credentials4);
        userRepository0.addUser(user5);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials10, "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) facultyMember14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setStatus(true);
        boolean boolean4 = parkingSpace1.getStatus();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setCost((double) 100L);
        parkingSpace1.setBooking(booking5);
        int int16 = booking5.getLotId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = booking5.getTotalCost();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Client client9 = new model.user.Client(credentials7);
        model.user.User user10 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client9", client8.equals(client9) ? client8.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Visitor visitor5 = new model.user.Visitor(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager4 and manager6", manager4.equals(manager6) ? manager4.hashCode() == manager6.hashCode() : true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        userRepository4.addUser((model.user.User) nonFacultyStaff11);
        java.util.List<model.user.User> userList14 = userRepository4.getUsers();
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        java.lang.String str20 = credentials18.toString();
        model.user.Visitor visitor21 = new model.user.Visitor(credentials18);
        model.user.Student student23 = new model.user.Student(credentials18, "users.json");
        java.lang.String str24 = student23.getStudentId();
        student23.setStudentId("HcpxBjAE]");
        student23.setStudentId("Parking Space 35 is already disabled.");
        userRepository4.removeUser((model.user.User) student23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials8 and credentials18", credentials8.equals(credentials18) ? credentials8.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.loginUser("Parking Lot 97 is already enabled.", "DYp5a&9eU");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Av+-nN6Nu");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace(100);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        parkingSpace1.setBooking(booking2);
        java.lang.String str7 = booking2.getEmail();
        booking2.setStatus("Parking Space 1 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking2.getTotalCost();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isValidEmail("1bR(76zCD");
        boolean boolean9 = userService0.isStrongPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 97 has been enabled.");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("cZ=IAx!!l");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        boolean boolean5 = clientServices0.updateBooking(0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyName("Success: Parking Space -1 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client9", client7.equals(client9) ? client7.hashCode() == client9.hashCode() : true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials12, "hi!");
        model.user.Credentials credentials16 = nonFacultyStaff15.getCredentials();
        model.user.Client client17 = new model.user.Client(credentials16);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials16);
        model.user.User user19 = new model.user.User(credentials16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount(user19);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials13, "Student", "Manager");
        facultyMember20.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember20.validateAccount();
        model.user.Credentials credentials24 = facultyMember20.getCredentials();
        java.lang.String str25 = credentials24.getType();
        model.user.Student student27 = new model.user.Student(credentials24, "X?EhgrKDV");
        model.user.Client client28 = new model.user.Client(credentials24);
        model.user.Manager manager29 = new model.user.Manager(credentials24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) manager29);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setCost((double) 0.0f);
        java.lang.String str8 = booking2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking2.getTotalCost();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        services.ClientServices clientServices13 = services.ClientServices.getInstance();
        model.booking.Booking booking15 = clientServices13.getBookingById((int) (short) 1);
        boolean boolean16 = student9.equals((java.lang.Object) clientServices13);
        model.booking.Booking booking17 = new model.booking.Booking();
        int int18 = booking17.getStartTime();
        booking17.setEndTime((int) (short) 10);
        java.lang.String str21 = booking17.getEmail();
        booking17.setCost((double) (byte) 0);
        int int24 = booking17.getLotId();
        booking17.setEmail("Manager");
        java.lang.String str27 = booking17.getLicensePlate();
        booking17.setLicensePlate("(O3fsOXXJ");
        java.lang.String str30 = booking17.toString();
        java.util.Date date31 = booking17.getEndDateTime();
        booking17.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.util.Date date34 = booking17.getDate();
        boolean boolean35 = clientServices13.bookParkingSpace(booking17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double36 = booking17.getTotalCost();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "hi!");
        model.user.Credentials credentials11 = nonFacultyStaff10.getCredentials();
        model.user.Credentials credentials12 = nonFacultyStaff10.getCredentials();
        userRepository3.removeUser((model.user.User) nonFacultyStaff10);
        java.util.List<model.user.User> userList14 = userRepository3.getUsers();
        java.util.List<model.user.User> userList15 = userRepository3.getUsers();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials19, "hi!");
        nonFacultyStaff22.setRole("");
        model.user.Credentials credentials25 = nonFacultyStaff22.getCredentials();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials25);
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials25);
        model.user.Student student28 = new model.user.Student(credentials25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) student28);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = facultyMember9.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3);
        java.lang.String str8 = facultyMember7.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember7", facultyMember5.equals(facultyMember7) ? facultyMember5.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7, "Credentials{login='hi!', password='hi!', type='hi!'}", "Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str11 = facultyMember10.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateStrongPassword();
        boolean boolean5 = superManagerServices0.isValidEmail("Success: Parking Space 1 has been disabled.");
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        java.lang.String str13 = credentials9.getPassword();
        java.lang.String str14 = credentials9.getPassword();
        model.user.Manager manager15 = new model.user.Manager(credentials9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) manager15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        repo.UserRepository userRepository12 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.loginUser("-hW9I6iG0", "Parking Space 35 is already disabled.");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot15 = clientServices0.getParkingLotByAddress("4]z?3Qs%M");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList17 = clientServices0.getAllUsersBookings("Parking Space 1 is already disabled.");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("taSI0*=tM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("(j1+k0)lO");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("Student");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.User user8 = new model.user.User(credentials3);
        repo.RepositoryProvider repositoryProvider9 = new repo.RepositoryProvider();
        repo.UserRepository userRepository10 = repositoryProvider9.getUserRepository();
        repo.BookingRepository bookingRepository11 = repositoryProvider9.getBookingRepository();
        boolean boolean12 = credentials3.equals((java.lang.Object) bookingRepository11);
        model.user.User user13 = new model.user.User(credentials3);
        model.user.Manager manager14 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user8 and user13", user8.equals(user13) ? user8.hashCode() == user13.hashCode() : true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        int int5 = booking0.getSpaceId();
        booking0.setEmail("");
        double double8 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository9 = userService0.userRepository;
        java.util.List<model.user.User> userList10 = userRepository9.getUsers();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        java.lang.String str16 = facultyMember15.getFacultyId();
        java.lang.String str17 = facultyMember15.getFacultyId();
        java.lang.String str18 = facultyMember15.getFacultyId();
        java.lang.String str19 = facultyMember15.getFacultyId();
        boolean boolean20 = facultyMember15.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) facultyMember15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials7, "Parking Space 100 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) (short) 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = clientServices0.cancenlBooking((int) 'a');
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        facultyMember13.setFacultyName("Qw$TanXAv");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        model.user.Client client16 = new model.user.Client(credentials14);
        model.user.User user17 = model.user.UserFactory.createAccount(credentials14);
        java.lang.String str18 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials14, "X?EhgrKDV");
        java.lang.String str21 = credentials14.getType();
        model.user.Student student23 = new model.user.Student(credentials14, "");
        student23.setStudentId("");
        java.lang.String str26 = student23.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository10.updateUser((model.user.User) student23);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        booking0.setId((-1));
        booking0.setCost((double) (short) 100);
        int int14 = booking0.getLotId();
        int int15 = booking0.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = booking0.getTotalCost();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = userService0.registerUser((model.user.User) facultyMember9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = facultyMember13.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember13", facultyMember12.equals(facultyMember13) ? facultyMember12.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client9 and client11", client9.equals(client11) ? client9.hashCode() == client11.hashCode() : true);
    }
}

