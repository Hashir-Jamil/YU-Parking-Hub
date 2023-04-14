import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("cgJd5wr]v");
        model.user.Client client11 = new model.user.Client("Success: Parking Lot -1 has been disabled.", "", "lWu#FFEES");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = userService0.registerUser((model.user.User) client11);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllUsersBookings("vU3-I3w?4");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "OZs%xojGf");
        boolean boolean16 = facultyMember14.equals((java.lang.Object) 600000.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember14", facultyMember9.equals(facultyMember14) ? facultyMember9.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials16);
        model.user.User user19 = new model.user.User(credentials16);
        model.user.Credentials credentials20 = user19.getCredentials();
        model.user.Student student22 = new model.user.Student(credentials20, "There is no Such Parking Lot");
        java.lang.String str23 = student22.getStudentId();
        java.lang.String str24 = student22.getStudentId();
        java.lang.String str25 = student22.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository12.updateUser((model.user.User) student22);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.lang.String str14 = clientServices0.getParkingSpaceById(0, 1);
        java.lang.String str17 = clientServices0.getParkingSpaceById(99, (-87));
        model.booking.Booking booking18 = new model.booking.Booking();
        booking18.setId(0);
        booking18.setEmail("Student");
        java.util.Date date23 = booking18.getStartDateTime();
        booking18.setId((int) (byte) 100);
        int int26 = booking18.getSpaceId();
        booking18.setEmail("HcpxBjAE]");
        boolean boolean29 = clientServices0.updateCompleteBooking(booking18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList31 = clientServices0.getAllUsersBookings("Success: Parking Lot 0 has been disabled.");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("$yn@vQ[]e");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        facultyMember6.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        java.util.List<model.user.User> userList9 = userRepository2.getUsers();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        java.lang.String str18 = nonFacultyStaff16.getRole();
        java.lang.String str19 = nonFacultyStaff16.getRole();
        nonFacultyStaff16.setRole("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.', password='AAwYnzN!e', type='Rg2)djJx]'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student8 = new model.user.Student(credentials3);
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEmail("Manager");
        booking9.setStartTime((int) (byte) 0);
        java.lang.String str21 = booking9.getStatus();
        boolean boolean22 = credentials3.equals((java.lang.Object) booking9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("FacultyMember");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 35 is already disabled.");
        services.ClientServices clientServices9 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot11 = clientServices9.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList12 = clientServices9.getAllBookings();
        java.util.List<model.booking.Booking> bookingList13 = clientServices9.getAllBookings();
        java.lang.String str16 = clientServices9.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str19 = clientServices9.enableParkingSpaceById((-1), (int) 'a');
        boolean boolean22 = clientServices9.updateBooking((int) (byte) 100, 97);
        model.booking.Booking booking23 = new model.booking.Booking();
        int int24 = booking23.getStartTime();
        booking23.setEndTime((int) (short) 10);
        java.lang.String str27 = booking23.getEmail();
        booking23.setCost((double) (byte) 0);
        int int30 = booking23.getLotId();
        booking23.setEndTime((int) (short) 100);
        booking23.setEmail("(O3fsOXXJ");
        booking23.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        booking23.setStartTime((int) (short) -1);
        int int39 = booking23.getId();
        boolean boolean40 = clientServices9.bookParkingSpace(booking23);
        double double41 = booking23.getCost();
        boolean boolean42 = student8.equals((java.lang.Object) booking23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student8", student6.equals(student8) ? student6.hashCode() == student8.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        int int4 = booking0.getEndTime();
        java.lang.String str5 = booking0.getEmail();
        int int6 = booking0.getStartTime();
        double double7 = booking0.getCost();
        booking0.setId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList5 = userRepository4.getUsers();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.getType();
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.User user13 = new model.user.User(credentials9);
        userRepository4.removeUser(user13);
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getLogin();
        strategy.StudentParkingRate studentParkingRate20 = new strategy.StudentParkingRate();
        double double22 = studentParkingRate20.calculateRate((double) 1.0f);
        boolean boolean23 = credentials18.equals((java.lang.Object) 1.0f);
        model.user.User user24 = new model.user.User(credentials18);
        model.user.Student student25 = new model.user.Student(credentials18);
        student25.setStudentId("Parking Lot 100 is already enabled.");
        java.lang.String str28 = student25.getStudentId();
        student25.setStudentId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) student25);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.User user10 = model.user.UserFactory.createAccount(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3, "Parking Lot 97 is already disabled.");
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        model.user.Student student24 = new model.user.Student(credentials19, "users.json");
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials19);
        facultyMember25.setFacultyName("Parking Lot -1 is already enabled.");
        boolean boolean28 = credentials3.equals((java.lang.Object) "Parking Lot -1 is already enabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember10.validateAccount();
        model.user.Credentials credentials14 = facultyMember10.getCredentials();
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials14);
        model.user.Student student18 = new model.user.Student(credentials14, "Failure: Parking Space 52 has active bookings. Parking Space has not been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor16", visitor6.equals(visitor16) ? visitor6.hashCode() == visitor16.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        model.user.Client client13 = new model.user.Client("Success: Parking Space 97 has been disabled.", "Success: Parking Space 100 has been disabled.", "Parking Space 35 is already enabled.");
        client13.validateAccount();
        model.user.Credentials credentials15 = client13.getCredentials();
        model.user.Manager manager16 = new model.user.Manager(credentials15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = superManagerServices0.createAccount((model.user.User) manager16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.toString();
        model.user.Manager manager19 = new model.user.Manager(credentials17);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) nonFacultyStaff20);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.lang.String str14 = clientServices0.getParkingSpaceById(0, 1);
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList17 = clientServices0.getAllUsersBookings("vUVnh*YQ(");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        java.lang.String str12 = credentials7.getType();
        model.user.Manager manager13 = new model.user.Manager(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager9 and manager13", manager9.equals(manager13) ? manager9.hashCode() == manager13.hashCode() : true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("L2C@FUe6G");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        services.UserService userService0 = new services.UserService();
        repo.UserRepository userRepository1 = userService0.userRepository;
        repo.UserRepository userRepository2 = userService0.userRepository;
        java.util.List<model.user.User> userList3 = userRepository2.getUsers();
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str8 = credentials7.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7, "Parking Space 32 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7);
        userRepository2.addUser((model.user.User) facultyMember14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Lot 35 is already enabled.");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        java.lang.String str15 = credentials10.getPassword();
        java.lang.String str16 = credentials10.getType();
        model.user.Student student17 = new model.user.Student(credentials10);
        model.user.Visitor visitor18 = new model.user.Visitor(credentials10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) visitor18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        repo.UserRepository userRepository7 = userService0.userRepository;
        repo.UserRepository userRepository8 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("*a[AnW&Y-");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        model.user.Student student9 = new model.user.Student(credentials3, "Student");
        model.user.Client client10 = new model.user.Client(credentials3);
        model.user.Manager manager11 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client10", client7.equals(client10) ? client7.hashCode() == client10.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "=B3fAbMGq", "Parking Lot -1 is already enabled.");
        services.ManagerServices managerServices8 = services.ManagerServices.getInstance();
        managerServices8.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList10 = managerServices8.getAllParkingLots();
        managerServices8.loadLots();
        repo.ParkingRepository parkingRepository12 = new repo.ParkingRepository();
        model.parking.ParkingLot parkingLot15 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean16 = parkingLot15.getStatus();
        model.parking.ParkingLot parkingLot19 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean20 = parkingLot19.getStatus();
        boolean boolean21 = parkingLot19.getStatus();
        model.parking.ParkingLot parkingLot24 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean25 = parkingLot24.getStatus();
        boolean boolean26 = parkingLot24.getStatus();
        model.parking.ParkingLot parkingLot29 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean30 = parkingLot29.getStatus();
        boolean boolean31 = parkingLot29.getStatus();
        parkingLot29.setLotID((int) (byte) 100);
        model.parking.ParkingLot[] parkingLotArray34 = new model.parking.ParkingLot[] { parkingLot15, parkingLot19, parkingLot24, parkingLot29 };
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList35 = new java.util.ArrayList<model.parking.ParkingLot>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.parking.ParkingLot>) parkingLotList35, parkingLotArray34);
        parkingRepository12.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList35);
        managerServices8.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList35);
        model.parking.ParkingLot parkingLot41 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.util.List<model.parking.ParkingSpace> parkingSpaceList42 = parkingLot41.getParkingSpaces();
        int int43 = parkingLot41.getLotID();
        managerServices8.addParkingLot(parkingLot41);
        services.ManagerServices managerServices45 = services.ManagerServices.getInstance();
        managerServices45.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList47 = managerServices45.getAllParkingLots();
        managerServices45.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList49 = managerServices45.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList50 = managerServices45.getAllParkingLots();
        managerServices8.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList50);
        boolean boolean52 = credentials3.equals((java.lang.Object) parkingLotList50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember7", facultyMember4.equals(facultyMember7) ? facultyMember4.hashCode() == facultyMember7.hashCode() : true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        boolean boolean19 = clientServices13.updateBooking((int) '#', 52);
        boolean boolean22 = clientServices13.updateBooking((int) (byte) 100, (int) (byte) 1);
        boolean boolean25 = clientServices13.updateBooking(52, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = clientServices13.cancenlBooking((-87));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user11 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("&*6eW=@lx");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost(")r1bQiJUq");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository3 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.getPassword();
        model.user.Student student14 = new model.user.Student(credentials9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) student14);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.getType();
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Credentials credentials11 = student10.getCredentials();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials11);
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "9z6wsHuxQ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor12", visitor6.equals(visitor12) ? visitor6.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.Client client11 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        java.util.Date date17 = booking5.getStartDateTime();
        int int18 = booking5.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = booking5.getTotalCost();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        repo.UserRepository userRepository6 = userService0.userRepository;
        boolean boolean8 = userService0.isValidEmail("Success: Parking Lot -1 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("Parking Space 1 is already enabled.", "success");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList7 = clientServices0.getAllLocations();
        java.lang.String str10 = clientServices0.getParkingSpaceById((int) (short) 100, 101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList12 = clientServices0.getAllUsersBookings("Success: Parking Lot 97 has been enabled.");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking9 = clientServices0.getBookingById((int) (byte) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById((int) (short) 1);
        java.lang.String str14 = clientServices0.getParkingSpaceById(32, (int) (short) 1);
        java.lang.String str17 = clientServices0.getParkingSpaceById((int) (short) 10, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllUsersBookings("vIEt(w$k&");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isValidEmail("Success: Parking Lot -1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        boolean boolean11 = userService0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = userService0.isStrongPassword("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        repo.UserRepository userRepository14 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.getUserByEmail("WsR_[hRm]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Client client7 = new model.user.Client(credentials3);
        java.lang.String str8 = credentials3.getLogin();
        services.SuperManagerServices superManagerServices9 = services.SuperManagerServices.getInstance();
        boolean boolean11 = superManagerServices9.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str12 = superManagerServices9.generateRandomEmail();
        java.lang.String str13 = superManagerServices9.generateStrongPassword();
        boolean boolean15 = superManagerServices9.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean17 = superManagerServices9.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean19 = superManagerServices9.isValidEmail("Parking Lot 1 is already enabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) "Parking Lot 1 is already enabled.");
        model.user.Client client21 = new model.user.Client(credentials3);
        java.lang.String str22 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client7 and client21", client7.equals(client21) ? client7.hashCode() == client21.hashCode() : true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        java.lang.String str21 = clientServices0.enableParkingSpaceById(10, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList23 = clientServices0.getAllUsersBookings("");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        java.lang.String str5 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}", "Parking Space 52 is already enabled.");
        model.user.Student student9 = new model.user.Student(credentials3);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList13 = clientServices10.getAllBookings();
        java.util.List<model.booking.Booking> bookingList14 = clientServices10.getAllBookings();
        java.lang.String str17 = clientServices10.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str20 = clientServices10.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList21 = clientServices10.getAllLocations();
        java.lang.String str24 = clientServices10.getParkingSpaceById(0, 1);
        java.lang.String str27 = clientServices10.getParkingSpaceById(99, (-87));
        model.booking.Booking booking28 = new model.booking.Booking();
        booking28.setId(0);
        booking28.setEmail("Student");
        java.util.Date date33 = booking28.getStartDateTime();
        booking28.setId((int) (byte) 100);
        int int36 = booking28.getSpaceId();
        booking28.setEmail("HcpxBjAE]");
        boolean boolean39 = clientServices10.updateCompleteBooking(booking28);
        boolean boolean40 = student9.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student9", student4.equals(student9) ? student4.hashCode() == student9.hashCode() : true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        boolean boolean6 = superManagerServices0.isStrongPassword("cjn@voHRz");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials10, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str15 = facultyMember14.getFacultyName();
        facultyMember14.validateAccount();
        facultyMember14.setFacultyName("Success: Parking Lot -1 has been disabled.");
        java.lang.String str19 = facultyMember14.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount((model.user.User) facultyMember14);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        java.lang.String str12 = clientServices0.disableParkingSpaceById(1, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllUsersBookings(")r1bQiJUq");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        boolean boolean19 = clientServices13.updateBooking(10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList21 = clientServices13.getAllUsersBookings("A%v5&YzsA");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList3 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList6 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList7 = clientServices0.getAllLocations();
        java.lang.String str10 = clientServices0.disableParkingSpaceById((int) (byte) 0, 1);
        java.lang.String str13 = clientServices0.getParkingSpaceById((int) (short) 0, 35);
        services.ClientServices clientServices14 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot16 = clientServices14.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList17 = clientServices14.getAllBookings();
        java.lang.String str20 = clientServices14.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str23 = clientServices14.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking25 = clientServices14.getBookingById(100);
        java.util.List<java.lang.String> strList26 = clientServices14.getAllLocations();
        model.booking.Booking booking27 = new model.booking.Booking();
        int int28 = booking27.getStartTime();
        int int29 = booking27.getId();
        int int30 = booking27.getTotalHours();
        java.util.Date date31 = booking27.getEndDateTime();
        int int32 = booking27.getTotalHours();
        boolean boolean33 = clientServices14.updateCompleteBooking(booking27);
        java.util.Date date34 = booking27.getDate();
        booking27.setCost(7500.0d);
        int int37 = booking27.getLotId();
        boolean boolean38 = clientServices0.updateCompleteBooking(booking27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList40 = clientServices0.getAllUsersBookings("1RQ?pvlDC");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "X?EhgrKDV");
        java.lang.String str9 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7, "Success: Parking Lot 10 has been disabled.");
        student12.setStudentId("pUdP465**");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student9 and student12", student9.equals(student12) ? student9.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("R14et$0r@");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("#x]HUM-X4");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("n69?7)[Al");
        repo.RepositoryProvider repositoryProvider8 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository9 = repositoryProvider8.getBookingRepository();
        repo.UserRepository userRepository10 = repositoryProvider8.getUserRepository();
        model.user.Credentials credentials14 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user15 = new model.user.User(credentials14);
        userRepository10.addUser(user15);
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.toString();
        model.user.Visitor visitor23 = new model.user.Visitor(credentials20);
        model.user.Client client24 = new model.user.Client(credentials20);
        model.user.Student student26 = new model.user.Student(credentials20, "Student");
        userRepository10.addUser((model.user.User) student26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = userService0.registerUser((model.user.User) student26);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("G4X2M+Ju@");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("Parking Space 35 is already disabled.");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials11);
        model.user.User user14 = new model.user.User(credentials11);
        model.user.Credentials credentials15 = user14.getCredentials();
        java.lang.String str16 = credentials15.getPassword();
        model.user.Student student17 = new model.user.Student(credentials15);
        java.lang.String str18 = student17.getStudentId();
        student17.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        services.ClientServices clientServices21 = services.ClientServices.getInstance();
        model.booking.Booking booking23 = clientServices21.getBookingById((int) (short) 1);
        boolean boolean24 = student17.equals((java.lang.Object) clientServices21);
        java.lang.String str25 = student17.getStudentId();
        java.lang.String str26 = student17.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) student17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "=K*eY67RK");
        model.user.Student student6 = new model.user.Student(credentials3);
        boolean boolean7 = student6.getValidationStatus();
        model.booking.Booking booking8 = new model.booking.Booking();
        int int9 = booking8.getStartTime();
        booking8.setEndTime((int) (short) 10);
        java.lang.String str12 = booking8.getEmail();
        booking8.setCost((double) (byte) 0);
        int int15 = booking8.getLotId();
        booking8.setEmail("Manager");
        java.lang.String str18 = booking8.getLicensePlate();
        java.lang.String str19 = booking8.toString();
        java.util.Date date20 = booking8.getEndDateTime();
        double double21 = booking8.getCost();
        java.util.Date date22 = booking8.getDate();
        boolean boolean23 = student6.equals((java.lang.Object) booking8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = booking8.getTotalCost();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials11);
        model.booking.Booking booking17 = new model.booking.Booking();
        int int18 = booking17.getStartTime();
        booking17.setEndTime((int) (short) 10);
        java.lang.String str21 = booking17.getEmail();
        booking17.setCost((double) (byte) 0);
        int int24 = booking17.getLotId();
        booking17.setEndTime((int) (short) 100);
        java.lang.String str27 = booking17.getEmail();
        booking17.setLicensePlate("Give Id for parking Space is wrong");
        boolean boolean30 = credentials11.equals((java.lang.Object) booking17);
        model.user.Student student31 = new model.user.Student(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = userService0.registerUser((model.user.User) student31);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isStrongPassword("%IlXqo&_Y");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student', password='NonFacultyStaff', type='Student'}", "WX+ifyUaq");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        java.lang.String str4 = parkingSpace1.disableParkingSpace();
        java.lang.String str5 = parkingSpace1.enableParkingSpace();
        boolean boolean6 = parkingSpace1.getStatus();
        parkingSpace1.setStatus(false);
        parkingSpace1.setStatus(true);
        model.booking.Booking booking11 = new model.booking.Booking();
        int int12 = booking11.getStartTime();
        booking11.setEndTime((int) (short) 10);
        java.lang.String str15 = booking11.getEmail();
        booking11.setCost((double) (byte) 0);
        int int18 = booking11.getLotId();
        booking11.setEndTime((int) (short) 100);
        java.lang.String str21 = booking11.getEmail();
        java.util.Date date22 = booking11.getStartDateTime();
        java.lang.String str23 = booking11.getLicensePlate();
        int int24 = booking11.getTotalHours();
        parkingSpace1.setBooking(booking11);
        model.booking.Booking booking26 = new model.booking.Booking();
        int int27 = booking26.getStartTime();
        booking26.setEndTime((int) (short) 10);
        java.lang.String str30 = booking26.getEmail();
        booking26.setCost((double) (byte) 0);
        int int33 = booking26.getLotId();
        booking26.setEmail("Manager");
        java.lang.String str36 = booking26.getLicensePlate();
        booking26.setLicensePlate("(O3fsOXXJ");
        java.lang.String str39 = booking26.toString();
        java.util.Date date40 = booking26.getEndDateTime();
        booking26.setEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.util.Date date43 = booking26.getDate();
        java.lang.String str44 = booking26.getEmail();
        parkingSpace1.setBooking(booking26);
        int int46 = booking26.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double47 = booking26.getTotalCost();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Success: Parking Lot 97 has been disabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Parking Space 1 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        java.lang.String str15 = credentials10.getPassword();
        java.lang.String str16 = credentials10.getType();
        model.user.Student student17 = new model.user.Student(credentials10);
        java.lang.String str18 = student17.getStudentId();
        student17.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) student17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository9 = userService0.userRepository;
        model.user.Client client13 = new model.user.Client("NonFacultyStaff", "Success: Parking Space 100 has been disabled.", "SuperManager");
        userRepository9.removeUser((model.user.User) client13);
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        java.lang.String str20 = credentials18.toString();
        model.user.Visitor visitor21 = new model.user.Visitor(credentials18);
        java.lang.String str22 = credentials18.toString();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials18, "Student", "Manager");
        facultyMember25.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember25.setFacultyName("Parking Space 35 is already disabled.");
        facultyMember25.setFacultyName("Parking Lot 1 is already enabled.");
        java.lang.String str32 = facultyMember25.getFacultyName();
        facultyMember25.setFacultyId("Success: Parking Lot 32 has been enabled.");
        facultyMember25.setFacultyId("Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) facultyMember25);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        java.util.List<model.user.User> userList13 = userRepository12.getUsers();
        model.user.Credentials credentials17 = new model.user.Credentials("", "Success: Parking Space 100 has been disabled.", "");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17, "bEFVFN!4F", "iqmrymciB");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository12.updateUser((model.user.User) facultyMember20);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isValidEmail("HcpxBjAE]");
        boolean boolean14 = userService0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user17 = userService0.loginUser("Success: Parking Space 97 has been enabled.", "Success: Parking Space 1 has been disabled.");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        boolean boolean9 = userService0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository10 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("yCFe[eRt(", "iim*=oKjy");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        boolean boolean11 = userService0.isStrongPassword("HGL)]pX%+");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("users.json");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) (short) 1);
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        java.lang.String str6 = booking2.getEmail();
        booking2.setCost((double) (byte) 0);
        int int9 = booking2.getLotId();
        booking2.setEndTime((int) (short) 100);
        java.lang.String str12 = booking2.toString();
        int int13 = booking2.getId();
        booking2.setEndTime((int) (short) 10);
        java.util.Date date16 = booking2.getDate();
        int int17 = booking2.getId();
        booking2.setStartTime((int) (short) 100);
        java.util.Date date20 = booking2.getEndDateTime();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking22 = parkingSpace1.getBooking();
        java.lang.String str23 = booking22.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = booking22.getTotalCost();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("paJF3HN(W");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.validateAccount();
        model.user.Credentials credentials14 = facultyMember11.getCredentials();
        java.lang.String str15 = facultyMember11.getFacultyId();
        userRepository6.addUser((model.user.User) facultyMember11);
        model.user.Credentials credentials20 = new model.user.Credentials("Parking Lot 32 is already enabled.", "Success: Parking Space 0 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str21 = credentials20.getPassword();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository6.updateUser((model.user.User) facultyMember22);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        java.lang.String str11 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("JoNIi]ebC");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("6!yglfcy=", "Y@mMCI7!u");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot6 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking8 = clientServices0.getBookingById((-1));
        java.util.List<java.lang.String> strList9 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = clientServices0.cancenlBooking(35);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("#x]HUM-X4", "?WmF)ske8");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("xQ)b!n)sD");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "(j1+k0)lO");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff7", nonFacultyStaff6.equals(nonFacultyStaff7) ? nonFacultyStaff6.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        java.lang.String str10 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        nonFacultyStaff11.setRole("Credentials{login='\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null', password='Success: Parking Space 97 has been disabled.', type='users.json'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff11", nonFacultyStaff6.equals(nonFacultyStaff11) ? nonFacultyStaff6.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Student student9 = new model.user.Student(credentials3, ")CAoHm8t(");
        strategy.FacultyParkingRate facultyParkingRate10 = new strategy.FacultyParkingRate();
        double double12 = facultyParkingRate10.calculateRate(22500.0d);
        double double14 = facultyParkingRate10.calculateRate((double) 1.0f);
        double double16 = facultyParkingRate10.calculateRate(180000.0d);
        double double18 = facultyParkingRate10.calculateRate(100.0d);
        double double20 = facultyParkingRate10.calculateRate((double) 10);
        double double22 = facultyParkingRate10.calculateRate(776.0d);
        double double24 = facultyParkingRate10.calculateRate(0.0d);
        double double26 = facultyParkingRate10.calculateRate(0.0d);
        boolean boolean27 = credentials3.equals((java.lang.Object) double26);
        model.user.NonFacultyStaff nonFacultyStaff29 = new model.user.NonFacultyStaff(credentials3, "A%v5&YzsA");
        model.user.Client client30 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff29", nonFacultyStaff6.equals(nonFacultyStaff29) ? nonFacultyStaff6.hashCode() == nonFacultyStaff29.hashCode() : true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) ' ', (int) ' ');
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        boolean boolean16 = clientServices0.bookParkingSpace(booking12);
        model.parking.ParkingLot parkingLot18 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        java.lang.String str23 = booking19.getEmail();
        booking19.setCost((double) (byte) 0);
        int int26 = booking19.getLotId();
        booking19.setEmail("Manager");
        booking19.setStartTime((int) (byte) 0);
        double double31 = booking19.getCost();
        java.lang.String str32 = booking19.toString();
        java.lang.String str33 = booking19.toString();
        booking19.setEndTime((int) (byte) 1);
        boolean boolean36 = clientServices0.bookParkingSpace(booking19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList38 = clientServices0.getAllUsersBookings("iim*=oKjy");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client12 = new model.user.Client(credentials3);
        java.lang.String str13 = credentials3.getType();
        model.user.Client client14 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3, "=K*eY67RK");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client12 and client14", client12.equals(client14) ? client12.hashCode() == client14.hashCode() : true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (short) 10);
        double double12 = booking0.getCost();
        double double13 = booking0.getCost();
        java.lang.String str14 = booking0.getLicensePlate();
        java.util.Date date15 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = booking0.getTotalCost();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        java.lang.String str18 = clientServices0.enableParkingSpaceById((int) (byte) 1, (int) (short) 10);
        java.lang.String str21 = clientServices0.getParkingSpaceById(32, (int) '4');
        model.parking.ParkingLot parkingLot23 = clientServices0.getParkingLotByAddress("\nid             1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   Success: Parking Space 100 has been disabled.'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean25 = clientServices0.cancenlBooking(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList27 = clientServices0.getAllUsersBookings("Credentials{login='hi!', password='', type='Student'}");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        java.lang.String str7 = superManagerServices0.generateRandomEmail();
        java.lang.String str8 = superManagerServices0.generateStrongPassword();
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials13 = new model.user.Credentials("", "*a[AnW&Y-", "o2RaN4]aM");
        model.user.Client client14 = new model.user.Client(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount((model.user.User) client14);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        java.util.List<model.user.User> userList12 = userRepository3.getUsers();
        services.UserService userService13 = new services.UserService();
        repo.UserRepository userRepository14 = userService13.userRepository;
        repo.UserRepository userRepository15 = userService13.userRepository;
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        java.lang.String str23 = credentials19.toString();
        java.lang.String str24 = credentials19.getPassword();
        java.lang.String str25 = credentials19.getType();
        model.user.Student student26 = new model.user.Student(credentials19);
        model.user.Credentials credentials27 = student26.getCredentials();
        java.lang.String str28 = student26.getStudentId();
        userRepository15.removeUser((model.user.User) student26);
        services.ClientServices clientServices30 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot32 = clientServices30.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList33 = clientServices30.getAllBookings();
        model.booking.Booking booking34 = new model.booking.Booking();
        int int35 = booking34.getStartTime();
        booking34.setEndTime((int) (short) 10);
        java.lang.String str38 = booking34.getEmail();
        java.util.Date date39 = booking34.getStartDateTime();
        boolean boolean40 = clientServices30.bookParkingSpace(booking34);
        java.lang.String str43 = clientServices30.getParkingSpaceById((int) (short) 0, (int) '#');
        java.util.List<model.booking.Booking> bookingList44 = clientServices30.getAllBookings();
        java.lang.String str47 = clientServices30.disableParkingSpaceById(52, (int) '#');
        services.ClientServices clientServices48 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot50 = clientServices48.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList51 = clientServices48.getAllBookings();
        java.lang.String str54 = clientServices48.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str57 = clientServices48.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking59 = clientServices48.getBookingById(100);
        java.util.List<java.lang.String> strList60 = clientServices48.getAllLocations();
        model.booking.Booking booking61 = new model.booking.Booking();
        int int62 = booking61.getStartTime();
        int int63 = booking61.getId();
        int int64 = booking61.getTotalHours();
        java.util.Date date65 = booking61.getEndDateTime();
        int int66 = booking61.getTotalHours();
        boolean boolean67 = clientServices48.updateCompleteBooking(booking61);
        boolean boolean68 = clientServices30.updateCompleteBooking(booking61);
        boolean boolean69 = student26.equals((java.lang.Object) booking61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) student26);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        boolean boolean15 = userService11.isValidEmail("There is no Such Parking Lot");
        boolean boolean17 = userService11.isStrongPassword("Success: Parking Space 35 has been disabled.");
        boolean boolean19 = userService11.isStrongPassword("Success: Parking Space 10 has been disabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) userService11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user23 = userService11.loginUser("Success: Parking Lot 97 has been enabled.", "Success: Parking Lot 97 has been enabled.");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Parking Lot 97 is already enabled.");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        java.lang.String str11 = booking7.getEmail();
        java.util.Date date12 = booking7.getStartDateTime();
        boolean boolean13 = clientServices0.bookParkingSpace(booking7);
        java.lang.String str16 = clientServices0.getParkingSpaceById(97, (int) (byte) 100);
        java.lang.String str19 = clientServices0.enableParkingSpaceById(32, 100);
        java.util.List<java.lang.String> strList20 = clientServices0.getAllLocations();
        boolean boolean23 = clientServices0.updateBooking((-87), (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("X?EhgrKDV");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        java.lang.String str12 = credentials7.getType();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials7, "ngy(gkqsc");
        nonFacultyStaff14.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        nZ!X]L6?(");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff14", nonFacultyStaff6.equals(nonFacultyStaff14) ? nonFacultyStaff6.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials11, "hi!");
        model.user.Credentials credentials15 = nonFacultyStaff14.getCredentials();
        model.user.Client client16 = new model.user.Client(credentials15);
        model.user.Student student17 = new model.user.Student(credentials15);
        student17.validateAccount();
        student17.setStudentId("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) student17);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        java.lang.String str7 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials11);
        java.lang.String str17 = credentials11.getType();
        model.user.Manager manager18 = new model.user.Manager(credentials11);
        model.user.Student student19 = new model.user.Student(credentials11);
        model.user.Credentials credentials20 = student19.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) student19);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("JoNIi]ebC");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getLogin();
        strategy.StudentParkingRate studentParkingRate12 = new strategy.StudentParkingRate();
        double double14 = studentParkingRate12.calculateRate((double) 1.0f);
        boolean boolean15 = credentials10.equals((java.lang.Object) 1.0f);
        java.lang.String str16 = credentials10.getType();
        model.user.User user17 = model.user.UserFactory.createAccount(credentials10);
        model.user.NonFacultyStaff nonFacultyStaff18 = new model.user.NonFacultyStaff(credentials10);
        nonFacultyStaff18.validateAccount();
        nonFacultyStaff18.setRole("&*I]dB!o!");
        nonFacultyStaff18.setRole("Success: Parking Space 0 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = userService0.registerUser((model.user.User) nonFacultyStaff18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("vCPEq&9Q@");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        java.lang.String str10 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "There is no Such Parking Lot");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = credentials3.getType();
        model.user.Student student15 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str18 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff17", nonFacultyStaff12.equals(nonFacultyStaff17) ? nonFacultyStaff12.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEndTime((int) (short) 100);
        java.lang.String str19 = booking9.getEmail();
        booking9.setLicensePlate("Give Id for parking Space is wrong");
        boolean boolean22 = credentials3.equals((java.lang.Object) booking9);
        java.lang.String str23 = booking9.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = booking9.getTotalCost();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("qS46Qm6yT");
        boolean boolean11 = userService0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = userService0.isStrongPassword("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        repo.UserRepository userRepository14 = userService0.userRepository;
        model.user.Client client18 = new model.user.Client("hLihvheFq", "lWu#FFEES", "+O3S!#50S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) client18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("]82UgsU=G");
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.Client client7 = new model.user.Client(credentials6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = userService0.registerUser((model.user.User) client7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        boolean boolean14 = userService0.isStrongPassword("?qqRirU!a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user17 = userService0.loginUser("0!CWaRD$O", "1bR(76zCD");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        java.lang.String str11 = clientServices0.disableParkingSpaceById((int) '4', (int) (byte) -1);
        model.booking.Booking booking13 = clientServices0.getBookingById((int) (byte) 10);
        services.ClientServices clientServices14 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot16 = clientServices14.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList17 = clientServices14.getAllBookings();
        java.lang.String str20 = clientServices14.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking22 = clientServices14.getBookingById(100);
        boolean boolean25 = clientServices14.updateBooking((int) 'a', 100);
        java.lang.String str28 = clientServices14.getParkingSpaceById((int) ' ', 100);
        model.booking.Booking booking29 = new model.booking.Booking();
        int int30 = booking29.getStartTime();
        booking29.setEndTime((int) (short) 10);
        booking29.setCost((double) (short) 100);
        int int35 = booking29.getTotalHours();
        boolean boolean36 = clientServices14.bookParkingSpace(booking29);
        booking29.setStartTime((int) (short) 100);
        java.lang.String str39 = booking29.getLicensePlate();
        int int40 = booking29.getEndTime();
        booking29.setCost(337500.0d);
        boolean boolean43 = clientServices0.bookParkingSpace(booking29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList45 = clientServices0.getAllUsersBookings("(Oa4#e=mK");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        model.user.User user11 = new model.user.User(credentials7);
        model.user.Student student12 = new model.user.Student(credentials7);
        java.lang.String str13 = credentials7.getPassword();
        model.user.Student student14 = new model.user.Student(credentials7);
        model.user.User user15 = new model.user.User(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getLogin();
        strategy.StudentParkingRate studentParkingRate13 = new strategy.StudentParkingRate();
        double double15 = studentParkingRate13.calculateRate((double) 1.0f);
        boolean boolean16 = credentials11.equals((java.lang.Object) 1.0f);
        model.user.User user17 = new model.user.User(credentials11);
        model.user.User user18 = model.user.UserFactory.createAccount(credentials11);
        model.user.User user19 = model.user.UserFactory.createAccount(credentials11);
        model.user.Student student20 = new model.user.Student(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = userService0.registerUser((model.user.User) student20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        facultyMember10.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str13 = facultyMember10.getFacultyId();
        java.lang.String str14 = facultyMember10.getFacultyName();
        model.user.Credentials credentials15 = facultyMember10.getCredentials();
        model.user.Student student16 = new model.user.Student(credentials15);
        student16.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials22 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str23 = credentials22.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials22, "hi!");
        model.user.Credentials credentials26 = nonFacultyStaff25.getCredentials();
        model.user.User user27 = model.user.UserFactory.createAccount(credentials26);
        model.user.Student student28 = new model.user.Student(credentials26);
        java.lang.String str29 = student28.getStudentId();
        boolean boolean30 = student16.equals((java.lang.Object) student28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials22", credentials3.equals(credentials22) ? credentials3.hashCode() == credentials22.hashCode() : true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
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
        model.user.Student student17 = new model.user.Student(credentials14, "X?EhgrKDV");
        model.user.Visitor visitor18 = new model.user.Visitor(credentials14);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials14, "pZRg)p#2o");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor18", visitor6.equals(visitor18) ? visitor6.hashCode() == visitor18.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        java.lang.String str18 = credentials13.getPassword();
        java.lang.String str19 = credentials13.toString();
        java.lang.String str20 = credentials13.toString();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials13, "There is no Such Parking Lot");
        model.user.Student student23 = new model.user.Student(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser((model.user.User) student23);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("?qqRirU!a");
        boolean boolean7 = userService0.isValidEmail("1bR(76zCD");
        boolean boolean9 = userService0.isStrongPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("UGdx6wsC*");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
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
        java.lang.String str17 = clientServices0.getParkingSpaceById(1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllUsersBookings("Parking Space 10 is already enabled.");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("=B3fAbMGq");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("9z6wsHuxQ");
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "hi!");
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        model.user.Client client13 = new model.user.Client(credentials12);
        model.user.Student student14 = new model.user.Student(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = userService0.registerUser((model.user.User) student14);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) 'a', 100);
        model.parking.ParkingLot parkingLot13 = clientServices0.getParkingLotByAddress("Parking Space 32 is already enabled.");
        model.booking.Booking booking15 = clientServices0.getBookingById((int) ' ');
        boolean boolean18 = clientServices0.updateBooking((-90), (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllUsersBookings("=syRIr=H*");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.setFacultyId("hi!");
        model.user.Credentials credentials11 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.", "AAwYnzN!e", "Rg2)djJx]");
        model.user.User user12 = model.user.UserFactory.createAccount(credentials11);
        boolean boolean13 = facultyMember4.equals((java.lang.Object) credentials11);
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        java.lang.String str21 = credentials17.getPassword();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials17);
        java.lang.String str23 = credentials17.toString();
        boolean boolean24 = facultyMember4.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("Parking Space 35 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("", "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("wl(koPNa!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateRandomEmail();
        boolean boolean4 = superManagerServices0.isStrongPassword("(O3fsOXXJ");
        services.UserService userService5 = new services.UserService();
        repo.UserRepository userRepository6 = userService5.userRepository;
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
        userRepository6.removeUser((model.user.User) nonFacultyStaff17);
        nonFacultyStaff17.setRole("Parking Space 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff17);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        java.util.List<java.lang.String> strList6 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.cancenlBooking((int) 'a');
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str9 = nonFacultyStaff8.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("8hXCtaT!&", "pUdP465**");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        services.UserService userService0 = new services.UserService();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials4, "hi!");
        nonFacultyStaff7.setRole("");
        model.user.Credentials credentials10 = nonFacultyStaff7.getCredentials();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials10);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials10);
        java.lang.String str13 = facultyMember12.getFacultyId();
        facultyMember12.setFacultyName("Parking Lot 97 is already disabled.");
        facultyMember12.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser((model.user.User) facultyMember12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("-ddq]bnqr");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("YEu*&Uy])");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "Parking Space 35 is already disabled.");
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getPassword();
        java.lang.String str14 = credentials12.toString();
        model.user.Visitor visitor15 = new model.user.Visitor(credentials12);
        visitor15.validateAccount();
        boolean boolean17 = visitor15.getValidationStatus();
        boolean boolean18 = visitor15.getValidationStatus();
        model.user.Credentials credentials19 = visitor15.getCredentials();
        boolean boolean20 = student8.equals((java.lang.Object) visitor15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        model.user.Credentials credentials3 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str4 = credentials3.getLogin();
        model.user.User user5 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "NonFacultyStaff", "2g]O0QGM)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember8", facultyMember6.equals(facultyMember8) ? facultyMember6.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        nonFacultyStaff6.setRole("Parking Lot 97 is already enabled.");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        model.user.Credentials credentials19 = user18.getCredentials();
        model.user.Student student21 = new model.user.Student(credentials19, "There is no Such Parking Lot");
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        boolean boolean23 = nonFacultyStaff6.equals((java.lang.Object) visitor22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getSpaceId();
        int int8 = booking6.getStartTime();
        double double9 = booking6.getCost();
        booking6.setLicensePlate("GmnB8A3OL");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = booking6.getTotalCost();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.User user12 = new model.user.User(credentials7);
        model.user.Visitor visitor13 = new model.user.Visitor(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user12", user6.equals(user12) ? user6.hashCode() == user12.hashCode() : true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        java.lang.String str22 = credentials18.toString();
        model.user.User user23 = model.user.UserFactory.createAccount(credentials18);
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials18, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client27 = new model.user.Client(credentials18);
        java.lang.String str28 = credentials18.getType();
        model.user.NonFacultyStaff nonFacultyStaff30 = new model.user.NonFacultyStaff(credentials18, "Parking Lot 97 is already disabled.");
        java.lang.String str31 = nonFacultyStaff30.getRole();
        userRepository4.addUser((model.user.User) nonFacultyStaff30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials8 and credentials18", credentials8.equals(credentials18) ? credentials8.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        booking2.setEndTime((int) (short) 10);
        java.lang.String str6 = booking2.getEmail();
        booking2.setCost((double) (byte) 0);
        parkingSpace1.setBooking(booking2);
        java.lang.String str10 = parkingSpace1.enableParkingSpace();
        parkingSpace1.setSpaceID((int) (byte) -1);
        model.booking.Booking booking13 = new model.booking.Booking();
        booking13.setId(0);
        booking13.setEmail("Student");
        java.util.Date date18 = booking13.getStartDateTime();
        parkingSpace1.setBooking(booking13);
        booking13.setStatus("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = booking13.getTotalCost();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("oNJkb*w)s");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("Success: Parking Lot 97 has been disabled.");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "", "Student");
        java.lang.String str9 = credentials8.getType();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.Student student14 = new model.user.Student(credentials3);
        java.lang.String str15 = student14.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student14", student10.equals(student14) ? student10.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        booking12.setCost((double) (byte) 0);
        int int19 = booking12.getLotId();
        booking12.setId((int) '#');
        java.lang.String str22 = booking12.getStatus();
        booking12.setId((int) (byte) 10);
        boolean boolean25 = credentials3.equals((java.lang.Object) booking12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = booking12.getTotalCost();
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "R3$W[qgE=");
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getType();
        model.user.Manager manager10 = new model.user.Manager(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        java.lang.String str12 = credentials3.getLogin();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "YAFUIs1L_", "pUdP465**");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "lQUJw)vOH", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials3, "bEFVFN!4F");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember15 and facultyMember18", facultyMember15.equals(facultyMember18) ? facultyMember15.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "", "A%v5&YzsA");
        java.lang.String str16 = facultyMember15.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember15", facultyMember11.equals(facultyMember15) ? facultyMember11.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isStrongPassword("T#NJctMi&");
        boolean boolean11 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.getType();
        java.lang.String str18 = credentials15.toString();
        java.lang.String str19 = credentials15.getLogin();
        model.user.User user20 = model.user.UserFactory.createAccount(credentials15);
        java.lang.String str21 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials15);
        nonFacultyStaff22.setRole("Success: Parking Lot 100 has been disabled.");
        java.lang.String str25 = nonFacultyStaff22.getRole();
        nonFacultyStaff22.setRole("]cT(-?mBj");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff22);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("L2C@FUe6G");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("q?fu1zARj", "_0OsrHq9&");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials7);
        model.user.Student student9 = new model.user.Student(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        model.user.User user12 = model.user.UserFactory.createAccount(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7);
        java.lang.String str14 = nonFacultyStaff13.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff13", nonFacultyStaff6.equals(nonFacultyStaff13) ? nonFacultyStaff6.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) 'a', (int) (byte) 100);
        java.lang.String str6 = clientServices0.disableParkingSpaceById(1, (int) (byte) 10);
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = clientServices0.cancenlBooking((-90));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository8 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getLogin();
        model.user.User user15 = new model.user.User(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository9.updateUser(user15);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("&jn[e]&j%");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
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
        model.booking.Booking booking25 = new model.booking.Booking();
        int int26 = booking25.getStartTime();
        booking25.setEndTime((int) (short) 10);
        java.lang.String str29 = booking25.getEmail();
        booking25.setCost((double) (byte) 0);
        booking25.setCost(10.0d);
        int int34 = booking25.getTotalHours();
        boolean boolean35 = clientServices0.bookParkingSpace(booking25);
        model.parking.ParkingSpace parkingSpace37 = new model.parking.ParkingSpace((int) '#');
        parkingSpace37.setStatus(true);
        boolean boolean40 = parkingSpace37.getStatus();
        model.booking.Booking booking41 = new model.booking.Booking();
        int int42 = booking41.getStartTime();
        booking41.setEndTime((int) (short) 10);
        java.lang.String str45 = booking41.getEmail();
        booking41.setCost((double) (byte) 0);
        int int48 = booking41.getLotId();
        booking41.setCost((double) 100L);
        parkingSpace37.setBooking(booking41);
        java.lang.String str52 = booking41.toString();
        int int53 = booking41.getStartTime();
        java.lang.String str54 = booking41.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean55 = clientServices0.updateCompleteBooking(booking41);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("Student");
        boolean boolean11 = superManagerServices0.isStrongPassword("Failure: Parking Space 35 has active bookings. Parking Space has not been disabled.");
        boolean boolean13 = superManagerServices0.isStrongPassword("t3=jyxeE5");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        nonFacultyStaff20.setRole("");
        model.user.Credentials credentials23 = nonFacultyStaff20.getCredentials();
        model.user.Credentials credentials24 = nonFacultyStaff20.getCredentials();
        model.user.Credentials credentials25 = nonFacultyStaff20.getCredentials();
        nonFacultyStaff20.setRole("X5G?ZJ!c@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff20);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user7", user6.equals(user7) ? user6.hashCode() == user7.hashCode() : true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList9 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllBookings();
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        booking12.setCost((double) (byte) 0);
        booking12.setCost(10.0d);
        int int21 = booking12.getTotalHours();
        int int22 = booking12.getSpaceId();
        booking12.setStartTime((int) '4');
        java.util.Date date25 = booking12.getStartDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = clientServices0.updateCompleteBooking(booking12);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost(10.0d);
        int int9 = booking0.getTotalHours();
        int int10 = booking0.getSpaceId();
        booking0.setCost(500.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff10.setRole("users.json");
        boolean boolean14 = nonFacultyStaff10.equals((java.lang.Object) 75.0d);
        nonFacultyStaff10.validateAccount();
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials19);
        model.user.Client client21 = new model.user.Client(credentials19);
        model.user.Student student22 = new model.user.Student(credentials19);
        java.lang.String str23 = student22.getStudentId();
        boolean boolean24 = nonFacultyStaff10.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials19", credentials3.equals(credentials19) ? credentials3.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.Student student13 = new model.user.Student(credentials11, "Success: Parking Space 97 has been enabled.");
        model.user.Manager manager14 = new model.user.Manager(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) manager14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("users.json");
        boolean boolean11 = userService0.isValidEmail("Av+-nN6Nu");
        repo.UserRepository userRepository12 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.loginUser("Parking Lot -1 is already enabled.", "cgJd5wr]v");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        java.lang.String str9 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str11 = nonFacultyStaff10.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.lang.String str13 = clientServices0.enableParkingSpaceById((int) 'a', 0);
        model.parking.ParkingLot parkingLot15 = clientServices0.getParkingLotByAddress("b0K0Td]sJ");
        java.lang.String str18 = clientServices0.enableParkingSpaceById(100, 1);
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        java.lang.String str9 = credentials8.getType();
        java.lang.String str10 = credentials8.getLogin();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8);
        model.user.Client client13 = new model.user.Client(credentials8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("Parking Lot 97 is already disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        97\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        services.ClientServices clientServices10 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot12 = clientServices10.getParkingLotByAddress("Student");
        model.booking.Booking booking14 = clientServices10.getBookingById((int) (short) 0);
        boolean boolean15 = clientServices0.updateCompleteBooking(booking14);
        java.lang.String str18 = clientServices0.enableParkingSpaceById((int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking(1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("oNJkb*w)s");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
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
        model.parking.ParkingLot parkingLot20 = clientServices0.getParkingLotByAddress("X5Ky_2+t)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = clientServices0.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = facultyMember13.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember13", facultyMember11.equals(facultyMember13) ? facultyMember11.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean9 = superManagerServices0.isStrongPassword("T#NJctMi&");
        boolean boolean11 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        boolean boolean13 = superManagerServices0.isValidEmail("740DtnjCF");
        model.user.Credentials credentials17 = new model.user.Credentials("", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Lot 100 has been disabled.");
        model.user.Visitor visitor18 = new model.user.Visitor(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = superManagerServices0.createAccount((model.user.User) visitor18);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("q?fu1zARj");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        model.booking.Booking booking6 = parkingSpace1.getBooking();
        int int7 = booking6.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = booking6.getTotalCost();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student15", student10.equals(student15) ? student10.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
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
        java.lang.String str38 = clientServices13.getParkingSpaceById(97, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = clientServices13.cancenlBooking((int) (byte) 100);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        boolean boolean10 = superManagerServices0.isValidEmail("");
        boolean boolean12 = superManagerServices0.isStrongPassword("B7Q7?T8bL");
        model.user.Credentials credentials16 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager17 = new model.user.Manager(credentials16);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials16, "Parking Space -1 is already enabled.", "X?EhgrKDV");
        model.user.Student student22 = new model.user.Student(credentials16, "cZ=IAx!!l");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = superManagerServices0.createAccount((model.user.User) student22);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
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
        model.user.Student student13 = new model.user.Student(credentials3);
        student13.setStudentId("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.User user7 = model.user.UserFactory.createAccount(credentials3);
        model.user.Manager manager8 = new model.user.Manager(credentials3);
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "(kfyao&]i");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager8 and manager9", manager8.equals(manager9) ? manager8.hashCode() == manager9.hashCode() : true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("hLihvheFq");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        booking0.setCost(10.0d);
        int int9 = booking0.getTotalHours();
        booking0.setStartTime((int) (byte) -1);
        java.util.Date date12 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.enableParkingSpaceById(0, (int) (byte) 1);
        model.booking.Booking booking8 = clientServices0.getBookingById(100);
        boolean boolean11 = clientServices0.updateBooking((int) (short) 100, (int) ' ');
        boolean boolean14 = clientServices0.updateBooking((int) (short) 10, 0);
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList17 = clientServices0.getAllUsersBookings("hqs?oL5o7");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 97 is already disabled.");
        boolean boolean6 = superManagerServices0.isValidEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client10 = new model.user.Client("Parking Lot 100 is already enabled.", "&jn[e]&j%", "&jn[e]&j%");
        model.user.Credentials credentials11 = client10.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateStrongPassword();
        boolean boolean4 = superManagerServices0.isValidEmail("Success: Parking Lot 97 has been disabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str7 = superManagerServices0.generateStrongPassword();
        boolean boolean9 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials13);
        model.user.User user16 = new model.user.User(credentials13);
        model.user.Credentials credentials17 = user16.getCredentials();
        java.lang.String str18 = credentials17.getPassword();
        model.user.Student student19 = new model.user.Student(credentials17);
        java.lang.String str20 = student19.getStudentId();
        java.lang.String str21 = student19.getStudentId();
        student19.validateAccount();
        student19.setStudentId("");
        student19.setStudentId("nAVofek+=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = superManagerServices0.createAccount((model.user.User) student19);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("O*Ctm)%!R");
        boolean boolean9 = userService0.isStrongPassword(")CAoHm8t(");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("Nn#x&lKqI", "Parking Lot 35 is already enabled.");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("(O3fsOXXJ");
        boolean boolean8 = userService0.isStrongPassword("1Uy3Mwvq6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("+O3S!#50S");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        java.lang.String str17 = clientServices0.getParkingSpaceById(1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllUsersBookings("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        HcpxBjAE]");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.RepositoryProvider repositoryProvider8 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository9 = repositoryProvider8.getBookingRepository();
        repo.BookingRepository bookingRepository10 = repositoryProvider8.getBookingRepository();
        repo.UserRepository userRepository11 = repositoryProvider8.getUserRepository();
        repo.UserRepository userRepository12 = repositoryProvider8.getUserRepository();
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getLogin();
        strategy.StudentParkingRate studentParkingRate18 = new strategy.StudentParkingRate();
        double double20 = studentParkingRate18.calculateRate((double) 1.0f);
        boolean boolean21 = credentials16.equals((java.lang.Object) 1.0f);
        model.user.User user22 = new model.user.User(credentials16);
        model.user.Manager manager23 = new model.user.Manager(credentials16);
        userRepository12.addUser((model.user.User) manager23);
        model.user.Credentials credentials25 = manager23.getCredentials();
        userRepository7.removeUser((model.user.User) manager23);
        model.user.Credentials credentials30 = new model.user.Credentials("There is no Such Parking Lot", "", "Visitor");
        java.lang.String str31 = credentials30.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff32 = new model.user.NonFacultyStaff(credentials30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) nonFacultyStaff32);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
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
        java.lang.String str19 = facultyMember18.getFacultyName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember18", facultyMember10.equals(facultyMember18) ? facultyMember10.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials17, "hi!");
        java.lang.String str21 = credentials17.getPassword();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials17);
        java.lang.String str23 = credentials17.toString();
        model.user.Client client24 = new model.user.Client(credentials17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = userService0.registerUser((model.user.User) client24);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Y@mMCI7!u");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("9z6wsHuxQ");
        repo.UserRepository userRepository14 = userService0.userRepository;
        repo.UserRepository userRepository15 = userService0.userRepository;
        repo.UserRepository userRepository16 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user18 = userService0.getUserByEmail("WUEKRKn[t");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("B2ibqc(C8", "Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("yCFe[eRt(");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        boolean boolean6 = userService0.isValidEmail("HGL)]pX%+");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "f$4(6N0nf");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        double double10 = booking0.getCost();
        java.util.Date date11 = booking0.getDate();
        int int12 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        java.util.List<java.lang.String> strList9 = clientServices0.getAllLocations();
        model.booking.Booking booking10 = new model.booking.Booking();
        int int11 = booking10.getStartTime();
        booking10.setEndTime((int) (short) 10);
        java.lang.String str14 = booking10.getEmail();
        booking10.setCost((double) (byte) 0);
        int int17 = booking10.getLotId();
        booking10.setEmail("Manager");
        boolean boolean20 = clientServices0.updateCompleteBooking(booking10);
        java.util.Date date21 = booking10.getStartDateTime();
        booking10.setId(97);
        double double24 = booking10.getCost();
        java.lang.String str25 = booking10.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = booking10.getTotalCost();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        services.UserService userService6 = new services.UserService();
        boolean boolean8 = userService6.isValidEmail("SuperManager");
        repo.UserRepository userRepository9 = userService6.userRepository;
        model.user.User user10 = null;
        userRepository9.removeUser(user10);
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        model.user.Credentials credentials19 = user18.getCredentials();
        java.lang.String str20 = credentials19.getPassword();
        model.user.Student student21 = new model.user.Student(credentials19);
        java.lang.String str22 = student21.getStudentId();
        java.lang.String str23 = student21.getStudentId();
        student21.setStudentId("(O3fsOXXJ");
        student21.validateAccount();
        userRepository9.addUser((model.user.User) student21);
        model.user.Credentials credentials31 = new model.user.Credentials("There is no Such Parking Lot", "hi!", "SuperManager");
        java.lang.String str32 = credentials31.getPassword();
        model.user.Student student34 = new model.user.Student(credentials31, "Success: Parking Space 35 has been disabled.");
        model.user.FacultyMember facultyMember37 = new model.user.FacultyMember(credentials31, "Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}", "Parking Lot 97 is already disabled.");
        userRepository9.removeUser((model.user.User) facultyMember37);
        userRepository5.removeUser((model.user.User) facultyMember37);
        model.user.Credentials credentials43 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str44 = credentials43.getPassword();
        model.user.FacultyMember facultyMember45 = new model.user.FacultyMember(credentials43);
        model.user.User user46 = new model.user.User(credentials43);
        model.user.Credentials credentials47 = user46.getCredentials();
        model.user.Student student49 = new model.user.Student(credentials47, "There is no Such Parking Lot");
        userRepository5.addUser((model.user.User) student49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials15 and credentials43", credentials15.equals(credentials43) ? credentials15.hashCode() == credentials43.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setId(0);
        booking6.setEmail("Student");
        boolean boolean11 = clientServices0.updateCompleteBooking(booking6);
        booking6.setStartTime((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking6.getTotalCost();
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        java.lang.String str9 = credentials8.getType();
        java.lang.String str10 = credentials8.getLogin();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8);
        java.lang.String str13 = credentials8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.Client client4 = new model.user.Client(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.Client client6 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client5", client4.equals(client5) ? client4.hashCode() == client5.hashCode() : true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
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
        java.lang.String str15 = credentials11.toString();
        model.user.User user16 = model.user.UserFactory.createAccount(credentials11);
        model.user.FacultyMember facultyMember19 = new model.user.FacultyMember(credentials11, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client20 = new model.user.Client(credentials11);
        java.lang.String str21 = credentials11.getType();
        model.user.NonFacultyStaff nonFacultyStaff23 = new model.user.NonFacultyStaff(credentials11, "Parking Lot 97 is already disabled.");
        java.lang.String str24 = nonFacultyStaff23.getRole();
        nonFacultyStaff23.setRole("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) nonFacultyStaff23);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getLogin();
        model.user.User user21 = new model.user.User(credentials19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser(user21);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        java.lang.String str6 = facultyMember4.getFacultyId();
        java.lang.String str7 = facultyMember4.getFacultyName();
        facultyMember4.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Credentials credentials10 = facultyMember4.getCredentials();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        boolean boolean12 = facultyMember11.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember11", facultyMember4.equals(facultyMember11) ? facultyMember4.hashCode() == facultyMember11.hashCode() : true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        java.lang.String str3 = clientServices0.enableParkingSpaceById((int) 'a', (int) (byte) 100);
        java.lang.String str6 = clientServices0.disableParkingSpaceById(1, (int) (byte) 10);
        java.util.List<model.booking.Booking> bookingList7 = clientServices0.getAllBookings();
        boolean boolean10 = clientServices0.updateBooking(97, (int) (short) 100);
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllBookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllUsersBookings("JoNIi]ebC");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.Student student12 = new model.user.Student(credentials9);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials9);
        model.user.Visitor visitor14 = new model.user.Visitor(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff13", nonFacultyStaff6.equals(nonFacultyStaff13) ? nonFacultyStaff6.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 1 is already disabled.", "X?EhgrKDV", "Success: Parking Lot -1 has been disabled.");
        model.user.Student student5 = new model.user.Student(credentials3, "&jn[e]&j%");
        model.user.Student student6 = new model.user.Student(credentials3);
        student6.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      -1\nendTime        32\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student6", student5.equals(student6) ? student5.hashCode() == student6.hashCode() : true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        model.user.Student student11 = new model.user.Student(credentials3, "Parking Lot 100 is already enabled.");
        java.lang.String str12 = credentials3.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff13.setRole("yCFe[eRt(");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff13", nonFacultyStaff9.equals(nonFacultyStaff13) ? nonFacultyStaff9.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = userService0.registerUser((model.user.User) manager27);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        java.lang.String str18 = clientServices0.getParkingSpaceById((int) (short) 100, (int) (short) 10);
        java.lang.String str21 = clientServices0.disableParkingSpaceById((int) (byte) 100, (-90));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = clientServices0.updateBooking((-90), 35);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllBookings();
        java.lang.String str16 = clientServices0.enableParkingSpaceById(35, (int) (short) -1);
        java.lang.String str19 = clientServices0.getParkingSpaceById(99, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = clientServices0.updateBooking((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        repo.UserRepository userRepository13 = userService0.userRepository;
        boolean boolean15 = userService0.isValidEmail("Success: Parking Space 35 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user17 = userService0.getUserByEmail("?)iViwJ?y");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.lang.String str14 = clientServices0.getParkingSpaceById(0, 1);
        model.booking.Booking booking15 = new model.booking.Booking();
        int int16 = booking15.getStartTime();
        booking15.setEndTime((int) (short) 10);
        java.lang.String str19 = booking15.getEmail();
        booking15.setCost((double) (byte) 0);
        int int22 = booking15.getLotId();
        booking15.setEndTime((int) (short) 100);
        booking15.setEmail("(O3fsOXXJ");
        booking15.setEmail("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.util.Date date29 = booking15.getEndDateTime();
        booking15.setStartTime(0);
        int int32 = booking15.getTotalHours();
        booking15.setId((int) (byte) 0);
        boolean boolean35 = clientServices0.bookParkingSpace(booking15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList37 = clientServices0.getAllUsersBookings("_8m]KJGvM");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setId(0);
        booking0.setEmail("Student");
        java.lang.String str5 = booking0.toString();
        java.lang.String str6 = booking0.getStatus();
        booking0.setCost((double) ' ');
        int int9 = booking0.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        java.lang.String str2 = superManagerServices0.generateRandomEmail();
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 100 is already disabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        java.lang.String str7 = superManagerServices0.generateStrongPassword();
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.toString();
        model.user.Manager manager15 = new model.user.Manager(credentials13);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials13);
        facultyMember16.validateAccount();
        model.user.Credentials credentials18 = facultyMember16.getCredentials();
        model.user.User user19 = new model.user.User(credentials18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = superManagerServices0.createAccount(user19);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.getType();
        model.user.Student student18 = new model.user.Student(credentials15);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials15);
        boolean boolean20 = credentials3.equals((java.lang.Object) credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        java.lang.String str10 = superManagerServices0.generateRandomEmail();
        model.user.SuperManager superManager11 = model.user.SuperManager.getInstance();
        superManager11.validateAccount();
        model.user.Credentials credentials13 = superManager11.getCredentials();
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        java.lang.String str15 = facultyMember14.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) facultyMember14);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.getUserByEmail("NeTPxw#HE");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        HcpxBjAE]");
        model.parking.ParkingSpace parkingSpace11 = new model.parking.ParkingSpace((int) ' ');
        boolean boolean12 = parkingSpace11.hasBooking();
        parkingSpace11.setStatus(false);
        model.booking.Booking booking15 = parkingSpace11.getBooking();
        int int16 = parkingSpace11.getSpaceID();
        parkingSpace11.setSpaceID(97);
        parkingSpace11.setSpaceID((int) (short) 0);
        java.lang.String str21 = parkingSpace11.enableParkingSpace();
        model.booking.Booking booking22 = new model.booking.Booking();
        booking22.setId(0);
        booking22.setEmail("Student");
        java.util.Date date27 = booking22.getDate();
        booking22.setEndTime((int) ' ');
        parkingSpace11.setBooking(booking22);
        boolean boolean31 = credentials3.equals((java.lang.Object) parkingSpace11);
        model.user.Student student33 = new model.user.Student(credentials3, "JA4?OBm[J");
        student33.setStudentId("=syRIr=H*");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student6 and student33", student6.equals(student33) ? student6.hashCode() == student33.hashCode() : true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials7);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember10", facultyMember5.equals(facultyMember10) ? facultyMember5.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Client client11 = new model.user.Client(credentials3);
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        java.lang.String str19 = credentials15.toString();
        java.lang.String str20 = credentials15.getPassword();
        model.user.Client client21 = new model.user.Client(credentials15);
        java.lang.String str22 = credentials15.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff23 = new model.user.NonFacultyStaff(credentials15);
        boolean boolean24 = client11.equals((java.lang.Object) nonFacultyStaff23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials15", credentials3.equals(credentials15) ? credentials3.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("(j1+k0)lO");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot5 = clientServices0.getParkingLotByAddress("Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.updateBooking(99, (int) '4');
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
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
        java.util.List<java.lang.String> strList18 = clientServices0.getAllLocations();
        model.booking.Booking booking20 = clientServices0.getBookingById(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = clientServices0.cancenlBooking(32);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(true);
        model.sensor.Sensor sensor6 = parkingSpace1.getSensor();
        boolean boolean7 = parkingSpace1.hasBooking();
        java.lang.String str8 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEndTime((int) (short) 100);
        booking9.setId((-1));
        java.util.Date date21 = booking9.getDate();
        java.util.Date date22 = booking9.getEndDateTime();
        java.lang.String str23 = booking9.toString();
        parkingSpace1.setBooking(booking9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = booking9.getTotalCost();
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.booking.Booking booking1 = new model.booking.Booking();
        int int2 = booking1.getStartTime();
        int int3 = booking1.getId();
        java.util.Date date4 = booking1.getStartDateTime();
        boolean boolean5 = clientServices0.bookParkingSpace(booking1);
        boolean boolean8 = clientServices0.updateBooking((int) (short) 100, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setEmail("Manager");
        java.lang.String str23 = booking13.getLicensePlate();
        java.lang.String str24 = booking13.toString();
        int int25 = booking13.getSpaceId();
        boolean boolean26 = clientServices0.bookParkingSpace(booking13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList28 = clientServices0.getAllUsersBookings("nZ!X]L6?(");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isValidEmail("(kfyao&]i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("9IG1CMQkh");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        java.lang.String str15 = clientServices0.enableParkingSpaceById(32, 0);
        java.util.List<java.lang.String> strList16 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = clientServices0.cancenlBooking((-87));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.toString();
        java.lang.String str14 = credentials9.getPassword();
        java.lang.String str15 = credentials9.toString();
        model.user.Client client16 = new model.user.Client(credentials9);
        userRepository5.removeUser((model.user.User) client16);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        java.lang.String str23 = credentials21.toString();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials21);
        java.lang.String str25 = credentials21.toString();
        java.lang.String str26 = credentials21.getPassword();
        java.lang.String str27 = credentials21.toString();
        model.user.NonFacultyStaff nonFacultyStaff29 = new model.user.NonFacultyStaff(credentials21, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) nonFacultyStaff29);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.User user6 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "X?EhgrKDV");
        java.lang.String str10 = credentials3.getType();
        model.user.Student student12 = new model.user.Student(credentials3, "");
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3, "ngy(gkqsc");
        nonFacultyStaff14.setRole("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.', password='AAwYnzN!e', type='Rg2)djJx]'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff14", nonFacultyStaff9.equals(nonFacultyStaff14) ? nonFacultyStaff9.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        booking7.setEndTime((int) (short) 10);
        java.lang.String str11 = booking7.getEmail();
        java.util.Date date12 = booking7.getStartDateTime();
        boolean boolean13 = clientServices0.bookParkingSpace(booking7);
        java.lang.String str16 = clientServices0.getParkingSpaceById(97, (int) (byte) 100);
        java.lang.String str19 = clientServices0.enableParkingSpaceById(32, 100);
        java.util.List<java.lang.String> strList20 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList22 = clientServices0.getAllUsersBookings("oNJkb*w)s");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "Student", "Manager");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3, "Success: Parking Lot 97 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        facultyMember13.setFacultyId("iim*=oKjy");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember13", facultyMember10.equals(facultyMember13) ? facultyMember10.hashCode() == facultyMember13.hashCode() : true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 1 has been enabled.");
        boolean boolean8 = userService0.isStrongPassword("Wd_kK(d(K");
        repo.UserRepository userRepository9 = userService0.userRepository;
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        nonFacultyStaff16.setRole("");
        nonFacultyStaff16.setRole("hi!");
        java.lang.String str21 = nonFacultyStaff16.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) nonFacultyStaff16);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.getUserByEmail("+O3S!#50S");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
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
        java.util.List<model.user.User> userList23 = userRepository8.getUsers();
        java.util.List<model.user.User> userList24 = userRepository8.getUsers();
        model.user.Credentials credentials28 = new model.user.Credentials("T#NJctMi&", "Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}", "A%v5&YzsA");
        java.lang.String str29 = credentials28.getType();
        model.user.Student student30 = new model.user.Student(credentials28);
        model.user.Client client31 = new model.user.Client(credentials28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository8.updateUser((model.user.User) client31);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "WsR_[hRm]", "(j1+k0)lO");
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllBookings();
        boolean boolean10 = clientServices0.cancenlBooking((int) (byte) 0);
        model.booking.Booking booking12 = clientServices0.getBookingById((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllUsersBookings("$yn@vQ[]e");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getPassword();
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.Student student13 = new model.user.Student(credentials7, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager9 and manager11", manager9.equals(manager11) ? manager9.hashCode() == manager11.hashCode() : true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '#');
        parkingSpace1.setSpaceID((int) 'a');
        parkingSpace1.setStatus(true);
        model.sensor.Sensor sensor6 = parkingSpace1.getSensor();
        boolean boolean7 = parkingSpace1.hasBooking();
        java.lang.String str8 = parkingSpace1.disableParkingSpace();
        model.booking.Booking booking9 = new model.booking.Booking();
        int int10 = booking9.getStartTime();
        booking9.setEndTime((int) (short) 10);
        java.lang.String str13 = booking9.getEmail();
        booking9.setCost((double) (byte) 0);
        int int16 = booking9.getLotId();
        booking9.setEndTime((int) (short) 100);
        booking9.setId((-1));
        java.util.Date date21 = booking9.getDate();
        java.util.Date date22 = booking9.getEndDateTime();
        java.lang.String str23 = booking9.toString();
        parkingSpace1.setBooking(booking9);
        booking9.setStatus("Parking Space 35 is already enabled.");
        int int27 = booking9.getSpaceId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double28 = booking9.getTotalCost();
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("Parking Space 1 is already disabled.");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("cgJd5wr]v");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "X5G?ZJ!c@", "Parking Lot 97 is already enabled.");
        model.user.User user4 = new model.user.User(credentials3);
        model.user.User user5 = new model.user.User(credentials3);
        java.lang.String str6 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user4 and user5", user4.equals(user5) ? user4.hashCode() == user5.hashCode() : true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.Student student15 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("oC#i7vwX?");
        boolean boolean9 = userService0.isStrongPassword("SuperManager");
        repo.RepositoryProvider repositoryProvider10 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository11 = repositoryProvider10.getBookingRepository();
        repo.BookingRepository bookingRepository12 = repositoryProvider10.getBookingRepository();
        repo.UserRepository userRepository13 = repositoryProvider10.getUserRepository();
        java.util.List<model.user.User> userList14 = userRepository13.getUsers();
        model.user.Credentials credentials18 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.User user19 = model.user.UserFactory.createAccount(credentials18);
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials18, "Parking Space 35 is already enabled.");
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials18, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Manager");
        model.user.Student student25 = new model.user.Student(credentials18);
        userRepository13.removeUser((model.user.User) student25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) student25);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        boolean boolean16 = userService0.isValidEmail("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user18 = userService0.getUserByEmail("A9lHMeJ%f");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        model.parking.ParkingSpace parkingSpace1 = new model.parking.ParkingSpace((int) '4');
        model.booking.Booking booking2 = new model.booking.Booking();
        int int3 = booking2.getStartTime();
        int int4 = booking2.getId();
        parkingSpace1.setBooking(booking2);
        booking2.setEmail("Ss!n_uj18");
        java.util.Date date8 = booking2.getDate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking2.getTotalCost();
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "wl(koPNa!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.User user11 = model.user.UserFactory.createAccount(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember10", facultyMember7.equals(facultyMember10) ? facultyMember7.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        java.lang.String str13 = clientServices0.getParkingSpaceById((int) (short) 0, (int) '#');
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllBookings();
        java.lang.String str17 = clientServices0.disableParkingSpaceById(52, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.Credentials credentials12 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str13 = credentials12.getLogin();
        strategy.StudentParkingRate studentParkingRate14 = new strategy.StudentParkingRate();
        double double16 = studentParkingRate14.calculateRate((double) 1.0f);
        boolean boolean17 = credentials12.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials12);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials12, "");
        boolean boolean21 = client8.equals((java.lang.Object) credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials12", credentials3.equals(credentials12) ? credentials3.hashCode() == credentials12.hashCode() : true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("JoNIi]ebC");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("iWoSR5k!H", "G4X2M+Ju@");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials7, "(O3fsOXXJ");
        model.user.Student student12 = new model.user.Student(credentials7, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Student student14 = new model.user.Student(credentials7, "Parking Lot 97 is already enabled.");
        model.user.Student student16 = new model.user.Student(credentials7, "vY6VGU&EC");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student12 and student14", student12.equals(student14) ? student12.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository7 = userService0.userRepository;
        boolean boolean9 = userService0.isStrongPassword("WsR_[hRm]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("wMB&=eDYD", "2g]O0QGM)");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        boolean boolean9 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        boolean boolean11 = userService0.isValidEmail("&eLd?)dY$");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.getUserByEmail("jWLPJXvyC");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("Success: Parking Space -1 has been disabled.");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        java.util.List<model.user.User> userList2 = userRepository1.getUsers();
        repo.UserRepository userRepository3 = new repo.UserRepository();
        model.user.Credentials credentials7 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user8 = new model.user.User(credentials7);
        userRepository3.addUser(user8);
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials13, "hi!");
        model.user.Credentials credentials17 = nonFacultyStaff16.getCredentials();
        model.user.Client client18 = new model.user.Client(credentials17);
        model.user.Manager manager19 = new model.user.Manager(credentials17);
        userRepository3.addUser((model.user.User) manager19);
        manager19.validateAccount();
        model.user.Credentials credentials22 = manager19.getCredentials();
        userRepository1.addUser((model.user.User) manager19);
        model.user.Credentials credentials27 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str28 = credentials27.getPassword();
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials27, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        facultyMember31.setFacultyName("Credentials{login='hi!', password='hi!', type='hi!'}");
        facultyMember31.validateAccount();
        userRepository1.removeUser((model.user.User) facultyMember31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials13 and credentials27", credentials13.equals(credentials27) ? credentials13.hashCode() == credentials27.hashCode() : true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllBookings();
        java.lang.String str16 = clientServices0.enableParkingSpaceById(35, (int) (short) -1);
        java.lang.String str19 = clientServices0.getParkingSpaceById((int) 'a', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = clientServices0.cancenlBooking((int) (short) 100);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isValidEmail("SuperManager");
        boolean boolean8 = userService0.isValidEmail("");
        model.user.Client client12 = new model.user.Client("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "(j1+k0)lO", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         There is no Such Parking Lot'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = userService0.registerUser((model.user.User) client12);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("3OjMI%ePF");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
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
        java.util.Date date15 = booking0.getEndDateTime();
        java.lang.String str16 = booking0.getStatus();
        booking0.setCost(15.0d);
        java.lang.String str19 = booking0.getLicensePlate();
        int int20 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = booking0.getTotalCost();
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   Give Id for parking Space is wrong'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.Student student11 = new model.user.Student(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student11", student10.equals(student11) ? student10.hashCode() == student11.hashCode() : true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        repo.UserRepository userRepository12 = userService0.userRepository;
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        boolean boolean16 = userService0.isValidEmail("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user18 = userService0.getUserByEmail("mYV!Wkz9*");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean15 = userService0.isValidEmail("Success: Parking Space -1 has been disabled.");
        repo.UserRepository userRepository16 = userService0.userRepository;
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.toString();
        model.user.Visitor visitor23 = new model.user.Visitor(credentials20);
        java.lang.String str24 = credentials20.toString();
        model.user.User user25 = model.user.UserFactory.createAccount(credentials20);
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials20, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.booking.Booking booking29 = new model.booking.Booking();
        int int30 = booking29.getStartTime();
        booking29.setEndTime((int) (short) 10);
        java.lang.String str33 = booking29.getEmail();
        java.lang.String str34 = booking29.toString();
        boolean boolean35 = credentials20.equals((java.lang.Object) booking29);
        model.user.FacultyMember facultyMember36 = new model.user.FacultyMember(credentials20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository16.updateUser((model.user.User) facultyMember36);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("Av+-nN6Nu");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("X!w_%8nHT");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("t3=jyxeE5");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getType();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        model.user.Client client12 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client8 and client12", client8.equals(client12) ? client8.hashCode() == client12.hashCode() : true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Student student9 = new model.user.Student(credentials7, "There is no Such Parking Lot");
        java.lang.String str10 = credentials7.getPassword();
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.Client client12 = new model.user.Client(credentials7);
        model.user.User user13 = model.user.UserFactory.createAccount(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client11 and client12", client11.equals(client12) ? client11.hashCode() == client12.hashCode() : true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.setFacultyName("Parking Lot 97 is already disabled.");
        repo.RepositoryProvider repositoryProvider15 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository16 = repositoryProvider15.getBookingRepository();
        repo.UserRepository userRepository17 = repositoryProvider15.getUserRepository();
        repo.UserRepository userRepository18 = repositoryProvider15.getUserRepository();
        boolean boolean19 = facultyMember11.equals((java.lang.Object) userRepository18);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        java.lang.String str25 = credentials23.getType();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository18.updateUser((model.user.User) visitor26);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) '#', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList5 = clientServices0.getAllUsersBookings("Wd_kK(d(K");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        java.lang.String str9 = credentials7.getPassword();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials15);
        model.user.Client client17 = new model.user.Client(credentials15);
        java.lang.String str18 = credentials15.getLogin();
        boolean boolean19 = credentials7.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials15", credentials7.equals(credentials15) ? credentials7.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        model.user.Credentials credentials3 = new model.user.Credentials("", "Parking Space 97 is already disabled.", "Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
        model.user.Visitor visitor4 = new model.user.Visitor(credentials3);
        model.user.Student student6 = new model.user.Student(credentials3, "t3=jyxeE5");
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Lot 1 has been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        java.lang.String str10 = nonFacultyStaff9.getRole();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff8 and nonFacultyStaff9", nonFacultyStaff8.equals(nonFacultyStaff9) ? nonFacultyStaff8.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.lang.String str13 = clientServices0.enableParkingSpaceById((int) 'a', 0);
        model.parking.ParkingLot parkingLot15 = clientServices0.getParkingLotByAddress("b0K0Td]sJ");
        java.lang.String str18 = clientServices0.enableParkingSpaceById(100, 1);
        java.util.List<model.booking.Booking> bookingList19 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList20 = clientServices0.getAllBookings();
        boolean boolean23 = clientServices0.updateBooking((int) (short) -1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = clientServices0.cancenlBooking((int) '#');
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking((int) '#', (int) (short) 0);
        java.util.List<java.lang.String> strList10 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = clientServices0.cancenlBooking(10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("n69?7)[Al");
        repo.UserRepository userRepository8 = userService0.userRepository;
        repo.UserRepository userRepository9 = new repo.UserRepository();
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials13);
        facultyMember14.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str17 = facultyMember14.getFacultyId();
        userRepository9.addUser((model.user.User) facultyMember14);
        java.lang.String str19 = facultyMember14.getFacultyName();
        java.lang.String str20 = facultyMember14.getFacultyId();
        facultyMember14.setFacultyName("Student");
        model.parking.ParkingSpace parkingSpace24 = new model.parking.ParkingSpace((int) ' ');
        model.booking.Booking booking25 = new model.booking.Booking();
        int int26 = booking25.getStartTime();
        booking25.setEndTime((int) (short) 10);
        java.lang.String str29 = booking25.getEmail();
        booking25.setCost((double) (byte) 0);
        parkingSpace24.setBooking(booking25);
        model.sensor.Sensor sensor33 = parkingSpace24.getSensor();
        boolean boolean34 = parkingSpace24.getStatus();
        boolean boolean35 = facultyMember14.equals((java.lang.Object) boolean34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository8.updateUser((model.user.User) facultyMember14);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        java.util.List<model.user.User> userList10 = userRepository3.getUsers();
        java.util.List<model.user.User> userList11 = userRepository3.getUsers();
        java.util.List<model.user.User> userList12 = userRepository3.getUsers();
        model.user.User user16 = new model.user.User("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "X5G?ZJ!c@", "Parking Space 1 is already disabled.");
        userRepository3.addUser(user16);
        model.user.Credentials credentials21 = new model.user.Credentials("Credentials{login='hi!', password='hi!', type='hi!'}", "Success: Parking Lot 100 has been disabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Visitor visitor22 = new model.user.Visitor(credentials21);
        userRepository3.addUser((model.user.User) visitor22);
        model.user.Credentials credentials27 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials27);
        java.lang.String str29 = facultyMember28.getFacultyId();
        java.lang.String str30 = facultyMember28.getFacultyId();
        facultyMember28.setFacultyName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) facultyMember28);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("VdrdR[gzY");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("%IlXqo&_Y");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember12", facultyMember11.equals(facultyMember12) ? facultyMember11.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isValidEmail("ngy(gkqsc");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setId(0);
        booking6.setEmail("Student");
        boolean boolean11 = clientServices0.updateCompleteBooking(booking6);
        boolean boolean14 = clientServices0.updateBooking((-87), 52);
        java.lang.String str17 = clientServices0.getParkingSpaceById((int) '4', (int) '#');
        boolean boolean19 = clientServices0.cancenlBooking((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList21 = clientServices0.getAllUsersBookings("3AJB9R!TA");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = superManagerServices0.isValidEmail("Parking Lot 1 is already enabled.");
        java.lang.String str11 = superManagerServices0.generateRandomEmail();
        boolean boolean13 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getLogin();
        strategy.StudentParkingRate studentParkingRate19 = new strategy.StudentParkingRate();
        double double21 = studentParkingRate19.calculateRate((double) 1.0f);
        boolean boolean22 = credentials17.equals((java.lang.Object) 1.0f);
        model.user.User user23 = new model.user.User(credentials17);
        model.user.Student student24 = new model.user.Student(credentials17);
        student24.setStudentId("Parking Lot 100 is already enabled.");
        repo.RepositoryProvider repositoryProvider27 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository28 = repositoryProvider27.getBookingRepository();
        repo.BookingRepository bookingRepository29 = repositoryProvider27.getBookingRepository();
        repo.UserRepository userRepository30 = repositoryProvider27.getUserRepository();
        repo.BookingRepository bookingRepository31 = repositoryProvider27.getBookingRepository();
        boolean boolean32 = student24.equals((java.lang.Object) repositoryProvider27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = superManagerServices0.createAccount((model.user.User) student24);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "&eLd?)dY$", "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        model.user.Student student16 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember15", facultyMember12.equals(facultyMember15) ? facultyMember12.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        java.lang.String str9 = superManagerServices0.generateRandomEmail();
        boolean boolean11 = superManagerServices0.isValidEmail("");
        java.lang.String str12 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials16 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager17 = new model.user.Manager(credentials16);
        model.user.Visitor visitor18 = new model.user.Visitor(credentials16);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials16);
        nonFacultyStaff19.setRole("UGdx6wsC*");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff19);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) (byte) 100);
        int int5 = booking0.getTotalHours();
        int int6 = booking0.getSpaceId();
        java.lang.String str7 = booking0.getLicensePlate();
        int int8 = booking0.getStartTime();
        java.lang.String str9 = booking0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = booking0.getTotalCost();
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        model.user.Credentials credentials3 = new model.user.Credentials("Parking Space 1 is already disabled.", "X?EhgrKDV", "Success: Parking Lot -1 has been disabled.");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        java.lang.String str9 = facultyMember8.getFacultyId();
        facultyMember8.setFacultyId("hi!");
        facultyMember8.setFacultyName("hi!");
        java.lang.String str14 = facultyMember8.getFacultyId();
        userRepository3.addUser((model.user.User) facultyMember8);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        java.lang.String str21 = credentials19.toString();
        model.user.Visitor visitor22 = new model.user.Visitor(credentials19);
        visitor22.validateAccount();
        userRepository3.removeUser((model.user.User) visitor22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials19", credentials7.equals(credentials19) ? credentials7.hashCode() == credentials19.hashCode() : true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "X?EhgrKDV");
        model.user.Student student9 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff8", nonFacultyStaff6.equals(nonFacultyStaff8) ? nonFacultyStaff6.hashCode() == nonFacultyStaff8.hashCode() : true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.getType();
        model.user.Student student8 = new model.user.Student(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3, "gH7ICSj!r");
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        repo.UserRepository userRepository0 = new repo.UserRepository();
        model.user.Credentials credentials4 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user5 = new model.user.User(credentials4);
        userRepository0.addUser(user5);
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials10, "hi!");
        model.user.Credentials credentials14 = nonFacultyStaff13.getCredentials();
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.Manager manager16 = new model.user.Manager(credentials14);
        userRepository0.addUser((model.user.User) manager16);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        java.lang.String str23 = credentials21.getType();
        java.lang.String str24 = credentials21.toString();
        java.lang.String str25 = credentials21.getLogin();
        model.user.User user26 = model.user.UserFactory.createAccount(credentials21);
        java.lang.String str27 = credentials21.getPassword();
        model.user.Student student29 = new model.user.Student(credentials21, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Manager manager30 = new model.user.Manager(credentials21);
        userRepository0.removeUser((model.user.User) manager30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials10 and credentials21", credentials10.equals(credentials21) ? credentials10.hashCode() == credentials21.hashCode() : true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
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
        booking9.setId((int) (short) 10);
        java.lang.String str24 = booking9.getEmail();
        booking9.setLicensePlate("SBu-sSijR");
        java.lang.String str27 = booking9.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double28 = booking9.getTotalCost();
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        boolean boolean14 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        model.user.Client client18 = new model.user.Client("Success: Parking Space 0 has been enabled.", "Parking Lot 100 is already enabled.", "=B3fAbMGq");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) client18);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.User user12 = new model.user.User(credentials7);
        model.user.Manager manager13 = new model.user.Manager(credentials7);
        model.user.Credentials credentials14 = manager13.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager11 and manager13", manager11.equals(manager13) ? manager11.hashCode() == manager13.hashCode() : true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("", "b0K0Td]sJ");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "nN*du?GVX", "Parking Space 32 is already disabled.");
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "FacultyMember");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember6 and facultyMember9", facultyMember6.equals(facultyMember9) ? facultyMember6.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("#SD_4Mfd)");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository5 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository7 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository8 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository9 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository10 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str15 = credentials14.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials14, "hi!");
        java.lang.String str18 = credentials14.getPassword();
        model.user.Visitor visitor19 = new model.user.Visitor(credentials14);
        java.lang.String str20 = credentials14.toString();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials14);
        userRepository10.removeUser((model.user.User) nonFacultyStaff21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff17 and nonFacultyStaff21", nonFacultyStaff17.equals(nonFacultyStaff21) ? nonFacultyStaff17.hashCode() == nonFacultyStaff21.hashCode() : true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isStrongPassword("success");
        boolean boolean5 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           10.0\nstatus         null'\nemail        Parking Space 35 is already enabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        java.lang.String str7 = superManagerServices0.generateRandomEmail();
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials12 = new model.user.Credentials("X5G?ZJ!c@", "Success: Parking Space 10 has been disabled.", "l@=7Kn[?f");
        model.user.Visitor visitor13 = new model.user.Visitor(credentials12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = superManagerServices0.createAccount((model.user.User) visitor13);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.User user12 = new model.user.User(credentials3);
        java.lang.String str13 = credentials3.getLogin();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials3, "Parking Space 97 is already disabled.", "Success: Parking Space 1 has been enabled.");
        model.user.Student student18 = new model.user.Student(credentials3, "Success: Parking Space 0 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember16", facultyMember11.equals(facultyMember16) ? facultyMember11.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.booking.Booking booking13 = new model.booking.Booking();
        int int14 = booking13.getStartTime();
        booking13.setEndTime((int) (short) 10);
        java.lang.String str17 = booking13.getEmail();
        booking13.setCost((double) (byte) 0);
        int int20 = booking13.getLotId();
        booking13.setEndTime((int) (short) 100);
        java.lang.String str23 = booking13.getEmail();
        java.util.Date date24 = booking13.getStartDateTime();
        java.lang.String str25 = booking13.getLicensePlate();
        boolean boolean26 = clientServices0.bookParkingSpace(booking13);
        model.booking.Booking booking27 = new model.booking.Booking();
        int int28 = booking27.getStartTime();
        booking27.setEndTime((int) (short) 10);
        booking27.setCost((double) (short) 100);
        int int33 = booking27.getSpaceId();
        java.util.Date date34 = booking27.getStartDateTime();
        booking27.setStartTime((int) (byte) 0);
        boolean boolean37 = clientServices0.updateCompleteBooking(booking27);
        boolean boolean40 = clientServices0.updateBooking((int) (byte) -1, (-1));
        java.lang.String str43 = clientServices0.disableParkingSpaceById(0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList45 = clientServices0.getAllUsersBookings("(Sh$=Nmu9");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "Success: Parking Space 100 has been disabled.");
        nonFacultyStaff10.setRole(")%cW5iUd)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("k_mu%h)Pk");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.BookingRepository bookingRepository6 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository8 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository9 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository10 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        java.lang.String str16 = facultyMember15.getFacultyId();
        java.lang.String str17 = facultyMember15.getFacultyId();
        facultyMember15.setFacultyName("");
        java.lang.String str20 = facultyMember15.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository10.updateUser((model.user.User) facultyMember15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        java.lang.String str6 = credentials3.getType();
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "", "Student");
        model.user.Student student13 = new model.user.Student(credentials11, "Success: Parking Lot 100 has been disabled.");
        java.lang.String str14 = credentials11.getType();
        boolean boolean15 = credentials3.equals((java.lang.Object) credentials11);
        model.user.Manager manager16 = new model.user.Manager(credentials3);
        model.user.Manager manager17 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager5 and manager16", manager5.equals(manager16) ? manager5.hashCode() == manager16.hashCode() : true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        double double10 = booking0.getCost();
        java.util.Date date11 = booking0.getDate();
        java.util.Date date12 = booking0.getDate();
        java.util.Date date13 = booking0.getStartDateTime();
        java.util.Date date14 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        client7.validateAccount();
        model.user.Credentials credentials9 = client7.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials9);
        java.lang.String str12 = credentials9.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor10 and visitor11", visitor10.equals(visitor11) ? visitor10.hashCode() == visitor11.hashCode() : true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
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
        java.lang.String str15 = booking0.getStatus();
        booking0.setStatus("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = booking0.getTotalCost();
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.booking.Booking booking3 = new model.booking.Booking();
        int int4 = booking3.getStartTime();
        booking3.setEndTime((int) (short) 10);
        booking3.setCost((double) (short) 100);
        booking3.setStatus("Student");
        boolean boolean11 = clientServices0.bookParkingSpace(booking3);
        java.util.List<model.booking.Booking> bookingList12 = clientServices0.getAllBookings();
        boolean boolean15 = clientServices0.updateBooking(32, 100);
        java.util.List<java.lang.String> strList16 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList18 = clientServices0.getAllUsersBookings("Parking Lot 35 is already enabled.");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.User user14 = new model.user.User(credentials11);
        java.lang.String str15 = credentials11.getType();
        model.user.Student student16 = new model.user.Student(credentials11);
        model.user.Student student18 = new model.user.Student(credentials11, "gH7ICSj!r");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) student18);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Student student14 = new model.user.Student(credentials8, "Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        java.lang.String str10 = superManagerServices0.generateStrongPassword();
        boolean boolean12 = superManagerServices0.isValidEmail("l@=7Kn[?f");
        boolean boolean14 = superManagerServices0.isStrongPassword("A%v5&YzsA");
        model.user.Credentials credentials18 = new model.user.Credentials("pUdP465**", "", "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials18, "\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff20);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isValidEmail("OOyw(kS=+");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        java.lang.String str16 = credentials11.getPassword();
        java.lang.String str17 = credentials11.getType();
        model.user.Student student18 = new model.user.Student(credentials11);
        java.lang.String str19 = credentials11.getLogin();
        java.lang.String str20 = credentials11.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials11, "Success: Parking Space 100 has been disabled.");
        java.lang.String str23 = nonFacultyStaff22.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = userService0.registerUser((model.user.User) nonFacultyStaff22);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        java.lang.String str12 = clientServices0.getParkingSpaceById(100, 100);
        java.lang.String str15 = clientServices0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        java.lang.String str18 = clientServices0.getParkingSpaceById(1, 97);
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getStartTime();
        booking19.setEndTime((int) (short) 10);
        booking19.setCost((double) (short) 100);
        int int25 = booking19.getSpaceId();
        java.util.Date date26 = booking19.getStartDateTime();
        booking19.setCost((double) '4');
        java.lang.String str29 = booking19.toString();
        java.util.Date date30 = booking19.getStartDateTime();
        boolean boolean31 = clientServices0.updateCompleteBooking(booking19);
        boolean boolean34 = clientServices0.updateBooking((int) 'a', (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = clientServices0.cancenlBooking((int) (byte) 100);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.getType();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials3);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Credentials credentials11 = visitor10.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff13 = new model.user.NonFacultyStaff(credentials11, "Parking Space 35 is already enabled.");
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials11, "*a[AnW&Y-");
        java.lang.String str16 = credentials11.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff13 and nonFacultyStaff15", nonFacultyStaff13.equals(nonFacultyStaff15) ? nonFacultyStaff13.hashCode() == nonFacultyStaff15.hashCode() : true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean9 = userService0.isValidEmail("Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        boolean boolean11 = userService0.isValidEmail("gH7ICSj!r");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.loginUser("Parking Space 100 is already enabled.", "Success: Parking Space 97 has been enabled.");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
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
        model.user.Student student17 = new model.user.Student(credentials14, "X?EhgrKDV");
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials14);
        model.user.NonFacultyStaff nonFacultyStaff20 = new model.user.NonFacultyStaff(credentials14, "Credentials{login='hi!', password='hi!', type='hi!'}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember18", facultyMember10.equals(facultyMember18) ? facultyMember10.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        java.util.Date date11 = booking4.getEndDateTime();
        booking4.setId(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking4.getTotalCost();
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("");
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Client client11 = new model.user.Client("Parking Lot -1 is already enabled.", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = userService0.registerUser((model.user.User) client11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been enabled.");
        boolean boolean8 = userService0.isStrongPassword("Y%XCkmT1Q");
        services.UserService userService9 = new services.UserService();
        boolean boolean11 = userService9.isValidEmail("SuperManager");
        repo.UserRepository userRepository12 = userService9.userRepository;
        repo.RepositoryProvider repositoryProvider13 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository14 = repositoryProvider13.getBookingRepository();
        repo.UserRepository userRepository15 = repositoryProvider13.getUserRepository();
        model.user.Credentials credentials19 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user20 = new model.user.User(credentials19);
        userRepository15.addUser(user20);
        userRepository12.removeUser(user20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser(user20);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        model.booking.Booking booking9 = clientServices0.getBookingById(97);
        model.booking.Booking booking11 = clientServices0.getBookingById((int) 'a');
        java.lang.String str14 = clientServices0.getParkingSpaceById((int) (short) 1, (int) (byte) 10);
        model.parking.ParkingSpace parkingSpace16 = new model.parking.ParkingSpace((int) '#');
        parkingSpace16.setStatus(true);
        boolean boolean19 = parkingSpace16.getStatus();
        model.booking.Booking booking20 = new model.booking.Booking();
        int int21 = booking20.getStartTime();
        booking20.setEndTime((int) (short) 10);
        java.lang.String str24 = booking20.getEmail();
        booking20.setCost((double) (byte) 0);
        int int27 = booking20.getLotId();
        booking20.setCost((double) 100L);
        parkingSpace16.setBooking(booking20);
        int int31 = booking20.getLotId();
        double double32 = booking20.getCost();
        java.util.Date date33 = booking20.getStartDateTime();
        booking20.setId((-87));
        boolean boolean36 = clientServices0.updateCompleteBooking(booking20);
        model.booking.Booking booking38 = clientServices0.getBookingById(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList40 = clientServices0.getAllUsersBookings("e!aihgp[(");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.util.Date date10 = booking0.getEndDateTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking0.getTotalCost();
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Student student12 = new model.user.Student(credentials3);
        model.user.Credentials credentials13 = student12.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student12", student11.equals(student12) ? student11.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("SfsE&rZb@");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials3, "FacultyMember", "Success: Parking Space -1 has been disabled.");
        model.user.Student student20 = new model.user.Student(credentials3, "Success: Parking Lot -87 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember18", facultyMember11.equals(facultyMember18) ? facultyMember11.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean6 = superManagerServices0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        boolean boolean8 = superManagerServices0.isValidEmail("");
        boolean boolean10 = superManagerServices0.isStrongPassword("");
        boolean boolean12 = superManagerServices0.isValidEmail("Rg2)djJx]");
        java.lang.String str13 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.getType();
        java.lang.String str20 = credentials17.toString();
        java.lang.String str21 = credentials17.getLogin();
        model.user.User user22 = model.user.UserFactory.createAccount(credentials17);
        java.lang.String str23 = credentials17.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials17);
        nonFacultyStaff24.setRole("Success: Parking Lot 100 has been disabled.");
        java.lang.String str27 = nonFacultyStaff24.getRole();
        nonFacultyStaff24.setRole("]cT(-?mBj");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff24);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3, "");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Success: Parking Lot -1 has been enabled.", "OZs%xojGf");
        java.lang.String str15 = facultyMember14.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember14", facultyMember9.equals(facultyMember14) ? facultyMember9.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
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
        java.lang.String str23 = credentials21.getType();
        java.lang.String str24 = credentials21.toString();
        java.lang.String str25 = credentials21.getLogin();
        model.user.User user26 = model.user.UserFactory.createAccount(credentials21);
        java.lang.String str27 = credentials21.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff28 = new model.user.NonFacultyStaff(credentials21);
        nonFacultyStaff28.setRole("users.json");
        nonFacultyStaff28.setRole("NonFacultyStaff");
        java.lang.String str33 = nonFacultyStaff28.getRole();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) nonFacultyStaff28);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("=syRIr=H*");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.Object obj7 = null;
        boolean boolean8 = credentials3.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("85WGol)r-");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Success: Parking Space 97 has been disabled.", "users.json");
        model.user.Student student4 = new model.user.Student(credentials3);
        model.user.Student student5 = new model.user.Student(credentials3);
        java.lang.String str6 = credentials3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student4 and student5", student4.equals(student5) ? student4.hashCode() == student5.hashCode() : true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser("", "a%aS=LeNP");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        model.parking.ParkingSpace parkingSpace11 = new model.parking.ParkingSpace((int) (byte) 0);
        parkingSpace11.setSpaceID(0);
        boolean boolean14 = credentials3.equals((java.lang.Object) parkingSpace11);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3);
        java.lang.String str16 = facultyMember15.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember15", facultyMember9.equals(facultyMember15) ? facultyMember9.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.lang.String str14 = clientServices0.getParkingSpaceById(0, (-1));
        model.booking.Booking booking16 = clientServices0.getBookingById((int) (byte) -1);
        java.lang.String str19 = clientServices0.disableParkingSpaceById((int) '4', 101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = clientServices0.cancenlBooking(101);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        model.parking.ParkingLot parkingLot4 = clientServices0.getParkingLotByAddress("Parking Space 35 is already enabled.");
        java.util.List<java.lang.String> strList5 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = clientServices0.cancenlBooking((int) (byte) -1);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("ZIt(w3LM]");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        model.user.SuperManager superManager0 = model.user.SuperManager.getInstance();
        superManager0.validateAccount();
        model.user.Credentials credentials2 = superManager0.getCredentials();
        model.user.Student student3 = new model.user.Student(credentials2);
        model.parking.ParkingSpace parkingSpace5 = new model.parking.ParkingSpace((int) '#');
        model.sensor.Sensor sensor6 = parkingSpace5.getSensor();
        model.sensor.Sensor sensor7 = parkingSpace5.getSensor();
        java.lang.String str8 = parkingSpace5.disableParkingSpace();
        boolean boolean9 = parkingSpace5.hasBooking();
        int int10 = parkingSpace5.getSpaceID();
        boolean boolean11 = credentials2.equals((java.lang.Object) parkingSpace5);
        model.user.Student student12 = new model.user.Student(credentials2);
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student3 and student12", student3.equals(student12) ? student3.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
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
        student13.setStudentId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         Student'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student10 and student13", student10.equals(student13) ? student10.hashCode() == student13.hashCode() : true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        model.user.SuperManager superManager0 = model.user.SuperManager.getInstance();
        model.user.Credentials credentials1 = superManager0.getCredentials();
        model.user.FacultyMember facultyMember2 = new model.user.FacultyMember(credentials1);
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials1, "YmYm%?Lqy", "?qqRirU!a");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember2 and facultyMember5", facultyMember2.equals(facultyMember5) ? facultyMember2.hashCode() == facultyMember5.hashCode() : true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.toString();
        java.util.Date date11 = booking0.getDate();
        java.lang.String str12 = booking0.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.Manager manager9 = new model.user.Manager(credentials7);
        java.lang.String str10 = credentials7.getLogin();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials7);
        java.lang.String str12 = credentials7.getType();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials7, "ngy(gkqsc");
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials7, "qS46Qm6yT", ")ISBucDm-");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff14", nonFacultyStaff6.equals(nonFacultyStaff14) ? nonFacultyStaff6.hashCode() == nonFacultyStaff14.hashCode() : true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Parking Lot -1 is already enabled.");
        model.user.Visitor visitor15 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) (short) 1, (int) '#');
        java.lang.String str12 = clientServices0.enableParkingSpaceById((int) ' ', 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList14 = clientServices0.getAllUsersBookings("Parking Lot -1 is already enabled.");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList4 = userRepository3.getUsers();
        model.user.Credentials credentials8 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials8, "Parking Space 35 is already enabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "Manager");
        model.user.Student student15 = new model.user.Student(credentials8);
        userRepository3.removeUser((model.user.User) student15);
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials20);
        model.user.User user23 = new model.user.User(credentials20);
        model.user.Credentials credentials24 = user23.getCredentials();
        model.user.Student student26 = new model.user.Student(credentials24, "There is no Such Parking Lot");
        java.lang.String str27 = credentials24.getPassword();
        model.user.Client client28 = new model.user.Client(credentials24);
        model.user.Client client29 = new model.user.Client(credentials24);
        userRepository3.removeUser((model.user.User) client29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client28 and client29", client28.equals(client29) ? client28.hashCode() == client29.hashCode() : true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Credentials credentials14 = new model.user.Credentials("Rg2)djJx]", "A%v5&YzsA", "Av+-nN6Nu");
        boolean boolean15 = nonFacultyStaff10.equals((java.lang.Object) credentials14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff10", nonFacultyStaff6.equals(nonFacultyStaff10) ? nonFacultyStaff6.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        facultyMember8.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember8.validateAccount();
        facultyMember8.setFacultyName("NonFacultyStaff");
        model.user.Credentials credentials15 = facultyMember8.getCredentials();
        java.lang.String str16 = credentials15.getLogin();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        java.lang.String str18 = facultyMember17.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember17", facultyMember8.equals(facultyMember17) ? facultyMember8.hashCode() == facultyMember17.hashCode() : true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Manager manager12 = new model.user.Manager(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      1\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        (O3fsOXXJ");
        student14.setStudentId("SfsE&rZb@");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("Tb[mUCNRL");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.loginUser("tb=I*k6#)", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   '\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.util.List<model.booking.Booking> bookingList4 = clientServices0.getAllBookings();
        java.lang.String str7 = clientServices0.disableParkingSpaceById(0, (int) (short) 0);
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-1), (int) 'a');
        java.util.List<java.lang.String> strList11 = clientServices0.getAllLocations();
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        java.util.List<model.booking.Booking> bookingList13 = clientServices0.getAllBookings();
        java.lang.String str16 = clientServices0.enableParkingSpaceById(35, (int) (short) -1);
        java.lang.String str19 = clientServices0.getParkingSpaceById(99, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList21 = clientServices0.getAllUsersBookings("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isValidEmail("=B3fAbMGq");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        java.lang.String str18 = credentials13.getPassword();
        model.user.Client client19 = new model.user.Client(credentials13);
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials13, "AAwYnzN!e");
        model.user.User user22 = new model.user.User(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = userService0.registerUser(user22);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.getParkingSpaceById(0, 10);
        model.booking.Booking booking7 = clientServices0.getBookingById((int) '4');
        java.lang.String str10 = clientServices0.enableParkingSpaceById((-87), (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = clientServices0.cancenlBooking(52);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        java.lang.String str5 = facultyMember4.getFacultyId();
        facultyMember4.validateAccount();
        model.user.Credentials credentials7 = facultyMember4.getCredentials();
        model.user.Student student8 = new model.user.Student(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7, "-hW9I6iG0");
        java.lang.String str11 = student10.getStudentId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student8 and student10", student8.equals(student10) ? student8.hashCode() == student10.hashCode() : true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("%g-0ycn?9");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getLogin();
        strategy.StudentParkingRate studentParkingRate10 = new strategy.StudentParkingRate();
        double double12 = studentParkingRate10.calculateRate((double) 1.0f);
        boolean boolean13 = credentials8.equals((java.lang.Object) 1.0f);
        model.user.User user14 = new model.user.User(credentials8);
        model.user.Client client15 = new model.user.Client(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) client15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("\nid             10\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
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
        java.util.List<model.user.User> userList18 = userRepository0.getUsers();
        model.user.Credentials credentials22 = new model.user.Credentials("Student", "=B3fAbMGq", "AAwYnzN!e");
        model.user.Manager manager23 = new model.user.Manager(credentials22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository0.updateUser((model.user.User) manager23);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        java.lang.String str12 = credentials3.toString();
        java.lang.String str13 = credentials3.getPassword();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials3);
        java.lang.String str15 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor14", visitor6.equals(visitor14) ? visitor6.hashCode() == visitor14.hashCode() : true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEndTime((int) (short) 100);
        java.lang.String str10 = booking0.getEmail();
        java.util.Date date11 = booking0.getStartDateTime();
        java.lang.String str12 = booking0.getLicensePlate();
        java.lang.String str13 = booking0.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.parking.ParkingLot parkingLot14 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = clientServices0.cancenlBooking(100);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.User user11 = new model.user.User("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null", "users.json", "Success: Parking Space 1 has been disabled.");
        user11.validateAccount();
        userRepository7.removeUser(user11);
        repo.RepositoryProvider repositoryProvider14 = new repo.RepositoryProvider();
        repo.UserRepository userRepository15 = repositoryProvider14.getUserRepository();
        java.util.List<model.user.User> userList16 = userRepository15.getUsers();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str21 = credentials20.getPassword();
        java.lang.String str22 = credentials20.getType();
        model.user.FacultyMember facultyMember25 = new model.user.FacultyMember(credentials20, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember25.setFacultyId("NonFacultyStaff");
        userRepository15.addUser((model.user.User) facultyMember25);
        model.user.Credentials credentials29 = facultyMember25.getCredentials();
        facultyMember25.setFacultyName("R14et$0r@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository7.updateUser((model.user.User) facultyMember25);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "hi!", "Success: Parking Lot 32 has been disabled.");
        model.user.Client client12 = new model.user.Client(credentials3);
        java.lang.String str13 = credentials3.getType();
        model.user.NonFacultyStaff nonFacultyStaff15 = new model.user.NonFacultyStaff(credentials3, "Parking Lot 97 is already disabled.");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3);
        model.user.User user17 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff15 and nonFacultyStaff16", nonFacultyStaff15.equals(nonFacultyStaff16) ? nonFacultyStaff15.hashCode() == nonFacultyStaff16.hashCode() : true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("Parking Space 32 is already enabled.");
        boolean boolean7 = userService0.isValidEmail("&jn[e]&j%");
        boolean boolean9 = userService0.isStrongPassword("Success: Parking Space 32 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.loginUser("There is no Such Parking Lot", ")r1bQiJUq");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        java.lang.String str7 = credentials3.getPassword();
        model.user.User user8 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        nonFacultyStaff9.setRole("A9lHMeJ%f");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        java.lang.String str8 = credentials3.toString();
        model.user.Manager manager9 = new model.user.Manager(credentials3);
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3);
        model.user.User user11 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "WsR_[hRm]", "(j1+k0)lO");
        java.lang.String str15 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember10 and facultyMember14", facultyMember10.equals(facultyMember14) ? facultyMember10.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        model.booking.Booking booking6 = clientServices0.getBookingById((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = clientServices0.cancenlBooking((int) (short) 1);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials3, "wl(koPNa!", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.lang.String str11 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember10", facultyMember7.equals(facultyMember10) ? facultyMember7.hashCode() == facultyMember10.hashCode() : true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        java.lang.String str10 = booking0.getLicensePlate();
        java.lang.String str11 = booking0.toString();
        int int12 = booking0.getSpaceId();
        double double13 = booking0.getCost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = booking0.getTotalCost();
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        boolean boolean3 = userService0.isValidEmail("]Q8Qq1gv4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user5 = userService0.getUserByEmail("y)_UMnETd");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        java.lang.String str8 = credentials3.toString();
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        java.lang.String str10 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember9", facultyMember7.equals(facultyMember9) ? facultyMember7.hashCode() == facultyMember9.hashCode() : true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        model.user.User user10 = new model.user.User("Y%XCkmT1Q", "Visitor", "?WmF)ske8");
        user10.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository6.updateUser(user10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        java.util.List<model.user.User> userList4 = userRepository3.getUsers();
        java.util.List<model.user.User> userList5 = userRepository3.getUsers();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.toString();
        java.lang.String str14 = credentials9.getPassword();
        java.lang.String str15 = credentials9.getType();
        model.user.Student student16 = new model.user.Student(credentials9);
        model.user.Credentials credentials17 = student16.getCredentials();
        java.lang.String str18 = student16.getStudentId();
        userRepository3.removeUser((model.user.User) student16);
        model.user.Credentials credentials23 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str24 = credentials23.getPassword();
        java.lang.String str25 = credentials23.toString();
        model.user.Visitor visitor26 = new model.user.Visitor(credentials23);
        visitor26.validateAccount();
        boolean boolean28 = visitor26.getValidationStatus();
        boolean boolean30 = visitor26.equals((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository3.updateUser((model.user.User) visitor26);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isValidEmail("B7Q7?T8bL");
        java.lang.String str14 = superManagerServices0.generateStrongPassword();
        model.user.User user18 = new model.user.User("Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}", "Success: Parking Space 97 has been disabled.", "Success: Parking Lot -87 has been enabled.");
        model.user.Credentials credentials22 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str23 = credentials22.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials22, "hi!");
        model.user.Credentials credentials26 = nonFacultyStaff25.getCredentials();
        model.user.Client client27 = new model.user.Client(credentials26);
        java.lang.String str28 = credentials26.getPassword();
        model.user.FacultyMember facultyMember29 = new model.user.FacultyMember(credentials26);
        model.user.Manager manager30 = new model.user.Manager(credentials26);
        model.user.User user31 = new model.user.User(credentials26);
        user31.validateAccount();
        boolean boolean33 = user18.equals((java.lang.Object) user31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = superManagerServices0.createAccount(user18);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("2G(xw=hcj");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("O*Ctm)%!R");
        boolean boolean9 = userService0.isStrongPassword("Parking Space 100 is already enabled.");
        model.user.Credentials credentials13 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str14 = credentials13.getPassword();
        java.lang.String str15 = credentials13.toString();
        model.user.Visitor visitor16 = new model.user.Visitor(credentials13);
        java.lang.String str17 = credentials13.toString();
        java.lang.String str18 = credentials13.getPassword();
        model.user.Client client19 = new model.user.Client(credentials13);
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials13, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials13);
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = userService0.registerUser((model.user.User) facultyMember23);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isValidEmail("HcpxBjAE]");
        boolean boolean14 = userService0.isStrongPassword("Success: Parking Lot 97 has been disabled.");
        repo.UserRepository userRepository15 = userService0.userRepository;
        repo.UserRepository userRepository16 = userService0.userRepository;
        model.user.Credentials credentials20 = new model.user.Credentials("QhLFPQ#PO", "WsR_[hRm]", "q?fu1zARj");
        model.user.Student student21 = new model.user.Student(credentials20);
        model.user.FacultyMember facultyMember24 = new model.user.FacultyMember(credentials20, "iim*=oKjy", "nAVofek+=");
        java.lang.String str25 = facultyMember24.getFacultyName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = userService0.registerUser((model.user.User) facultyMember24);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        model.user.Credentials credentials3 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Success: Parking Space 100 has been disabled.");
        model.user.Client client7 = new model.user.Client(credentials3);
        client7.validateAccount();
        model.user.Credentials credentials9 = client7.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.Visitor visitor11 = new model.user.Visitor(credentials9);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor10 and visitor11", visitor10.equals(visitor11) ? visitor10.hashCode() == visitor11.hashCode() : true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.Client client5 = new model.user.Client(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.getPassword();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("wC0@&+)[5", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        model.user.Credentials credentials3 = new model.user.Credentials("TZ[Ra9=4U", "Success: Parking Space 10 has been enabled.", "B7Q7?T8bL");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Manager manager5 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "j-PRzL&Qa");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager4 and manager5", manager4.equals(manager5) ? manager4.hashCode() == manager5.hashCode() : true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Visitor visitor7 = new model.user.Visitor(credentials3);
        java.lang.String str8 = credentials3.getPassword();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3, "(O3fsOXXJ", "Success: Parking Space 100 has been disabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials3, "Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}", "YAFUIs1L_");
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        java.lang.String str7 = credentials3.toString();
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember8", facultyMember5.equals(facultyMember8) ? facultyMember5.hashCode() == facultyMember8.hashCode() : true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isValidEmail("ngy(gkqsc");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user16 = userService0.loginUser("NbCVxJ1h3", "Success: Parking Lot 10 has been disabled.");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        java.lang.String str9 = credentials7.getPassword();
        model.user.FacultyMember facultyMember10 = new model.user.FacultyMember(credentials7);
        model.user.Manager manager11 = new model.user.Manager(credentials7);
        model.user.User user12 = new model.user.User(credentials7);
        model.user.Manager manager13 = new model.user.Manager(credentials7);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager11 and manager13", manager11.equals(manager13) ? manager11.hashCode() == manager13.hashCode() : true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        booking0.setCost((double) (short) 100);
        int int6 = booking0.getSpaceId();
        java.util.Date date7 = booking0.getStartDateTime();
        booking0.setCost((double) '4');
        int int10 = booking0.getEndTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = booking0.getTotalCost();
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean6 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.toString();
        model.user.Visitor visitor13 = new model.user.Visitor(credentials10);
        java.lang.String str14 = credentials10.toString();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials10, "Student", "Manager");
        facultyMember17.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str20 = facultyMember17.getFacultyId();
        model.user.Credentials credentials21 = facultyMember17.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = userService0.registerUser((model.user.User) facultyMember17);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user4 = userService0.getUserByEmail("ARcmD%B)!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials3, "&eLd?)dY$", "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember12 and facultyMember15", facultyMember12.equals(facultyMember15) ? facultyMember12.hashCode() == facultyMember15.hashCode() : true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3, "=K*eY67RK");
        model.user.Student student6 = new model.user.Student(credentials3);
        boolean boolean7 = student6.getValidationStatus();
        model.booking.Booking booking8 = new model.booking.Booking();
        int int9 = booking8.getStartTime();
        booking8.setEndTime((int) (short) 10);
        java.lang.String str12 = booking8.getEmail();
        booking8.setCost((double) (byte) 0);
        int int15 = booking8.getLotId();
        booking8.setEmail("Manager");
        java.lang.String str18 = booking8.getLicensePlate();
        java.lang.String str19 = booking8.toString();
        java.util.Date date20 = booking8.getEndDateTime();
        double double21 = booking8.getCost();
        java.util.Date date22 = booking8.getDate();
        boolean boolean23 = student6.equals((java.lang.Object) booking8);
        int int24 = booking8.getTotalHours();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = booking8.getTotalCost();
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been disabled.");
        boolean boolean8 = userService0.isValidEmail("Success: Parking Space -90 has been disabled.");
        boolean boolean10 = userService0.isStrongPassword("o2RaN4]aM");
        model.user.Credentials credentials14 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember15 = new model.user.FacultyMember(credentials14);
        model.user.Client client16 = new model.user.Client(credentials14);
        model.user.Student student17 = new model.user.Student(credentials14);
        student17.setStudentId("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        student17.setStudentId("NonFacultyStaff");
        java.lang.String str22 = student17.getStudentId();
        student17.setStudentId("ngy(gkqsc");
        student17.setStudentId("cZ=IAx!!l");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = userService0.registerUser((model.user.User) student17);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.getParkingSpaceById((int) (short) 1, 100);
        boolean boolean9 = clientServices0.updateBooking(35, (int) (byte) 0);
        java.lang.String str12 = clientServices0.getParkingSpaceById(0, (int) (short) 100);
        java.lang.String str15 = clientServices0.enableParkingSpaceById((int) (short) 0, (int) (short) -1);
        java.lang.String str18 = clientServices0.enableParkingSpaceById(35, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking(1);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("(O3fsOXXJ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("qS46Qm6yT", "6Yob(8CyM");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      100\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.getUserByEmail("");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 1 has been enabled.");
        repo.UserRepository userRepository7 = userService0.userRepository;
        boolean boolean9 = userService0.isStrongPassword("Success: Parking Space 100 has been enabled.");
        repo.RepositoryProvider repositoryProvider10 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository11 = repositoryProvider10.getBookingRepository();
        repo.UserRepository userRepository12 = repositoryProvider10.getUserRepository();
        model.user.Credentials credentials16 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user17 = new model.user.User(credentials16);
        userRepository12.addUser(user17);
        services.UserService userService19 = new services.UserService();
        boolean boolean21 = userService19.isValidEmail("SuperManager");
        repo.UserRepository userRepository22 = userService19.userRepository;
        model.user.Credentials credentials26 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember27 = new model.user.FacultyMember(credentials26);
        userRepository22.addUser((model.user.User) facultyMember27);
        facultyMember27.setFacultyName("Parking Space 32 is already enabled.");
        facultyMember27.validateAccount();
        boolean boolean32 = user17.equals((java.lang.Object) facultyMember27);
        facultyMember27.setFacultyName("Give Id for parking Space is wrong");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = userService0.registerUser((model.user.User) facultyMember27);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        repo.UserRepository userRepository4 = userService0.userRepository;
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        repo.UserRepository userRepository7 = userService0.userRepository;
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials11);
        model.user.Student student14 = new model.user.Student(credentials11);
        model.user.Manager manager15 = new model.user.Manager(credentials11);
        model.user.User user16 = new model.user.User(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = userService0.registerUser(user16);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList2 = userRepository1.getUsers();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        java.lang.String str8 = credentials6.getType();
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials6, "FacultyMember", "Success: Parking Space 97 has been disabled.");
        facultyMember11.setFacultyId("NonFacultyStaff");
        userRepository1.addUser((model.user.User) facultyMember11);
        model.user.Credentials credentials15 = facultyMember11.getCredentials();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials15, "qS46Qm6yT", "l)d9[%+Se");
        model.user.User user19 = model.user.UserFactory.createAccount(credentials15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember18", facultyMember11.equals(facultyMember18) ? facultyMember11.hashCode() == facultyMember18.hashCode() : true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.setRole("");
        model.user.Credentials credentials9 = nonFacultyStaff6.getCredentials();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials9);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials9);
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials9, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str15 = credentials9.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember11 and facultyMember14", facultyMember11.equals(facultyMember14) ? facultyMember11.hashCode() == facultyMember14.hashCode() : true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        java.lang.String str13 = credentials8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("There is no Such Parking Lot");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 35 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("O[zT&cj2B", "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean4 = userService0.isValidEmail("&jn[e]&j%");
        repo.UserRepository userRepository5 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user7 = userService0.getUserByEmail("?)iViwJ?y");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
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
        model.user.Student student14 = new model.user.Student(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff10 and nonFacultyStaff13", nonFacultyStaff10.equals(nonFacultyStaff13) ? nonFacultyStaff10.hashCode() == nonFacultyStaff13.hashCode() : true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        model.user.Credentials credentials3 = new model.user.Credentials("There is no Such Parking Lot", "", "Visitor");
        model.user.Client client4 = new model.user.Client(credentials3);
        repo.RepositoryProvider repositoryProvider5 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository6 = repositoryProvider5.getBookingRepository();
        repo.BookingRepository bookingRepository7 = repositoryProvider5.getBookingRepository();
        repo.BookingRepository bookingRepository8 = repositoryProvider5.getBookingRepository();
        repo.ParkingRepository parkingRepository9 = repositoryProvider5.getParkingRepository();
        repo.UserRepository userRepository10 = repositoryProvider5.getUserRepository();
        repo.ParkingRepository parkingRepository11 = repositoryProvider5.getParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList12 = parkingRepository11.getAllParkingLots();
        boolean boolean13 = credentials3.equals((java.lang.Object) parkingLotList12);
        java.lang.String str14 = credentials3.getLogin();
        model.user.Client client15 = new model.user.Client(credentials3);
        boolean boolean16 = client15.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client4 and client15", client4.equals(client15) ? client4.hashCode() == client15.hashCode() : true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "", "Student");
        model.user.Student student5 = new model.user.Student(credentials3, "Success: Parking Lot 100 has been disabled.");
        java.lang.String str6 = credentials3.getType();
        model.user.Student student7 = new model.user.Student(credentials3);
        model.user.Visitor visitor8 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student5 and student7", student5.equals(student7) ? student5.hashCode() == student7.hashCode() : true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("Success: Parking Space 1 has been disabled.");
        boolean boolean4 = userService0.isStrongPassword("Parking Lot 100 is already enabled.");
        boolean boolean6 = userService0.isValidEmail("Parking Space 1 is already enabled.");
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str11 = credentials10.getPassword();
        java.lang.String str12 = credentials10.getType();
        java.lang.String str13 = credentials10.toString();
        java.lang.String str14 = credentials10.getLogin();
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials10, "Credentials{login='Manager', password='Success: Parking Space 0 has been disabled.', type='Success: Parking Lot 32 has been disabled.'}");
        model.user.Student student17 = new model.user.Student(credentials10);
        model.user.Manager manager18 = new model.user.Manager(credentials10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) manager18);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("Nn#x&lKqI");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        model.user.SuperManager superManager0 = model.user.SuperManager.getInstance();
        superManager0.validateAccount();
        model.user.Credentials credentials2 = superManager0.getCredentials();
        model.user.NonFacultyStaff nonFacultyStaff4 = new model.user.NonFacultyStaff(credentials2, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.User user5 = new model.user.User(credentials2);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials2, "2F6u)Wp7=");
        nonFacultyStaff7.setRole("E5K3y!$ma");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff4 and nonFacultyStaff7", nonFacultyStaff4.equals(nonFacultyStaff7) ? nonFacultyStaff4.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean15 = userService0.isValidEmail("Success: Parking Space -1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user18 = userService0.loginUser("JCxG$C6qS", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        boolean boolean9 = userService0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        repo.UserRepository userRepository10 = userService0.userRepository;
        model.user.Credentials credentials14 = new model.user.Credentials("Parking Space 1 is already disabled.", "X?EhgrKDV", "Success: Parking Lot -1 has been disabled.");
        model.user.Student student16 = new model.user.Student(credentials14, "&jn[e]&j%");
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
        java.lang.String str35 = booking17.toString();
        booking17.setId((-87));
        boolean boolean38 = student16.equals((java.lang.Object) booking17);
        java.lang.String str39 = student16.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository10.updateUser((model.user.User) student16);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        boolean boolean12 = userService0.isStrongPassword("1bR(76zCD");
        repo.UserRepository userRepository13 = userService0.userRepository;
        repo.UserRepository userRepository14 = userService0.userRepository;
        model.user.Client client18 = new model.user.Client("Success: Parking Lot 97 has been disabled.", "Success: Parking Lot 97 has been disabled.", "Credentials{login='hi!', password='hi!', type='hi!'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = userService0.registerUser((model.user.User) client18);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        java.lang.String str7 = superManagerServices0.generateStrongPassword();
        boolean boolean9 = superManagerServices0.isValidEmail("");
        boolean boolean11 = superManagerServices0.isValidEmail("9Sphra6hZ");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials15);
        model.user.User user18 = new model.user.User(credentials15);
        model.user.Credentials credentials19 = user18.getCredentials();
        model.user.Client client20 = new model.user.Client(credentials19);
        model.user.Credentials credentials21 = client20.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = superManagerServices0.createAccount((model.user.User) client20);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isStrongPassword("success");
        boolean boolean10 = superManagerServices0.isStrongPassword("NbCVxJ1h3");
        model.user.User user14 = new model.user.User(")CAoHm8t(", "Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = superManagerServices0.createAccount(user14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
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
        boolean boolean15 = clientServices0.cancenlBooking(99);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("p]lfxGl&]");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.Visitor visitor11 = new model.user.Visitor(credentials8);
        model.user.Student student13 = new model.user.Student(credentials8, "users.json");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8);
        facultyMember14.setFacultyId("Success: Parking Space 97 has been enabled.");
        userRepository4.removeUser((model.user.User) facultyMember14);
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.getPassword();
        java.lang.String str23 = credentials21.toString();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials21);
        java.lang.String str25 = credentials21.toString();
        model.user.FacultyMember facultyMember28 = new model.user.FacultyMember(credentials21, "Student", "Manager");
        facultyMember28.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember28.validateAccount();
        model.user.Credentials credentials32 = facultyMember28.getCredentials();
        java.lang.String str33 = credentials32.getType();
        model.user.Student student35 = new model.user.Student(credentials32, "X?EhgrKDV");
        model.user.Visitor visitor36 = new model.user.Visitor(credentials32);
        userRepository4.addUser((model.user.User) visitor36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials8 and credentials21", credentials8.equals(credentials21) ? credentials8.hashCode() == credentials21.hashCode() : true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff7 = new model.user.NonFacultyStaff(credentials3, "%Xsf91eG]");
        model.user.User user8 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff5 and nonFacultyStaff7", nonFacultyStaff5.equals(nonFacultyStaff7) ? nonFacultyStaff5.hashCode() == nonFacultyStaff7.hashCode() : true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Success: Parking Lot 32 has been disabled.");
        services.UserService userService13 = new services.UserService();
        boolean boolean15 = userService13.isValidEmail("SuperManager");
        boolean boolean17 = userService13.isStrongPassword("SuperManager");
        boolean boolean19 = userService13.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean21 = userService13.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository22 = userService13.userRepository;
        java.util.List<model.user.User> userList23 = userRepository22.getUsers();
        java.util.List<model.user.User> userList24 = userRepository22.getUsers();
        model.user.Credentials credentials28 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str29 = credentials28.getPassword();
        java.lang.String str30 = credentials28.toString();
        model.user.User user31 = new model.user.User(credentials28);
        java.lang.String str32 = credentials28.getType();
        model.user.FacultyMember facultyMember35 = new model.user.FacultyMember(credentials28, "Parking Space -1 is already enabled.", "Parking Lot 100 is already enabled.");
        facultyMember35.setFacultyName("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        userRepository22.removeUser((model.user.User) facultyMember35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = userService0.registerUser((model.user.User) facultyMember35);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        repo.UserRepository userRepository11 = userService0.userRepository;
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        java.lang.String str19 = credentials15.toString();
        model.user.FacultyMember facultyMember22 = new model.user.FacultyMember(credentials15, "Student", "Manager");
        facultyMember22.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember22.validateAccount();
        model.user.Credentials credentials26 = facultyMember22.getCredentials();
        java.lang.String str27 = credentials26.getType();
        model.user.Student student29 = new model.user.Student(credentials26, "X?EhgrKDV");
        model.user.Visitor visitor30 = new model.user.Visitor(credentials26);
        userRepository11.removeUser((model.user.User) visitor30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor18 and visitor30", visitor18.equals(visitor30) ? visitor18.hashCode() == visitor30.hashCode() : true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.User user7 = new model.user.User(credentials3);
        model.user.Client client8 = new model.user.Client(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on user6 and user7", user6.equals(user7) ? user6.hashCode() == user7.hashCode() : true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        java.lang.String str9 = credentials3.getType();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials3);
        model.user.Student student12 = new model.user.Student(credentials3, "Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
        model.user.Student student14 = new model.user.Student(credentials3, "OOyw(kS=+");
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        java.lang.String str20 = credentials18.toString();
        model.user.Visitor visitor21 = new model.user.Visitor(credentials18);
        java.lang.String str22 = credentials18.toString();
        java.lang.String str23 = credentials18.getPassword();
        java.lang.String str24 = credentials18.toString();
        java.lang.String str25 = credentials18.toString();
        model.user.NonFacultyStaff nonFacultyStaff27 = new model.user.NonFacultyStaff(credentials18, "There is no Such Parking Lot");
        model.user.Student student28 = new model.user.Student(credentials18);
        model.user.NonFacultyStaff nonFacultyStaff30 = new model.user.NonFacultyStaff(credentials18, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean31 = credentials3.equals((java.lang.Object) credentials18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials18", credentials3.equals(credentials18) ? credentials3.hashCode() == credentials18.hashCode() : true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.Client client12 = new model.user.Client("Student", "zKZEsst)6", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = superManagerServices0.createAccount((model.user.User) client12);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("U&p5$DL%w");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        repo.UserRepository userRepository6 = userService0.userRepository;
        boolean boolean8 = userService0.isValidEmail("Success: Parking Lot -1 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user11 = userService0.loginUser(")ISBucDm-", "Failure: Parking Space 100 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("NonFacultyStaff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("9z6wsHuxQ");
        repo.UserRepository userRepository14 = userService0.userRepository;
        repo.UserRepository userRepository15 = userService0.userRepository;
        repo.UserRepository userRepository16 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user19 = userService0.loginUser("X5G?ZJ!c@", "Parking Lot 1 is already enabled.");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = userService0.isStrongPassword("success");
        repo.UserRepository userRepository11 = userService0.userRepository;
        boolean boolean13 = userService0.isStrongPassword("NonFacultyStaff");
        boolean boolean15 = userService0.isValidEmail("Success: Parking Space -1 has been disabled.");
        repo.UserRepository userRepository16 = userService0.userRepository;
        boolean boolean18 = userService0.isStrongPassword("K#3J1MLbd");
        model.user.Credentials credentials22 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str23 = credentials22.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials22, "hi!");
        model.user.Credentials credentials26 = nonFacultyStaff25.getCredentials();
        model.user.Client client27 = new model.user.Client(credentials26);
        model.user.Manager manager28 = new model.user.Manager(credentials26);
        java.lang.String str29 = credentials26.getType();
        java.lang.String str30 = credentials26.getLogin();
        model.user.Student student31 = new model.user.Student(credentials26);
        java.lang.String str32 = student31.getStudentId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = userService0.registerUser((model.user.User) student31);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.parking.ParkingLot parkingLot5 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str8 = clientServices0.getParkingSpaceById(32, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList10 = clientServices0.getAllUsersBookings("Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials9, "hi!");
        java.lang.String str13 = credentials9.getPassword();
        model.user.User user14 = new model.user.User(credentials9);
        userRepository5.addUser(user14);
        model.user.Credentials credentials19 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str20 = credentials19.getPassword();
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials19);
        model.user.User user22 = new model.user.User(credentials19);
        model.user.Credentials credentials23 = user22.getCredentials();
        model.user.Visitor visitor24 = new model.user.Visitor(credentials23);
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials23);
        nonFacultyStaff25.setRole("Success: Parking Lot 32 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) nonFacultyStaff25);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        model.booking.Booking booking0 = new model.booking.Booking();
        booking0.setStartTime((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = booking0.getTotalCost();
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        model.booking.Booking booking6 = new model.booking.Booking();
        booking6.setId(0);
        booking6.setEmail("Student");
        boolean boolean11 = clientServices0.updateCompleteBooking(booking6);
        boolean boolean14 = clientServices0.updateBooking((-87), 52);
        model.booking.Booking booking15 = new model.booking.Booking();
        booking15.setId(0);
        booking15.setEmail("Student");
        java.util.Date date20 = booking15.getStartDateTime();
        booking15.setId((int) (byte) 100);
        boolean boolean23 = clientServices0.bookParkingSpace(booking15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList25 = clientServices0.getAllUsersBookings("tR8u?H)I*");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        java.util.Date date5 = booking0.getStartDateTime();
        int int6 = booking0.getTotalHours();
        int int7 = booking0.getId();
        int int8 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = booking0.getTotalCost();
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        boolean boolean9 = userService0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean11 = userService0.isStrongPassword("fnoK1s5im");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user14 = userService0.loginUser("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Parking Lot 100 is already enabled.", "Success: Parking Space 35 has been disabled.");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Credentials credentials8 = nonFacultyStaff6.getCredentials();
        model.user.User user9 = model.user.UserFactory.createAccount(credentials8);
        model.user.User user10 = new model.user.User(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials8, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        nonFacultyStaff12.setRole("QJSFqJ6_M");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff12", nonFacultyStaff6.equals(nonFacultyStaff12) ? nonFacultyStaff6.hashCode() == nonFacultyStaff12.hashCode() : true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isStrongPassword("Success: Parking Lot -1 has been disabled.");
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        java.lang.String str16 = credentials11.getPassword();
        model.user.Client client17 = new model.user.Client(credentials11);
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials11, "\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = superManagerServices0.createAccount((model.user.User) facultyMember20);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.Student student12 = new model.user.Student(credentials3);
        student12.setStudentId("E5K3y!$ma");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student12", student11.equals(student12) ? student11.hashCode() == student12.hashCode() : true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        model.user.Student student14 = new model.user.Student(credentials3, "Credentials{login='Success: Parking Lot 100 has been disabled.', password='X5G?ZJ!c@', type='Parking Lot 97 is already enabled.'}");
        java.lang.String str15 = credentials3.getLogin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student11 and student14", student11.equals(student14) ? student11.hashCode() == student14.hashCode() : true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        nonFacultyStaff6.validateAccount();
        nonFacultyStaff6.setRole("9IG1CMQkh");
        repo.RepositoryProvider repositoryProvider10 = new repo.RepositoryProvider();
        repo.UserRepository userRepository11 = repositoryProvider10.getUserRepository();
        repo.BookingRepository bookingRepository12 = repositoryProvider10.getBookingRepository();
        repo.BookingRepository bookingRepository13 = repositoryProvider10.getBookingRepository();
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.getPassword();
        java.lang.String str19 = credentials17.toString();
        model.user.User user20 = new model.user.User(credentials17);
        repo.BookingRepository bookingRepository21 = new repo.BookingRepository();
        java.util.ArrayList<model.booking.Booking> bookingList22 = bookingRepository21.getAllBookings();
        repo.BookingRepository bookingRepository23 = new repo.BookingRepository();
        model.booking.Booking booking24 = new model.booking.Booking();
        int int25 = booking24.getStartTime();
        booking24.setEndTime((int) (short) 10);
        java.lang.String str28 = booking24.getEmail();
        model.booking.Booking booking29 = new model.booking.Booking();
        int int30 = booking29.getStartTime();
        booking29.setEndTime((int) (short) 10);
        java.lang.String str33 = booking29.getEmail();
        booking29.setCost((double) (byte) 0);
        model.booking.Booking booking36 = new model.booking.Booking();
        int int37 = booking36.getStartTime();
        int int38 = booking36.getId();
        booking36.setEndTime((int) 'a');
        model.booking.Booking booking41 = new model.booking.Booking();
        int int42 = booking41.getStartTime();
        booking41.setEndTime((int) (short) 10);
        java.lang.String str45 = booking41.getEmail();
        booking41.setCost((double) (byte) 0);
        int int48 = booking41.getLotId();
        booking41.setEmail("Manager");
        model.booking.Booking booking51 = new model.booking.Booking();
        int int52 = booking51.getStartTime();
        int int53 = booking51.getId();
        model.booking.Booking booking54 = new model.booking.Booking();
        int int55 = booking54.getStartTime();
        int int56 = booking54.getId();
        booking54.setEndTime((int) 'a');
        model.booking.Booking booking59 = new model.booking.Booking();
        int int60 = booking59.getStartTime();
        booking59.setEndTime((int) (short) 10);
        booking59.setCost((double) (short) 100);
        model.booking.Booking[] bookingArray65 = new model.booking.Booking[] { booking24, booking29, booking36, booking41, booking51, booking54, booking59 };
        java.util.ArrayList<model.booking.Booking> bookingList66 = new java.util.ArrayList<model.booking.Booking>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<model.booking.Booking>) bookingList66, bookingArray65);
        bookingRepository23.updateBookings((java.util.List<model.booking.Booking>) bookingList66);
        bookingRepository21.updateBookings((java.util.List<model.booking.Booking>) bookingList66);
        services.ClientServices clientServices70 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot72 = clientServices70.getParkingLotByAddress("");
        java.util.List<java.lang.String> strList73 = clientServices70.getAllLocations();
        java.util.List<model.booking.Booking> bookingList74 = clientServices70.getAllBookings();
        bookingRepository21.updateBookings(bookingList74);
        boolean boolean76 = credentials17.equals((java.lang.Object) bookingRepository21);
        java.util.ArrayList<model.booking.Booking> bookingList77 = bookingRepository21.getAllBookings();
        bookingRepository13.updateBookings((java.util.List<model.booking.Booking>) bookingList77);
        java.util.ArrayList<model.booking.Booking> bookingList79 = bookingRepository13.getAllBookings();
        boolean boolean80 = nonFacultyStaff6.equals((java.lang.Object) bookingList79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials17", credentials3.equals(credentials17) ? credentials3.hashCode() == credentials17.hashCode() : true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        model.user.User user7 = null;
        userRepository6.removeUser(user7);
        services.UserService userService9 = new services.UserService();
        repo.UserRepository userRepository10 = userService9.userRepository;
        repo.UserRepository userRepository11 = userService9.userRepository;
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        java.lang.String str19 = credentials15.toString();
        java.lang.String str20 = credentials15.getPassword();
        java.lang.String str21 = credentials15.getType();
        model.user.Student student22 = new model.user.Student(credentials15);
        model.user.Credentials credentials23 = student22.getCredentials();
        java.lang.String str24 = student22.getStudentId();
        userRepository11.removeUser((model.user.User) student22);
        userRepository6.addUser((model.user.User) student22);
        repo.UserRepository userRepository27 = new repo.UserRepository();
        model.user.Credentials credentials31 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials31);
        facultyMember32.setFacultyName("Parking Lot 97 is already enabled.");
        java.lang.String str35 = facultyMember32.getFacultyId();
        userRepository27.addUser((model.user.User) facultyMember32);
        java.lang.String str37 = facultyMember32.getFacultyName();
        java.lang.String str38 = facultyMember32.getFacultyId();
        facultyMember32.setFacultyName("Student");
        facultyMember32.setFacultyId("tZectvKdt");
        facultyMember32.setFacultyName("Failure: Parking Space 97 has active bookings. Parking Space has not been disabled.");
        userRepository6.addUser((model.user.User) facultyMember32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials15 and credentials31", credentials15.equals(credentials31) ? credentials15.hashCode() == credentials31.hashCode() : true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.lang.String str5 = clientServices0.disableParkingSpaceById((int) (byte) 0, (int) (byte) 100);
        java.util.List<java.lang.String> strList6 = clientServices0.getAllLocations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList8 = clientServices0.getAllUsersBookings("FkIdV)OtU");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff6 = new model.user.NonFacultyStaff(credentials3, "hi!");
        model.user.Credentials credentials7 = nonFacultyStaff6.getCredentials();
        model.user.Client client8 = new model.user.Client(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Student student10 = new model.user.Student(credentials7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff6 and nonFacultyStaff9", nonFacultyStaff6.equals(nonFacultyStaff9) ? nonFacultyStaff6.hashCode() == nonFacultyStaff9.hashCode() : true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        services.UserService userService0 = services.UserService.getInstance();
        repo.UserRepository userRepository1 = userService0.userRepository;
        boolean boolean3 = userService0.isStrongPassword("Success: Parking Lot 97 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user6 = userService0.loginUser("l=PztP**d", "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials6 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user7 = new model.user.User(credentials6);
        userRepository2.addUser(user7);
        java.util.List<model.user.User> userList9 = userRepository2.getUsers();
        model.user.Credentials credentials13 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "Parking Space 35 is already disabled.", "users.json");
        model.user.Client client14 = new model.user.Client(credentials13);
        userRepository2.addUser((model.user.User) client14);
        model.user.User user19 = new model.user.User("NonFacultyStaff", "success", "SBu-sSijR");
        userRepository2.addUser(user19);
        model.user.Credentials credentials24 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str25 = credentials24.getPassword();
        java.lang.String str26 = credentials24.toString();
        model.user.Visitor visitor27 = new model.user.Visitor(credentials24);
        java.lang.String str28 = credentials24.toString();
        model.user.FacultyMember facultyMember31 = new model.user.FacultyMember(credentials24, "Student", "Manager");
        java.lang.String str32 = facultyMember31.getFacultyName();
        java.lang.String str33 = facultyMember31.getFacultyId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository2.updateUser((model.user.User) facultyMember31);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        model.user.Visitor visitor8 = new model.user.Visitor(credentials7);
        services.UserService userService9 = new services.UserService();
        boolean boolean11 = userService9.isValidEmail("SuperManager");
        boolean boolean13 = userService9.isValidEmail("There is no Such Parking Lot");
        repo.UserRepository userRepository14 = userService9.userRepository;
        boolean boolean15 = visitor8.equals((java.lang.Object) userService9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user17 = userService9.getUserByEmail("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        boolean boolean7 = userService0.isStrongPassword("Parking Space 1 is already disabled.");
        boolean boolean9 = userService0.isStrongPassword("Parking Lot -1 is already enabled.");
        repo.UserRepository userRepository10 = userService0.userRepository;
        boolean boolean12 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository13 = userService0.userRepository;
        model.user.Credentials credentials17 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str18 = credentials17.toString();
        model.user.NonFacultyStaff nonFacultyStaff19 = new model.user.NonFacultyStaff(credentials17);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials17);
        userRepository13.removeUser((model.user.User) facultyMember20);
        repo.RepositoryProvider repositoryProvider22 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository23 = repositoryProvider22.getBookingRepository();
        repo.BookingRepository bookingRepository24 = repositoryProvider22.getBookingRepository();
        repo.BookingRepository bookingRepository25 = repositoryProvider22.getBookingRepository();
        repo.UserRepository userRepository26 = repositoryProvider22.getUserRepository();
        model.user.Credentials credentials30 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str31 = credentials30.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff33 = new model.user.NonFacultyStaff(credentials30, "hi!");
        model.user.Credentials credentials34 = nonFacultyStaff33.getCredentials();
        userRepository26.addUser((model.user.User) nonFacultyStaff33);
        java.lang.String str36 = nonFacultyStaff33.getRole();
        userRepository13.removeUser((model.user.User) nonFacultyStaff33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials17 and credentials30", credentials17.equals(credentials30) ? credentials17.hashCode() == credentials30.hashCode() : true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
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
        model.booking.Booking booking15 = clientServices0.getBookingById((int) 'a');
        java.lang.String str18 = clientServices0.disableParkingSpaceById((int) 'a', (int) (byte) 0);
        model.booking.Booking booking19 = new model.booking.Booking();
        int int20 = booking19.getEndTime();
        int int21 = booking19.getStartTime();
        booking19.setStatus("");
        int int24 = booking19.getId();
        java.util.Date date25 = booking19.getStartDateTime();
        boolean boolean26 = clientServices0.bookParkingSpace(booking19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = booking19.getTotalCost();
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        facultyMember6.setFacultyId("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           100.0\nstatus         null'\nemail        null");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        java.util.List<model.user.User> userList2 = userRepository1.getUsers();
        model.user.Credentials credentials6 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str7 = credentials6.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials6, "hi!");
        nonFacultyStaff9.setRole("");
        nonFacultyStaff9.setRole("hi!");
        nonFacultyStaff9.setRole("Success: Parking Lot 0 has been disabled.");
        userRepository1.addUser((model.user.User) nonFacultyStaff9);
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember21 = new model.user.FacultyMember(credentials20);
        facultyMember21.setFacultyName("Parking Lot 97 is already enabled.");
        facultyMember21.setFacultyName("Parking Lot 10 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository1.updateUser((model.user.User) facultyMember21);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        model.user.Student student8 = new model.user.Student(credentials3, "users.json");
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3);
        facultyMember9.setFacultyId("Success: Parking Space 97 has been enabled.");
        facultyMember9.setFacultyName("Av+-nN6Nu");
        model.user.Credentials credentials14 = facultyMember9.getCredentials();
        model.user.Client client15 = new model.user.Client(credentials14);
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials14);
        java.lang.String str17 = facultyMember16.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember9 and facultyMember16", facultyMember9.equals(facultyMember16) ? facultyMember9.hashCode() == facultyMember16.hashCode() : true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        boolean boolean15 = superManagerServices0.isValidEmail("&jn[e]&j%");
        model.user.Credentials credentials19 = new model.user.Credentials("Rg2)djJx]", "A%v5&YzsA", "Av+-nN6Nu");
        model.user.Student student21 = new model.user.Student(credentials19, "9z6wsHuxQ");
        student21.setStudentId(")ISBucDm-");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) student21);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        boolean boolean12 = userService0.isValidEmail("Parking Space -1 is already enabled.");
        boolean boolean14 = userService0.isValidEmail("Parking Space 100 is already disabled.");
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff21 = new model.user.NonFacultyStaff(credentials18, "hi!");
        nonFacultyStaff21.setRole("");
        nonFacultyStaff21.setRole("hi!");
        model.parking.ParkingSpace parkingSpace27 = new model.parking.ParkingSpace((int) '#');
        parkingSpace27.setSpaceID((int) 'a');
        java.lang.String str30 = parkingSpace27.disableParkingSpace();
        java.lang.String str31 = parkingSpace27.enableParkingSpace();
        boolean boolean32 = parkingSpace27.getStatus();
        parkingSpace27.setStatus(false);
        java.lang.String str35 = parkingSpace27.disableParkingSpace();
        java.lang.String str36 = parkingSpace27.enableParkingSpace();
        boolean boolean37 = nonFacultyStaff21.equals((java.lang.Object) str36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = userService0.registerUser((model.user.User) nonFacultyStaff21);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getLogin();
        strategy.StudentParkingRate studentParkingRate5 = new strategy.StudentParkingRate();
        double double7 = studentParkingRate5.calculateRate((double) 1.0f);
        boolean boolean8 = credentials3.equals((java.lang.Object) 1.0f);
        model.user.User user9 = new model.user.User(credentials3);
        model.user.Student student10 = new model.user.Student(credentials3);
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials3);
        java.lang.String str12 = credentials3.getPassword();
        java.lang.String str13 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff14 = new model.user.NonFacultyStaff(credentials3);
        model.user.Manager manager15 = new model.user.Manager(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff16 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember17 = new model.user.FacultyMember(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff14 and nonFacultyStaff16", nonFacultyStaff14.equals(nonFacultyStaff16) ? nonFacultyStaff14.hashCode() == nonFacultyStaff16.hashCode() : true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("Av+-nN6Nu");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        int int2 = booking0.getId();
        booking0.setEndTime((int) 'a');
        booking0.setEndTime((-1));
        int int7 = booking0.getId();
        java.util.Date date8 = booking0.getDate();
        double double9 = booking0.getCost();
        int int10 = booking0.getTotalHours();
        int int11 = booking0.getTotalHours();
        int int12 = booking0.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.getTotalCost();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember4 = new model.user.FacultyMember(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff5 = new model.user.NonFacultyStaff(credentials3);
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials3);
        java.lang.String str7 = credentials3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember4 and facultyMember6", facultyMember4.equals(facultyMember6) ? facultyMember4.hashCode() == facultyMember6.hashCode() : true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember7 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Give Id for parking Space is wrong");
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials3, "Parking Space 32 is already enabled.");
        java.lang.String str10 = credentials3.getType();
        java.lang.String str11 = credentials3.getLogin();
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials3);
        facultyMember12.setFacultyId("Success: Parking Lot 97 has been disabled.");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember7 and facultyMember12", facultyMember7.equals(facultyMember12) ? facultyMember7.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        model.booking.Booking booking4 = new model.booking.Booking();
        int int5 = booking4.getStartTime();
        booking4.setEndTime((int) (short) 10);
        java.lang.String str8 = booking4.getEmail();
        java.util.Date date9 = booking4.getStartDateTime();
        boolean boolean10 = clientServices0.bookParkingSpace(booking4);
        int int11 = booking4.getEndTime();
        int int12 = booking4.getId();
        booking4.setId(10);
        java.lang.String str15 = booking4.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = booking4.getTotalCost();
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        java.lang.String str8 = superManagerServices0.generateRandomEmail();
        java.lang.String str9 = superManagerServices0.generateStrongPassword();
        boolean boolean11 = superManagerServices0.isStrongPassword("Parking Space 35 is already enabled.");
        boolean boolean13 = superManagerServices0.isValidEmail("Success: Parking Space 35 has been disabled.");
        java.lang.String str14 = superManagerServices0.generateRandomEmail();
        java.lang.String str15 = superManagerServices0.generateRandomEmail();
        boolean boolean17 = superManagerServices0.isStrongPassword("NonFacultyStaff");
        model.user.Credentials credentials21 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str22 = credentials21.toString();
        model.user.NonFacultyStaff nonFacultyStaff23 = new model.user.NonFacultyStaff(credentials21);
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials21, "%Xsf91eG]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff25);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff9 = new model.user.NonFacultyStaff(credentials7);
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials7);
        model.user.Credentials credentials12 = nonFacultyStaff11.getCredentials();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff9 and nonFacultyStaff11", nonFacultyStaff9.equals(nonFacultyStaff11) ? nonFacultyStaff9.hashCode() == nonFacultyStaff11.hashCode() : true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        services.UserService userService0 = new services.UserService();
        model.user.Credentials credentials4 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str5 = credentials4.getPassword();
        model.user.FacultyMember facultyMember6 = new model.user.FacultyMember(credentials4);
        model.user.User user7 = new model.user.User(credentials4);
        model.user.Credentials credentials8 = user7.getCredentials();
        model.user.Visitor visitor9 = new model.user.Visitor(credentials8);
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = userService0.registerUser((model.user.User) nonFacultyStaff10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("yCFe[eRt(");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        java.lang.String str9 = credentials7.getPassword();
        model.user.Student student11 = new model.user.Student(credentials7, "NgoLYmWc!");
        model.user.Credentials credentials15 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str16 = credentials15.getPassword();
        java.lang.String str17 = credentials15.toString();
        model.user.Visitor visitor18 = new model.user.Visitor(credentials15);
        java.lang.String str19 = credentials15.toString();
        java.lang.String str20 = credentials15.getPassword();
        java.lang.String str21 = credentials15.toString();
        java.lang.String str22 = credentials15.toString();
        model.user.NonFacultyStaff nonFacultyStaff24 = new model.user.NonFacultyStaff(credentials15, "There is no Such Parking Lot");
        model.user.Student student25 = new model.user.Student(credentials15);
        boolean boolean26 = credentials7.equals((java.lang.Object) student25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials7 and credentials15", credentials7.equals(credentials15) ? credentials7.hashCode() == credentials15.hashCode() : true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("QrRHap4Y2");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        model.user.Credentials credentials3 = new model.user.Credentials("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student", "NonFacultyStaff", "Student");
        model.user.Manager manager4 = new model.user.Manager(credentials3);
        model.user.Visitor visitor5 = new model.user.Visitor(credentials3);
        model.user.Manager manager6 = new model.user.Manager(credentials3);
        model.booking.Booking booking7 = new model.booking.Booking();
        int int8 = booking7.getStartTime();
        java.util.Date date9 = booking7.getDate();
        boolean boolean10 = manager6.equals((java.lang.Object) date9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on manager4 and manager6", manager4.equals(manager6) ? manager4.hashCode() == manager6.hashCode() : true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("There is no Such Parking Lot");
        boolean boolean4 = userService0.isStrongPassword("Credentials{login='hi!', password='hi!', type='hi!'}");
        repo.UserRepository userRepository5 = userService0.userRepository;
        repo.UserRepository userRepository6 = userService0.userRepository;
        boolean boolean8 = userService0.isStrongPassword("Parking Space 100 is already disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.getUserByEmail("Failure: Parking Space -90 has active bookings. Parking Space has not been disabled.");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.UserRepository userRepository1 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository3 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository5 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository6 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials10 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember11 = new model.user.FacultyMember(credentials10);
        java.lang.String str12 = facultyMember11.getFacultyId();
        facultyMember11.setFacultyId("hi!");
        facultyMember11.setFacultyName("hi!");
        java.lang.String str17 = facultyMember11.getFacultyId();
        facultyMember11.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository6.updateUser((model.user.User) facultyMember11);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        services.UserService userService11 = new services.UserService();
        boolean boolean13 = userService11.isValidEmail("SuperManager");
        boolean boolean15 = userService11.isValidEmail("There is no Such Parking Lot");
        boolean boolean17 = userService11.isStrongPassword("Success: Parking Space 35 has been disabled.");
        boolean boolean19 = userService11.isStrongPassword("Success: Parking Space 10 has been disabled.");
        boolean boolean20 = credentials3.equals((java.lang.Object) userService11);
        model.user.Client client21 = new model.user.Client(credentials3);
        model.user.User user22 = new model.user.User(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on client9 and client21", client9.equals(client21) ? client9.hashCode() == client21.hashCode() : true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        model.parking.ParkingLot parkingLot2 = clientServices0.getParkingLotByAddress("");
        java.util.List<model.booking.Booking> bookingList3 = clientServices0.getAllBookings();
        java.lang.String str6 = clientServices0.disableParkingSpaceById(10, (int) (byte) 1);
        java.lang.String str9 = clientServices0.disableParkingSpaceById((int) 'a', (int) (short) 100);
        model.booking.Booking booking11 = clientServices0.getBookingById(100);
        java.util.List<java.lang.String> strList12 = clientServices0.getAllLocations();
        model.parking.ParkingLot parkingLot14 = clientServices0.getParkingLotByAddress("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           52.0\nstatus         null'\nemail        null");
        java.util.List<model.booking.Booking> bookingList15 = clientServices0.getAllBookings();
        java.lang.String str18 = clientServices0.disableParkingSpaceById(32, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = clientServices0.cancenlBooking((int) 'a');
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository2 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository3 = repositoryProvider0.getParkingRepository();
        repo.ParkingRepository parkingRepository4 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials9 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str10 = credentials9.getPassword();
        java.lang.String str11 = credentials9.toString();
        model.user.Visitor visitor12 = new model.user.Visitor(credentials9);
        java.lang.String str13 = credentials9.toString();
        model.user.FacultyMember facultyMember16 = new model.user.FacultyMember(credentials9, "Student", "Manager");
        facultyMember16.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        facultyMember16.validateAccount();
        model.user.Credentials credentials20 = facultyMember16.getCredentials();
        model.user.Client client21 = new model.user.Client(credentials20);
        model.user.Visitor visitor22 = new model.user.Visitor(credentials20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository5.updateUser((model.user.User) visitor22);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean6 = userService0.isStrongPassword("Success: Parking Space 1 has been enabled.");
        boolean boolean8 = userService0.isStrongPassword("Wd_kK(d(K");
        boolean boolean10 = userService0.isStrongPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("Success: Parking Space 32 has been disabled.", "B7Q7?T8bL");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        model.booking.Booking booking5 = new model.booking.Booking();
        int int6 = booking5.getStartTime();
        booking5.setEndTime((int) (short) 10);
        java.lang.String str9 = booking5.getEmail();
        booking5.setCost((double) (byte) 0);
        int int12 = booking5.getLotId();
        booking5.setEmail("Manager");
        double double15 = booking5.getCost();
        java.util.Date date16 = booking5.getDate();
        java.lang.String str17 = booking5.getStatus();
        boolean boolean18 = clientServices0.updateCompleteBooking(booking5);
        java.lang.String str21 = clientServices0.enableParkingSpaceById((int) (short) 100, 0);
        model.booking.Booking booking23 = clientServices0.getBookingById(32);
        model.booking.Booking booking25 = clientServices0.getBookingById(0);
        java.util.List<model.booking.Booking> bookingList26 = clientServices0.getAllBookings();
        java.lang.String str29 = clientServices0.disableParkingSpaceById(99, 11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = clientServices0.cancenlBooking((-87));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("l)d9[%+Se");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("Ss!n_uj18");
        boolean boolean13 = superManagerServices0.isValidEmail("lWu#FFEES");
        java.lang.String str14 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials18 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str19 = credentials18.getPassword();
        java.lang.String str20 = credentials18.toString();
        model.user.Visitor visitor21 = new model.user.Visitor(credentials18);
        java.lang.String str22 = credentials18.toString();
        java.lang.String str23 = credentials18.getPassword();
        java.lang.String str24 = credentials18.getType();
        model.user.Student student25 = new model.user.Student(credentials18);
        model.user.Credentials credentials26 = student25.getCredentials();
        model.user.Visitor visitor27 = new model.user.Visitor(credentials26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = superManagerServices0.createAccount((model.user.User) visitor27);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        java.lang.String str6 = credentials3.toString();
        java.lang.String str7 = credentials3.getLogin();
        model.user.User user8 = model.user.UserFactory.createAccount(credentials3);
        java.lang.String str9 = credentials3.getPassword();
        model.user.Student student11 = new model.user.Student(credentials3, "\nid             -1\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        100\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        model.booking.Booking booking12 = new model.booking.Booking();
        int int13 = booking12.getStartTime();
        booking12.setEndTime((int) (short) 10);
        java.lang.String str16 = booking12.getEmail();
        booking12.setCost((double) (byte) 0);
        int int19 = booking12.getLotId();
        booking12.setId((int) '#');
        java.lang.String str22 = booking12.getStatus();
        booking12.setId((int) (byte) 10);
        boolean boolean25 = credentials3.equals((java.lang.Object) booking12);
        services.ManagerServices managerServices26 = services.ManagerServices.getInstance();
        managerServices26.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList28 = managerServices26.getAllParkingLots();
        managerServices26.loadLots();
        services.ManagerServices managerServices30 = services.ManagerServices.getInstance();
        managerServices30.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList32 = managerServices30.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList33 = managerServices30.getAllParkingLots();
        managerServices26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList33);
        model.parking.ParkingLot parkingLot37 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        boolean boolean38 = parkingLot37.getStatus();
        java.lang.String str39 = parkingLot37.getLocation();
        parkingLot37.setLotID((-1));
        managerServices26.addParkingLot(parkingLot37);
        managerServices26.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList44 = managerServices26.getAllParkingLots();
        boolean boolean45 = credentials3.equals((java.lang.Object) managerServices26);
        services.ManagerServices managerServices46 = services.ManagerServices.getInstance();
        managerServices46.loadLots();
        managerServices46.loadLots();
        repo.RepositoryProvider repositoryProvider49 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository50 = repositoryProvider49.getBookingRepository();
        repo.UserRepository userRepository51 = repositoryProvider49.getUserRepository();
        model.user.Credentials credentials55 = new model.user.Credentials("Success: Parking Space 97 has been disabled.", "Success: Parking Space 97 has been enabled.", "Manager");
        model.user.User user56 = new model.user.User(credentials55);
        userRepository51.addUser(user56);
        model.user.Credentials credentials61 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str62 = credentials61.getPassword();
        java.lang.String str63 = credentials61.toString();
        model.user.Visitor visitor64 = new model.user.Visitor(credentials61);
        model.user.Client client65 = new model.user.Client(credentials61);
        model.user.Student student67 = new model.user.Student(credentials61, "Student");
        userRepository51.addUser((model.user.User) student67);
        repo.ParkingRepository parkingRepository69 = new repo.ParkingRepository();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList70 = parkingRepository69.getAllParkingLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList71 = parkingRepository69.getAllParkingLots();
        boolean boolean72 = student67.equals((java.lang.Object) parkingLotList71);
        managerServices46.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList71);
        services.ManagerServices managerServices74 = services.ManagerServices.getInstance();
        managerServices74.loadLots();
        managerServices74.loadLots();
        services.ManagerServices managerServices77 = services.ManagerServices.getInstance();
        managerServices77.loadLots();
        model.parking.ParkingLot parkingLot81 = new model.parking.ParkingLot((int) 'a', "NonFacultyStaff");
        java.lang.String str82 = parkingLot81.enableParkingLot();
        java.lang.String str83 = parkingLot81.enableParkingLot();
        managerServices77.addParkingLot(parkingLot81);
        boolean boolean85 = parkingLot81.getStatus();
        java.lang.String str86 = parkingLot81.getLocation();
        parkingLot81.setLotID((int) ' ');
        managerServices74.addParkingLot(parkingLot81);
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList90 = managerServices74.getAllParkingLots();
        managerServices74.loadLots();
        managerServices74.loadLots();
        java.util.ArrayList<model.parking.ParkingLot> parkingLotList93 = managerServices74.getAllParkingLots();
        managerServices46.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList93);
        services.ManagerServices.parkingLots = parkingLotList93;
        managerServices26.updateParkingLots((java.util.List<model.parking.ParkingLot>) parkingLotList93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials3 and credentials61", credentials3.equals(credentials61) ? credentials3.hashCode() == credentials61.hashCode() : true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isStrongPassword("]82UgsU=G");
        boolean boolean4 = userService0.isValidEmail("JoNIi]ebC");
        boolean boolean6 = userService0.isStrongPassword(")ISBucDm-");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user8 = userService0.getUserByEmail("Success: Parking Lot 1 has been disabled.");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isStrongPassword("SuperManager");
        boolean boolean6 = userService0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = userService0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean10 = userService0.isStrongPassword("Success: Parking Space 1 has been disabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user12 = userService0.getUserByEmail("Student");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository3 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository5 = repositoryProvider0.getUserRepository();
        repo.ParkingRepository parkingRepository6 = repositoryProvider0.getParkingRepository();
        repo.UserRepository userRepository7 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials11 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str12 = credentials11.getPassword();
        java.lang.String str13 = credentials11.toString();
        model.user.Visitor visitor14 = new model.user.Visitor(credentials11);
        java.lang.String str15 = credentials11.toString();
        model.user.FacultyMember facultyMember18 = new model.user.FacultyMember(credentials11, "Student", "Manager");
        facultyMember18.setFacultyId("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        java.lang.String str21 = facultyMember18.getFacultyId();
        model.user.Credentials credentials22 = facultyMember18.getCredentials();
        java.lang.String str23 = facultyMember18.getFacultyName();
        java.lang.String str24 = facultyMember18.getFacultyId();
        java.lang.String str25 = facultyMember18.getFacultyId();
        userRepository7.addUser((model.user.User) facultyMember18);
        model.user.Credentials credentials30 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str31 = credentials30.getPassword();
        model.user.FacultyMember facultyMember32 = new model.user.FacultyMember(credentials30);
        java.lang.String str33 = facultyMember32.getFacultyName();
        userRepository7.removeUser((model.user.User) facultyMember32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on credentials11 and credentials30", credentials11.equals(credentials30) ? credentials11.hashCode() == credentials30.hashCode() : true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        boolean boolean7 = userService0.isStrongPassword("Visitor");
        boolean boolean9 = userService0.isValidEmail("\nid             100\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean11 = userService0.isStrongPassword("fnoK1s5im");
        boolean boolean13 = userService0.isValidEmail("(j1+k0)lO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user15 = userService0.getUserByEmail("(y8mL(Wmr");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        java.lang.String str3 = superManagerServices0.generateRandomEmail();
        java.lang.String str4 = superManagerServices0.generateStrongPassword();
        boolean boolean6 = superManagerServices0.isValidEmail("Parking Lot 100 is already enabled.");
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        boolean boolean10 = superManagerServices0.isValidEmail("Parking Lot 1 is already enabled.");
        java.lang.String str11 = superManagerServices0.generateRandomEmail();
        boolean boolean13 = superManagerServices0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean15 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean17 = superManagerServices0.isStrongPassword("Ss!n_uj18");
        boolean boolean19 = superManagerServices0.isStrongPassword("Credentials{login='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student', password='NonFacultyStaff', type='Student'}");
        model.user.Credentials credentials23 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "X5G?ZJ!c@", "Parking Lot 97 is already enabled.");
        java.lang.String str24 = credentials23.toString();
        model.user.NonFacultyStaff nonFacultyStaff25 = new model.user.NonFacultyStaff(credentials23);
        model.user.Credentials credentials26 = nonFacultyStaff25.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff25);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        services.ClientServices clientServices0 = services.ClientServices.getInstance();
        boolean boolean3 = clientServices0.updateBooking((int) (byte) 100, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = clientServices0.getAllLocations();
        model.booking.Booking booking6 = clientServices0.getBookingById((int) ' ');
        java.lang.String str9 = clientServices0.getParkingSpaceById(100, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<model.booking.Booking> bookingList11 = clientServices0.getAllUsersBookings("Eb6Z4nkde");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isValidEmail("Give Id for parking Space is wrong");
        repo.UserRepository userRepository6 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user9 = userService0.loginUser("_-Xv@VX6U", "J=P4i&KFN");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        model.user.FacultyMember facultyMember5 = new model.user.FacultyMember(credentials3);
        model.user.User user6 = new model.user.User(credentials3);
        model.user.Credentials credentials7 = user6.getCredentials();
        java.lang.String str8 = credentials7.getPassword();
        java.lang.String str9 = credentials7.getPassword();
        model.user.Visitor visitor10 = new model.user.Visitor(credentials7);
        model.user.Client client11 = new model.user.Client(credentials7);
        model.user.FacultyMember facultyMember12 = new model.user.FacultyMember(credentials7);
        java.lang.String str13 = facultyMember12.getFacultyId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember5 and facultyMember12", facultyMember5.equals(facultyMember12) ? facultyMember5.hashCode() == facultyMember12.hashCode() : true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strategy.ParkingRateStrategy parkingRateStrategy1 = strategy.StrategyHandler.calculateCost("HcpxBjAE]");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        model.user.Client client9 = new model.user.Client(credentials3);
        java.lang.String str10 = credentials3.getPassword();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Visitor visitor12 = new model.user.Visitor(credentials3);
        boolean boolean13 = visitor12.getValidationStatus();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on visitor6 and visitor12", visitor6.equals(visitor12) ? visitor6.hashCode() == visitor12.hashCode() : true);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.FacultyMember facultyMember9 = new model.user.FacultyMember(credentials3, "Parking Lot 97 is already enabled.", "Wm(OGK*DZ");
        java.lang.String str10 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff11 = new model.user.NonFacultyStaff(credentials3);
        model.user.Student student13 = new model.user.Student(credentials3, "JOS[]AzcP");
        model.user.User user14 = model.user.UserFactory.createAccount(credentials3);
        model.user.Student student15 = new model.user.Student(credentials3);
        model.user.Visitor visitor16 = new model.user.Visitor(credentials3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on student13 and student15", student13.equals(student15) ? student13.hashCode() == student15.hashCode() : true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        java.lang.String str6 = superManagerServices0.generateRandomEmail();
        boolean boolean8 = superManagerServices0.isStrongPassword("\nid             35\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        null");
        boolean boolean10 = superManagerServices0.isValidEmail("Parking Space 100 is already enabled.");
        boolean boolean12 = superManagerServices0.isValidEmail("l)d9[%+Se");
        model.user.Credentials credentials16 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str17 = credentials16.getPassword();
        java.lang.String str18 = credentials16.toString();
        model.user.Visitor visitor19 = new model.user.Visitor(credentials16);
        java.lang.String str20 = credentials16.toString();
        model.user.FacultyMember facultyMember23 = new model.user.FacultyMember(credentials16, "Student", "Manager");
        facultyMember23.setFacultyId("Give Id for parking Space is wrong");
        java.lang.String str26 = facultyMember23.getFacultyName();
        facultyMember23.setFacultyName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = superManagerServices0.createAccount((model.user.User) facultyMember23);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        boolean boolean2 = superManagerServices0.isValidEmail("Success: Parking Space 97 has been enabled.");
        boolean boolean4 = superManagerServices0.isValidEmail("Parking Space 35 is already enabled.");
        boolean boolean6 = superManagerServices0.isStrongPassword("Give Id for parking Space is wrong");
        boolean boolean8 = superManagerServices0.isValidEmail("NonFacultyStaff");
        model.user.Credentials credentials12 = new model.user.Credentials("Rg2)djJx]", "A%v5&YzsA", "Av+-nN6Nu");
        model.user.Student student14 = new model.user.Student(credentials12, "9z6wsHuxQ");
        student14.validateAccount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = superManagerServices0.createAccount((model.user.User) student14);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        boolean boolean15 = superManagerServices0.isValidEmail("&jn[e]&j%");
        java.lang.String str16 = superManagerServices0.generateRandomEmail();
        model.user.Credentials credentials20 = new model.user.Credentials("Success: Parking Lot 100 has been disabled.", "X5G?ZJ!c@", "Parking Lot 97 is already enabled.");
        java.lang.String str21 = credentials20.toString();
        model.user.NonFacultyStaff nonFacultyStaff22 = new model.user.NonFacultyStaff(credentials20);
        model.user.Credentials credentials23 = nonFacultyStaff22.getCredentials();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) nonFacultyStaff22);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        boolean boolean4 = userService0.isValidEmail("users.json");
        boolean boolean6 = userService0.isValidEmail("HGL)]pX%+");
        repo.UserRepository userRepository7 = userService0.userRepository;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user10 = userService0.loginUser("n69?7)[Al", "A%v5&YzsA");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.getType();
        model.user.User user6 = new model.user.User(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff8 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        model.user.NonFacultyStaff nonFacultyStaff10 = new model.user.NonFacultyStaff(credentials3, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           0.0\nstatus         null'\nemail        Manager");
        nonFacultyStaff10.validateAccount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff8 and nonFacultyStaff10", nonFacultyStaff8.equals(nonFacultyStaff10) ? nonFacultyStaff8.hashCode() == nonFacultyStaff10.hashCode() : true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        repo.RepositoryProvider repositoryProvider0 = new repo.RepositoryProvider();
        repo.BookingRepository bookingRepository1 = repositoryProvider0.getBookingRepository();
        repo.BookingRepository bookingRepository2 = repositoryProvider0.getBookingRepository();
        repo.UserRepository userRepository3 = repositoryProvider0.getUserRepository();
        repo.UserRepository userRepository4 = repositoryProvider0.getUserRepository();
        model.user.Credentials credentials8 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str9 = credentials8.getPassword();
        java.lang.String str10 = credentials8.toString();
        model.user.User user11 = new model.user.User(credentials8);
        model.user.Student student13 = new model.user.Student(credentials8, "Parking Space 97 is already disabled.");
        model.user.FacultyMember facultyMember14 = new model.user.FacultyMember(credentials8);
        model.user.Credentials credentials15 = facultyMember14.getCredentials();
        facultyMember14.setFacultyName("Credentials{login='Credentials{login='hi!', password='hi!', type='hi!'}', password='Success: Parking Lot 100 has been disabled.', type='\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student'}");
        userRepository4.removeUser((model.user.User) facultyMember14);
        java.util.List<model.user.User> userList19 = userRepository4.getUsers();
        model.user.Credentials credentials23 = new model.user.Credentials("", "Success: Parking Space 100 has been disabled.", "");
        model.user.FacultyMember facultyMember26 = new model.user.FacultyMember(credentials23, "bEFVFN!4F", "iqmrymciB");
        java.lang.String str27 = credentials23.getPassword();
        model.user.Student student29 = new model.user.Student(credentials23, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   (O3fsOXXJ'\ncost           10.0\nstatus         null'\nemail        \nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Manager");
        model.user.NonFacultyStaff nonFacultyStaff31 = new model.user.NonFacultyStaff(credentials23, "Success: Parking Space 35 has been enabled.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userRepository4.updateUser((model.user.User) nonFacultyStaff31);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        services.SuperManagerServices superManagerServices0 = services.SuperManagerServices.getInstance();
        java.lang.String str1 = superManagerServices0.generateRandomEmail();
        boolean boolean3 = superManagerServices0.isValidEmail("FacultyMember");
        boolean boolean5 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been disabled.");
        boolean boolean7 = superManagerServices0.isValidEmail("Credentials{login='hi!', password='hi!', type='hi!'}");
        boolean boolean9 = superManagerServices0.isStrongPassword("Success: Parking Space 97 has been enabled.");
        boolean boolean11 = superManagerServices0.isStrongPassword("HGL)]pX%+");
        boolean boolean13 = superManagerServices0.isStrongPassword("=B3fAbMGq");
        boolean boolean15 = superManagerServices0.isValidEmail("&jn[e]&j%");
        java.lang.String str16 = superManagerServices0.generateStrongPassword();
        model.user.Credentials credentials20 = new model.user.Credentials("hi!", "", "Student");
        model.user.Student student22 = new model.user.Student(credentials20, "Success: Parking Lot 100 has been disabled.");
        boolean boolean23 = student22.getValidationStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = superManagerServices0.createAccount((model.user.User) student22);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        model.booking.Booking booking0 = new model.booking.Booking();
        int int1 = booking0.getStartTime();
        booking0.setEndTime((int) (short) 10);
        java.lang.String str4 = booking0.getEmail();
        booking0.setCost((double) (byte) 0);
        int int7 = booking0.getLotId();
        booking0.setEmail("Manager");
        booking0.setStartTime((int) (short) 10);
        java.util.Date date12 = booking0.getDate();
        java.util.Date date13 = booking0.getEndDateTime();
        int int14 = booking0.getEndTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = booking0.getTotalCost();
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("NonFacultyStaff");
        repo.UserRepository userRepository3 = userService0.userRepository;
        boolean boolean5 = userService0.isStrongPassword("\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        0\nlicensePlate   null'\ncost           0.0\nstatus         null'\nemail        Student");
        boolean boolean7 = userService0.isStrongPassword("FacultyMember");
        repo.UserRepository userRepository8 = userService0.userRepository;
        boolean boolean10 = userService0.isValidEmail("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.user.User user13 = userService0.loginUser("", "b0K0Td]sJ");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        model.user.Credentials credentials3 = new model.user.Credentials("hi!", "hi!", "hi!");
        java.lang.String str4 = credentials3.getPassword();
        java.lang.String str5 = credentials3.toString();
        model.user.Visitor visitor6 = new model.user.Visitor(credentials3);
        java.lang.String str7 = credentials3.toString();
        java.lang.String str8 = credentials3.getPassword();
        java.lang.String str9 = credentials3.toString();
        java.lang.String str10 = credentials3.toString();
        model.user.NonFacultyStaff nonFacultyStaff12 = new model.user.NonFacultyStaff(credentials3, "There is no Such Parking Lot");
        model.user.FacultyMember facultyMember13 = new model.user.FacultyMember(credentials3);
        java.lang.String str14 = credentials3.getType();
        model.user.Student student15 = new model.user.Student(credentials3);
        model.user.NonFacultyStaff nonFacultyStaff17 = new model.user.NonFacultyStaff(credentials3, "Credentials{login='hi!', password='hi!', type='hi!'}");
        nonFacultyStaff17.setRole("#J?tKN9i*");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nonFacultyStaff12 and nonFacultyStaff17", nonFacultyStaff12.equals(nonFacultyStaff17) ? nonFacultyStaff12.hashCode() == nonFacultyStaff17.hashCode() : true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        services.UserService userService0 = new services.UserService();
        boolean boolean2 = userService0.isValidEmail("SuperManager");
        repo.UserRepository userRepository3 = userService0.userRepository;
        model.user.Credentials credentials7 = new model.user.Credentials("hi!", "hi!", "hi!");
        model.user.FacultyMember facultyMember8 = new model.user.FacultyMember(credentials7);
        userRepository3.addUser((model.user.User) facultyMember8);
        facultyMember8.setFacultyName("Parking Space 32 is already enabled.");
        model.user.Credentials credentials12 = facultyMember8.getCredentials();
        java.lang.String str13 = credentials12.toString();
        model.parking.ParkingSpace parkingSpace15 = new model.parking.ParkingSpace((int) (byte) 0);
        model.sensor.Sensor sensor16 = parkingSpace15.getSensor();
        boolean boolean17 = credentials12.equals((java.lang.Object) parkingSpace15);
        model.user.FacultyMember facultyMember20 = new model.user.FacultyMember(credentials12, "\nid             0\nStart Date Time           null\nEnd Date Time        null\nlotId          0\nspaceId        0\nstartTime      0\nendTime        10\nlicensePlate   null'\ncost           0.0\nstatus         There is no Such Parking Lot'\nemail        Manager", "Success: Parking Space 100 has been enabled.");
        model.user.User user21 = new model.user.User(credentials12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on facultyMember8 and facultyMember20", facultyMember8.equals(facultyMember20) ? facultyMember8.hashCode() == facultyMember20.hashCode() : true);
    }
}

